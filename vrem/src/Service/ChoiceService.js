const baseURL = 'http://localhost:8080/choices/';

const ChoiceService = {
    getChoices() {
        return fetch(baseURL).then((res) => res.json());
    },
};

export default ChoiceService;