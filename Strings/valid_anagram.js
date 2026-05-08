var isAnagram = function(s, t) {
    // Compare the length of s and t
    if (s.length !== t.length) {
        return false;
    }

    // Count frequency of characters in s
    const freqS = {};
    const freqT = {};

    for (let i = 0; i < s.length; i++) {
        let charS = s[i];
        freqS[charS] = (freqS[charS] || 0) + 1;
    }
    console.log(freqS);

    // Count frequency of characters in t
    for (let i = 0; i < t.length; i++) {
        let charT = t[i];
        freqT[charT] = (freqT[charT] || 0) + 1;
    }
    console.log(freqT);

    for (let key in freqS) {
        if (freqS[key] != freqT[key]) {
            return false;
        }
    }

    return true;
};

const s = "anagram";
const t = "nagaram";

console.log(isAnagram(s, t));
