const baseURL = 'http://localhost:8080/users/';

const UserService = {
    getUsers() {
        return fetch(baseURL).then((res) => res.json());
    },
};

export default UserService;