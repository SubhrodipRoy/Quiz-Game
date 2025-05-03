
  const overlay = document.querySelector(".plum-overlay");

  function createPlum() {
    const plum = document.createElement("img");
    plum.src = "/logos/logo.png"; // Place plum.png in your directory
    plum.classList.add("plum");

    plum.style.left = Math.random() * 100 + "vw";
    plum.style.animationDuration = (15 + Math.random() * 1) + "s";
    plum.style.transform = `scale(${0.5 + Math.random()})`;

    overlay.appendChild(plum);

    // Remove after animation
    setTimeout(() => {
      plum.remove();
    }, 13500);
  }

  // Spawn plums continuously
  setInterval(createPlum, 300);
