package aQute.jpm.lib;

import java.util.*;

import aQute.libg.version.*;

public class ArtifactData {
	public long				time	= System.currentTimeMillis();
	public String			bsn;
	public List<Version>	version;

	public String toString() {
		return "[" + bsn + "]";
	}
}