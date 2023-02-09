const baseURL = 'http://localhost:8080/npcs/';

const NPCService = {
    getNPCs() {
        return fetch(baseURL).then((res) => res.json());
    },
};

export default NPCService;