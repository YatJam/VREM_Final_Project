const baseURL = 'http://localhost:8080/armours/';

const ArmourService = {
    getArmours() {
        return fetch(baseURL).then((res) => res.json());
    },
};

export default ArmourService;