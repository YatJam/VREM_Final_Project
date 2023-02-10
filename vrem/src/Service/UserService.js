const baseURL = 'http://localhost:8080/users/';

const UserService = {
    getUsers() {
        return fetch(baseURL).then((res) => res.json());
    },
    addUser(user) {
        return fetch(baseURL, {
            method: 'POST',
            body: JSON.stringify(user),
            headers: {
                'Content-Type': 'application/json',
            },
        }).then((res) => res.json());
    },
};

export default UserService;