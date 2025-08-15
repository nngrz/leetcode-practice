var distance_calculator = function(distance) {
    const steps = [1, 2, 3];
    const map = new Map();
    for (let i = 0; i < steps.length; i++) {
        map.set(steps[i], i);
    }

    let result = 0;
    for (let i = 0; i < steps.length; i++) {
        const rest_distance = distance - steps[i];
        if (distance == 1) {
            return result = 1;
        } else {
            if (map.has(rest_distance)) {
                result++;
            }
        }
    }
    return result;
}

const distance1 = 1;
console.log(distance_calculator(1));

const distance2 = 2;
console.log(distance_calculator(2));

const distance3 = 3;
console.log(distance_calculator(3));

// Question:
// I can walk by having a 1m, or 2m, or 3m step (for each type of step I can only walk once). 
// Given the distance(D in meters),
// how many different ways I have to go this path.

// For D=1 result =1
// For D=2 result=2 (2)
// For D=3 result=4 (1+2: 3; 3)
