const baseURL = 'http://localhost:8080/events/';

const EventService = {
    getEvents() {
        return fetch(baseURL).then((res) => res.json());
    },
};

export default EventService;