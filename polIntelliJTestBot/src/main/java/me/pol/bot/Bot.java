package me.pol.bot;

import me.pol.bot.events.OnlineCommand;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;

public class Bot {
    public static void main(String[] arguments) throws Exception
    {
        JDA api = new JDABuilder("NDk1Mzk3NzI1OTg3Mjc0NzUz.DpBeyw.Ll6D-6nGWTK15qOLHIw8nLWwMdc").build();
        api.addEventListener(new MyListener());
        api.addEventListener(new OnlineCommand());
    }
}
