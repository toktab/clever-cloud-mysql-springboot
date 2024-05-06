document.addEventListener("DOMContentLoaded", function() {
    fetch('/api/users')
        .then(response => response.json())
        .then(users => {
            const userList = document.getElementById('userList');
            users.forEach(user => {
                const tr = document.createElement('tr');
                tr.innerHTML = `<td>${user.id}</td><td>${user.name}</td>`;
                userList.appendChild(tr);
            });
        })
        .catch(error => console.error('Fetching error:', error));
});
