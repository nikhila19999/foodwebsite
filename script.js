document.addEventListener("DOMContentLoaded", function() {
    const orderButtons = document.querySelectorAll("#home button, .menu-item button");
    
    orderButtons.forEach(button => {
        button.addEventListener("click", function() {
            alert("Thank you for your order! Your food is on the way.");
        });
    });
});
