"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
class Pizza {
    tomate = false;
    cheese = "";
    bacon = false;
    otherIngredients = [""];
    setCheese(cheese) {
        this.cheese = cheese;
        return this;
    }
    setBacon() {
        this.bacon = true;
        return this;
    }
    setOtherIngredients(ingredients) {
        this.otherIngredients = ingredients;
        return this;
    }
    build() {
        return this;
    }
}
const pepperoniPizza = new Pizza();
pepperoniPizza
    .setBacon()
    .setCheese("Mozzarella")
    .setOtherIngredients(["tomato"])
    .build();
console.log(pepperoniPizza);
//# sourceMappingURL=index.js.map