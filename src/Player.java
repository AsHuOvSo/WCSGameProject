public class Player {
    int health = 200;
    int food = 2000;
    int water = 2000;
    int coins = 0;

    public static int Damage(int healthAmount, int damageTaken) {
        healthAmount -= damageTaken;
        return healthAmount;
    }

    public static int Thirst(int waterAmount){
        waterAmount -= 200;
        return waterAmount;
    }

    public static int Hunger(int foodAmount) {
        foodAmount -= 100;
        return foodAmount;
    }

    public static int Heal(int healthAmount, int healingItem) {
        healthAmount += healingItem;
        return healthAmount;
    }

    public static int Drink(int waterAmount, int drinkItem) {
        waterAmount += drinkItem;
        return waterAmount;
    }

    public static int Eat (int foodAmount, int foodItem) {
        foodAmount += foodItem;
        return foodAmount;
    }

    public static int EarnCoins(int currentCoins, int coinsAmount) {
        currentCoins += coinsAmount;
        return currentCoins;
    }

    public static int SpendCoins(int currentCoins, int coinsAmount) {
        currentCoins -= coinsAmount;
        return currentCoins;
    }
}
