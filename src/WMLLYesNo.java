import org.lwjgl.input.Keyboard;


public class WMLLYesNo extends aag {

	protected WMLL wmll;
	protected aag parent;
	byte offset = -16;
	
	public WMLLYesNo(WMLL wmll, aag parent) {
		this.parent = parent;
		this.wmll = wmll;
	}
	
	@SuppressWarnings("unchecked")
	public void b() {
		s.clear();
		s.add(new ahg(0, q / 2 - 100, r / 2 + 10 + offset, 98, 20, "Yes"));
		s.add(new ahg(1, q / 2 + 2, r / 2 + 10 + offset, 98, 20, "No"));
		if (WMLL.debugClassPresent)
			s.add(new ahg(9001, q - 52, r - 22, 50, 20, "Reload"));
	}
	
	protected void a(ahg b) {
		if (b.f == 9001)
			p.a(new WMLLYesNo(wmll, parent));
		if (b.f == 0 || b.f == 1) {
			if (b.f == 0) {
				WMLL.options = WMLL.outputOptions = null;
				WMLL.settingsFile.delete();
				WMLL.outputOptionsFile.delete();
				wmll.loadOptions();
			}
			try {
				p.a(parent.getClass().newInstance());
			} catch (Exception e) {
				e.printStackTrace();
				p.a((aag)null);
			}
		}
	}
	
	protected void a(char c1, int i1) {
		if (i1 == Keyboard.KEY_ESCAPE && parent != null) {
			p.a(parent);
		}
		else
			super.a(c1, i1);
	}
	
	public void a(int i, int j, float f) {
		t_();
		a(u, "\247cAre you sure you want to reset ALL settings to their defaults?", q / 2, r / 2 - 20, 0xffffff);
		WMLLOptions.renderWMLLVersion();
		super.a(i, j, f);
	}
	
	
	
}
