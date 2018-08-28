package difficulty7

class Difficulty7Katas {
    companion object {
        /**
         * Your task is to implement a simple regular expression parser. We will have a parser that outputs the following AST of a regular expression:
         * As with the usual regular expressions, Any is denoted by the '.' character, ZeroOrMore is denoted by a subsequent '*' and Or is denoted by '|'. Brackets, ( and ), are allowed to group a sequence of regular expressions into the Str object.
         * Or is not associative, so "a|(a|a)" and "(a|a)|a" are both valid regular expressions, whereas "a|a|a" is not.
         * Operator precedences from highest to lowest are: *, sequencing and |. Therefore the followings hold:
         *   "ab*"     -> Str ([Normal ('a'), ZeroOrMore (Normal ('b'))])
         *   "(ab)*"   -> ZeroOrMore (Str ([Normal ('a'), Normal ('b')]))
         *   "ab|a"    -> Or (Str ([Normal ('a'), Normal ('b')]), Normal ('a'))
         *   "a(b|a)"  -> Str ([Normal ('a'), Or (Normal ('b'), Normal ('a'))])
         *   "a|b*"    -> Or (Normal ('a'), ZeroOrMore (Normal ('b')))
         *   "(a|b)*"  -> ZeroOrMore (Or (Normal ('a'), Normal ('b')))
         * Some examples:
         *   "a"          -> Normal('a')
         *   "ab"         -> Str([ Normal('a'), Normal('b') ])
         *   "a.*"        -> Str([ Normal('a'), ZeroOrMore( Any() ) ])
         *   "(a.*)|(bb)" -> Or( Str([ Normal('a'), ZeroOrMore( Any() ) ]),
         *   Str([ Normal('b'), Normal('b') ]) )
         * The followings are invalid regexps and the parser should return Void() in Kotlin:
         *   "", ")(", "*", "a(", "()", "a**", etc.
         * Feel free to use any parser combinator libraries available or implement the parser "from scratch".
         */
        class RegExpParser(input: String) {
            fun parse(): String {
                // Your code here!
                return ""
            }
        }
    }
}