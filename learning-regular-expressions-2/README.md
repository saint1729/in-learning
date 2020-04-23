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





































