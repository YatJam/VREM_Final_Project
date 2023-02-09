const baseURL = 'http://localhost:8080/characterclasses/';

const CharacterClassService = {
    getCharacterClasses() {
        return fetch(baseURL).then((res) => res.json());
    },
};

export default CharacterClassService;