const baseURL = 'http://localhost:8080/items/';

const ItemService = {
    getItems() {
        return fetch(baseURL).then((res) => res.json());
    },
};

export default ItemService;