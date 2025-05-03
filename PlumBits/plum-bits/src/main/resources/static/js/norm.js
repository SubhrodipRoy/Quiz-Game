const swiper = new Swiper('.swiper-container', {
    loop: true,
    grabCursor: true,
    centeredSlides: true,
    slidesPerView: 1,
    spaceBetween: 3000,
    effect: 'slide',
    keyboard: {
        enabled: true,
    }
});
// Card mouse-follow effect
const cards = document.querySelectorAll('.card');

cards.forEach(card => {
    card.addEventListener('mousemove', (e) => {
        const { offsetWidth: width, offsetHeight: height } = card;
        const { offsetX: x, offsetY: y } = e;

        const xPos = (x / width) * 100;
        const yPos = (y / height) * 100;

        const moveX = (xPos - 50) / 3;
        const moveY = (yPos - 50) / 3;

        card.style.transform = `rotateY(${moveX}deg) rotateX(${moveY}deg)`;
    });

    card.addEventListener('mouseleave', () => {
        card.style.transform = 'rotateY(0deg) rotateX(0deg)';
    });
});