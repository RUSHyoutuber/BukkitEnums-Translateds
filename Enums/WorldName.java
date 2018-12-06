package rush.enums;

import org.bukkit.World;
import org.bukkit.World.Environment;

public enum WorldName {

	NETHER("Mundo do Nether"), 
	NORMAL("Mundo Normal"), 
	THE_END("Mundo do Fim");

	private String name;

	WorldName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public static WorldName valueOf(World world) {
		return WorldName.valueOf(world.getEnvironment());
	}
	
	public static WorldName valueOf(Environment env) {
		return WorldName.valueOf(env.name());
	}

}