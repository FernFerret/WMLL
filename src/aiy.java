import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class aiy extends oo
{

    private static tw d = new tw();
    private java.util.List e;
    private java.util.List f;
    private Random h;
    private Minecraft i;
    private int j;
    private String k;
    private int l;
    private boolean m;
    private int n;
    private boolean o;
    public float b;
    float c;

    public aiy(Minecraft minecraft)
    {
        e = new ArrayList();
        f = new ArrayList();
        h = new Random();
        j = 0;
        k = "";
        l = 0;
        m = false;
        n = 0;
        o = false;
        c = 1.0F;
        i = minecraft;
    }

    public void a(float f1, boolean flag, int i1, int j1)
    {
        agd agd1 = new agd(i.A, i.d, i.e);
        int k1 = agd1.a();
        int l1 = agd1.b();
        nl nl1 = i.q;
        i.u.b();
        GL11.glEnable(3042);
        if(Minecraft.s())
        {
            a(i.h.a(f1), k1, l1);
        } else
        {
            GL11.glBlendFunc(770, 771);
        }
        aan aan1 = i.h.ap.f(3);
        if(i.A.E == 0 && aan1 != null && aan1.c == pb.ba.bO)
        {
            b(k1, l1);
        }
        if(!i.h.a(aad.k))
        {
            float f2 = i.h.aS + (i.h.aR - i.h.aS) * f1;
            if(f2 > 0.0F)
            {
                b(f2, k1, l1);
            }
        }
        if(!i.c.e())
        {
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glBindTexture(3553, i.p.b("/gui/gui.png"));
            aak aak1 = i.h.ap;
            g = -90F;
            b(k1 / 2 - 91, l1 - 22, 0, 0, 182, 22);
            b((k1 / 2 - 91 - 1) + aak1.c * 20, l1 - 22 - 1, 0, 22, 24, 22);
            GL11.glBindTexture(3553, i.p.b("/gui/icons.png"));
            GL11.glEnable(3042);
            GL11.glBlendFunc(775, 769);
            b(k1 / 2 - 7, l1 / 2 - 7, 0, 0, 16, 16);
            GL11.glDisable(3042);
            boolean flag1 = (i.h.Y / 3) % 2 == 1;
            if(i.h.Y < 10)
            {
                flag1 = false;
            }
            int j2 = i.h.bb();
            int k3 = i.h.by;
            h.setSeed(j * 0x4c627);
            boolean flag3 = false;
            ne ne1 = i.h.aF();
            int k5 = ne1.a();
            int j6 = ne1.b();
            f();
            if(i.c.d())
            {
                int i7 = k1 / 2 - 91;
                int k7 = k1 / 2 + 91;
                int j8 = i.h.aE();
                if(j8 > 0)
                {
                    char c1 = '\266';
                    int l9 = (int)(i.h.aW * (float)(c1 + 1));
                    int k10 = (l1 - 32) + 3;
                    b(i7, k10, 0, 64, c1, 5);
                    if(l9 > 0)
                    {
                        b(i7, k10, 0, 69, l9, 5);
                    }
                }
                int i9 = l1 - 39;
                int i10 = i9 - 10;
                int l10 = i.h.au();
                int k11 = -1;
                if(i.h.a(aad.l))
                {
                    k11 = j % 25;
                }
                for(int l11 = 0; l11 < 10; l11++)
                {
                    if(l10 > 0)
                    {
                        int k12 = i7 + l11 * 8;
                        if(l11 * 2 + 1 < l10)
                        {
                            b(k12, i10, 34, 9, 9, 9);
                        }
                        if(l11 * 2 + 1 == l10)
                        {
                            b(k12, i10, 25, 9, 9, 9);
                        }
                        if(l11 * 2 + 1 > l10)
                        {
                            b(k12, i10, 16, 9, 9, 9);
                        }
                    }
                    int l12 = 16;
                    if(i.h.a(aad.u))
                    {
                        l12 += 36;
                    }
                    int k13 = 0;
                    if(flag1)
                    {
                        k13 = 1;
                    }
                    int j14 = i7 + l11 * 8;
                    int l14 = i9;
                    if(j2 <= 4)
                    {
                        l14 += h.nextInt(2);
                    }
                    if(l11 == k11)
                    {
                        l14 -= 2;
                    }
                    byte byte3 = 0;
                    if(i.f.B().s())
                    {
                        byte3 = 5;
                    }
                    b(j14, l14, 16 + k13 * 9, 9 * byte3, 9, 9);
                    if(flag1)
                    {
                        if(l11 * 2 + 1 < k3)
                        {
                            b(j14, l14, l12 + 54, 9 * byte3, 9, 9);
                        }
                        if(l11 * 2 + 1 == k3)
                        {
                            b(j14, l14, l12 + 63, 9 * byte3, 9, 9);
                        }
                    }
                    if(l11 * 2 + 1 < j2)
                    {
                        b(j14, l14, l12 + 36, 9 * byte3, 9, 9);
                    }
                    if(l11 * 2 + 1 == j2)
                    {
                        b(j14, l14, l12 + 45, 9 * byte3, 9, 9);
                    }
                }

                for(int i12 = 0; i12 < 10; i12++)
                {
                    int i13 = i9;
                    int l13 = 16;
                    byte byte2 = 0;
                    if(i.h.a(aad.s))
                    {
                        l13 += 36;
                        byte2 = 13;
                    }
                    if(i.h.aF().d() <= 0.0F && j % (k5 * 3 + 1) == 0)
                    {
                        i13 += h.nextInt(3) - 1;
                    }
                    if(flag3)
                    {
                        byte2 = 1;
                    }
                    int i15 = k7 - i12 * 8 - 9;
                    b(i15, i13, 16 + byte2 * 9, 27, 9, 9);
                    if(flag3)
                    {
                        if(i12 * 2 + 1 < j6)
                        {
                            b(i15, i13, l13 + 54, 27, 9, 9);
                        }
                        if(i12 * 2 + 1 == j6)
                        {
                            b(i15, i13, l13 + 63, 27, 9, 9);
                        }
                    }
                    if(i12 * 2 + 1 < k5)
                    {
                        b(i15, i13, l13 + 36, 27, 9, 9);
                    }
                    if(i12 * 2 + 1 == k5)
                    {
                        b(i15, i13, l13 + 45, 27, 9, 9);
                    }
                }

                if(i.h.a(acn.g))
                {
                    int j12 = i.h.Y();
                    int j13 = (int)Math.ceil(((double)(j12 - 2) * 10D) / 300D);
                    int i14 = (int)Math.ceil(((double)j12 * 10D) / 300D) - j13;
                    for(int k14 = 0; k14 < j13 + i14; k14++)
                    {
                        if(k14 < j13)
                        {
                            b(k7 - k14 * 8 - 9, i10, 16, 18, 9, 9);
                        } else
                        {
                            b(k7 - k14 * 8 - 9, i10, 25, 18, 9, 9);
                        }
                    }

                }
            }
            GL11.glDisable(3042);
            GL11.glEnable(32826);
            tf.c();
            for(int j7 = 0; j7 < 9; j7++)
            {
                int l7 = (k1 / 2 - 90) + j7 * 20 + 2;
                int k8 = l1 - 16 - 3;
                a(j7, l7, k8, f1);
            }

            tf.a();
            GL11.glDisable(32826);
        }
        if(i.h.aB() > 0)
        {
            GL11.glDisable(2929);
            GL11.glDisable(3008);
            int i2 = i.h.aB();
            float f3 = (float)i2 / 100F;
            if(f3 > 1.0F)
            {
                f3 = 1.0F - (float)(i2 - 100) / 10F;
            }
            int k2 = (int)(220F * f3) << 24 | 0x101020;
            a(0, 0, k1, l1, k2);
            GL11.glEnable(3008);
            GL11.glEnable(2929);
        }
        if(i.c.f() && i.h.aU > 0)
        {
            boolean flag2 = false;
            int i3 = flag2 ? 0xffffff : 0x80ff20;
            String s = (new StringBuilder()).append("").append(i.h.aU).toString();
            int k4 = (k1 - nl1.a(s)) / 2;
            int i5 = l1 - 31 - 4;
            nl1.b(s, k4 + 1, i5, 0);
            nl1.b(s, k4 - 1, i5, 0);
            nl1.b(s, k4, i5 + 1, 0);
            nl1.b(s, k4, i5 - 1, 0);
            nl1.b(s, k4, i5, i3);
        }
        WMLL.i.updategui(i);
        if(i.A.F)
        {
            GL11.glPushMatrix();
            if(Minecraft.J > 0L)
            {
                GL11.glTranslatef(0.0F, 32F, 0.0F);
            }
            nl1.a((new StringBuilder()).append("Minecraft 1.2.5 (").append(i.M).append(")").toString(), 2, 2, 0xffffff);
            nl1.a(i.m(), 2, 12, 0xffffff);
            nl1.a(i.n(), 2, 22, 0xffffff);
            nl1.a(i.p(), 2, 32, 0xffffff);
            nl1.a(i.o(), 2, 42, 0xffffff);
            long l2 = Runtime.getRuntime().maxMemory();
            long l3 = Runtime.getRuntime().totalMemory();
            long l5 = Runtime.getRuntime().freeMemory();
            long l6 = l3 - l5;
            String s1 = (new StringBuilder()).append("Used memory: ").append((l6 * 100L) / l2).append("% (").append(l6 / 1024L / 1024L).append("MB) of ").append(l2 / 1024L / 1024L).append("MB").toString();
            b(nl1, s1, k1 - nl1.a(s1) - 2, 2, 0xe0e0e0);
            s1 = (new StringBuilder()).append("Allocated memory: ").append((l3 * 100L) / l2).append("% (").append(l3 / 1024L / 1024L).append("MB)").toString();
            b(nl1, s1, k1 - nl1.a(s1) - 2, 12, 0xe0e0e0);
            b(nl1, (new StringBuilder()).append("x: ").append(i.h.o).toString(), 2, 64, 0xe0e0e0);
            b(nl1, (new StringBuilder()).append("y: ").append(i.h.p).toString(), 2, 72, 0xe0e0e0);
            b(nl1, (new StringBuilder()).append("z: ").append(i.h.q).toString(), 2, 80, 0xe0e0e0);
            b(nl1, (new StringBuilder()).append("f: ").append(gk.c((double)((i.h.u * 4F) / 360F) + 0.5D) & 3).toString(), 2, 88, 0xe0e0e0);
            int j9 = gk.c(i.h.o);
            int j10 = gk.c(i.h.p);
            int i11 = gk.c(i.h.q);
            if(i.f != null && i.f.j(j9, j10, i11))
            {
                ack ack1 = i.f.c(j9, i11);
                b(nl1, (new StringBuilder()).append("lc: ").append(ack1.h() + 15).append(" b: ").append(ack1.a(j9 & 0xf, i11 & 0xf, i.f.i()).y).append(" bl: ").append(ack1.a(wl.b, j9 & 0xf, j10, i11 & 0xf)).append(" sl: ").append(ack1.a(wl.a, j9 & 0xf, j10, i11 & 0xf)).append(" rl: ").append(ack1.c(j9 & 0xf, j10, i11 & 0xf, 0)).toString(), 2, 96, 0xe0e0e0);
            }
            if(!i.f.F)
            {
                b(nl1, (new StringBuilder()).append("Seed: ").append(i.f.v()).toString(), 2, 112, 0xe0e0e0);
            }
            GL11.glPopMatrix();
        }
        if(l > 0)
        {
            float f4 = (float)l - f1;
            int j3 = (int)((f4 * 256F) / 20F);
            if(j3 > 255)
            {
                j3 = 255;
            }
            if(j3 > 0)
            {
                GL11.glPushMatrix();
                GL11.glTranslatef(k1 / 2, l1 - 48, 0.0F);
                GL11.glEnable(3042);
                GL11.glBlendFunc(770, 771);
                int i4 = 0xffffff;
                if(m)
                {
                    i4 = Color.HSBtoRGB(f4 / 50F, 0.7F, 0.6F) & 0xffffff;
                }
                nl1.b(k, -nl1.a(k) / 2, -4, i4 + (j3 << 24));
                GL11.glDisable(3042);
                GL11.glPopMatrix();
            }
        }
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        GL11.glDisable(3008);
        GL11.glPushMatrix();
        GL11.glTranslatef(0.0F, l1 - 48, 0.0F);
        a(nl1);
        GL11.glPopMatrix();
        if((i.h instanceof ahv) && i.A.y.e)
        {
            adl adl1 = ((ahv)i.h).cl;
            java.util.List list = adl1.c;
            int j4 = adl1.d;
            int l4 = j4;
            int j5 = 1;
            for(; l4 > 20; l4 = ((j4 + j5) - 1) / j5)
            {
                j5++;
            }

            int i6 = 300 / j5;
            if(i6 > 150)
            {
                i6 = 150;
            }
            int k6 = (k1 - j5 * i6) / 2;
            byte byte0 = 10;
            a(k6 - 1, byte0 - 1, k6 + i6 * j5, byte0 + 9 * l4, 0x80000000);
            for(int i8 = 0; i8 < j4; i8++)
            {
                int l8 = k6 + (i8 % j5) * i6;
                int k9 = byte0 + (i8 / j5) * 9;
                a(l8, k9, (l8 + i6) - 1, k9 + 8, 0x20ffffff);
                GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                GL11.glEnable(3008);
                if(i8 >= list.size())
                {
                    continue;
                }
                ah ah1 = (ah)list.get(i8);
                nl1.a(ah1.a, l8, k9, 0xffffff);
                i.p.b(i.p.b("/gui/icons.png"));
                int j11 = 0;
                byte byte1 = 0;
                if(ah1.b < 0)
                {
                    byte1 = 5;
                } else
                if(ah1.b < 150)
                {
                    byte1 = 0;
                } else
                if(ah1.b < 300)
                {
                    byte1 = 1;
                } else
                if(ah1.b < 600)
                {
                    byte1 = 2;
                } else
                if(ah1.b < 1000)
                {
                    byte1 = 3;
                } else
                {
                    byte1 = 4;
                }
                g += 100F;
                b((l8 + i6) - 12, k9, 0 + j11 * 10, 176 + byte1 * 8, 10, 8);
                g -= 100F;
            }

        }
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glDisable(2896);
        GL11.glEnable(3008);
    }

    private void a(nl nl1)
    {
        byte byte0 = 10;
        boolean flag = false;
        int i1 = 0;
        int j1 = e.size();
        if(j1 <= 0)
        {
            return;
        }
        if(e())
        {
            byte0 = 20;
            flag = true;
        }
        for(int k1 = 0; k1 + n < e.size() && k1 < byte0; k1++)
        {
            if(((nt)e.get(k1)).b >= 200 && !flag)
            {
                continue;
            }
            nt nt1 = (nt)e.get(k1 + n);
            double d1 = (double)nt1.b / 200D;
            d1 = 1.0D - d1;
            d1 *= 10D;
            if(d1 < 0.0D)
            {
                d1 = 0.0D;
            }
            if(d1 > 1.0D)
            {
                d1 = 1.0D;
            }
            d1 *= d1;
            int l2 = (int)(255D * d1);
            if(flag)
            {
                l2 = 255;
            }
            i1++;
            if(l2 > 2)
            {
                byte byte1 = 3;
                int j3 = -k1 * 9;
                String s = nt1.a;
                a(byte1, j3 - 1, byte1 + 320 + 4, j3 + 8, l2 / 2 << 24);
                GL11.glEnable(3042);
                nl1.a(s, byte1, j3, 0xffffff + (l2 << 24));
            }
        }

        if(flag)
        {
            GL11.glTranslatef(0.0F, nl1.b, 0.0F);
            int l1 = j1 * nl1.b + j1;
            int i2 = i1 * nl1.b + i1;
            int j2 = (n * i2) / j1;
            int k2 = (i2 * i2) / l1;
            if(l1 != i2)
            {
                char c1 = j2 <= 0 ? '`' : '\252';
                int i3 = o ? 0xcc3333 : 0x3333aa;
                a(0, -j2, 2, -j2 - k2, i3 + (c1 << 24));
                a(2, -j2, 1, -j2 - k2, 0xcccccc + (c1 << 24));
            }
        }
    }

    private void f()
    {
        if(or.c == null)
        {
            return;
        }
        oq oq1 = or.c;
        or.c = null;
        nl nl1 = i.q;
        agd agd1 = new agd(i.A, i.d, i.e);
        int i1 = agd1.a();
        char c1 = '\266';
        int j1 = i1 / 2 - c1 / 2;
        int k1 = (int)(((float)oq1.x() / (float)oq1.d()) * (float)(c1 + 1));
        byte byte0 = 12;
        b(j1, byte0, 0, 74, c1, 5);
        b(j1, byte0, 0, 74, c1, 5);
        if(k1 > 0)
        {
            b(j1, byte0, 0, 79, k1, 5);
        }
        String s = "Boss health";
        nl1.a(s, i1 / 2 - nl1.a(s) / 2, byte0 - 10, 0xff00ff);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glBindTexture(3553, i.p.b("/gui/icons.png"));
    }

    private void b(int i1, int j1)
    {
        GL11.glDisable(2929);
        GL11.glDepthMask(false);
        GL11.glBlendFunc(770, 771);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glDisable(3008);
        GL11.glBindTexture(3553, i.p.b("%blur%/misc/pumpkinblur.png"));
        adz adz1 = adz.a;
        adz1.b();
        adz1.a(0.0D, j1, -90D, 0.0D, 1.0D);
        adz1.a(i1, j1, -90D, 1.0D, 1.0D);
        adz1.a(i1, 0.0D, -90D, 1.0D, 0.0D);
        adz1.a(0.0D, 0.0D, -90D, 0.0D, 0.0D);
        adz1.a();
        GL11.glDepthMask(true);
        GL11.glEnable(2929);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    }

    private void a(float f1, int i1, int j1)
    {
        f1 = 1.0F - f1;
        if(f1 < 0.0F)
        {
            f1 = 0.0F;
        }
        if(f1 > 1.0F)
        {
            f1 = 1.0F;
        }
        c += (double)(f1 - c) * 0.01D;
        GL11.glDisable(2929);
        GL11.glDepthMask(false);
        GL11.glBlendFunc(0, 769);
        GL11.glColor4f(c, c, c, 1.0F);
        GL11.glBindTexture(3553, i.p.b("%blur%/misc/vignette.png"));
        adz adz1 = adz.a;
        adz1.b();
        adz1.a(0.0D, j1, -90D, 0.0D, 1.0D);
        adz1.a(i1, j1, -90D, 1.0D, 1.0D);
        adz1.a(i1, 0.0D, -90D, 1.0D, 0.0D);
        adz1.a(0.0D, 0.0D, -90D, 0.0D, 0.0D);
        adz1.a();
        GL11.glDepthMask(true);
        GL11.glEnable(2929);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glBlendFunc(770, 771);
    }

    private void b(float f1, int i1, int j1)
    {
        if(f1 < 1.0F)
        {
            f1 *= f1;
            f1 *= f1;
            f1 = f1 * 0.8F + 0.2F;
        }
        GL11.glDisable(3008);
        GL11.glDisable(2929);
        GL11.glDepthMask(false);
        GL11.glBlendFunc(770, 771);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, f1);
        GL11.glBindTexture(3553, i.p.b("/terrain.png"));
        float f2 = (float)(pb.be.bN % 16) / 16F;
        float f3 = (float)(pb.be.bN / 16) / 16F;
        float f4 = (float)(pb.be.bN % 16 + 1) / 16F;
        float f5 = (float)(pb.be.bN / 16 + 1) / 16F;
        adz adz1 = adz.a;
        adz1.b();
        adz1.a(0.0D, j1, -90D, f2, f5);
        adz1.a(i1, j1, -90D, f4, f5);
        adz1.a(i1, 0.0D, -90D, f4, f3);
        adz1.a(0.0D, 0.0D, -90D, f2, f3);
        adz1.a();
        GL11.glDepthMask(true);
        GL11.glEnable(2929);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    }

    private void a(int i1, int j1, int k1, float f1)
    {
        aan aan1 = i.h.ap.a[i1];
        if(aan1 == null)
        {
            return;
        }
        float f2 = (float)aan1.b - f1;
        if(f2 > 0.0F)
        {
            GL11.glPushMatrix();
            float f3 = 1.0F + f2 / 5F;
            GL11.glTranslatef(j1 + 8, k1 + 12, 0.0F);
            GL11.glScalef(1.0F / f3, (f3 + 1.0F) / 2.0F, 1.0F);
            GL11.glTranslatef(-(j1 + 8), -(k1 + 12), 0.0F);
        }
        d.a(i.q, i.p, aan1, j1, k1);
        if(f2 > 0.0F)
        {
            GL11.glPopMatrix();
        }
        d.b(i.q, i.p, aan1, j1, k1);
    }

    public void a()
    {
        if(l > 0)
        {
            l--;
        }
        j++;
        for(int i1 = 0; i1 < e.size(); i1++)
        {
            ((nt)e.get(i1)).b++;
        }

    }

    public void b()
    {
        e.clear();
        f.clear();
    }

    public void a(String s)
    {
        boolean flag = e();
        boolean flag1 = true;
        String s1;
        for(Iterator iterator = i.q.c(s, 320).iterator(); iterator.hasNext(); e.add(0, new nt(s1)))
        {
            s1 = (String)iterator.next();
            if(flag && n > 0)
            {
                o = true;
                a(1);
            }
            if(!flag1)
            {
                s1 = (new StringBuilder()).append(" ").append(s1).toString();
            }
            flag1 = false;
        }

        for(; e.size() > 100; e.remove(e.size() - 1)) { }
    }

    public java.util.List c()
    {
        return f;
    }

    public void d()
    {
        n = 0;
        o = false;
    }

    public void a(int i1)
    {
        n += i1;
        int j1 = e.size();
        if(n > j1 - 20)
        {
            n = j1 - 20;
        }
        if(n <= 0)
        {
            n = 0;
            o = false;
        }
    }

    public dx a(int i1, int j1)
    {
        if(!e())
        {
            return null;
        }
        agd agd1 = new agd(i.A, i.d, i.e);
        j1 = j1 / agd1.c - 40;
        i1 = i1 / agd1.c - 3;
        if(i1 < 0 || j1 < 0)
        {
            return null;
        }
        int k1 = Math.min(20, e.size());
        if(i1 <= 320 && j1 < i.q.b * k1 + k1)
        {
            int l1 = j1 / (i.q.b + 1) + n;
            return new dx(i.q, (nt)e.get(l1), i1, (j1 - (l1 - n) * i.q.b) + l1);
        } else
        {
            return null;
        }
    }

    public void b(String s)
    {
        k = (new StringBuilder()).append("Now playing: ").append(s).toString();
        l = 60;
        m = true;
    }

    public boolean e()
    {
        return i.s instanceof yf;
    }

    public void c(String s)
    {
        adn adn1 = adn.a();
        String s1 = adn1.b(s);
        a(s1);
    }

}