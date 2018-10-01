package me.pol.bot;

import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class MyListener extends ListenerAdapter
{
    @Override
    public void onMessageReceived(MessageReceivedEvent event)
    {
        String[] args = event.getMessage().getContentRaw().split( " ");
        if(args[0].equalsIgnoreCase("sup")){
            if(!event.getMember().getUser().isBot()) {
                event.getChannel().sendMessage("Hey !" + event.getMember().getEffectiveName()).queue();
            }
        }
    }
}