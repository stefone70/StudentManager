document.getElementById('rotateButton').addEventListener('click', function() {
    this.classList.add('rotate');  // Ajoute la classe pour lancer l'animation

    // Optionnel: retirer la classe après l'animation pour permettre des clics répétés
    this.addEventListener('animationend', () => {
        this.classList.remove('rotate');
    });
});
