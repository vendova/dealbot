package me.lkp111138.dealbot.game.card;

import me.lkp111138.dealbot.DealBot;
import me.lkp111138.dealbot.game.CardArgumentRequest;
import me.lkp111138.dealbot.game.Player;
import me.lkp111138.dealbot.game.card.state.CardState;

public interface Card {
    /**
     * @return The translation key for this card's name
     */
    String getNameKey();

    /**
     * @return The translation key for this card's description
     */
    String getDescriptionKey();

    /**
     * @return The card's current state
     */
    CardState getState();

    /**
     * @return The card's currency value
     */
    int getCurrencyValue();

    /**
     * Defines the actions when the card is used
     * @param bot The bot instance
     * @param player The Player that attempted to use this card
     * @param arg The optional argument to be passed to the card
     * @return An inline keyboard if the card needs further arguments or null
     */
    CardArgumentRequest execute(DealBot bot, Player player, String[] arg);
}
