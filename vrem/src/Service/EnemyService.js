const baseURL = 'http://localhost:8080/enemies/';

const EnemyService = {
    getEemies() {
        return fetch(baseURL).then((res) => res.json());
    },
};

export default EnemyService;