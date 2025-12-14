const textElement = document.getElementById("typewriter");
const texts = ["Data Analytic Student", "Python Developer", "AI Enthusiast", "Deep Learning Learner"];
let count = 0;
let index = 0;
let currentText = "";
let letter = "";

function type() {
    if (count === texts.length) {
        count = 0;
    }
    currentText = texts[count];
    letter = currentText.slice(0, ++index);

    textElement.textContent = letter;

    if (letter.length === currentText.length) {
        count++;
        index = 0;
        setTimeout(type, 2000); // Wait 2 seconds before typing next word
    } else {
        setTimeout(type, 100); // Typing speed
    }
}

document.addEventListener("DOMContentLoaded", type);