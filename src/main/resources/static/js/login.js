function handleLogin(event) {
    event.preventDefault();

    //User input
    const email = document.getElementById("email");
    const password = document.getElementById("password");

    const user = {
        email: email,
        password: password
    }

    // Call to backend API
}


const loginForm = document.getElementById("loginForm");
loginForm.addEventListener("submit",handleLogin);