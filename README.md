# PAPI Plugins Expansion

## Expansions
This is all the placeholders (V1.0.0)

| Placeholder | Return |
| ------ |------ |
| %plugins_list% | Array  |
| %plugins_getnumberplugins% | Int  |
| %plugins_getplugin_PLUGINNAME% | String  |
| %plugins_isenabled_PLUGINNAME% | Bool  |
| %plugins_getpermissions_PLUGINNAME% | Array  |
| %plugins_getauthor_PLUGINNAME% | String  |
| %plugins_getdescription_PLUGINNAME% | String  |
| %plugins_getprefix_PLUGINNAME% | String  |
| %plugins_getwebsite_PLUGINNAME% | String  |
| %plugins_getcommands_PLUGINNAME% | Json  |
| %plugins_getcontributors_PLUGINNAME% | String  |

# Examples
```
%plugins_list% -> [PlaceholderAPI V2.11.1, spark v1.6.4]
%plugins_getnumberplugins% → 2
%plugins_getplugin_spark% → spark v1.6.4
%plugins_isenabled_spark% → true
%plugins_getpermissions_chatcontrol% → chatcontrol.notify.overrideranged, chatcontrol.broadcaster.view
%plugins_getauthor_OneLobby% → Teyir
%plugins_getdescription_OneLobby% → Un plugin développé par Teyir pour le serveur One-Dream.fr
%plugins_getprefix_OneLobby% → OneLobby
%plugins_getwebsite_OneLobby% → https://teyir.fr
%plugins_getcommands_OneLobby% → {spawn={description=Téléportation au spawn},setspawn={description=Définition du spawn}}
%plugins_getcontributors_OneLobby% → Teyir

```


### Installation :
Drag the jar file in the folder /plugins/PlaceholderAPI/expansions

If you want any other expansion feel free to contact me !

### Discord: Teyir#4439
