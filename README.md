# SelectivePluginList
Show your plugins, but hide some from view.

Do you want to hide your plugins, but still show some of them? If so, this plugin is for you.

Simply drop it into your plugins folder, and use /spl.
This is the only command and it has no permissions.

In the configuration, you can hide plugins from the list, and people can trust what you hide because it adds a number of hidden plugins at the end of the message.
This can be useful for a plugin testing server, or generally when you want people to know the plugins but now want to have the chat spammed with plugins.

Currently there is only one bug, which is a user/config error, which I may fix if I release version 2.
This bug is where if a plugin is removed from the server, the plugin must be removed from the config as well, otherwise the plugin counter will go down.
In this example, I only have one plugin, but because the config has 4 to be ignored, the plugin count goes to -3.

[ATTACH=full]333917[/ATTACH]
