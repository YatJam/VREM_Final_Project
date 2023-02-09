const baseURL = 'http://localhost:8080/weapons/';

const WeaponService = {
    getWeapons() {
        return fetch(baseURL).then((res) => res.json());
    },
};

export default WeaponService;