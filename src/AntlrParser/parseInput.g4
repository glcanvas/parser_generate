grammar parseInput;
@header {
    package AntlrParser;
    import java.util.*;
}

@parser::members {

    Map<String, String> terminals = new HashMap<>();
    Set<String> passed = new HashSet<>();

    public class Node {
        public String name;
        public String defineInnerVariables;
        public String initCode;
        public List<List<Map.Entry<String, String>>> states;
        public Node() {
            name = "";
            defineInnerVariables = "";
            initCode = "";
            states = new ArrayList<>();
        }
    }
    Map<String, Node> notTerminals = new HashMap<>();
}


combine_all
    : begin non_terminal_all_rules terminal_all_rules
    ;

begin
    :   'start' '=' NOT_TERMINAL_ID ';'
    ;
pack
    :   'package' PACAGE_NAME ';'
    ;


non_terminal_all_rules
    : (a=non_terminal   {//notTerminals.put($a.node.name, $a.node);
                        } ';')+
    ;

non_terminal returns [Node node]
    @init {
        $node = new Node();
    }
    : NOT_TERMINAL_ID DECLARE_INNER_VARIABLE  '!' CODE ':'
            block_of_non_teerminal_rule
                 {
                            $node.name = $NOT_TERMINAL_ID.text;
                            $node.defineInnerVariables = $DECLARE_INNER_VARIABLE.text;
                            $node.initCode = $CODE.text;
                            $node.states.add($block_of_non_teerminal_rule.seq);
                 }
             ( '|' s=block_of_non_teerminal_rule
                 {
                    $node.states.add($s.seq);
                 }
             )*
    ;

block_of_non_teerminal_rule returns[List<Map.Entry<String, String>> seq]
    @init {
        $seq = new ArrayList<>();
    }
    : (sub_block_of_non_teerminal_rule CODE? {
                                $seq.add(new AbstractMap.SimpleEntry<>($sub_block_of_non_teerminal_rule.res, $CODE.text));
                                             }
      )+
    ;

sub_block_of_non_teerminal_rule returns[String res]
    : TERMINAL_ID {$res = $TERMINAL_ID.text;}
    | NOT_TERMINAL_ID {$res = $NOT_TERMINAL_ID.text;}
    ;

/*
declare result of non terminal
!
init block required
:

*/



terminal_all_rules
    : (terminal_rule ';')+
    ;

terminal_rule
    : TERMINAL_ID SAVE terminal_value    {terminals.put($TERMINAL_ID.text, $terminal_value.res);}
    | TERMINAL_ID SCIP terminal_value   {terminals.put($TERMINAL_ID.text, $terminal_value.res);
                                            passed.add($TERMINAL_ID.text);}
    ;


terminal_value returns [String res]
    : REGEXP_EXPRESSION {$res = $REGEXP_EXPRESSION.text;}
    | STRING {$res = $STRING.text;}
    ;


NOT_TERMINAL_ID : [a-z][a-z0-9]*;
TERMINAL_ID : [A-Z][A-Z0-9]*;

REGEXP_EXPRESSION : '\'' (~('\''|'\r' | '\n') | '\\\'')* '\'';
STRING : '"' (~('"') | '\\"')* '"';

CODE : '{' (~[{}]+)* '}' ;
DECLARE_INNER_VARIABLE : '<' (~[<>]+)* '>';
PACAGE_NAME : ([a-z0-9] | '.')+;

WHITE_SPACE  : [ \t\r\n]+ -> skip ;

SAVE : '=';
SCIP : '=>';