package main.turntable.clients;

import main.turntable.trades.Trade;

import java.time.LocalDateTime;

public class Bronze extends MembershipType{
    private final int MAX_TRADES_PER_DAY = 5;
    public Bronze()
    {
        this.setMaxPoints(10);

        this.setMaxTradesPerDay(MAX_TRADES_PER_DAY);
    }

    @Override
    public boolean canTrade(Trade trade){
        //check trade time
        LocalDateTime tradingStartTime = LocalDateTime.parse(
                LocalDateTime.now().toLocalDate() +"T10:00:00"
        );
        if(trade.getTradeCreatedAt().isBefore(tradingStartTime)){
            return false;
        }

        return trade.getQuantity() < this.getMaxTradesPerDay() && (trade.getQuantity() * trade.getPrice()) < MAX_TRADE_VALUE;
    }
}
