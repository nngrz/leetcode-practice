var isAnagram = function(s, t) {
    // Compare the length of s and t
    if (s.length == t.length) {
        // Count frequency of characters in s
        const freqS = {};
        const freqT = {};

        for (const char of s) {
            freqS[char] = (freqS[char] || 0) + 1;
        }
        console.log(freqS);

        // Count frequency of characters in t
        for (const char of t) {
            freqT[char] = (freqT[char] || 0) + 1;
        }
        console.log(freqT);

        if (freqS == freqT) {
            return true;
        }
    }

    return false;
};

const s = "anagram";
const t = "nagaram";

isAnagram(s, t);