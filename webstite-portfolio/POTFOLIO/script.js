// Selecteer de knop en het menu
const menuToggle = document.getElementById('menu-toggle');
const menu = document.getElementById('menu');

// Voeg een klik-event toe aan de hamburger-knop
menuToggle.addEventListener('click', function () {
    // Toggle de 'show' klasse van het menu
    menu.classList.toggle('show');
});
