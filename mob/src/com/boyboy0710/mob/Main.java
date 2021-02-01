package com.boyboy0710.mob;

import org.bukkit.ChatColor;
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
		System.out.println("    mob 를러그인을 성공적으로 불러왔습니다");
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
    //Custom mob
	public boolean custom_bat_ai = true;
	
	public void setcustombatStats(LivingEntity entity) {
		if(custom_bat_ai = false) {
			entity.setAI(false);
		}
		else if (custom_bat_ai = true) {
			entity.setAI(true);
		}
	}
	
		public boolean onCommand2(CommandSender sender, Command cmd, String label, String[] args) {
			Player p = (Player) sender;
		
			if(cmd.getName().equalsIgnoreCase("custom_mob")) {
				if(args.length == 0) {
					sender.sendMessage("커맨드를 끝까지 쳐주세요");
				}
				else if(args[0].equalsIgnoreCase("bat")) {
					Player player = (Player) sender;
				    
				    if(args[1].equalsIgnoreCase("spawn")) {
				    	setcustombatStats((LivingEntity) player.getWorld().spawnEntity(player.getLocation(), EntityType.BAT));
				    	p.sendMessage("커스텀 박쥐를 스폰하였습니다");
				    	p.sendMessage("기본설정은 true입니다");
				    }
				    
				    if(args[1].equalsIgnoreCase("ai")) {
						if(args[2].equalsIgnoreCase("true")) {
							custom_bat_ai = true;
							p.sendMessage("박쥐 ai를 true로 설정했습니다");
						}
						if(args[2].equalsIgnoreCase("false")) {
							custom_bat_ai = false;
							p.sendMessage("박쥐 ai를 false로 설정했습니다");
						}
					}
				}
				
			}
//-------------------------------------------------------------------------------------------------------------------------------------			
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
			
			
			else if(args[0].equalsIgnoreCase("silverflsh")) {
				Player player = (Player) sender;
			    setentityStats((LivingEntity) player.getWorld().spawnEntity(player.getLocation(), EntityType.SILVERFISH));
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
		 int maxhp = (int) entity.getMaxHealth(); 
		 entity.setCustomName("king_Iron golem" + ChatColor.RED   +" ❤" + ChatColor.RED + hp + " / " + ChatColor.GREEN + maxhp);
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
		 int maxhp = (int) entity.getMaxHealth(); 
		 entity.setCustomName("king_Wither Skeleton" + ChatColor.RED   +" ❤" + ChatColor.RED + hp + " / " + ChatColor.GREEN + maxhp);
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
		 int maxhp = (int) entity.getMaxHealth(); 
	  entity.setCustomName("king_zombie"+ ChatColor.RED   +" ❤" + ChatColor.RED + hp + " / " + ChatColor.GREEN + maxhp);                        // [king_zombie hp:20/20]
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
		 int maxhp = (int) entity.getMaxHealth(); 
		  entity.setCustomName("king_creeper"+ ChatColor.RED   +" ❤" + ChatColor.RED + hp + " / " + ChatColor.GREEN + maxhp);
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
		 int maxhp = (int) entity.getMaxHealth(); 
		 entity.setCustomName("king_skeleton"+ ChatColor.RED   +" ❤" + ChatColor.RED + hp + " / " + ChatColor.GREEN + maxhp);
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
		 int maxhp = (int) entity.getMaxHealth(); 
		 int hp = (int) entity.getHealth();
		 entity.setCustomName("queen_witch"+ ChatColor.RED   +" ❤" + ChatColor.RED + hp + " / " + ChatColor.GREEN + maxhp);
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
