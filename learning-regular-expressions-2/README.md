#Learning Regular Expressions
     
## 1. Challenge: Characters
1. How many times does the word "self" appear? <br />
    64 (http://regexr.com/5365u)
1. Count: himself, herself, itself, myself, yourself, thyself <br />
    himself - 20 (https://regexr.com/5367e) <br />
    herself - 0 (https://regexr.com/5367h) <br />
    itself - 12 (https://regexr.com/5367k) <br />
    myself - 6 (https://regexr.com/5367t) <br />
    yourself - 7 (https://regexr.com/53680) <br />
    thyself - 1 (https://regexr.com/53683) <br />
1. Using three literal characters and three wildcard characters, match: please, palace, parade <br />
    p..a.e - https://regexr.com/53691
1. What matches /t..ch/ besides "teach"? <br />
    ttach <br />
    to Ch <br />
    t, ch <br />
    t, ch <br />
    touch <br />
    tarch <br />
    https://regexr.com/5369d

## 2. Challenge: Character Sets
Write a regex to
1. Match both "lives" and "lived" <br />
   **live[sd]** (https://regexr.com/536d5)
1. Match "virtue" but not "virtues" <br />
    **virtue[^s]** (https://regexr.com/536de)
1. Match the numbers and periods on all numbered paragraphs <br />
    **\d[.]** (https://regexr.com/536dq)
1. Find the 16-character word that starts with "c" <br />
    **circumnavigation** (https://regexr.com/536e0)

## 3. Challenge: Repetition
1. Write one regular expression to match self, himself, herself, itself, myself, yourself, thyself <br />
    **\w{0,4}self** (https://regexr.com/536l7)
1. Write one regular expression that matches both "virtue" and "virtues" <br />
    **virtues?** (https://regexr.com/536lm)
1. Use quantified repetition to find the word that starts with "T" and has 12 letters <br />
    **T\w{11}** *Tranquillity* (https://regexr.com/536m8)
1. Match all text inside quotation marks, but nothing that is not inside them <br />
    **".*?"** (https://regexr.com/536me)

## 4. Challenge: Grouping and alternation
1. Match "myself", "yourself", "thyself", but not "himself", "itself" <br />
    **(my|your|thy)self** (https://regexr.com/536oa)
1. Match "good", "goodness", and "goods" without typing "good" more than once <br />
    **good(s|ness)?** (https://regexr.com/536om)
1. Match "do" or "does" followed by "no", "not", or "nothing", even when it occurs at the start of a sentence <br />
    **[Dd]o(es)? no(t(hing)?)?** (https://regexr.com/536os)

## 5. Challenge: Anchors
1. How many paragraphs start with "I" as in "I read"? <br />
    **^I\b** *9* (https://regexr.com/536qu)
1. How many paragraphs end with a question mark? <br />
    **\\?$** *1* (https://regexr.com/536rg)
1. Match all words with exactly 15 letters, including hyphenated words <br />
    **\b[\w\\-]{15}\b** (https://regexr.com/536rp)









