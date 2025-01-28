# undespawnable

[![Available on Modrinth](https://img.shields.io/modrinth/dt/undespawnable?logo=modrinth&style=flat)](https://modrinth.com/mod/undespawnable)

Extend and configure despawn time of your items using enchantments, gamerules and item data components.

Requires Fabric Language Kotlin.

## Content
### Enchantments

- `Persistence I` - adds 5 minutes to item despawn time (results in 10 minutes with default configuration)
- `Persistence II` - adds 10 minutes to item despawn time (results in 15 minutes)
- `Persistence III` - adds 15 minutes to item despawn time (results in 20 minutes)

### Gamerules

- `itemDespawnTime` - base item despawn time in ticks, `6000` (5 minutes) by default

### Components

- `despawn_time` - item data component, configures per-item despawn time in ticks. Overrides gamerules and
  enchantments.
- `add_despawn_time` - enchantment effect component, adds time in ticks to the base item despawn time 
  (configured by `itemDespawnTime` gamerule, `6000` by default).

## Credit & License

- Made by [otomir23](https://otomir23.me).
- Licensed under [MIT License](LICENSE.txt).
