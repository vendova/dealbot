package me.lkp111138.dealbot.translation;

import me.lkp111138.dealbot.DealBot;
import me.lkp111138.dealbot.game.GamePlayer;
import me.lkp111138.dealbot.game.cards.Card;

import java.util.HashMap;

public abstract class Translation {
    private static HashMap<String, Translation> translations;

    public static Translation get(String lang) {
        Translation fallback = new HongKongEnglish();
        if (translations == null) {
            translations = new HashMap<>();
            translations.put("en", fallback);
            translations.put("zh", new TraditionalChinese());
            translations.put("hk", new HongKongChinese());
            translations.put("en_us", new UnitedStatesEnglish());
            translations.put("en_gb", new UnitedKingdomEnglish());
        }
        return translations.getOrDefault(lang, fallback);
    }

    public abstract String BOT_NAME();
    public abstract String ERROR();
    public abstract String JOIN_SUCCESS();
    public abstract String BACK_TO();
    public abstract String JOINED_ANNOUNCEMENT();
    public abstract String START_ME_FIRST();
    public abstract String START_ME();
    public abstract String EXTENDED_ANNOUNCEMENT();
    public abstract String GAME_STARTING_ANNOUNCEMENT();
    public abstract String PROPERTY_NAME(int index);
    public abstract String NO_OF_FULL_SETS(int sets);
    public abstract String WILD_CARD();
    public abstract String WILD_CARD(int g1, int g2);
    public abstract String ITS_MY_BDAY();
    public abstract String DEBT_COLLECTOR();
    public abstract String GO_PASS();
    public abstract String DBL_RENT();
    public abstract String JUST_SAY_NO();
    public abstract String DEAL_BREAKER();
    public abstract String SLY_DEAL();
    public abstract String HOUSE();
    public abstract String HOTEL();
    public abstract String FORCED_DEAL();
    public abstract String WILDCARD_RENT(int g1, int g2);
    public abstract String RAINBOW_RENT();
    public abstract String CURRENT_STATE();
    public abstract String CARDS_IN_HAND();
    public abstract String CARDS_IN_CURRENCY_DECK();
    public abstract String PROPERTIES();
    public abstract String PROPERTY_GROUP(int group);
    public abstract String JUST_SAY_NO_DESC();
    public abstract String PASS();
    public abstract String MANAGE_CARD_MENU();
    public abstract String CHOOSE_AN_ACTION(int remaining, int secs);
    public abstract String SELF_CURRENCY_DECK(int count, int total);
    public abstract String JUST_SAY_NO_BTN(long count);
    public abstract String NO();
    public abstract String PAYMENT_COLLECTION_MESSAGE_SAY_NO(int group, String collector, int amount);
    public abstract String PAYMENT_COLLECTION_MESSAGE(int group, String collector, int amount, int secs);
    public abstract String PAY(int value);
    public abstract String CHOOSE_CARD_TO_MANAGE();
    public abstract String CHOOSE_RELOCATE();
    public abstract String GROUP_FULL();
    public abstract String PAYMENT_TOO_LOW();
    public abstract String SAID_NO();
    public abstract String SB_SAID_NO(String name);
    public abstract String SAID_YES();
    public abstract String PAYMENT_THX();
    public abstract String DISPOSE_CARD(int remaining);
    public abstract String BUILD_THIS_ON(String name);
    public abstract String DEAL_BREAKER_DESC();
    public abstract String WHOSE_DEAL_TO_BREAK();
    public abstract String VICTIM_SAID_NO(String name);
    public abstract String DEAL_BREAKER_SAY_NO_PROMPT(String name, int group);
    public abstract String YOU_HAVE_USED_AGAINST(String card, String against);
    public abstract String YOU_HAVE_USED(String card);
    public abstract String SOMEONE_HAVE_USED_AGAINST(String user, String card, String against);
    public abstract String SOMEONE_HAVE_USED(String user, String card);
    public abstract String DEBT_COLLECTOR_PROMPT(String victim);
    public abstract String DEBT_COLLECTOR_CHOOSE_PROMPT();
    public abstract String DEBT_COLLECTOR_DESC();
    public abstract String DBL_RENT_DESC();
    public abstract String DBL_RENT_MSG(int multiplier);
    public abstract String FORCED_DEAL_DESC();
    public abstract String FORCED_DEAL_TARGET();
    public abstract String FORCED_DEAL_CHOOSE_TARGET();
    public abstract String FORCED_DEAL_CHOOSE_GIVE();
    public abstract String FORCED_DEAL_SAY_NO_PROMPT(GamePlayer player, Card card, int group, Card selfCard);
    public abstract String GO_PASS_DESC();
    public abstract String YOU_HAVE_DRAWN();
    public abstract String BUILDING_DESC(String name, int amt);
    public abstract String COLLECTING_BDAY();
    public abstract String BDAY_DESC();
    public abstract String RENT_CARD_DESC(int g1, int g2);
    public abstract String RAINBOW_RENT_CARD_DESC();
    public abstract String YOU_HAVE_USED_RENT_FOR(String card, int group, int amount);
    public abstract String SOMEONE_HAVE_USED_RENT_FOR(String name, String card, int group, int amount);
    public abstract String YOU_HAVE_USED_RENT_FOR_AGAINST(String card, String victim, int group, int amount);
    public abstract String SOMEONE_HAVE_USED_RENT_FOR_AGAINST(String name, String card, String victim, int group, int amount);
    public abstract String COLLECTING_RENT(String from, int group, int amount);
    public abstract String RENT_CHOOSE_GROUP();
    public abstract String RENT_CHOOSE_PLAYER();
    public abstract String SLY_DEAL_DESC();
    public abstract String SLY_DEAL_CHOOSE_PLAYER();
    public abstract String SLY_DEAL_SAY_NO_PROMPT(String name, int group, String target);
    public abstract String ACTION_CARD_DESC(String title, String desc);
    public abstract String AS_CURRENCY();
    public abstract String AS_ACTION();
    public abstract String YOU_DEPOSITED(String title);
    public abstract String SOMEONE_DEPOSITED(String name, String title);
    public abstract String YOU_PLACED_PROP(String title);
    public abstract String SOMEONE_PLACED_PROP(String name, String title);
    public abstract String YOU_PLACED_PROP_AS(String title, int group);
    public abstract String SOMEONE_PLACED_PROP_AS(String name, String title, int group);
    public abstract String WILDCARD_CHOOSE_GROUP();
    public abstract String SB_PAID_YOU(String name, String payment);
    public abstract String SB_PAID_SB(String name, String payee, String payment);
    public abstract String SAID_NO_PROMPT_SAY_NO(String name);
    public abstract String SB_DISPOSED(String name, String card);
    public abstract String YOU_DISPOSED(String card);
    public abstract String PASS_ANNOUNCEMENT();
    public abstract String WON_ANNOUNCEMENT(long tgid, String name);
    public abstract String PASS_TIMEOUT();
    public abstract String PASS_CLICK();
    public abstract String NEW_GAME_PROMPT();
    public abstract String GAME_ENDED();
    public abstract String GAME_ENDED_ANNOUNCEMENT();
    public abstract String AFK_KILL();
    public abstract String YOUR_TURN_ANNOUNCEMENT();
    public abstract String ME_CMD_PMED();
    public abstract String PICK_CARDS();
    public abstract String JOIN_PROMPT();
    public abstract String NO_GAME_TO_JOIN();
    public abstract String GAME_STARTING();
    public abstract String GAME_STARTED();
    public abstract String GAME_START_ANNOUNCEMENT();
    public abstract String NOTHING_ON_DESK();
    public abstract String SORT_SUIT();
    public abstract String SORT_FACE();
    public abstract String FLEE_ANNOUNCEMENT();
    public abstract String MAINT_MODE_NOTICE();
    public abstract String CLOSE();
    public abstract String ACHIEVEMENT_UNLOCKED();
    public abstract String ACHV_TITLE(DealBot.Achievement ach);
    public abstract String ACHV_DESC(DealBot.Achievement ach);
    public String ACHV_MSG(DealBot.Achievement ach) {
        return String.format("%s%s\n%s", ACHV_UNLOCKED(), ACHV_TITLE(ach), ACHV_DESC(ach));
    }
    public abstract String ACHV_UNLOCKED();
    public abstract String A_TOTAL_OF();
    public abstract String HELP();
    public String ACHIEVEMENT_TITLE(String achv_key) {
        return ACHV_TITLE(DealBot.Achievement.valueOf(achv_key));
    }
    public abstract String ACHIEVEMENT_DESC(String achv_key);
    public abstract String JOIN_69_PROTEST();
    public abstract String OCT_5_STRIKE();
    public abstract String GAME_ENDED_ERROR();
    public abstract String NEXT_GAME_QUEUED(String name);
    public abstract String GAME_STARTING_IN(String name);
    public abstract String CANCEL();
    public abstract String SB_IS_ELIMINATED(String name);
    public abstract String LONE_WIN(long tgid, String name);
    public abstract String HOW_TO_PLAY();
    public abstract String STATS(long id, String name, int win, int total, float timePlayed, int cardsPlayed, int currency, int properties, int rent);
}
