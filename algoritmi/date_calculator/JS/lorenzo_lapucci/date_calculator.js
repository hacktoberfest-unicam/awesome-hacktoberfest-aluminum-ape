function calculator(dateA, dateB) {
        const diff = Math.abs(dateA.getTime() - dateB.getTime());
        const s = (diff / 1000) % 60;
        const m = (diff / 1000 / 60) % 60;
        const h = (diff / 1000 / 60 / 60) % 24;
        const d = Math.trunc((diff / 1000 / 60 / 60) / 24);
        console.log(d + "d " + h + "h " + m + "m " + s + "s");
}

console.log(calculator(new Date("2001-01-01T20:00:00"), new Date("2001-01-01T22:00:00")));
