package tk.ninjokin.rpgcraft.util;

public class Experience {

	public Experience getExpFromInt(int exp) {
		return Experience.class.cast(exp);
	}
}