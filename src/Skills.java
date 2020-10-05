public class Skills {
    int strength = 1;
    int endurance = 1;
    int agility = 1;
    int intelligence = 1;
    int survival = 1;
    int barter = 1;


    public static int AddSkillPoint(int skillPoints, int amountOfPoints) {
        skillPoints += amountOfPoints;
        return skillPoints;
    }

    public static int RemoveSkillPoint(int skillPoints, int amountOfPoints) {
        skillPoints-=amountOfPoints;
        return skillPoints;
    }

    public Skills() {

    }
}
