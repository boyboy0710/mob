package com.boyboy0710.mob;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerLevelChangeEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;


public class Main extends JavaPlugin implements Listener{

	public void onEnable() {
		System.out.println("----------------------------------------------------------");
		System.out.println("   §c mob 를러그인을 성공적으로 불러왔습니다");
		System.out.println("        플러그인 제작자ㅣ:boyboy0710");
		System.out.println("   최신버전 다운 사이트 : https://github.com/boyboy0710/mob");
		System.out.println("----------------------------------------------------------");
	}
	@Override
	public void onDisable() {
		System.out.println("mob 플러그인이 비활성화 되었습니다");
	}
	
	@EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        p.sendMessage("최신버전 다운사이트 : https://github.com/boyboy0710/mob");
	}
//------------------------------------------------------------------------------------------------------------------------------------
	//player
	int h = 0;
	int c = 0;
	int b = 0;
	int l = 0;
	int hp = 20;
	int e = 0;
	
	public boolean onCommand1(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;
		int level = p.getLevel();
		
		if(cmd.getName().equalsIgnoreCase("time and weather")) {
			World w = p.getWorld(); 
			w.setStorm(false);
			w.setThundering(false);
			w.setTime(0);
		}
		
		if(cmd.getName().equalsIgnoreCase("reloed_Health")) {
			if(p.getInventory().getBoots().getType() == Material.NETHERITE_BOOTS) {
				b = 4;
			}
			if(p.getInventory().getBoots().getType() == Material.DIAMOND_BOOTS) {
				b = 3;
			}
			if(p.getInventory().getBoots().getType() == Material.GOLDEN_BOOTS) {
				b = 2;
			}
			if(p.getInventory().getBoots().getType() == Material.IRON_BOOTS) {
				b = 2;
			}
			if(p.getInventory().getBoots().getType() == Material.CHAINMAIL_BOOTS) {
				b = 1;
			}
			if(p.getInventory().getBoots().getType() == Material.LEATHER_BOOTS) {
				b = 1;
			}
			if(p.getInventory().getBoots().getType() == Material.AIR) {
				b = 0;
			}
			
			
			if(p.getInventory().getChestplate().getType() == Material.NETHERITE_CHESTPLATE) {
				c = 4;
			}
			if(p.getInventory().getChestplate().getType() == Material.DIAMOND_CHESTPLATE) {
				c = 3;
			}
			if(p.getInventory().getChestplate().getType() == Material.GOLDEN_CHESTPLATE) {
				c = 2;
			}
			if(p.getInventory().getChestplate().getType() == Material.IRON_CHESTPLATE) {
				c = 2;
			}
			if(p.getInventory().getChestplate().getType() == Material.CHAINMAIL_CHESTPLATE) {
				c = 1;
			}
			if(p.getInventory().getChestplate().getType() == Material.LEATHER_CHESTPLATE) {
				c = 1;
			}
			if(p.getInventory().getChestplate().getType() == Material.AIR) {
				c = 0;
			}
			
			if(p.getInventory().getHelmet().getType() == Material.AIR) {
				h = 0;
			}
			if(p.getInventory().getHelmet().getType() == Material.NETHERITE_HELMET) {
				h = 4;
			}
			if(p.getInventory().getHelmet().getType() == Material.DIAMOND_HELMET) {
				h = 3;
			}
			if(p.getInventory().getHelmet().getType() == Material.GOLDEN_HELMET) {
				h = 2;
			}
			if(p.getInventory().getHelmet().getType() == Material.IRON_HELMET) {
				h = 2;
			}
			if(p.getInventory().getHelmet().getType() == Material.CHAINMAIL_HELMET) {
				h = 1;
			}
			if(p.getInventory().getHelmet().getType() == Material.LEATHER_HELMET) {
				h = 1;
			}
			
			
			if(p.getInventory().getLeggings().getType() == Material.AIR) {
				l = 0;
			}
			if(p.getInventory().getLeggings().getType() == Material.NETHERITE_LEGGINGS) {
				l = 4;
			}
			if(p.getInventory().getLeggings().getType() == Material.DIAMOND_LEGGINGS) {
				l = 3;
			}
			if(p.getInventory().getLeggings().getType() == Material.GOLDEN_LEGGINGS) {
				l = 2; 
			}
			if(p.getInventory().getLeggings().getType() == Material.IRON_LEGGINGS) {
				l = 2;
			}
			if(p.getInventory().getLeggings().getType() == Material.CHAINMAIL_LEGGINGS) {
				l = 1;
			}
			if(p.getInventory().getLeggings().getType() == Material.LEATHER_LEGGINGS) {
				l = 1;
			} 
			e = l+h+c+b+ level + hp;
			p.setMaxHealth(e);
		}
		
		if(cmd.getName().equalsIgnoreCase("MaxHealth")) {
			p.sendMessage("체력회복중......");
			ItemStack head =  p.getInventory().getHelmet();
			int ph = (int) p.getHealth();
			p.setHealth(ph);
			p.getInventory().setHelmet(new ItemStack(Material.GOLD_BLOCK));
			if(p.getHealth() != e) {
				ph = ph + 1;
				p.setHealth(ph);
				p.getInventory().setHelmet(new ItemStack(Material.AIR));
			}
			if(p.getHealth() == e) {
				p.getInventory().setHelmet(head);
			}
		}
		return false;
	}

	 @EventHandler
		public void onInteract(PlayerLevelChangeEvent ev) {
			Player p = ev.getPlayer();
			int level = p.getLevel();
				if(p.getInventory().getBoots().getType() == Material.NETHERITE_BOOTS) {
					b = 4;
				}
				if(p.getInventory().getBoots().getType() == Material.DIAMOND_BOOTS) {
					b = 3;
				}
				if(p.getInventory().getBoots().getType() == Material.GOLDEN_BOOTS) {
					b = 2;
				}
				if(p.getInventory().getBoots().getType() == Material.IRON_BOOTS) {
					b = 2;
				}
				if(p.getInventory().getBoots().getType() == Material.CHAINMAIL_BOOTS) {
					b = 1;
				}
				if(p.getInventory().getBoots().getType() == Material.LEATHER_BOOTS) {
					b = 1;
				}
				if(p.getInventory().getBoots().getType() == Material.AIR) {
					b = 0;
				}
				
				
				if(p.getInventory().getChestplate().getType() == Material.NETHERITE_CHESTPLATE) {
					c = 4;
				}
				if(p.getInventory().getChestplate().getType() == Material.DIAMOND_CHESTPLATE) {
					c = 3;
				}
				if(p.getInventory().getChestplate().getType() == Material.GOLDEN_CHESTPLATE) {
					c = 2;
				}
				if(p.getInventory().getChestplate().getType() == Material.IRON_CHESTPLATE) {
					c = 2;
				}
				if(p.getInventory().getChestplate().getType() == Material.CHAINMAIL_CHESTPLATE) {
					c = 1;
				}
				if(p.getInventory().getChestplate().getType() == Material.LEATHER_CHESTPLATE) {
					c = 1;
				}
				if(p.getInventory().getChestplate().getType() == Material.AIR) {
					c = 0;
				}
				
				if(p.getInventory().getHelmet().getType() == Material.AIR) {
					h = 0;
				}
				if(p.getInventory().getHelmet().getType() == Material.NETHERITE_HELMET) {
					h = 4;
				}
				if(p.getInventory().getHelmet().getType() == Material.DIAMOND_HELMET) {
					h = 3;
				}
				if(p.getInventory().getHelmet().getType() == Material.GOLDEN_HELMET) {
					h = 2;
				}
				if(p.getInventory().getHelmet().getType() == Material.IRON_HELMET) {
					h = 2;
				}
				if(p.getInventory().getHelmet().getType() == Material.CHAINMAIL_HELMET) {
					h = 1;
				}
				if(p.getInventory().getHelmet().getType() == Material.LEATHER_HELMET) {
					h = 1;
				}
				
				
				if(p.getInventory().getLeggings().getType() == Material.AIR) {
					l = 0;
				}
				if(p.getInventory().getLeggings().getType() == Material.NETHERITE_LEGGINGS) {
					l = 4;
				}
				if(p.getInventory().getLeggings().getType() == Material.DIAMOND_LEGGINGS) {
					l = 3;
				}
				if(p.getInventory().getLeggings().getType() == Material.GOLDEN_LEGGINGS) {
					l = 2; 
				}
				if(p.getInventory().getLeggings().getType() == Material.IRON_LEGGINGS) {
					l = 2;
				}
				if(p.getInventory().getLeggings().getType() == Material.CHAINMAIL_LEGGINGS) {
					l = 1;
				}
				if(p.getInventory().getLeggings().getType() == Material.LEATHER_LEGGINGS) {
					l = 1;
				} 
				e = l+h+c+b+ level + hp;
				p.setMaxHealth(e);
			}
	 
	 	@EventHandler
		public void onInteract(PlayerRespawnEvent ev) {
			Player p = ev.getPlayer();
			int level = p.getLevel();
				if(p.getInventory().getBoots().getType() == Material.NETHERITE_BOOTS) {
					b = 4;
				}
				if(p.getInventory().getBoots().getType() == Material.DIAMOND_BOOTS) {
					b = 3;
				}
				if(p.getInventory().getBoots().getType() == Material.GOLDEN_BOOTS) {
					b = 2;
				}
				if(p.getInventory().getBoots().getType() == Material.IRON_BOOTS) {
					b = 2;
				}
				if(p.getInventory().getBoots().getType() == Material.CHAINMAIL_BOOTS) {
					b = 1;
				}
				if(p.getInventory().getBoots().getType() == Material.LEATHER_BOOTS) {
					b = 1;
				}
				if(p.getInventory().getBoots().getType() == Material.AIR) {
					b = 0;
				}
				
				
				if(p.getInventory().getChestplate().getType() == Material.NETHERITE_CHESTPLATE) {
					c = 4;
				}
				if(p.getInventory().getChestplate().getType() == Material.DIAMOND_CHESTPLATE) {
					c = 3;
				}
				if(p.getInventory().getChestplate().getType() == Material.GOLDEN_CHESTPLATE) {
					c = 2;
				}
				if(p.getInventory().getChestplate().getType() == Material.IRON_CHESTPLATE) {
					c = 2;
				}
				if(p.getInventory().getChestplate().getType() == Material.CHAINMAIL_CHESTPLATE) {
					c = 1;
				}
				if(p.getInventory().getChestplate().getType() == Material.LEATHER_CHESTPLATE) {
					c = 1;
				}
				if(p.getInventory().getChestplate().getType() == Material.AIR) {
					c = 0;
				}
				
				if(p.getInventory().getHelmet().getType() == Material.AIR) {
					h = 0;
				}
				if(p.getInventory().getHelmet().getType() == Material.NETHERITE_HELMET) {
					h = 4;
				}
				if(p.getInventory().getHelmet().getType() == Material.DIAMOND_HELMET) {
					h = 3;
				}
				if(p.getInventory().getHelmet().getType() == Material.GOLDEN_HELMET) {
					h = 2;
				}
				if(p.getInventory().getHelmet().getType() == Material.IRON_HELMET) {
					h = 2;
				}
				if(p.getInventory().getHelmet().getType() == Material.CHAINMAIL_HELMET) {
					h = 1;
				}
				if(p.getInventory().getHelmet().getType() == Material.LEATHER_HELMET) {
					h = 1;
				}
				
				
				if(p.getInventory().getLeggings().getType() == Material.AIR) {
					l = 0;
				}
				if(p.getInventory().getLeggings().getType() == Material.NETHERITE_LEGGINGS) {
					l = 4;
				}
				if(p.getInventory().getLeggings().getType() == Material.DIAMOND_LEGGINGS) {
					l = 3;
				}
				if(p.getInventory().getLeggings().getType() == Material.GOLDEN_LEGGINGS) {
					l = 2; 
				}
				if(p.getInventory().getLeggings().getType() == Material.IRON_LEGGINGS) {
					l = 2;
				}
				if(p.getInventory().getLeggings().getType() == Material.CHAINMAIL_LEGGINGS) {
					l = 1;
				}
				if(p.getInventory().getLeggings().getType() == Material.LEATHER_LEGGINGS) {
					l = 1;
				} 
				e =l+h+c+b+ level + hp;
				p.setMaxHealth(e);
			}
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	 	//spawn_no_ai

		public boolean onCommand2(CommandSender sender, Command cmd, String label, String[] args) {
			Player p = (Player) sender;
		
		if(cmd.getName().equalsIgnoreCase("spawn_no_ai")) {
			if(args.length == 0) {
				sender.sendMessage("커맨드를 끝까지 쳐주세요");
			}
			else if(args[0].equalsIgnoreCase("bat")) {
				Player player = (Player) sender;
			    setentityStats((LivingEntity) player.getWorld().spawnEntity(player.getLocation(), EntityType.BAT));
			}
			else if(args[0].equalsIgnoreCase("bee")) {
				Player player = (Player) sender;
			    setentityStats((LivingEntity) player.getWorld().spawnEntity(player.getLocation(), EntityType.BEE));
			}
			else if(args[0].equalsIgnoreCase("blaze")) {
				Player player = (Player) sender;
			    setentityStats((LivingEntity) player.getWorld().spawnEntity(player.getLocation(), EntityType.BLAZE));
			}
			
			else if(args[0].equalsIgnoreCase("cat")) {
				Player player = (Player) sender;
			    setentityStats((LivingEntity) player.getWorld().spawnEntity(player.getLocation(), EntityType.CAT));
			}
			else if(args[0].equalsIgnoreCase("cave_spider")) {
				Player player = (Player) sender;
			    setentityStats((LivingEntity) player.getWorld().spawnEntity(player.getLocation(), EntityType.CAVE_SPIDER));
			}
			else if(args[0].equalsIgnoreCase("chicken")) {
				Player player = (Player) sender;
			    setentityStats((LivingEntity) player.getWorld().spawnEntity(player.getLocation(), EntityType.CHICKEN));
			}
			else if(args[0].equalsIgnoreCase("cod")) {
				Player player = (Player) sender;
			    setentityStats((LivingEntity) player.getWorld().spawnEntity(player.getLocation(), EntityType.COD)); 
			}
			else if(args[0].equalsIgnoreCase("cow")) {
				Player player = (Player) sender;
			    setentityStats((LivingEntity) player.getWorld().spawnEntity(player.getLocation(), EntityType.COW));
			}
			else if(args[0].equalsIgnoreCase("creeper")) {
				Player player = (Player) sender;
			    setentityStats((LivingEntity) player.getWorld().spawnEntity(player.getLocation(), EntityType.CREEPER));
			}
			
			else if(args[0].equalsIgnoreCase("dolphin")) {
				Player player = (Player) sender;
			    setentityStats((LivingEntity) player.getWorld().spawnEntity(player.getLocation(), EntityType.DOLPHIN)); 
			}
			else if(args[0].equalsIgnoreCase("donkey")) {
				Player player = (Player) sender;
			    setentityStats((LivingEntity) player.getWorld().spawnEntity(player.getLocation(), EntityType.DONKEY));
			}
			else if(args[0].equalsIgnoreCase("drowned")) {
				Player player = (Player) sender;
			    setentityStats((LivingEntity) player.getWorld().spawnEntity(player.getLocation(), EntityType.DROWNED));//드라운드
			}
			
			else if(args[0].equalsIgnoreCase("ender_guardian")) {
				Player player = (Player) sender;
			    setentityStats((LivingEntity) player.getWorld().spawnEntity(player.getLocation(), EntityType.ELDER_GUARDIAN));
			}
			else if(args[0].equalsIgnoreCase("ENDER_DRAGON")) {
				Player player = (Player) sender;
			    setentityStats((LivingEntity) player.getWorld().spawnEntity(player.getLocation(), EntityType.ENDER_DRAGON));
			}
			else if(args[0].equalsIgnoreCase("enderman")) {
				Player player = (Player) sender;
			    setentityStats((LivingEntity) player.getWorld().spawnEntity(player.getLocation(), EntityType.ENDERMAN));
			}
			else if(args[0].equalsIgnoreCase("endermite")) {
				Player player = (Player) sender;
			    setentityStats((LivingEntity) player.getWorld().spawnEntity(player.getLocation(), EntityType.ENDERMITE));
			}
			
			else if(args[0].equalsIgnoreCase("fox")) {
				Player player = (Player) sender;
			    setentityStats((LivingEntity) player.getWorld().spawnEntity(player.getLocation(), EntityType.FOX));
			}
			
			else if(args[0].equalsIgnoreCase("ghast")) {
				Player player = (Player) sender;
			    setentityStats((LivingEntity) player.getWorld().spawnEntity(player.getLocation(), EntityType.GHAST));
			}
			
			else if(args[0].equalsIgnoreCase("mooshroom")) {
				Player player = (Player) sender;
			    setentityStats((LivingEntity) player.getWorld().spawnEntity(player.getLocation(), EntityType.MUSHROOM_COW));
			}
			
			else if(args[0].equalsIgnoreCase("ocelot")) {
				Player player = (Player) sender;
			    setentityStats((LivingEntity) player.getWorld().spawnEntity(player.getLocation(), EntityType.OCELOT));
			}

			else if(args[0].equalsIgnoreCase("parrot")) {
				Player player = (Player) sender;
			    setentityStats((LivingEntity) player.getWorld().spawnEntity(player.getLocation(), EntityType.PARROT));
			}

			else if(args[0].equalsIgnoreCase("pig")) {
				Player player = (Player) sender;
			    setentityStats((LivingEntity) player.getWorld().spawnEntity(player.getLocation(), EntityType.PIG));
			}

			else if(args[0].equalsIgnoreCase("rabbit")) {
				Player player = (Player) sender;
			    setentityStats((LivingEntity) player.getWorld().spawnEntity(player.getLocation(), EntityType.RABBIT));
			}

			else if(args[0].equalsIgnoreCase("skeleton")) {
				Player player = (Player) sender;
			    setentityStats((LivingEntity) player.getWorld().spawnEntity(player.getLocation(), EntityType.SKELETON));
			}
			
			else if(args[0].equalsIgnoreCase("shulker")) {
				Player player = (Player) sender;
			    setentityStats((LivingEntity) player.getWorld().spawnEntity(player.getLocation(), EntityType.SHULKER));
			}
			
			else if(args[0].equalsIgnoreCase("sheep")) {
				Player player = (Player) sender;
			    setentityStats((LivingEntity) player.getWorld().spawnEntity(player.getLocation(), EntityType.SHEEP));
			}

			else if(args[0].equalsIgnoreCase("strider")) {
				Player player = (Player) sender;
			    setentityStats((LivingEntity) player.getWorld().spawnEntity(player.getLocation(), EntityType.STRIDER));
			}

			else if(args[0].equalsIgnoreCase("squid")) {
				Player player = (Player) sender;
			    setentityStats((LivingEntity) player.getWorld().spawnEntity(player.getLocation(), EntityType.SQUID));
			}

			else if(args[0].equalsIgnoreCase("snowman")) {
				Player player = (Player) sender;
			    setentityStats((LivingEntity) player.getWorld().spawnEntity(player.getLocation(), EntityType.SNOWMAN));
			}

			else if(args[0].equalsIgnoreCase("salmon")) {
				Player player = (Player) sender;
			    setentityStats((LivingEntity) player.getWorld().spawnEntity(player.getLocation(), EntityType.SALMON));
			}
			
			else if(args[0].equalsIgnoreCase("tropical_fish")) {
				Player player = (Player) sender;
			    setentityStats((LivingEntity) player.getWorld().spawnEntity(player.getLocation(), EntityType.TROPICAL_FISH));
			}

			else if(args[0].equalsIgnoreCase("turtle")) {
				Player player = (Player) sender;
			    setentityStats((LivingEntity) player.getWorld().spawnEntity(player.getLocation(), EntityType.TURTLE));
			}
			
			else if(args[0].equalsIgnoreCase("wandering_trader")) {
				Player player = (Player) sender;
			    setentityStats((LivingEntity) player.getWorld().spawnEntity(player.getLocation(), EntityType.WANDERING_TRADER));
			}
			
			else if(args[0].equalsIgnoreCase("witch")) {
				Player player = (Player) sender;
			    setentityStats((LivingEntity) player.getWorld().spawnEntity(player.getLocation(), EntityType.WITCH));
			}
			else if(args[0].equalsIgnoreCase("wither")) {
				Player player = (Player) sender;
			    setentityStats((LivingEntity) player.getWorld().spawnEntity(player.getLocation(), EntityType.WITHER));
			}
			else if(args[0].equalsIgnoreCase("wither_skeleton")) {
				Player player = (Player) sender;
			    setentityStats((LivingEntity) player.getWorld().spawnEntity(player.getLocation(), EntityType.WITHER_SKELETON));
			}
			
			else if(args[0].equalsIgnoreCase("zombie")) {
				Player player = (Player) sender;
			    setentityStats((LivingEntity) player.getWorld().spawnEntity(player.getLocation(), EntityType.ZOMBIE));
			}
			else if(args[0].equalsIgnoreCase("zoglin")) {
				Player player = (Player) sender;
			    setentityStats((LivingEntity) player.getWorld().spawnEntity(player.getLocation(), EntityType.ZOGLIN));
			}
			else if(args[0].equalsIgnoreCase("zombie_horse")) {
				Player player = (Player) sender;
			    setentityStats((LivingEntity) player.getWorld().spawnEntity(player.getLocation(), EntityType.ZOMBIE_HORSE));
			}
			else if(args[0].equalsIgnoreCase("zombie_villager")) {
				Player player = (Player) sender;
			    setentityStats((LivingEntity) player.getWorld().spawnEntity(player.getLocation(), EntityType.ZOMBIE_VILLAGER));
			}
			else if(args[0].equalsIgnoreCase("zombified_piglin")) {
				Player player = (Player) sender;
			    setentityStats((LivingEntity) player.getWorld().spawnEntity(player.getLocation(), EntityType.ZOMBIFIED_PIGLIN));
			}
		}
		return false;
	}
		
//-----------------------------------------------------------------------------------------------------------------------------------------------------
		//spawn
		public boolean zombie = false;
		public boolean skeleton = false;
		public boolean creeper = false;
		public boolean Wither_Skeleton = false;
		public boolean witch = false;
		
		public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
			Player p = (Player) sender;
		if(cmd.getName().equalsIgnoreCase("spawn")) {
			if(args.length == 0) {
				sender.sendMessage("커맨드를 끝까지 쳐주세요");
			} 
			
			else if(args[0].equalsIgnoreCase("king_zombie")) {
			Player player = (Player) sender;
		    setZombieStats((LivingEntity) player.getWorld().spawnEntity(player.getLocation(), EntityType.ZOMBIE));
		    zombie = true;
		    World world = player.getWorld();
			   world.setStorm(true);
			   world.setThundering(true);
			}
		
			else if(args[0].equalsIgnoreCase("king_skeleton")) {
				Player player = (Player) sender;                                                       
				setSkeletonStats((LivingEntity) player.getWorld().spawnEntity(player.getLocation(), EntityType.SKELETON));
				skeleton = true;
				World world = player.getWorld();
				world.setStorm(true);
				world.setThundering(true);
			}
			
			else if(args[0].equalsIgnoreCase("king_wither skeleton")) {
				Player player = (Player) sender;
				setWitherSkeletonStats((LivingEntity) player.getWorld().spawnEntity(player.getLocation(), EntityType.WITHER_SKELETON));
				Wither_Skeleton = true;
				World world = player.getWorld();
				world.setStorm(true);
				world.setThundering(true);
			}
			
			else if(args[0].equalsIgnoreCase("king_creeper")) {
				Player player = (Player) sender;
				setCreeperStats((LivingEntity) player.getWorld().spawnEntity(player.getLocation(), EntityType.CREEPER));
				creeper = true;
				World world = player.getWorld();
				world.setStorm(true);
				world.setThundering(true);
			} 
			
			else if(args[0].equalsIgnoreCase("king_Iron golem")) {
				Player player = (Player) sender;
				setCreeperStats((LivingEntity) player.getWorld().spawnEntity(player.getLocation(), EntityType.IRON_GOLEM));
			} 
			
		}
		return false;
	}
	
	public void setentityStats(LivingEntity entity) {
		entity.setAI(false);
		entity.setCustomName("no_ai_mob");
		  entity.setMaxHealth(9999.0);//최대 체력 설정
		  entity.setHealth(9999.0);//현재 체력 설정
	}
	
	 public void setIrongolemStats(LivingEntity entity) {
		 int hp = (int) entity.getHealth();
		 entity.setCustomName("king_Iron golem" + " hp:" + hp);
		  entity.setMaxHealth(5000.0);//최대 체력 설정
		  entity.setHealth(5000.0);//현재 체력 설정
		  entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED,1000000, 60));
		  entity.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST,1000000, 3000));
		  entity.addPotionEffect(new PotionEffect(PotionEffectType.GLOWING,1000000, 1));
		  entity.addPotionEffect(new PotionEffect(PotionEffectType.JUMP,1000000, 10));
		  entity.getEquipment().setItemInHand(new ItemStack(Material.NETHERITE_SWORD));
		  entity.getEquipment().setHelmet(new ItemStack(Material.IRON_HELMET));
		  entity.getEquipment().setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
		  entity.getEquipment().setLeggings(new ItemStack(Material.IRON_LEGGINGS));
		  entity.getEquipment().setBoots(new ItemStack(Material.IRON_BOOTS));
		 }
	
	 public void setWitherSkeletonStats(LivingEntity entity) {
		 int hp = (int) entity.getHealth();
		 entity.setCustomName("king_Wither Skeleton" + " hp:" + hp);
		  entity.setMaxHealth(5000.0);//최대 체력 설정
		  entity.setHealth(5000.0);//현재 체력 설정
		  entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED,1000000, 6));
		  entity.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST,1000000, 3000));
		  entity.addPotionEffect(new PotionEffect(PotionEffectType.GLOWING,1000000, 1));
		  entity.getEquipment().setHelmet(new ItemStack(Material.NETHERITE_HELMET));
		  entity.getEquipment().setChestplate(new ItemStack(Material.NETHERITE_CHESTPLATE));
		  entity.getEquipment().setLeggings(new ItemStack(Material.NETHERITE_LEGGINGS));
		  entity.getEquipment().setBoots(new ItemStack(Material.NETHERITE_BOOTS));
		  entity.getEquipment().setItemInHand(new ItemStack(Material.BOW));
		  if(hp == 0) {
			  Wither_Skeleton = false;
			  Location l = entity.getLocation();
			  World world = entity.getWorld();
			  world.strikeLightning(l);
			  if(!zombie) {                              
				   if(!skeleton) {
					   if(!creeper){
						   if(!Wither_Skeleton) {
							   world.setStorm(false);
							   world.setThundering(false);
						   }
					   }
				   }
			   }
			 }
		  }
	 
	
	 public void setZombieStats(LivingEntity entity) {
		 int hp = (int) entity.getHealth();
	  entity.setCustomName("king_zombie"+ " hp:" + hp);                        // [king_zombie hp:20]
	  entity.setMaxHealth(1000.0);//최대 체력 설정
	  entity.setHealth(1000.0);//현재 체력 설정
	  entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED,1000000, 10));
	  entity.addPotionEffect(new PotionEffect(PotionEffectType.JUMP,1000000, 10));
	  entity.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST,1000000, 300));
	  entity.addPotionEffect(new PotionEffect(PotionEffectType.GLOWING,1000000, 1));
	  entity.getEquipment().setHelmet(new ItemStack(Material.NETHERITE_HELMET));
	  entity.getEquipment().setChestplate(new ItemStack(Material.NETHERITE_CHESTPLATE));
	  entity.getEquipment().setLeggings(new ItemStack(Material.NETHERITE_LEGGINGS));
	  entity.getEquipment().setBoots(new ItemStack(Material.NETHERITE_BOOTS));
	  if(hp == 0) {
		  zombie = false;
		  Location l = entity.getLocation();
		  World world = entity.getWorld();
		  world.strikeLightning(l);
		  if(!zombie) {
			   if(!skeleton) {
				   if(!creeper){
					   if(!Wither_Skeleton) {
						   world.setStorm(false);
						   world.setThundering(false);
					   }
				   }
			   }
		   }
		 }
	 }
	 
	 public void setCreeperStats(LivingEntity entity) {
		 int hp = (int) entity.getHealth();
		  entity.setCustomName("king_creeper"+ " hp:" + hp);
		  entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED,1000000, 100));
		  entity.getEquipment().setItemInHand(new ItemStack(Material.NETHERITE_SWORD));
		  if(hp == 0) {
			  creeper = false;
			  Location l = entity.getLocation();
			  World world = entity.getWorld();
			  world.strikeLightning(l);
			  if(!zombie) {
				   if(!skeleton) {
					   if(!creeper){
						   if(!Wither_Skeleton) {
							   world.setStorm(false);
							   world.setThundering(false);
						   }
					   }
				   }
			   }
			 }
	 }
	 
	 public void setSkeletonStats(LivingEntity entity) {
		 int hp = (int) entity.getHealth();
		 entity.setCustomName("king_skeleton"+ " hp:" + hp);
		 entity.setMaxHealth(1000.0);//최대 체력 설정
		 entity.setHealth(1000.0);//현재 체력 설정
		 entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED,1000000, 10));
		 entity.addPotionEffect(new PotionEffect(PotionEffectType.JUMP,1000000, 10));
		 entity.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST,1000000, 100));
		 entity.addPotionEffect(new PotionEffect(PotionEffectType.GLOWING,1000000, 1));
		 entity.getEquipment().setHelmet(new ItemStack(Material.NETHERITE_HELMET));
		 entity.getEquipment().setChestplate(new ItemStack(Material.NETHERITE_CHESTPLATE));
		 entity.getEquipment().setLeggings(new ItemStack(Material.NETHERITE_LEGGINGS));
		 entity.getEquipment().setBoots(new ItemStack(Material.NETHERITE_BOOTS));
		 entity.getEquipment().setItemInHand(new ItemStack(Material.BOW));
		 if(hp == 0) {
			  skeleton = false;
			  Location l = entity.getLocation();
			  World world = entity.getWorld();
			  world.strikeLightning(l);
			  if(!zombie) {
				   if(!skeleton) {
					   if(!creeper){
						   if(!Wither_Skeleton) {
							   world.setStorm(false);
							   world.setThundering(false);
						   }
					   }
				   }
			   }
			 }
		 }
	 public void setwitchStats(LivingEntity entity) {
		 int hp = (int) entity.getHealth();
		 entity.setCustomName("queen_witch"+ " hp:" + hp);
		 entity.setMaxHealth(1000.0);//최대 체력 설정
		 entity.setHealth(1000.0);//현재 체력 설정
		 entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED,1000000, 10));
		 entity.addPotionEffect(new PotionEffect(PotionEffectType.JUMP,1000000, 10));
		 entity.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST,1000000, 100));
		 entity.addPotionEffect(new PotionEffect(PotionEffectType.GLOWING,1000000, 1));
		 entity.getEquipment().setHelmet(new ItemStack(Material.NETHERITE_HELMET));
		 entity.getEquipment().setChestplate(new ItemStack(Material.NETHERITE_CHESTPLATE));
		 entity.getEquipment().setLeggings(new ItemStack(Material.NETHERITE_LEGGINGS));
		 entity.getEquipment().setBoots(new ItemStack(Material.NETHERITE_BOOTS));
		 if(hp == 0) {
			  witch = false;
			  Location l = entity.getLocation();
			  World world = entity.getWorld();
			  world.strikeLightning(l);
			  if(!zombie) {
				   if(!skeleton) {
					   if(!creeper){
						   if(!Wither_Skeleton) {
							   world.setStorm(false);
							   world.setThundering(false);
						   }
					   }
				   }
			   }
			 }
		 }
	 

	 
}
