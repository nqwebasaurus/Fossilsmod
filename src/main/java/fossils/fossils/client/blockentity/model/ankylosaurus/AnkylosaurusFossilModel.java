package fossils.fossils.client.blockentity.model.ankylosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class AnkylosaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart osteoderms5;
	private final ModelPart bone2;
	private final ModelPart osteoderms19;
	private final ModelPart bone3;
	private final ModelPart bone;
	private final ModelPart leftleg;
	private final ModelPart leftleg2;
	private final ModelPart leftleg3;
	private final ModelPart leftfoot;
	private final ModelPart rightleg;
	private final ModelPart rightleg2;
	private final ModelPart rightleg3;
	private final ModelPart rightfoot;
	private final ModelPart body;
	private final ModelPart osteoderms4;
	private final ModelPart osteoderms18;
	private final ModelPart body2;
	private final ModelPart osteoderms11;
	private final ModelPart osteoderms17;
	private final ModelPart body3;
	private final ModelPart osteoderms9;
	private final ModelPart osteoderms16;
	private final ModelPart chest;
	private final ModelPart osteoderms3;
	private final ModelPart osteoderms15;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart lefthand2;
	private final ModelPart lefthand;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart righthand2;
	private final ModelPart righthand;
	private final ModelPart neck;
	private final ModelPart osteoderms10;
	private final ModelPart osteoderms14;
	private final ModelPart osteoderms2;
	private final ModelPart neck2;
	private final ModelPart osteoderms;
	private final ModelPart osteoderms13;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart osteoderms6;
	private final ModelPart osteoderms20;
	private final ModelPart tail2;
	private final ModelPart osteoderms7;
	private final ModelPart osteoderms21;
	private final ModelPart tail3;
	private final ModelPart osteoderms12;
	private final ModelPart osteoderms22;
	private final ModelPart osteoderms8;
	private final ModelPart leftClub2;
	private final ModelPart rightClub2;

	public AnkylosaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.osteoderms5 = this.hips.getChild("osteoderms5");
		this.bone2 = this.osteoderms5.getChild("bone2");
		this.osteoderms19 = this.hips.getChild("osteoderms19");
		this.bone3 = this.osteoderms19.getChild("bone3");
		this.bone = this.hips.getChild("bone");
		this.leftleg = this.hips.getChild("leftleg");
		this.leftleg2 = this.leftleg.getChild("leftleg2");
		this.leftleg3 = this.leftleg2.getChild("leftleg3");
		this.leftfoot = this.leftleg3.getChild("leftfoot");
		this.rightleg = this.hips.getChild("rightleg");
		this.rightleg2 = this.rightleg.getChild("rightleg2");
		this.rightleg3 = this.rightleg2.getChild("rightleg3");
		this.rightfoot = this.rightleg3.getChild("rightfoot");
		this.body = this.hips.getChild("body");
		this.osteoderms4 = this.body.getChild("osteoderms4");
		this.osteoderms18 = this.body.getChild("osteoderms18");
		this.body2 = this.body.getChild("body2");
		this.osteoderms11 = this.body2.getChild("osteoderms11");
		this.osteoderms17 = this.body2.getChild("osteoderms17");
		this.body3 = this.body2.getChild("body3");
		this.osteoderms9 = this.body3.getChild("osteoderms9");
		this.osteoderms16 = this.body3.getChild("osteoderms16");
		this.chest = this.body3.getChild("chest");
		this.osteoderms3 = this.chest.getChild("osteoderms3");
		this.osteoderms15 = this.chest.getChild("osteoderms15");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.lefthand2 = this.leftarm2.getChild("lefthand2");
		this.lefthand = this.lefthand2.getChild("lefthand");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.righthand2 = this.rightarm2.getChild("righthand2");
		this.righthand = this.righthand2.getChild("righthand");
		this.neck = this.chest.getChild("neck");
		this.osteoderms10 = this.neck.getChild("osteoderms10");
		this.osteoderms14 = this.neck.getChild("osteoderms14");
		this.osteoderms2 = this.neck.getChild("osteoderms2");
		this.neck2 = this.neck.getChild("neck2");
		this.osteoderms = this.neck2.getChild("osteoderms");
		this.osteoderms13 = this.neck2.getChild("osteoderms13");
		this.head = this.neck2.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.osteoderms6 = this.tail.getChild("osteoderms6");
		this.osteoderms20 = this.tail.getChild("osteoderms20");
		this.tail2 = this.tail.getChild("tail2");
		this.osteoderms7 = this.tail2.getChild("osteoderms7");
		this.osteoderms21 = this.tail2.getChild("osteoderms21");
		this.tail3 = this.tail2.getChild("tail3");
		this.osteoderms12 = this.tail3.getChild("osteoderms12");
		this.osteoderms22 = this.tail3.getChild("osteoderms22");
		this.osteoderms8 = this.tail3.getChild("osteoderms8");
		this.leftClub2 = this.osteoderms8.getChild("leftClub2");
		this.rightClub2 = this.osteoderms8.getChild("rightClub2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -25.5378F, 9.7532F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(55, 119).addBox(-0.006F, -0.05F, 0.025F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.3958F, 1.4715F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(75, 105).addBox(0.0F, -2.3978F, -0.0926F, 0.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(63, 0).addBox(-1.0F, -0.1978F, -0.0926F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.711F, -3.6542F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(70, 29).mirror().addBox(-0.4015F, 0.9296F, 2.8711F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(63, 24).mirror().addBox(-2.4015F, 0.9296F, -3.0289F, 7.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.5698F, -1.7595F, 1.5127F, -0.1963F, 0.0065F, 0.176F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(70, 29).addBox(-4.5985F, 0.9296F, 2.8711F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(63, 24).addBox(-4.5985F, 0.9296F, -3.0289F, 7.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5698F, -1.7595F, 1.5127F, -0.1963F, -0.0065F, -0.176F));

		PartDefinition osteoderms5 = hips.addOrReplaceChild("osteoderms5", CubeListBuilder.create(), PartPose.offset(5.9F, -1.6146F, -2.4021F));

		PartDefinition cube_r5 = osteoderms5.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(85, 146).addBox(-0.49F, -0.8518F, -1.6177F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-1.8059F, -1.979F, 5.3293F, 0.0951F, 0.0157F, 0.1908F));

		PartDefinition cube_r6 = osteoderms5.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(14, 147).addBox(-0.4919F, -0.8719F, -0.3891F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.8059F, -1.979F, 5.3293F, -0.5157F, 0.0157F, 0.1908F));

		PartDefinition cube_r7 = osteoderms5.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(124, 27).addBox(-1.044F, -0.3324F, -1.6381F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.8059F, -1.979F, 5.3293F, -0.1841F, 0.0157F, 0.1908F));

		PartDefinition cube_r8 = osteoderms5.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(146, 28).addBox(-0.4325F, -0.7142F, -1.2529F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-1.6825F, -2.7245F, 0.8454F, 0.154F, 0.0924F, 0.1807F));

		PartDefinition cube_r9 = osteoderms5.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(23, 146).addBox(-0.4343F, -0.9684F, -0.0114F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.6825F, -2.7245F, 0.8454F, -0.4569F, 0.0924F, 0.1807F));

		PartDefinition cube_r10 = osteoderms5.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(123, 85).addBox(-0.9864F, -0.3008F, -1.2495F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.6825F, -2.7245F, 0.8454F, -0.1252F, 0.0924F, 0.1807F));

		PartDefinition bone2 = osteoderms5.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(4.182F, 0.3402F, 3.2386F));

		PartDefinition cube_r11 = bone2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(135, 148).addBox(-0.4994F, -1.9555F, 0.6922F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.104F))
				.texOffs(148, 105).addBox(-0.4994F, -1.9555F, 0.3922F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3071F, -0.0994F, 1.3376F));

		PartDefinition cube_r12 = bone2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(84, 137).addBox(-0.4513F, -1.2404F, -0.7098F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.6156F, -0.1226F, 1.351F));

		PartDefinition cube_r13 = bone2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(127, 101).addBox(-0.5087F, -0.2838F, -2.8159F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(1.3051F, -0.4044F, 1.0066F, 0.4083F, -0.1036F, 1.347F));

		PartDefinition cube_r14 = bone2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(7, 148).addBox(-0.4994F, -1.9555F, 0.3922F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.109F))
				.texOffs(148, 100).addBox(-0.4994F, -1.9555F, 0.6922F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-2.0F, 1.1F, 4.2F, -0.3796F, 0.1966F, 1.3164F));

		PartDefinition cube_r15 = bone2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(145, 150).addBox(-0.5087F, -1.5614F, -0.8516F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.0F, 1.1F, 4.2F, 0.4695F, 0.1931F, 1.3262F));

		PartDefinition cube_r16 = bone2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 140).addBox(-0.5087F, -1.4838F, -0.6159F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-2.0F, 1.1F, 4.2F, 0.0768F, 0.1931F, 1.3262F));

		PartDefinition cube_r17 = bone2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(54, 133).addBox(-0.4513F, -1.7404F, -0.7098F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.0F, 1.1F, 4.2F, -1.6838F, 0.1744F, 1.3315F));

		PartDefinition osteoderms19 = hips.addOrReplaceChild("osteoderms19", CubeListBuilder.create(), PartPose.offset(-5.9F, -1.6146F, -2.4021F));

		PartDefinition cube_r18 = osteoderms19.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(85, 146).mirror().addBox(-0.51F, -0.8518F, -1.6177F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(1.8059F, -1.979F, 5.3293F, 0.0951F, -0.0157F, -0.1908F));

		PartDefinition cube_r19 = osteoderms19.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(14, 147).mirror().addBox(-0.5081F, -0.8719F, -0.3891F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.8059F, -1.979F, 5.3293F, -0.5157F, -0.0157F, -0.1908F));

		PartDefinition cube_r20 = osteoderms19.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(124, 27).mirror().addBox(-0.956F, -0.3324F, -1.6381F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.8059F, -1.979F, 5.3293F, -0.1841F, -0.0157F, -0.1908F));

		PartDefinition cube_r21 = osteoderms19.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(146, 28).mirror().addBox(-0.5675F, -0.7142F, -1.2529F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(1.6825F, -2.7245F, 0.8454F, 0.154F, -0.0924F, -0.1807F));

		PartDefinition cube_r22 = osteoderms19.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(23, 146).mirror().addBox(-0.5657F, -0.9684F, -0.0114F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.6825F, -2.7245F, 0.8454F, -0.4569F, -0.0924F, -0.1807F));

		PartDefinition cube_r23 = osteoderms19.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(123, 85).mirror().addBox(-1.0136F, -0.3008F, -1.2495F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.6825F, -2.7245F, 0.8454F, -0.1252F, -0.0924F, -0.1807F));

		PartDefinition bone3 = osteoderms19.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-4.182F, 0.3402F, 3.2386F));

		PartDefinition cube_r24 = bone3.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(135, 148).mirror().addBox(-0.5006F, -1.9555F, 0.6922F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false)
				.texOffs(148, 105).mirror().addBox(-0.5006F, -1.9555F, 0.3922F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.109F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3071F, 0.0994F, -1.3376F));

		PartDefinition cube_r25 = bone3.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(84, 137).mirror().addBox(-0.5487F, -1.2404F, -0.7098F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.6156F, 0.1226F, -1.351F));

		PartDefinition cube_r26 = bone3.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(127, 101).mirror().addBox(-0.4913F, -0.2838F, -2.8159F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-1.3051F, -0.4044F, 1.0066F, 0.4083F, 0.1036F, -1.347F));

		PartDefinition cube_r27 = bone3.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(7, 148).mirror().addBox(-0.5006F, -1.9555F, 0.3922F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.109F)).mirror(false)
				.texOffs(148, 100).mirror().addBox(-0.5006F, -1.9555F, 0.6922F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(2.0F, 1.1F, 4.2F, -0.3796F, -0.1966F, -1.3164F));

		PartDefinition cube_r28 = bone3.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(145, 150).mirror().addBox(-0.4913F, -1.5614F, -0.8516F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.0F, 1.1F, 4.2F, 0.4695F, -0.1931F, -1.3262F));

		PartDefinition cube_r29 = bone3.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(0, 140).mirror().addBox(-0.4913F, -1.4838F, -0.6159F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(2.0F, 1.1F, 4.2F, 0.0768F, -0.1931F, -1.3262F));

		PartDefinition cube_r30 = bone3.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(54, 133).mirror().addBox(-0.5487F, -1.7404F, -0.7098F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.0F, 1.1F, 4.2F, -1.6838F, -0.1744F, -1.3315F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(6.7698F, -1.7595F, 1.5127F));

		PartDefinition cube_r31 = bone.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(56, 150).mirror().addBox(-0.5F, -1.3F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(51, 148).mirror().addBox(-0.5F, -1.3F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-11.842F, 5.676F, -0.6074F, 0.0787F, -0.0998F, -0.5149F));

		PartDefinition cube_r32 = bone.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(148, 43).mirror().addBox(-0.5F, -1.0F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-11.9059F, 5.398F, -1.419F, 0.2968F, -0.0998F, -0.5149F));

		PartDefinition cube_r33 = bone.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(151, 20).mirror().addBox(0.0197F, 3.4874F, -1.1965F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-11.5332F, 7.3951F, -0.0536F, 0.1834F, -0.0998F, -0.6021F));

		PartDefinition cube_r34 = bone.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(60, 144).mirror().addBox(0.0197F, -0.1759F, -1.4933F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-11.5332F, 7.3951F, -0.0536F, 0.2096F, -0.0998F, -0.6021F));

		PartDefinition cube_r35 = bone.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(144, 140).mirror().addBox(0.0197F, 3.4331F, -1.7316F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-11.5332F, 7.3951F, -0.0536F, 0.2183F, -0.0998F, -0.6021F));

		PartDefinition cube_r36 = bone.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(53, 144).mirror().addBox(-0.8F, -0.5F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-13.1504F, -0.3491F, -1.8306F, -0.3168F, 0.0987F, -0.4684F));

		PartDefinition cube_r37 = bone.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(120, 32).mirror().addBox(-2.7458F, 0.0112F, -0.7851F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(107, 21).mirror().addBox(-1.7458F, 0.0112F, -0.2851F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-12.4395F, -0.6F, 0.0F, -0.4847F, 0.0616F, -0.3701F));

		PartDefinition cube_r38 = bone.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(13, 110).mirror().addBox(-4.0314F, -0.9214F, -6.5951F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(130, 136).mirror().addBox(-4.0314F, -0.9214F, -2.5951F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-12.2779F, -0.4768F, -1.2021F, -0.0316F, 0.3498F, -0.5323F));

		PartDefinition cube_r39 = bone.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(0, 105).mirror().addBox(-2.2835F, -0.9214F, -11.7227F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-12.2779F, -0.4768F, -1.2021F, -0.0332F, 0.4632F, -0.5363F));

		PartDefinition cube_r40 = bone.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(143, 84).mirror().addBox(-6.8958F, -0.9214F, -11.893F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-12.2779F, -0.4768F, -1.2021F, -0.0297F, 0.0445F, -0.5227F));

		PartDefinition cube_r41 = bone.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(30, 104).mirror().addBox(-4.5888F, -0.9214F, -11.1931F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-12.2779F, -0.4768F, -1.2021F, -0.0308F, 0.2626F, -0.5294F));

		PartDefinition cube_r42 = bone.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(9, 116).mirror().addBox(-1.8689F, -0.9214F, -6.1697F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-12.2779F, -0.4768F, -1.2021F, -0.0391F, 0.7074F, -0.5468F));

		PartDefinition cube_r43 = bone.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(119, 120).mirror().addBox(0.1403F, -0.9214F, -3.9076F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-12.2779F, -0.4768F, -1.2021F, -0.0553F, 1.0038F, -0.5681F));

		PartDefinition cube_r44 = bone.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(75, 75).mirror().addBox(-1.191F, -0.9214F, -13.2163F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-12.2779F, -0.4768F, -1.2021F, -0.0337F, 0.4893F, -0.5373F));

		PartDefinition cube_r45 = bone.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(33, 118).mirror().addBox(0.3707F, -0.2379F, -3.8051F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-13.5395F, 0.0F, 0.0F, -0.2489F, -0.0315F, -0.2599F));

		PartDefinition cube_r46 = bone.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(43, 106).mirror().addBox(-0.8139F, 0.0112F, -0.1763F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-12.4395F, -0.6F, 0.0F, -0.4845F, -0.0543F, -0.3092F));

		PartDefinition cube_r47 = bone.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(44, 118).mirror().addBox(-3.7148F, 0.0112F, -0.0328F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-12.4395F, -0.6F, 0.0F, -0.5253F, 0.3833F, -0.5511F));

		PartDefinition cube_r48 = bone.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(130, 144).mirror().addBox(0.0197F, 3.5153F, -0.5415F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-11.5332F, 7.3951F, -0.0536F, 0.0961F, -0.0998F, -0.6021F));

		PartDefinition cube_r49 = bone.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(67, 78).mirror().addBox(0.0F, -2.5F, -1.6F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-13.118F, 3.5943F, 0.4566F, -0.5849F, 0.0027F, -0.1571F));

		PartDefinition cube_r50 = bone.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(21, 150).mirror().addBox(-1.926F, -2.4569F, -1.9933F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-10.7325F, 4.4973F, -0.0092F, 0.7416F, 0.0027F, -0.1571F));

		PartDefinition cube_r51 = bone.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(120, 141).mirror().addBox(0.0197F, -0.1088F, -0.8438F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-11.5332F, 7.3951F, -0.0536F, 0.1223F, -0.0998F, -0.6021F));

		PartDefinition cube_r52 = bone.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(149, 146).mirror().addBox(-0.5F, -1.1865F, -0.3924F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-11.0885F, 6.8777F, -2.0086F, 0.1755F, -0.0646F, -0.5551F));

		PartDefinition cube_r53 = bone.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(79, 148).mirror().addBox(-0.5F, -3.4118F, -0.0695F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-11.0885F, 6.8777F, -2.0086F, 0.638F, -0.0646F, -0.5551F));

		PartDefinition cube_r54 = bone.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(99, 81).mirror().addBox(0.6501F, 0.4029F, -3.0466F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-14.3395F, 0.0F, 0.0F, -0.1552F, -0.0245F, -0.1552F));

		PartDefinition cube_r55 = bone.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(111, 97).mirror().addBox(-3.3F, -0.3F, -0.7F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-13.5246F, -0.4559F, -1.967F, -0.3359F, 0.3468F, -0.5542F));

		PartDefinition cube_r56 = bone.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(143, 84).addBox(5.8958F, -0.9214F, -11.893F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2616F, -0.4768F, -1.2021F, -0.0297F, -0.0445F, 0.5227F));

		PartDefinition cube_r57 = bone.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(0, 105).addBox(1.2835F, -0.9214F, -11.7227F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2616F, -0.4768F, -1.2021F, -0.0332F, -0.4632F, 0.5363F));

		PartDefinition cube_r58 = bone.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(30, 104).addBox(3.5888F, -0.9214F, -11.1931F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2616F, -0.4768F, -1.2021F, -0.0308F, -0.2626F, 0.5294F));

		PartDefinition cube_r59 = bone.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(13, 110).addBox(2.0314F, -0.9214F, -6.5951F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(130, 136).addBox(1.0314F, -0.9214F, -2.5951F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2616F, -0.4768F, -1.2021F, -0.0316F, -0.3498F, 0.5323F));

		PartDefinition cube_r60 = bone.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(119, 120).addBox(-2.1403F, -0.9214F, -3.9076F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.2616F, -0.4768F, -1.2021F, -0.0553F, -1.0038F, 0.5681F));

		PartDefinition cube_r61 = bone.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(9, 116).addBox(-1.1311F, -0.9214F, -6.1697F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.2616F, -0.4768F, -1.2021F, -0.0391F, -0.7074F, 0.5468F));

		PartDefinition cube_r62 = bone.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(75, 75).addBox(0.191F, -0.9214F, -13.2163F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.2616F, -0.4768F, -1.2021F, -0.0337F, -0.4893F, 0.5373F));

		PartDefinition cube_r63 = bone.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(33, 118).addBox(-1.3707F, -0.2379F, -3.8051F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2489F, 0.0315F, 0.2599F));

		PartDefinition cube_r64 = bone.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(120, 32).addBox(1.7458F, 0.0112F, -0.7851F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(107, 21).addBox(0.7458F, 0.0112F, -0.2851F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, -0.6F, 0.0F, -0.4847F, -0.0616F, 0.3701F));

		PartDefinition cube_r65 = bone.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(43, 106).addBox(-0.1861F, 0.0112F, -0.1763F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.1F, -0.6F, 0.0F, -0.4845F, 0.0543F, 0.3092F));

		PartDefinition cube_r66 = bone.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(44, 118).addBox(2.7148F, 0.0112F, -0.0328F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.1F, -0.6F, 0.0F, -0.5253F, -0.3833F, 0.5511F));

		PartDefinition cube_r67 = bone.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(144, 140).addBox(-1.0196F, 3.4331F, -1.7316F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-2.0064F, 7.3951F, -0.0536F, 0.2183F, 0.0998F, 0.6021F));

		PartDefinition cube_r68 = bone.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(151, 20).addBox(-1.0196F, 3.4874F, -1.1965F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-2.0064F, 7.3951F, -0.0536F, 0.1834F, 0.0998F, 0.6021F));

		PartDefinition cube_r69 = bone.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(130, 144).addBox(-1.0196F, 3.5153F, -0.5415F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.0064F, 7.3951F, -0.0536F, 0.0961F, 0.0998F, 0.6021F));

		PartDefinition cube_r70 = bone.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(67, 78).addBox(-1.0F, -2.5F, -1.6F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.4216F, 3.5943F, 0.4566F, -0.5849F, -0.0027F, 0.1571F));

		PartDefinition cube_r71 = bone.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(21, 150).addBox(0.926F, -2.4569F, -1.9933F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.8071F, 4.4973F, -0.0092F, 0.7416F, -0.0027F, 0.1571F));

		PartDefinition cube_r72 = bone.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(56, 150).addBox(-0.5F, -1.3F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(51, 148).addBox(-0.5F, -1.3F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.6976F, 5.676F, -0.6074F, 0.0787F, 0.0998F, 0.5149F));

		PartDefinition cube_r73 = bone.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(148, 43).addBox(-0.5F, -1.0F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.6337F, 5.398F, -1.419F, 0.2968F, 0.0998F, 0.5149F));

		PartDefinition cube_r74 = bone.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(60, 144).addBox(-1.0196F, -0.1759F, -1.4933F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.0064F, 7.3951F, -0.0536F, 0.2096F, 0.0998F, 0.6021F));

		PartDefinition cube_r75 = bone.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(120, 141).addBox(-1.0196F, -0.1088F, -0.8438F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-2.0064F, 7.3951F, -0.0536F, 0.1223F, 0.0998F, 0.6021F));

		PartDefinition cube_r76 = bone.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(149, 146).addBox(-0.5F, -1.1865F, -0.3924F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-2.4511F, 6.8777F, -2.0086F, 0.1755F, 0.0646F, 0.5551F));

		PartDefinition cube_r77 = bone.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(79, 148).addBox(-0.5F, -3.4118F, -0.0695F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.4511F, 6.8777F, -2.0086F, 0.638F, 0.0646F, 0.5551F));

		PartDefinition cube_r78 = bone.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(99, 81).addBox(-1.6501F, 0.4029F, -3.0466F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 0.0F, 0.0F, -0.1552F, 0.0245F, 0.1552F));

		PartDefinition cube_r79 = bone.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(53, 144).addBox(-0.2F, -0.5F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3891F, -0.3491F, -1.8306F, -0.3168F, -0.0987F, 0.4684F));

		PartDefinition cube_r80 = bone.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(111, 97).addBox(0.3F, -0.3F, -0.7F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.015F, -0.4559F, -1.967F, -0.3359F, -0.3468F, 0.5542F));

		PartDefinition leftleg = hips.addOrReplaceChild("leftleg", CubeListBuilder.create().texOffs(99, 40).addBox(-1.0F, 9.2943F, -4.4481F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(8.2F, 1.7318F, -0.244F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r81 = leftleg.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(100, 61).addBox(-1.0F, -4.5273F, -2.2834F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5F, 3.7019F, -0.7153F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r82 = leftleg.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(153, 29).addBox(0.2879F, 2.2954F, -3.2479F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(66, 151).addBox(0.2879F, -0.0351F, -4.5928F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.5F, 5.1354F, -3.0419F, 0.3316F, -0.1745F, 0.0F));

		PartDefinition cube_r83 = leftleg.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(112, 152).addBox(0.2879F, 0.5127F, -1.2979F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.5F, 5.1354F, -3.0419F, 0.1134F, -0.1745F, 0.0F));

		PartDefinition cube_r84 = leftleg.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(152, 79).addBox(0.2879F, 1.1088F, 1.8254F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(107, 152).addBox(0.2879F, -1.2654F, 0.3684F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.5F, 5.1354F, -3.0419F, -0.0611F, -0.1745F, 0.0F));

		PartDefinition cube_r85 = leftleg.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(152, 39).addBox(-0.9836F, 0.7007F, -0.5613F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.5997F, 3.4962F, 1.0089F, -0.0611F, -0.3491F, 0.0F));

		PartDefinition cube_r86 = leftleg.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(154, 3).addBox(0.2879F, -1.4756F, -5.6758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(153, 45).addBox(0.2879F, -1.3709F, -2.6776F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(153, 117).addBox(0.2879F, -4.0388F, -6.149F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(45, 153).addBox(0.2879F, -3.9341F, -3.1508F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.5F, 5.1354F, -3.0419F, 0.1571F, -0.1745F, 0.0F));

		PartDefinition cube_r87 = leftleg.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(154, 32).addBox(-0.9836F, -0.9693F, 0.9526F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(29, 154).addBox(-0.9836F, -1.3363F, -1.9032F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.5997F, 3.4962F, 1.0089F, -0.1047F, -0.3491F, 0.0F));

		PartDefinition cube_r88 = leftleg.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(153, 99).addBox(0.2879F, -3.4685F, -1.3975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.5F, 5.1354F, -3.0419F, -0.1047F, -0.1745F, 0.0F));

		PartDefinition cube_r89 = leftleg.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(55, 86).addBox(0.0F, -0.2273F, -1.6834F, 3.0F, 10.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, 0.9143F, 0.084F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r90 = leftleg.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(115, 61).addBox(-1.0F, 1.988F, -5.0012F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 4.6019F, -1.1153F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r91 = leftleg.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(75, 123).addBox(-1.0F, -2.5F, -0.8F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, 7.3315F, -2.6527F, -0.4363F, 0.0F, 0.0F));

		PartDefinition leftleg2 = leftleg.addOrReplaceChild("leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5F, 12.0786F, -3.1861F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r92 = leftleg2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(131, 0).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 2.4998F, 0.9328F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r93 = leftleg2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(91, 137).addBox(0.499F, -1.0091F, -0.7869F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.499F, 0.9977F, 0.8973F, 0.9338F, 0.0F, 0.0F));

		PartDefinition cube_r94 = leftleg2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(79, 134).addBox(0.499F, -1.0091F, -0.0869F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.499F, 0.9977F, 0.8973F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r95 = leftleg2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(131, 125).addBox(-1.0F, -0.7F, -1.1F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, 7.1214F, 3.069F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r96 = leftleg2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(105, 14).addBox(-1.5F, -0.6F, -2.3F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.4388F, 0.8705F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r97 = leftleg2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(84, 123).addBox(-1.601F, -3.8974F, -0.9438F, 2.0F, 7.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.499F, 4.058F, 2.8349F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r98 = leftleg2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(99, 110).addBox(-1.601F, -0.2974F, -1.5438F, 2.0F, 7.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.499F, 0.9977F, 0.8973F, 0.4538F, 0.0F, 0.0F));

		PartDefinition leftleg3 = leftleg2.addOrReplaceChild("leftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.2162F, 2.7509F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r99 = leftleg3.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(118, 131).addBox(-1.602F, -0.6F, 0.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.499F, 0.2307F, -0.7197F, -0.3491F, 0.0F, 0.0F));

		PartDefinition leftfoot = leftleg3.addOrReplaceChild("leftfoot", CubeListBuilder.create().texOffs(36, 91).addBox(-2.499F, -0.6693F, -3.2197F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 3.0899F, -1.4652F, -0.1745F, 0.0F, 0.0F));

		PartDefinition rightleg = hips.addOrReplaceChild("rightleg", CubeListBuilder.create().texOffs(99, 91).addBox(-3.0F, 9.2943F, -4.4481F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-8.2F, 1.7318F, -0.244F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r100 = rightleg.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(103, 0).addBox(-3.0F, -4.5273F, -2.2834F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, 3.7019F, -0.7153F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r101 = rightleg.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(153, 42).addBox(-1.2879F, 2.2954F, -3.2479F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(151, 96).addBox(-1.2879F, -0.0351F, -4.5928F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-4.5F, 5.1354F, -3.0419F, 0.3316F, 0.1745F, 0.0F));

		PartDefinition cube_r102 = rightleg.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(5, 153).addBox(-1.2879F, 0.5127F, -1.2979F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-4.5F, 5.1354F, -3.0419F, 0.1134F, 0.1745F, 0.0F));

		PartDefinition cube_r103 = rightleg.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(152, 91).addBox(-1.2879F, 1.1088F, 1.8254F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(117, 152).addBox(-1.2879F, -1.2654F, 0.3684F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-4.5F, 5.1354F, -3.0419F, -0.0611F, 0.1745F, 0.0F));

		PartDefinition cube_r104 = rightleg.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(152, 88).addBox(-0.0164F, 0.7007F, -0.5613F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-4.5997F, 3.4962F, 1.0089F, -0.0611F, 0.3491F, 0.0F));

		PartDefinition cube_r105 = rightleg.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(154, 15).addBox(-1.2879F, -1.4756F, -5.6758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(153, 66).addBox(-1.2879F, -1.3709F, -2.6776F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(131, 153).addBox(-1.2879F, -4.0388F, -6.149F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(50, 153).addBox(-1.2879F, -3.9341F, -3.1508F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-4.5F, 5.1354F, -3.0419F, 0.1571F, 0.1745F, 0.0F));

		PartDefinition cube_r106 = rightleg.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(154, 35).addBox(-0.0164F, -0.9693F, 0.9526F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(34, 154).addBox(-0.0164F, -1.3363F, -1.9032F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-4.5997F, 3.4962F, 1.0089F, -0.1047F, 0.3491F, 0.0F));

		PartDefinition cube_r107 = rightleg.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(153, 108).addBox(-1.2879F, -3.4685F, -1.3975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-4.5F, 5.1354F, -3.0419F, -0.1047F, 0.1745F, 0.0F));

		PartDefinition cube_r108 = rightleg.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(88, 85).addBox(-3.0F, -0.2273F, -1.6834F, 3.0F, 10.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, 0.9143F, 0.084F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r109 = rightleg.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(115, 75).addBox(-3.0F, 1.988F, -5.0012F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 4.6019F, -1.1153F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r110 = rightleg.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(36, 124).addBox(-2.0F, -2.5F, -0.8F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5F, 7.3315F, -2.6527F, -0.4363F, 0.0F, 0.0F));

		PartDefinition rightleg2 = rightleg.addOrReplaceChild("rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.5F, 12.0786F, -3.1861F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r111 = rightleg2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(131, 14).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 2.4998F, 0.9328F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r112 = rightleg2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(9, 139).addBox(-1.499F, -1.0091F, -0.7869F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.499F, 0.9977F, 0.8973F, 0.9338F, 0.0F, 0.0F));

		PartDefinition cube_r113 = rightleg2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(136, 100).addBox(-1.499F, -1.0091F, -0.0869F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.499F, 0.9977F, 0.8973F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r114 = rightleg2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(127, 131).addBox(-1.0F, -0.7F, -1.1F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 7.1214F, 3.069F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r115 = rightleg2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(86, 105).addBox(-0.5F, -0.6F, -2.3F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.4388F, 0.8705F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r116 = rightleg2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(45, 124).addBox(-0.399F, -3.8974F, -0.9438F, 2.0F, 7.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.499F, 4.058F, 2.8349F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r117 = rightleg2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(0, 112).addBox(-0.399F, -0.2974F, -1.5438F, 2.0F, 7.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.499F, 0.9977F, 0.8973F, 0.4538F, 0.0F, 0.0F));

		PartDefinition rightleg3 = rightleg2.addOrReplaceChild("rightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.2162F, 2.7509F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r118 = rightleg3.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(61, 132).addBox(-1.398F, -0.6F, 0.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.499F, 0.2307F, -0.7197F, -0.3491F, 0.0F, 0.0F));

		PartDefinition rightfoot = rightleg3.addOrReplaceChild("rightfoot", CubeListBuilder.create().texOffs(0, 92).addBox(-1.501F, -0.6693F, -3.2197F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 3.0899F, -1.4652F, -0.1309F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create().texOffs(63, 12).addBox(-1.0F, -0.65F, -9.0F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.3099F, -3.6876F, 0.1223F, 0.0433F, 0.0053F));

		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(56, 106).addBox(0.0F, -2.6F, -0.1F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5991F, -2.9131F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(143, 104).addBox(0.5F, -2.85F, 3.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(80, 142).addBox(0.5F, -2.75F, 0.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.7F, -9.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r121 = body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(47, 32).mirror().addBox(-11.0439F, 0.622F, -3.5074F, 12.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.418F, 0.3104F, -1.853F, -0.125F, -0.0794F, 0.0342F));

		PartDefinition cube_r122 = body.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(94, 79).mirror().addBox(-8.0439F, 0.622F, -0.5074F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.118F, 0.3104F, -7.853F, -0.12F, 0.0237F, 0.164F));

		PartDefinition cube_r123 = body.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(145, 18).mirror().addBox(-9.4864F, -4.8012F, -0.5071F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.118F, 0.3104F, -7.853F, -0.1063F, -0.0607F, -0.5469F));

		PartDefinition cube_r124 = body.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(120, 25).mirror().addBox(-9.6503F, -9.9857F, -0.5071F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.118F, 0.3104F, -7.853F, -0.0363F, -0.1168F, -1.2985F));

		PartDefinition cube_r125 = body.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(47, 32).addBox(-0.9561F, 0.622F, -3.5074F, 12.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.418F, 0.3104F, -1.853F, -0.125F, 0.0794F, -0.0342F));

		PartDefinition cube_r126 = body.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(120, 25).addBox(3.6503F, -9.9857F, -0.5071F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.118F, 0.3104F, -7.853F, -0.0363F, 0.1168F, 1.2985F));

		PartDefinition cube_r127 = body.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(145, 18).addBox(6.4864F, -4.8012F, -0.5071F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.118F, 0.3104F, -7.853F, -0.1063F, 0.0607F, 0.5469F));

		PartDefinition cube_r128 = body.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(94, 79).addBox(-0.9561F, 0.622F, -0.5074F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.118F, 0.3104F, -7.853F, -0.12F, -0.0237F, -0.164F));

		PartDefinition osteoderms4 = body.addOrReplaceChild("osteoderms4", CubeListBuilder.create(), PartPose.offset(5.9F, -0.3047F, -6.0145F));

		PartDefinition cube_r129 = osteoderms4.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(130, 114).addBox(-0.2472F, -2.2157F, 0.266F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(4.8453F, -0.1552F, 5.4284F, 0.2315F, -0.0844F, 1.3481F));

		PartDefinition cube_r130 = osteoderms4.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(81, 90).addBox(-0.1787F, -2.7625F, -1.2964F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(4.8453F, -0.1552F, 5.4284F, -1.5303F, -0.1036F, 1.3505F));

		PartDefinition cube_r131 = osteoderms4.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(19, 77).addBox(-0.2331F, -3.3983F, 1.8651F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(4.8453F, -0.1552F, 5.4284F, -0.2223F, -0.0794F, 1.3391F));

		PartDefinition cube_r132 = osteoderms4.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(96, 54).addBox(-0.7331F, -0.5181F, -2.0019F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(4.8453F, -0.1552F, 5.4284F, -0.2834F, -0.0794F, 1.3391F));

		PartDefinition cube_r133 = osteoderms4.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(66, 139).addBox(-0.2472F, -2.1013F, -1.1947F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(4.8453F, -0.1552F, 5.4284F, 0.406F, -0.0844F, 1.3481F));

		PartDefinition cube_r134 = osteoderms4.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(92, 148).addBox(-0.4865F, -2.2356F, -0.5032F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(7.7475F, 0.0251F, 1.2913F, -0.2324F, -0.037F, 1.427F));

		PartDefinition cube_r135 = osteoderms4.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(66, 98).addBox(-0.9865F, -0.0095F, -2.7405F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(7.7475F, 0.0251F, 1.2913F, -0.2934F, -0.037F, 1.427F));

		PartDefinition cube_r136 = osteoderms4.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(16, 140).addBox(-0.4865F, -0.0674F, -0.1089F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(8.1268F, -0.0944F, 3.0181F, -1.5399F, -0.061F, 1.4385F));

		PartDefinition cube_r137 = osteoderms4.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(139, 114).addBox(-0.4865F, -1.7674F, -1.4088F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(7.7475F, 0.0251F, 1.2913F, -1.0614F, -0.037F, 1.427F));

		PartDefinition cube_r138 = osteoderms4.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(17, 154).addBox(-0.5023F, -0.1767F, 0.2122F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(9.3453F, -0.1552F, 0.4284F, 0.44F, -0.0418F, 1.436F));

		PartDefinition cube_r139 = osteoderms4.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(127, 90).addBox(-0.5023F, -1.8767F, -2.2878F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(7.7475F, 0.0251F, 1.2913F, 0.6582F, -0.0418F, 1.436F));

		PartDefinition cube_r140 = osteoderms4.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(104, 145).addBox(-0.49F, -0.8518F, -1.6177F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-1.8059F, -3.679F, 4.2293F, 0.2665F, -0.0175F, 0.1906F));

		PartDefinition cube_r141 = osteoderms4.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(146, 120).addBox(-0.4919F, -0.8719F, -0.3891F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.8059F, -3.679F, 4.2293F, -0.3444F, -0.0175F, 0.1906F));

		PartDefinition cube_r142 = osteoderms4.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(118, 0).addBox(-1.544F, -0.3324F, -1.6381F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.8059F, -3.679F, 4.2293F, -0.0127F, -0.0175F, 0.1906F));

		PartDefinition cube_r143 = osteoderms4.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(146, 112).addBox(-0.529F, -0.603F, -1.4024F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-1.5522F, -3.8506F, 0.3511F, 0.2831F, 0.0682F, 0.191F));

		PartDefinition cube_r144 = osteoderms4.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(146, 134).addBox(-0.529F, -0.2603F, -0.158F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.4469F, -4.3137F, 0.6049F, -0.3278F, 0.0682F, 0.191F));

		PartDefinition cube_r145 = osteoderms4.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(124, 96).addBox(-0.8F, 0.2F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(1.6851F, -3.0429F, 4.7725F, -0.167F, -0.2283F, 0.5623F));

		PartDefinition cube_r146 = osteoderms4.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(124, 50).addBox(-1.0F, -0.7F, -2.4F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(1.8086F, -2.3372F, 0.6269F, 0.0074F, 0.0771F, 0.5646F));

		PartDefinition cube_r147 = osteoderms4.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(118, 14).addBox(-1.5F, -0.3F, -1.05F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.6825F, -3.7245F, 0.0454F, 0.0038F, 0.0682F, 0.191F));

		PartDefinition osteoderms18 = body.addOrReplaceChild("osteoderms18", CubeListBuilder.create(), PartPose.offset(-5.9F, -0.3047F, -6.0145F));

		PartDefinition cube_r148 = osteoderms18.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(130, 114).mirror().addBox(-0.7528F, -2.2157F, 0.266F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-4.8453F, -0.1552F, 5.4284F, 0.2315F, 0.0844F, -1.3481F));

		PartDefinition cube_r149 = osteoderms18.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(81, 90).mirror().addBox(-0.8213F, -2.7625F, -1.2964F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-4.8453F, -0.1552F, 5.4284F, -1.5303F, 0.1036F, -1.3505F));

		PartDefinition cube_r150 = osteoderms18.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(19, 77).mirror().addBox(-0.7669F, -3.3983F, 1.8651F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-4.8453F, -0.1552F, 5.4284F, -0.2223F, 0.0794F, -1.3391F));

		PartDefinition cube_r151 = osteoderms18.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(96, 54).mirror().addBox(-1.2669F, -0.5181F, -2.0019F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-4.8453F, -0.1552F, 5.4284F, -0.2834F, 0.0794F, -1.3391F));

		PartDefinition cube_r152 = osteoderms18.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(66, 139).mirror().addBox(-0.7528F, -2.1013F, -1.1947F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-4.8453F, -0.1552F, 5.4284F, 0.406F, 0.0844F, -1.3481F));

		PartDefinition cube_r153 = osteoderms18.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(92, 148).mirror().addBox(-0.5135F, -2.2356F, -0.5032F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-7.7475F, 0.0251F, 1.2913F, -0.2324F, 0.037F, -1.427F));

		PartDefinition cube_r154 = osteoderms18.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(66, 98).mirror().addBox(-1.0135F, -0.0095F, -2.7405F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-7.7475F, 0.0251F, 1.2913F, -0.2934F, 0.037F, -1.427F));

		PartDefinition cube_r155 = osteoderms18.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(16, 140).mirror().addBox(-0.5135F, -0.0674F, -0.1089F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-8.1268F, -0.0944F, 3.0181F, -1.5399F, 0.061F, -1.4385F));

		PartDefinition cube_r156 = osteoderms18.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(139, 114).mirror().addBox(-0.5135F, -1.7674F, -1.4088F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-7.7475F, 0.0251F, 1.2913F, -1.0614F, 0.037F, -1.427F));

		PartDefinition cube_r157 = osteoderms18.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(17, 154).mirror().addBox(-0.4977F, -0.1767F, 0.2122F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F)).mirror(false), PartPose.offsetAndRotation(-9.3453F, -0.1552F, 0.4284F, 0.44F, 0.0418F, -1.436F));

		PartDefinition cube_r158 = osteoderms18.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(127, 90).mirror().addBox(-0.4977F, -1.8767F, -2.2878F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-7.7475F, 0.0251F, 1.2913F, 0.6582F, 0.0418F, -1.436F));

		PartDefinition cube_r159 = osteoderms18.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(104, 145).mirror().addBox(-0.51F, -0.8518F, -1.6177F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(1.8059F, -3.679F, 4.2293F, 0.2665F, 0.0175F, -0.1906F));

		PartDefinition cube_r160 = osteoderms18.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(146, 120).mirror().addBox(-0.5081F, -0.8719F, -0.3891F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.8059F, -3.679F, 4.2293F, -0.3444F, 0.0175F, -0.1906F));

		PartDefinition cube_r161 = osteoderms18.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(118, 0).mirror().addBox(-1.456F, -0.3324F, -1.6381F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.8059F, -3.679F, 4.2293F, -0.0127F, 0.0175F, -0.1906F));

		PartDefinition cube_r162 = osteoderms18.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(146, 112).mirror().addBox(-0.471F, -0.603F, -1.4024F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(1.5522F, -3.8506F, 0.3511F, 0.2831F, -0.0682F, -0.191F));

		PartDefinition cube_r163 = osteoderms18.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(146, 134).mirror().addBox(-0.471F, -0.2603F, -0.158F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.4469F, -4.3137F, 0.6049F, -0.3278F, -0.0682F, -0.191F));

		PartDefinition cube_r164 = osteoderms18.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(124, 96).mirror().addBox(-1.2F, 0.2F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-1.6851F, -3.0429F, 4.7725F, -0.167F, 0.2283F, -0.5623F));

		PartDefinition cube_r165 = osteoderms18.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(124, 50).mirror().addBox(-1.0F, -0.7F, -2.4F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-1.8086F, -2.3372F, 0.6269F, 0.0074F, -0.0771F, -0.5646F));

		PartDefinition cube_r166 = osteoderms18.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(118, 14).mirror().addBox(-1.5F, -0.3F, -1.05F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.6825F, -3.7245F, 0.0454F, 0.0038F, -0.0682F, -0.191F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(19, 82).addBox(-0.5F, -1.15F, -7.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 0.4233F, -7.9067F, 0.0792F, 0.1305F, 0.0103F));

		PartDefinition cube_r167 = body2.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(115, 141).addBox(0.5F, -3.05F, 3.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(125, 141).addBox(0.5F, -3.05F, 0.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, -7.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r168 = body2.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(94, 77).mirror().addBox(-6.0713F, 0.2922F, -0.5001F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.518F, -0.1128F, -2.9463F, -0.0339F, 0.0094F, 0.1655F));

		PartDefinition cube_r169 = body2.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(14, 145).mirror().addBox(-7.7812F, -3.756F, -0.4998F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.518F, -0.1128F, -2.9463F, -0.0318F, -0.0152F, -0.5497F));

		PartDefinition cube_r170 = body2.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(111, 73).mirror().addBox(-10.1161F, -8.0584F, -0.4998F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.518F, -0.1128F, -2.9463F, -0.0129F, -0.0328F, -1.3003F));

		PartDefinition cube_r171 = body2.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(103, 12).mirror().addBox(-6.0713F, 0.2922F, -0.5001F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.018F, -0.1128F, -5.9463F, 0.0522F, -0.005F, 0.1656F));

		PartDefinition cube_r172 = body2.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(145, 6).mirror().addBox(-7.7812F, -3.756F, -0.4998F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.018F, -0.1128F, -5.9463F, 0.0427F, 0.0304F, -0.5492F));

		PartDefinition cube_r173 = body2.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(103, 10).mirror().addBox(-11.1161F, -8.0584F, -0.4998F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.018F, -0.1128F, -5.9463F, 0.0105F, 0.0513F, -1.3F));

		PartDefinition cube_r174 = body2.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(111, 73).addBox(3.1161F, -8.0584F, -0.4998F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.518F, -0.1128F, -2.9463F, -0.0129F, 0.0328F, 1.3003F));

		PartDefinition cube_r175 = body2.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(14, 145).addBox(4.7812F, -3.756F, -0.4998F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.518F, -0.1128F, -2.9463F, -0.0318F, 0.0152F, 0.5497F));

		PartDefinition cube_r176 = body2.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(94, 77).addBox(-2.9287F, 0.2922F, -0.5001F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.518F, -0.1128F, -2.9463F, -0.0339F, -0.0094F, -0.1655F));

		PartDefinition cube_r177 = body2.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(103, 10).addBox(3.1161F, -8.0584F, -0.4998F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.018F, -0.1128F, -5.9463F, 0.0105F, -0.0513F, 1.3F));

		PartDefinition cube_r178 = body2.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(145, 6).addBox(4.7812F, -3.756F, -0.4998F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.018F, -0.1128F, -5.9463F, 0.0427F, -0.0304F, 0.5492F));

		PartDefinition cube_r179 = body2.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(103, 12).addBox(-1.9287F, 0.2922F, -0.5001F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.018F, -0.1128F, -5.9463F, 0.0522F, 0.005F, -0.1656F));

		PartDefinition osteoderms11 = body2.addOrReplaceChild("osteoderms11", CubeListBuilder.create(), PartPose.offset(6.4F, -0.728F, -4.1078F));

		PartDefinition cube_r180 = osteoderms11.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(140, 150).addBox(-0.4865F, -1.2356F, -0.9032F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(8.3475F, 4.0251F, 1.3913F, 0.1993F, 0.027F, 1.4248F));

		PartDefinition cube_r181 = osteoderms11.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(0, 98).addBox(-0.9865F, -0.0095F, -2.4405F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(8.3475F, 4.0251F, 1.3913F, 0.1382F, 0.027F, 1.4248F));

		PartDefinition cube_r182 = osteoderms11.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(52, 127).addBox(-0.4865F, -1.0674F, -0.7088F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(8.3475F, 4.0251F, 1.3913F, -0.3679F, 0.027F, 1.4248F));

		PartDefinition cube_r183 = osteoderms11.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(139, 135).addBox(-0.5023F, -1.4767F, -1.8878F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(8.3475F, 4.0251F, 1.3913F, 0.8285F, 0.0189F, 1.431F));

		PartDefinition cube_r184 = osteoderms11.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(81, 98).addBox(-1.029F, -0.1177F, -3.0307F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(4.8478F, -1.3506F, 1.6511F, -0.0476F, 0.0578F, 0.7015F));

		PartDefinition cube_r185 = osteoderms11.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(145, 39).addBox(-0.529F, -0.9603F, -0.058F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(4.6478F, -0.7506F, 1.6511F, -0.3356F, 0.0578F, 0.7015F));

		PartDefinition cube_r186 = osteoderms11.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(0, 135).addBox(-0.529F, -0.603F, -2.4024F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-1.5522F, -4.1506F, 1.4511F, 0.2831F, 0.0682F, 0.191F));

		PartDefinition cube_r187 = osteoderms11.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(134, 107).addBox(-0.529F, -0.2603F, -0.158F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.4469F, -4.6137F, 1.7049F, -0.3278F, 0.0682F, 0.191F));

		PartDefinition cube_r188 = osteoderms11.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(124, 66).addBox(-1.0F, -1.0F, -1.1F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(1.8086F, -2.3372F, 0.6269F, 0.0074F, 0.0771F, 0.5646F));

		PartDefinition cube_r189 = osteoderms11.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(136, 89).addBox(-1.3F, -0.5F, -1.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(7.7971F, 7.8481F, 1.4489F, 0.0426F, -0.0848F, 1.5586F));

		PartDefinition cube_r190 = osteoderms11.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(15, 104).addBox(-1.5F, -0.3F, -1.65F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.6825F, -3.7245F, 1.1454F, 0.0038F, 0.0682F, 0.191F));

		PartDefinition cube_r191 = osteoderms11.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(70, 134).addBox(-0.529F, -0.8031F, -2.4024F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(4.8478F, -1.3506F, 1.6511F, 0.2317F, 0.0578F, 0.7015F));

		PartDefinition osteoderms17 = body2.addOrReplaceChild("osteoderms17", CubeListBuilder.create(), PartPose.offset(-5.4F, -0.728F, -4.1078F));

		PartDefinition cube_r192 = osteoderms17.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(140, 150).mirror().addBox(-0.5135F, -1.2356F, -0.9032F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-8.3475F, 4.0251F, 1.3913F, 0.1993F, -0.027F, -1.4248F));

		PartDefinition cube_r193 = osteoderms17.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(0, 98).mirror().addBox(-1.0135F, -0.0095F, -2.4405F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-8.3475F, 4.0251F, 1.3913F, 0.1382F, -0.027F, -1.4248F));

		PartDefinition cube_r194 = osteoderms17.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(52, 127).mirror().addBox(-0.5135F, -1.0674F, -0.7088F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-8.3475F, 4.0251F, 1.3913F, -0.3679F, -0.027F, -1.4248F));

		PartDefinition cube_r195 = osteoderms17.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(139, 135).mirror().addBox(-0.4977F, -1.4767F, -1.8878F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-8.3475F, 4.0251F, 1.3913F, 0.8285F, -0.0189F, -1.431F));

		PartDefinition cube_r196 = osteoderms17.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(81, 98).mirror().addBox(-0.971F, -0.1177F, -3.0307F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-4.8478F, -1.3506F, 1.6511F, -0.0476F, -0.0578F, -0.7015F));

		PartDefinition cube_r197 = osteoderms17.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(145, 39).mirror().addBox(-0.471F, -0.9603F, -0.058F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-4.6478F, -0.7506F, 1.6511F, -0.3356F, -0.0578F, -0.7015F));

		PartDefinition cube_r198 = osteoderms17.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(0, 135).mirror().addBox(-0.471F, -0.603F, -2.4024F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(1.5522F, -4.1506F, 1.4511F, 0.2831F, -0.0682F, -0.191F));

		PartDefinition cube_r199 = osteoderms17.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(134, 107).mirror().addBox(-0.471F, -0.2603F, -0.158F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.4469F, -4.6137F, 1.7049F, -0.3278F, -0.0682F, -0.191F));

		PartDefinition cube_r200 = osteoderms17.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(124, 66).mirror().addBox(-1.0F, -1.0F, -1.1F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-1.8086F, -2.3372F, 0.6269F, 0.0074F, -0.0771F, -0.5646F));

		PartDefinition cube_r201 = osteoderms17.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(136, 89).mirror().addBox(-0.7F, -0.5F, -1.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-7.7971F, 7.8481F, 1.4489F, 0.0426F, 0.0848F, -1.5586F));

		PartDefinition cube_r202 = osteoderms17.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(15, 104).mirror().addBox(-1.5F, -0.3F, -1.65F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.6825F, -3.7245F, 1.1454F, 0.0038F, -0.0682F, -0.191F));

		PartDefinition cube_r203 = osteoderms17.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(70, 134).mirror().addBox(-0.471F, -0.8031F, -2.4024F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-4.8478F, -1.3506F, 1.6511F, 0.2317F, -0.0578F, -0.7015F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(86, 9).addBox(-0.5F, -1.15F, -6.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.0035F, -6.9501F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r204 = body3.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(143, 43).addBox(0.5F, -3.05F, 3.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(92, 142).addBox(0.5F, -2.95F, 0.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, -6.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r205 = body3.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(103, 6).mirror().addBox(-5.5781F, 0.2097F, -0.4982F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.418F, -0.1093F, -1.9962F, 0.0952F, -0.0122F, 0.1653F));

		PartDefinition cube_r206 = body3.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(94, 75).mirror().addBox(-11.9825F, -7.5766F, -0.498F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.418F, -0.1093F, -1.9962F, 0.0222F, 0.0934F, -1.2992F));

		PartDefinition cube_r207 = body3.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(144, 12).mirror().addBox(-7.355F, -3.4947F, -0.498F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.418F, -0.1093F, -1.9962F, 0.0799F, 0.0532F, -0.5476F));

		PartDefinition cube_r208 = body3.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(86, 31).mirror().addBox(-12.9825F, -7.5766F, -0.498F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.718F, -0.1093F, -4.9962F, 0.0459F, 0.1774F, -1.296F));

		PartDefinition cube_r209 = body3.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(143, 110).mirror().addBox(-7.355F, -3.4947F, -0.498F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.718F, -0.1093F, -4.9962F, 0.1548F, 0.0984F, -0.5419F));

		PartDefinition cube_r210 = body3.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(111, 59).mirror().addBox(-5.5781F, 0.2097F, -0.4982F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.718F, -0.1093F, -4.9962F, 0.1813F, -0.0265F, 0.1636F));

		PartDefinition cube_r211 = body3.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(144, 12).addBox(4.355F, -3.4947F, -0.498F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.418F, -0.1093F, -1.9962F, 0.0799F, -0.0532F, 0.5476F));

		PartDefinition cube_r212 = body3.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(94, 75).addBox(2.9825F, -7.5766F, -0.498F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.418F, -0.1093F, -1.9962F, 0.0222F, -0.0934F, 1.2992F));

		PartDefinition cube_r213 = body3.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(103, 6).addBox(-2.4219F, 0.2097F, -0.4982F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.418F, -0.1093F, -1.9962F, 0.0952F, 0.0122F, -0.1653F));

		PartDefinition cube_r214 = body3.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(111, 59).addBox(-1.4219F, 0.2097F, -0.4982F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.718F, -0.1093F, -4.9962F, 0.1813F, 0.0265F, -0.1636F));

		PartDefinition cube_r215 = body3.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(143, 110).addBox(4.355F, -3.4947F, -0.498F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.718F, -0.1093F, -4.9962F, 0.1548F, -0.0984F, 0.5419F));

		PartDefinition cube_r216 = body3.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(86, 31).addBox(2.9826F, -7.5766F, -0.498F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.718F, -0.1093F, -4.9962F, 0.0459F, -0.1774F, 1.296F));

		PartDefinition osteoderms9 = body3.addOrReplaceChild("osteoderms9", CubeListBuilder.create(), PartPose.offset(6.4F, -0.7245F, -3.1577F));

		PartDefinition cube_r217 = osteoderms9.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(150, 127).addBox(-0.4865F, -1.2356F, -0.9032F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(8.3475F, 4.0251F, 1.3913F, 0.1993F, 0.027F, 1.4248F));

		PartDefinition cube_r218 = osteoderms9.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(97, 46).addBox(-0.9865F, -0.0095F, -2.4405F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(8.3475F, 4.0251F, 1.3913F, 0.1382F, 0.027F, 1.4248F));

		PartDefinition cube_r219 = osteoderms9.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(127, 38).addBox(-0.4865F, -1.0674F, -0.7088F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(8.3475F, 4.0251F, 1.3913F, -0.3679F, 0.027F, 1.4248F));

		PartDefinition cube_r220 = osteoderms9.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(130, 139).addBox(-0.5023F, -1.4767F, -1.8878F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(8.3475F, 4.0251F, 1.3913F, 0.8285F, 0.0189F, 1.431F));

		PartDefinition cube_r221 = osteoderms9.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(32, 97).addBox(-1.029F, -0.1177F, -3.0307F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(4.7478F, -1.2506F, 1.8511F, 0.0091F, 0.1244F, 0.7067F));

		PartDefinition cube_r222 = osteoderms9.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(145, 80).addBox(-0.729F, -1.5103F, -0.2581F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(4.5478F, -0.6506F, 1.8511F, -0.2788F, 0.1244F, 0.7067F));

		PartDefinition cube_r223 = osteoderms9.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(135, 49).addBox(-0.529F, -0.603F, -2.4024F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-1.5522F, -4.1506F, 1.1511F, 0.2831F, 0.0682F, 0.191F));

		PartDefinition cube_r224 = osteoderms9.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(134, 44).addBox(-0.529F, -0.2603F, -0.1581F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.4469F, -4.6137F, 1.405F, -0.3278F, 0.0682F, 0.191F));

		PartDefinition cube_r225 = osteoderms9.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(136, 39).addBox(-1.3F, -0.5F, -1.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(7.7971F, 7.8481F, 1.4489F, 0.0426F, -0.0848F, 1.5586F));

		PartDefinition cube_r226 = osteoderms9.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(136, 80).addBox(-0.7F, -1.0F, -6.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(1.8086F, -2.3372F, 6.6269F, 0.0074F, 0.0771F, 0.5646F));

		PartDefinition cube_r227 = osteoderms9.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(78, 46).addBox(-1.5F, -0.3F, -2.65F, 3.0F, 1.0F, 6.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.6825F, -3.7245F, 0.8454F, 0.0038F, 0.0682F, 0.191F));

		PartDefinition cube_r228 = osteoderms9.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(135, 23).addBox(-0.529F, -0.803F, -2.4024F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(4.7478F, -1.2506F, 1.8511F, 0.2884F, 0.1244F, 0.7067F));

		PartDefinition osteoderms16 = body3.addOrReplaceChild("osteoderms16", CubeListBuilder.create(), PartPose.offset(-5.4F, -0.7245F, -3.1577F));

		PartDefinition cube_r229 = osteoderms16.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(150, 127).mirror().addBox(-0.5135F, -1.2356F, -0.9032F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-8.3475F, 4.0251F, 1.3913F, 0.1993F, -0.027F, -1.4248F));

		PartDefinition cube_r230 = osteoderms16.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(97, 46).mirror().addBox(-1.0135F, -0.0095F, -2.4405F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-8.3475F, 4.0251F, 1.3913F, 0.1382F, -0.027F, -1.4248F));

		PartDefinition cube_r231 = osteoderms16.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(127, 38).mirror().addBox(-0.5135F, -1.0674F, -0.7088F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-8.3475F, 4.0251F, 1.3913F, -0.3679F, -0.027F, -1.4248F));

		PartDefinition cube_r232 = osteoderms16.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(130, 139).mirror().addBox(-0.4977F, -1.4767F, -1.8878F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-8.3475F, 4.0251F, 1.3913F, 0.8285F, -0.0189F, -1.431F));

		PartDefinition cube_r233 = osteoderms16.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(32, 97).mirror().addBox(-0.971F, -0.1177F, -3.0307F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-4.7478F, -1.2506F, 1.8511F, 0.0091F, -0.1244F, -0.7067F));

		PartDefinition cube_r234 = osteoderms16.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(145, 80).mirror().addBox(-0.271F, -1.5103F, -0.2581F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-4.5478F, -0.6506F, 1.8511F, -0.2788F, -0.1244F, -0.7067F));

		PartDefinition cube_r235 = osteoderms16.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(135, 49).mirror().addBox(-0.471F, -0.603F, -2.4024F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(1.5522F, -4.1506F, 1.1511F, 0.2831F, -0.0682F, -0.191F));

		PartDefinition cube_r236 = osteoderms16.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(134, 44).mirror().addBox(-0.471F, -0.2603F, -0.1581F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.4469F, -4.6137F, 1.405F, -0.3278F, -0.0682F, -0.191F));

		PartDefinition cube_r237 = osteoderms16.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(136, 39).mirror().addBox(-0.7F, -0.5F, -1.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-7.7971F, 7.8481F, 1.4489F, 0.0426F, 0.0848F, -1.5586F));

		PartDefinition cube_r238 = osteoderms16.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(136, 80).mirror().addBox(-1.3F, -1.0F, -6.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-1.8086F, -2.3372F, 6.6269F, 0.0074F, -0.0771F, -0.5646F));

		PartDefinition cube_r239 = osteoderms16.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(78, 46).mirror().addBox(-1.5F, -0.3F, -2.65F, 3.0F, 1.0F, 6.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.6825F, -3.7245F, 0.8454F, 0.0038F, -0.0682F, -0.191F));

		PartDefinition cube_r240 = osteoderms16.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(135, 23).mirror().addBox(-0.471F, -0.803F, -2.4024F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-4.7478F, -1.2506F, 1.8511F, 0.2884F, -0.1244F, -0.7067F));

		PartDefinition chest = body3.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.5088F, -5.8725F, 0.035F, 0.0872F, 0.0031F));

		PartDefinition cube_r241 = chest.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(99, 153).mirror().addBox(-0.889F, 1.7634F, -3.4962F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(136, 130).mirror().addBox(-0.889F, 0.7634F, -2.4962F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.5755F, 6.0945F, -9.9818F, 0.8291F, -1.0352F, -0.9012F));

		PartDefinition cube_r242 = chest.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(139, 119).mirror().addBox(-1.0586F, -0.7939F, -1.2133F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.2194F, 5.2948F, -9.5118F, 1.0016F, -0.1482F, 0.1836F));

		PartDefinition cube_r243 = chest.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(150, 84).mirror().addBox(-1.9183F, -0.3705F, -0.3181F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-9.2797F, 1.2278F, 0.1563F, 0.3064F, -0.311F, 0.117F));

		PartDefinition cube_r244 = chest.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(0, 129).mirror().addBox(-2.5055F, 0.5975F, 0.8775F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-7.4958F, 0.5256F, -3.181F, 0.0184F, -0.311F, 0.117F));

		PartDefinition cube_r245 = chest.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(108, 114).mirror().addBox(-1.9183F, -0.7124F, -1.6052F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-7.8675F, 2.6874F, -4.3651F, 0.4459F, -0.3265F, 0.0595F));

		PartDefinition cube_r246 = chest.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(67, 114).mirror().addBox(-1.8429F, 0.398F, 0.5373F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-7.0497F, 1.9787F, -6.8868F, 0.4022F, -0.3265F, 0.0595F));

		PartDefinition cube_r247 = chest.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(145, 14).mirror().addBox(-5.8062F, -2.1943F, -0.5116F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.418F, 1.7995F, -10.2237F, 0.4398F, 0.2589F, -0.4908F));

		PartDefinition cube_r248 = chest.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(114, 107).mirror().addBox(-8.7367F, -5.5693F, -0.5116F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.418F, 1.7995F, -10.2237F, 0.1435F, 0.487F, -1.2637F));

		PartDefinition cube_r249 = chest.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(144, 26).mirror().addBox(-3.4821F, 0.1627F, -0.5116F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, 1.7995F, -10.2237F, 0.5007F, -0.0769F, 0.147F));

		PartDefinition cube_r250 = chest.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(86, 38).mirror().addBox(-11.9825F, -7.5766F, -0.498F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.418F, 0.8995F, -4.9237F, 0.0882F, 0.32F, -1.2855F));

		PartDefinition cube_r251 = chest.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(145, 4).mirror().addBox(-7.355F, -3.4947F, -0.498F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.418F, 0.8995F, -4.9237F, 0.2837F, 0.1739F, -0.5244F));

		PartDefinition cube_r252 = chest.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(122, 12).mirror().addBox(-5.5781F, 0.2097F, -0.4982F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.418F, 0.8995F, -4.9237F, 0.3278F, -0.0503F, 0.158F));

		PartDefinition cube_r253 = chest.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(107, 38).mirror().addBox(-5.5781F, 0.2097F, -0.4982F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.518F, 0.6995F, -1.9237F, 0.1985F, -0.0293F, 0.1631F));

		PartDefinition cube_r254 = chest.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(145, 2).mirror().addBox(-7.355F, -3.4947F, -0.498F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.518F, 0.6995F, -1.9237F, 0.1698F, 0.1074F, -0.5404F));

		PartDefinition cube_r255 = chest.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(77, 65).mirror().addBox(-12.9825F, -7.5766F, -0.498F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.518F, 0.6995F, -1.9237F, 0.0508F, 0.1942F, -1.2951F));

		PartDefinition cube_r256 = chest.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(47, 40).mirror().addBox(-1.6026F, 0.085F, -1.5911F, 1.0F, 0.0F, 14.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.344F, 10.5674F, -6.0863F, -0.5231F, -0.8501F, 0.555F));

		PartDefinition cube_r257 = chest.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(52, 55).mirror().addBox(-1.4827F, -0.0887F, -0.5214F, 1.0F, 0.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.344F, 10.5674F, -6.0863F, -0.4106F, -0.9878F, 0.5082F));

		PartDefinition cube_r258 = chest.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(52, 67).mirror().addBox(-0.9567F, -0.25F, -1.4011F, 1.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5095F, 10.407F, -6.3438F, -0.4582F, -1.236F, 0.5663F));

		PartDefinition cube_r259 = chest.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(137, 140).mirror().addBox(-0.6963F, -0.1009F, -2.0849F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.5755F, 6.0945F, -9.9818F, -2.8039F, -1.0921F, -1.0377F));

		PartDefinition cube_r260 = chest.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(135, 30).mirror().addBox(-3.4821F, 0.1626F, -0.5116F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.493F, 0.9995F, -7.9237F, 0.4142F, -0.0638F, 0.153F));

		PartDefinition cube_r261 = chest.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(103, 8).mirror().addBox(-10.7367F, -5.5693F, -0.5116F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.418F, 0.9995F, -7.9237F, 0.1149F, 0.4036F, -1.2761F));

		PartDefinition cube_r262 = chest.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(145, 0).mirror().addBox(-5.8062F, -2.1943F, -0.5116F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.418F, 0.9995F, -7.9237F, 0.361F, 0.2171F, -0.5094F));

		PartDefinition cube_r263 = chest.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(113, 125).mirror().addBox(-0.8883F, -0.0972F, -2.0641F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-6.5755F, 6.0945F, -9.9818F, 1.4138F, -1.0352F, -0.9012F));

		PartDefinition cube_r264 = chest.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(86, 112).mirror().addBox(-0.8883F, -1.1663F, -2.3065F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.5755F, 6.0945F, -9.9818F, 1.1345F, -1.0352F, -0.9012F));

		PartDefinition cube_r265 = chest.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(9, 121).mirror().addBox(-1.8429F, 2.0293F, -1.2575F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.1958F, 4.5506F, -9.856F, 1.432F, -0.3265F, 0.0595F));

		PartDefinition cube_r266 = chest.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(56, 112).mirror().addBox(-1.8429F, 0.0645F, 0.4843F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-6.1958F, 4.5506F, -9.856F, 0.5768F, -0.3265F, 0.0595F));

		PartDefinition cube_r267 = chest.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(39, 154).mirror().addBox(-1.9183F, -0.0833F, -0.2453F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-9.0019F, 0.4623F, -0.4239F, 0.6555F, -0.311F, 0.117F));

		PartDefinition cube_r268 = chest.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(128, 71).mirror().addBox(-2.5055F, 0.2733F, 0.6138F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.4958F, 0.5256F, -3.181F, 0.193F, -0.311F, 0.117F));

		PartDefinition cube_r269 = chest.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(47, 40).addBox(0.6026F, 0.085F, -1.5911F, 1.0F, 0.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.344F, 10.5674F, -6.0863F, -0.5231F, 0.8501F, -0.555F));

		PartDefinition cube_r270 = chest.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(52, 55).addBox(0.4827F, -0.0887F, -0.5214F, 1.0F, 0.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.344F, 10.5674F, -6.0863F, -0.4106F, 0.9878F, -0.5082F));

		PartDefinition cube_r271 = chest.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(52, 67).addBox(-0.0433F, -0.25F, -1.4011F, 1.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5095F, 10.407F, -6.3438F, -0.4582F, 1.236F, -0.5663F));

		PartDefinition cube_r272 = chest.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(105, 33).addBox(-4.344F, -0.974F, -3.0107F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.344F, 10.229F, -8.1944F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r273 = chest.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(114, 102).addBox(-3.844F, -0.574F, -2.8107F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.344F, 10.5674F, -5.3863F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r274 = chest.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(103, 138).addBox(0.0F, -3.1254F, -0.0249F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3201F, -2.9949F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r275 = chest.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(61, 137).addBox(0.0F, -2.9F, -1.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1337F, -5.0113F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r276 = chest.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(137, 140).addBox(-0.3037F, -0.1009F, -2.0849F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5755F, 6.0945F, -9.9818F, -2.8039F, 1.0921F, 1.0377F));

		PartDefinition cube_r277 = chest.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(122, 12).addBox(0.5781F, 0.2097F, -0.4982F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.418F, 0.8995F, -4.9237F, 0.3278F, 0.0503F, -0.158F));

		PartDefinition cube_r278 = chest.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(145, 4).addBox(4.355F, -3.4947F, -0.498F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.418F, 0.8995F, -4.9237F, 0.2837F, -0.1739F, 0.5244F));

		PartDefinition cube_r279 = chest.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(86, 38).addBox(2.9825F, -7.5766F, -0.498F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.418F, 0.8995F, -4.9237F, 0.0882F, -0.32F, 1.2855F));

		PartDefinition cube_r280 = chest.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(77, 65).addBox(2.9825F, -7.5766F, -0.498F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.518F, 0.6995F, -1.9237F, 0.0508F, -0.1942F, 1.2951F));

		PartDefinition cube_r281 = chest.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(145, 2).addBox(4.355F, -3.4947F, -0.498F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.518F, 0.6995F, -1.9237F, 0.1698F, -0.1074F, 0.5404F));

		PartDefinition cube_r282 = chest.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(107, 38).addBox(-1.4219F, 0.2097F, -0.4982F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.518F, 0.6995F, -1.9237F, 0.1985F, 0.0293F, -0.1631F));

		PartDefinition cube_r283 = chest.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(144, 26).addBox(0.4821F, 0.1627F, -0.5116F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, 1.7995F, -10.2237F, 0.5007F, 0.0769F, -0.147F));

		PartDefinition cube_r284 = chest.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(114, 107).addBox(2.7367F, -5.5693F, -0.5116F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.418F, 1.7995F, -10.2237F, 0.1435F, -0.487F, 1.2637F));

		PartDefinition cube_r285 = chest.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(145, 14).addBox(2.8062F, -2.1943F, -0.5116F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.418F, 1.7995F, -10.2237F, 0.4398F, -0.2589F, 0.4908F));

		PartDefinition cube_r286 = chest.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(135, 30).addBox(-0.5179F, 0.1626F, -0.5116F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.493F, 0.9995F, -7.9237F, 0.4142F, 0.0638F, -0.153F));

		PartDefinition cube_r287 = chest.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(103, 8).addBox(2.7367F, -5.5693F, -0.5116F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.418F, 0.9995F, -7.9237F, 0.1149F, -0.4036F, 1.2761F));

		PartDefinition cube_r288 = chest.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(145, 0).addBox(2.8062F, -2.1943F, -0.5116F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.418F, 0.9995F, -7.9237F, 0.361F, -0.2171F, 0.5094F));

		PartDefinition cube_r289 = chest.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(99, 153).addBox(-0.111F, 1.7634F, -3.4962F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(136, 130).addBox(-0.111F, 0.7634F, -2.4962F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5755F, 6.0945F, -9.9818F, 0.8291F, 1.0352F, 0.9012F));

		PartDefinition cube_r290 = chest.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(113, 125).addBox(-0.1117F, -0.0972F, -2.0641F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(6.5755F, 6.0945F, -9.9818F, 1.4138F, 1.0352F, 0.9012F));

		PartDefinition cube_r291 = chest.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(139, 119).addBox(0.0586F, -0.7939F, -1.2133F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.2194F, 5.2948F, -9.5118F, 1.0016F, 0.1482F, -0.1836F));

		PartDefinition cube_r292 = chest.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(86, 112).addBox(-0.1117F, -1.1663F, -2.3065F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5755F, 6.0945F, -9.9818F, 1.1345F, 1.0352F, 0.9012F));

		PartDefinition cube_r293 = chest.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(9, 121).addBox(0.8429F, 2.0293F, -1.2575F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.1958F, 4.5506F, -9.856F, 1.432F, 0.3265F, -0.0595F));

		PartDefinition cube_r294 = chest.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(108, 114).addBox(0.9183F, -0.7124F, -1.6052F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(7.8675F, 2.6874F, -4.3651F, 0.4459F, 0.3265F, -0.0595F));

		PartDefinition cube_r295 = chest.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(67, 114).addBox(0.8429F, 0.398F, 0.5373F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(7.0497F, 1.9787F, -6.8868F, 0.4022F, 0.3265F, -0.0595F));

		PartDefinition cube_r296 = chest.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(56, 112).addBox(0.8429F, 0.0645F, 0.4843F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(6.1958F, 4.5506F, -9.856F, 0.5768F, 0.3265F, -0.0595F));

		PartDefinition cube_r297 = chest.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(150, 84).addBox(0.9183F, -0.3705F, -0.3181F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(9.2797F, 1.2278F, 0.1563F, 0.3064F, 0.311F, -0.117F));

		PartDefinition cube_r298 = chest.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(39, 154).addBox(0.9183F, -0.0833F, -0.2453F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(9.0019F, 0.4623F, -0.4239F, 0.6555F, 0.311F, -0.117F));

		PartDefinition cube_r299 = chest.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(0, 129).addBox(1.5055F, 0.5975F, 0.8775F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(7.4958F, 0.5256F, -3.181F, 0.0184F, 0.311F, -0.117F));

		PartDefinition cube_r300 = chest.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(128, 71).addBox(1.5055F, 0.2733F, 0.6138F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.4958F, 0.5256F, -3.181F, 0.193F, 0.311F, -0.117F));

		PartDefinition cube_r301 = chest.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(77, 55).addBox(-1.0F, -0.1F, 0.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1799F, -6.9949F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r302 = chest.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(48, 68).addBox(1.0F, -2.7611F, 0.0073F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.894F, -10.9435F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r303 = chest.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(137, 54).addBox(1.0F, -3.0611F, 0.0073F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.4952F, -8.9836F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r304 = chest.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(62, 105).addBox(0.0F, -0.1611F, -0.9927F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0F, 0.8906F, -9.9237F, 0.2007F, 0.0F, 0.0F));

		PartDefinition osteoderms3 = chest.addOrReplaceChild("osteoderms3", CubeListBuilder.create(), PartPose.offset(4.9F, 0.5843F, -9.2852F));

		PartDefinition cube_r305 = osteoderms3.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(48, 78).addBox(-1.5F, -0.3F, -2.65F, 3.0F, 1.0F, 6.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.9825F, -4.4245F, 6.7454F, 0.0896F, 0.0514F, 0.1962F));

		PartDefinition cube_r306 = osteoderms3.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(45, 133).addBox(-0.529F, -0.2603F, -0.158F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7469F, -5.3137F, 7.305F, -0.242F, 0.0514F, 0.1962F));

		PartDefinition cube_r307 = osteoderms3.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(135, 9).addBox(-0.529F, -0.603F, -2.4024F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.8522F, -4.8506F, 7.0511F, 0.3689F, 0.0514F, 0.1962F));

		PartDefinition cube_r308 = osteoderms3.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(126, 150).addBox(-0.4865F, -0.9356F, -0.4032F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(6.0475F, 2.2251F, 2.7913F, 0.3974F, 0.1876F, 1.4318F));

		PartDefinition cube_r309 = osteoderms3.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(17, 97).addBox(-0.9865F, -0.0095F, -2.4405F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(6.0475F, 2.2251F, 2.7913F, 0.3363F, 0.1876F, 1.4318F));

		PartDefinition cube_r310 = osteoderms3.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(0, 145).addBox(-0.4865F, -1.0674F, -0.1089F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(6.0475F, 2.2251F, 2.7913F, -0.1698F, 0.1876F, 1.4318F));

		PartDefinition cube_r311 = osteoderms3.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(97, 145).addBox(-0.5023F, -0.9767F, -1.8878F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(6.0475F, 2.2251F, 2.7913F, 0.7655F, 0.1783F, 1.4363F));

		PartDefinition cube_r312 = osteoderms3.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(78, 114).addBox(-0.4616F, -0.1314F, -0.0998F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(8.6566F, 2.5106F, 7.0897F, 0.2076F, -0.0179F, 1.406F));

		PartDefinition cube_r313 = osteoderms3.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(142, 54).addBox(-0.4616F, -1.2314F, -1.8998F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(7.879F, 2.6259F, 7.8592F, 0.7749F, -0.0179F, 1.406F));

		PartDefinition cube_r314 = osteoderms3.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(34, 140).addBox(-0.4616F, -1.5106F, 0.3289F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(7.879F, 2.6259F, 7.8592F, -0.3596F, -0.0179F, 1.406F));

		PartDefinition cube_r315 = osteoderms3.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(123, 109).addBox(-1.0F, 0.3F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(8.0191F, 5.9932F, 7.5394F, 0.2612F, 0.1768F, 1.5697F));

		PartDefinition cube_r316 = osteoderms3.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(96, 98).addBox(-0.9616F, -0.1457F, -2.236F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(7.879F, 2.6259F, 7.8592F, 0.1465F, -0.0179F, 1.406F));

		PartDefinition cube_r317 = osteoderms3.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(47, 99).addBox(-1.029F, -0.1177F, -3.0307F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(4.2478F, -2.2506F, 7.8511F, 0.2318F, 0.0815F, 0.7106F));

		PartDefinition cube_r318 = osteoderms3.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(142, 146).addBox(-0.529F, -0.9603F, -0.058F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(4.2478F, -2.2506F, 7.8511F, -0.0562F, 0.0815F, 0.7106F));

		PartDefinition cube_r319 = osteoderms3.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(135, 65).addBox(-0.529F, -0.803F, -2.4024F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(4.2478F, -2.2506F, 7.8511F, 0.5111F, 0.0815F, 0.7106F));

		PartDefinition cube_r320 = osteoderms3.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(96, 67).addBox(-1.029F, -0.1177F, -3.0307F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.5478F, -1.4506F, 1.8511F, 0.3586F, 0.0256F, 0.7354F));

		PartDefinition cube_r321 = osteoderms3.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(72, 145).addBox(-0.529F, -0.9603F, -0.058F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.5478F, -1.4506F, 1.8511F, 0.0706F, 0.0256F, 0.7354F));

		PartDefinition cube_r322 = osteoderms3.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(134, 84).addBox(-0.529F, -0.803F, -2.4024F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(2.5478F, -1.4506F, 1.8511F, 0.6378F, 0.0256F, 0.7354F));

		PartDefinition cube_r323 = osteoderms3.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(90, 24).addBox(-1.4875F, -0.1458F, -3.2873F, 3.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.4198F, -3.8733F, 2.0095F, 0.2206F, 0.2653F, 0.2031F));

		PartDefinition cube_r324 = osteoderms3.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(44, 145).addBox(-0.4875F, -0.9144F, -0.3121F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.4198F, -3.8733F, 2.0095F, -0.0674F, 0.2653F, 0.2031F));

		PartDefinition cube_r325 = osteoderms3.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(9, 134).addBox(-0.4875F, -0.9008F, -2.6413F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-1.4198F, -3.8733F, 2.0095F, 0.4998F, 0.2653F, 0.2031F));

		PartDefinition osteoderms15 = chest.addOrReplaceChild("osteoderms15", CubeListBuilder.create(), PartPose.offset(-4.9F, 0.5843F, -9.2852F));

		PartDefinition cube_r326 = osteoderms15.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(48, 78).mirror().addBox(-1.5F, -0.3F, -2.65F, 3.0F, 1.0F, 6.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.9825F, -4.4245F, 6.7454F, 0.0896F, -0.0514F, -0.1962F));

		PartDefinition cube_r327 = osteoderms15.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(45, 133).mirror().addBox(-0.471F, -0.2603F, -0.158F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.7469F, -5.3137F, 7.305F, -0.242F, -0.0514F, -0.1962F));

		PartDefinition cube_r328 = osteoderms15.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(135, 9).mirror().addBox(-0.471F, -0.603F, -2.4024F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(0.8522F, -4.8506F, 7.0511F, 0.3689F, -0.0514F, -0.1962F));

		PartDefinition cube_r329 = osteoderms15.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(126, 150).mirror().addBox(-0.5135F, -0.9356F, -0.4032F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-6.0475F, 2.2251F, 2.7913F, 0.3974F, -0.1876F, -1.4318F));

		PartDefinition cube_r330 = osteoderms15.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(17, 97).mirror().addBox(-1.0135F, -0.0095F, -2.4405F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-6.0475F, 2.2251F, 2.7913F, 0.3363F, -0.1876F, -1.4318F));

		PartDefinition cube_r331 = osteoderms15.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(0, 145).mirror().addBox(-0.5135F, -1.0674F, -0.1089F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-6.0475F, 2.2251F, 2.7913F, -0.1698F, -0.1876F, -1.4318F));

		PartDefinition cube_r332 = osteoderms15.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(97, 145).mirror().addBox(-0.4977F, -0.9767F, -1.8878F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-6.0475F, 2.2251F, 2.7913F, 0.7655F, -0.1783F, -1.4363F));

		PartDefinition cube_r333 = osteoderms15.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(78, 114).mirror().addBox(-0.5384F, -0.1314F, -0.0998F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.109F)).mirror(false), PartPose.offsetAndRotation(-8.6566F, 2.5106F, 7.0897F, 0.2076F, 0.0179F, -1.406F));

		PartDefinition cube_r334 = osteoderms15.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(142, 54).mirror().addBox(-0.5384F, -1.2314F, -1.8998F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-7.879F, 2.6259F, 7.8592F, 0.7749F, 0.0179F, -1.406F));

		PartDefinition cube_r335 = osteoderms15.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(34, 140).mirror().addBox(-0.5384F, -1.5106F, 0.3289F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-7.879F, 2.6259F, 7.8592F, -0.3596F, 0.0179F, -1.406F));

		PartDefinition cube_r336 = osteoderms15.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(123, 109).mirror().addBox(-1.0F, 0.3F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-8.0191F, 5.9932F, 7.5394F, 0.2612F, -0.1768F, -1.5697F));

		PartDefinition cube_r337 = osteoderms15.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(96, 98).mirror().addBox(-1.0384F, -0.1457F, -2.236F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-7.879F, 2.6259F, 7.8592F, 0.1465F, 0.0179F, -1.406F));

		PartDefinition cube_r338 = osteoderms15.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(47, 99).mirror().addBox(-0.971F, -0.1177F, -3.0307F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-4.2478F, -2.2506F, 7.8511F, 0.2318F, -0.0815F, -0.7106F));

		PartDefinition cube_r339 = osteoderms15.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(142, 146).mirror().addBox(-0.471F, -0.9603F, -0.058F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-4.2478F, -2.2506F, 7.8511F, -0.0562F, -0.0815F, -0.7106F));

		PartDefinition cube_r340 = osteoderms15.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(135, 65).mirror().addBox(-0.471F, -0.803F, -2.4024F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-4.2478F, -2.2506F, 7.8511F, 0.5111F, -0.0815F, -0.7106F));

		PartDefinition cube_r341 = osteoderms15.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(96, 67).mirror().addBox(-0.971F, -0.1177F, -3.0307F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.5478F, -1.4506F, 1.8511F, 0.3586F, -0.0256F, -0.7354F));

		PartDefinition cube_r342 = osteoderms15.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(72, 145).mirror().addBox(-0.471F, -0.9603F, -0.058F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.5478F, -1.4506F, 1.8511F, 0.0706F, -0.0256F, -0.7354F));

		PartDefinition cube_r343 = osteoderms15.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(134, 84).mirror().addBox(-0.471F, -0.803F, -2.4024F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-2.5478F, -1.4506F, 1.8511F, 0.6378F, -0.0256F, -0.7354F));

		PartDefinition cube_r344 = osteoderms15.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(90, 24).mirror().addBox(-1.5125F, -0.1458F, -3.2873F, 3.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.4198F, -3.8733F, 2.0095F, 0.2206F, -0.2653F, -0.2031F));

		PartDefinition cube_r345 = osteoderms15.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(44, 145).mirror().addBox(-0.5125F, -0.9144F, -0.3121F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.4198F, -3.8733F, 2.0095F, -0.0674F, -0.2653F, -0.2031F));

		PartDefinition cube_r346 = osteoderms15.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(9, 134).mirror().addBox(-0.5125F, -0.9008F, -2.6413F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(1.4198F, -3.8733F, 2.0095F, 0.4998F, -0.2653F, -0.2031F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(8.7616F, 6.3458F, -8.2191F, -0.2138F, 0.0338F, -0.0021F));

		PartDefinition cube_r347 = leftarm.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(116, 136).addBox(-0.5F, -2.561F, -1.4986F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.702F, 2.6244F, 1.0163F, 0.1151F, -1.016F, -0.5837F));

		PartDefinition cube_r348 = leftarm.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(116, 147).addBox(-0.5F, -0.9743F, -2.0521F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.702F, 2.6244F, 1.0163F, 1.6684F, -1.016F, -0.5837F));

		PartDefinition cube_r349 = leftarm.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(122, 5).addBox(-0.5F, -1.2439F, -1.3761F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.702F, 2.6244F, 1.0163F, 0.3158F, -1.016F, -0.5837F));

		PartDefinition cube_r350 = leftarm.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(147, 124).addBox(0.4991F, -3.0473F, -2.2197F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7329F, 2.6425F, 1.9228F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r351 = leftarm.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(0, 122).addBox(0.4991F, -2.9813F, -1.7269F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.7329F, 2.6425F, 1.9228F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r352 = leftarm.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(110, 85).addBox(-2.0F, -0.5F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.2662F, 7.4082F, 3.331F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r353 = leftarm.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(154, 136).addBox(1.8298F, -3.2492F, -0.164F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.8877F, 4.0815F, 7.6361F, 0.9048F, 0.3465F, 1.6768F));

		PartDefinition cube_r354 = leftarm.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(154, 145).addBox(4.3173F, 3.4188F, 2.8902F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(153, 114).addBox(6.703F, 3.0323F, 0.3803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(5, 156).addBox(6.4201F, -0.2406F, -0.5261F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(122, 154).addBox(4.6093F, -2.2578F, -2.1367F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(81, 154).addBox(6.81F, -0.5931F, -2.9338F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(155, 126).addBox(3.6379F, -0.8575F, -0.3886F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.593F, 0.8244F, 5.9032F, 0.2781F, 0.8081F, 0.8098F));

		PartDefinition cube_r355 = leftarm.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(122, 125).addBox(0.4991F, 0.0298F, -1.9589F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.7329F, 3.9066F, 3.1436F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r356 = leftarm.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(27, 131).addBox(0.4991F, -1.9702F, -1.8589F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.7329F, 3.9702F, 3.0665F, 0.6021F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2329F, 8.0814F, 6.4069F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r357 = leftarm2.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(35, 149).addBox(-0.5F, 0.0F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8802F, 3.8471F, -1.6682F, 0.0434F, -0.0051F, 0.0089F));

		PartDefinition cube_r358 = leftarm2.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(0, 149).addBox(-0.5F, -1.2F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8991F, 2.2507F, -2.5907F, 0.3052F, -0.0051F, 0.0089F));

		PartDefinition cube_r359 = leftarm2.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(9, 128).addBox(-0.5F, -2.3014F, -1.1033F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9991F, 2.1376F, -0.9814F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r360 = leftarm2.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(43, 138).addBox(-0.5F, -0.8604F, -0.5627F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(137, 70).addBox(-0.5F, -0.8604F, -0.0627F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9991F, 2.1376F, -0.9814F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r361 = leftarm2.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(10, 155).addBox(7.7205F, 6.9961F, 3.5792F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(151, 154).addBox(7.0736F, 5.3436F, 2.6569F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(146, 154).addBox(5.4058F, 5.3807F, 3.7602F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.8259F, -7.2569F, -0.5036F, 0.2781F, 0.8081F, 0.8098F));

		PartDefinition lefthand2 = leftarm2.addOrReplaceChild("lefthand2", CubeListBuilder.create().texOffs(111, 53).addBox(0.0001F, -0.5927F, -1.2898F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5F, 7.0984F, -1.2652F, 0.1309F, 0.0F, 0.0F));

		PartDefinition lefthand = lefthand2.addOrReplaceChild("lefthand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 2.0482F, -0.2347F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r362 = lefthand.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(64, 121).addBox(-0.2952F, -0.6032F, -2.1146F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5729F, 0.0105F, -0.4836F, 0.0F, -0.7767F, 0.0F));

		PartDefinition cube_r363 = lefthand.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(39, 113).addBox(0.0746F, -0.1032F, -2.375F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.499F, -0.4895F, -0.8405F, 0.0F, -0.2182F, 0.0F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-8.7616F, 6.3458F, -8.2191F, 0.1789F, -0.0338F, 0.0021F));

		PartDefinition cube_r364 = rightarm.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(123, 136).addBox(-0.5F, -2.561F, -1.4986F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.702F, 2.6244F, 1.0163F, 0.1151F, 1.016F, 0.5837F));

		PartDefinition cube_r365 = rightarm.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(121, 147).addBox(-0.5F, -0.9743F, -2.0521F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.702F, 2.6244F, 1.0163F, 1.6684F, 1.016F, 0.5837F));

		PartDefinition cube_r366 = rightarm.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(27, 124).addBox(-0.5F, -1.2439F, -1.3761F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.702F, 2.6244F, 1.0163F, 0.3158F, 1.016F, 0.5837F));

		PartDefinition cube_r367 = rightarm.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(148, 76).addBox(-2.4991F, -3.0473F, -2.2197F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7329F, 2.6425F, 1.9228F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r368 = rightarm.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(18, 124).addBox(-2.4991F, -2.9813F, -1.7269F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.7329F, 2.6425F, 1.9228F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r369 = rightarm.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(26, 111).addBox(-1.0F, -0.5F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.2662F, 7.4082F, 3.331F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r370 = rightarm.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(154, 139).addBox(-2.8298F, -3.2492F, -0.164F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.8877F, 4.0815F, 7.6361F, 0.9048F, -0.3465F, -1.6768F));

		PartDefinition cube_r371 = rightarm.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(22, 155).addBox(-5.3173F, 3.4188F, 2.8902F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(153, 120).addBox(-7.703F, 3.0323F, 0.3803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(156, 6).addBox(-7.4201F, -0.2406F, -0.5261F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(136, 154).addBox(-5.6093F, -2.2578F, -2.1367F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(154, 123).addBox(-7.81F, -0.5931F, -2.9338F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(155, 151).addBox(-4.6379F, -0.8575F, -0.3886F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.593F, 0.8244F, 5.9032F, 0.2781F, -0.8081F, -0.8098F));

		PartDefinition cube_r372 = rightarm.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(91, 126).addBox(-2.4991F, 0.0298F, -1.9589F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.7329F, 3.9066F, 3.1436F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r373 = rightarm.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(109, 131).addBox(-2.4991F, -1.9702F, -1.8589F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.7329F, 3.9702F, 3.0665F, 0.6021F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2329F, 8.0814F, 6.4069F, -1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r374 = rightarm2.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(40, 149).addBox(-0.5F, 0.0F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8802F, 3.8471F, -1.6682F, 0.0434F, 0.0051F, -0.0089F));

		PartDefinition cube_r375 = rightarm2.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(30, 149).addBox(-0.5F, -1.2F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8991F, 2.2507F, -2.5907F, 0.3052F, 0.0051F, -0.0089F));

		PartDefinition cube_r376 = rightarm2.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(128, 55).addBox(-0.5F, -2.3014F, -1.1033F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9991F, 2.1376F, -0.9814F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r377 = rightarm2.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(98, 138).addBox(-0.5F, -0.8604F, -0.5627F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(48, 138).addBox(-0.5F, -0.8604F, -0.0627F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9991F, 2.1376F, -0.9814F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r378 = rightarm2.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(155, 75).addBox(-8.7205F, 6.9961F, 3.5792F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(155, 60).addBox(-8.0736F, 5.3436F, 2.6569F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(60, 155).addBox(-6.4058F, 5.3807F, 3.7602F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.8259F, -7.2569F, -0.5036F, 0.2781F, -0.8081F, -0.8098F));

		PartDefinition righthand2 = rightarm2.addOrReplaceChild("righthand2", CubeListBuilder.create().texOffs(111, 67).addBox(-3.0001F, -0.5927F, -1.2898F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5F, 7.0984F, -1.2652F, 0.1309F, 0.0F, 0.0F));

		PartDefinition righthand = righthand2.addOrReplaceChild("righthand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 2.0482F, -0.2347F, 2.0944F, 0.0F, 0.0F));

		PartDefinition cube_r379 = righthand.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(102, 121).addBox(-1.7048F, -0.6032F, -2.1146F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5729F, 0.0105F, -0.4836F, 0.0F, 0.7767F, 0.0F));

		PartDefinition cube_r380 = righthand.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(114, 91).addBox(-3.0746F, -0.1032F, -2.375F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.499F, -0.4895F, -0.8405F, 0.0F, 0.2182F, 0.0F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5866F, -10.4931F, 0.0354F, 0.1744F, 0.0062F));

		PartDefinition cube_r381 = neck.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(48, 73).addBox(1.0F, -2.8352F, 0.0091F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.5832F, -1.8637F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r382 = neck.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(144, 68).mirror().addBox(-5.0423F, -0.3278F, -0.8699F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4115F, -0.8348F, -3.5622F, 0.0981F, 0.4431F, -0.9656F));

		PartDefinition cube_r383 = neck.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(67, 112).mirror().addBox(-2.0145F, 0.5087F, -0.8699F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4115F, -0.8348F, -3.5622F, 0.2701F, 0.3684F, -0.5357F));

		PartDefinition cube_r384 = neck.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(142, 74).mirror().addBox(-5.3863F, -1.3663F, -0.4984F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.018F, 0.3129F, -1.4306F, 0.3119F, 0.2751F, -0.7317F));

		PartDefinition cube_r385 = neck.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(145, 16).mirror().addBox(-2.7369F, -0.3129F, -0.4984F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.018F, 0.3129F, -1.4306F, 0.3914F, 0.1351F, -0.347F));

		PartDefinition cube_r386 = neck.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(67, 112).addBox(0.0145F, 0.5087F, -0.8699F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4115F, -0.8348F, -3.5622F, 0.2701F, -0.3684F, 0.5357F));

		PartDefinition cube_r387 = neck.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(0, 68).addBox(-4.5F, -1.9F, -1.2F, 9.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.2993F, -2.6989F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r388 = neck.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(144, 68).addBox(2.0423F, -0.3278F, -0.8699F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4115F, -0.8348F, -3.5622F, 0.0981F, -0.4431F, 0.9656F));

		PartDefinition cube_r389 = neck.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(145, 16).addBox(-0.2631F, -0.3129F, -0.4984F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.018F, 0.3129F, -1.4306F, 0.3914F, -0.1351F, 0.347F));

		PartDefinition cube_r390 = neck.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(142, 74).addBox(2.3863F, -1.3663F, -0.4984F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.018F, 0.3129F, -1.4306F, 0.3119F, -0.2751F, 0.7317F));

		PartDefinition cube_r391 = neck.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(109, 126).addBox(1.0F, -2.7F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.8887F, -3.8536F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r392 = neck.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(66, 90).addBox(0.0F, -1.2F, -0.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.0616F, -4.4667F, -0.1309F, 0.0F, 0.0F));

		PartDefinition osteoderms10 = neck.addOrReplaceChild("osteoderms10", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4205F, 0.1003F, -1.7233F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r393 = osteoderms10.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(45, 149).addBox(-0.5F, 0.1739F, -0.4364F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4133F, -2.0974F, -2.6844F, 1.8397F, 0.057F, 1.2216F));

		PartDefinition cube_r394 = osteoderms10.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(113, 121).addBox(-0.5F, -1.8261F, -0.4365F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5986F, -2.4334F, -1.1089F, 2.2324F, 0.057F, 1.2216F));

		PartDefinition cube_r395 = osteoderms10.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(84, 150).addBox(-0.5F, -0.5F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(153, 26).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.7455F, -2.4689F, -0.813F, 0.1816F, 0.057F, 1.2216F));

		PartDefinition cube_r396 = osteoderms10.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(100, 126).addBox(-0.5F, 1.0F, -2.9F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(3.8513F, 2.4977F, -0.2674F, 0.393F, 0.2592F, 2.221F));

		PartDefinition cube_r397 = osteoderms10.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(27, 136).addBox(-0.5F, -1.3129F, -1.0846F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5022F, 1.0961F, -1.3945F, 2.4961F, 0.2592F, 2.221F));

		PartDefinition cube_r398 = osteoderms10.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(18, 136).addBox(-1.5F, -0.5F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.1596F, -4.2267F, -1.2339F, 0.3054F, 0.0F, 0.2182F));

		PartDefinition cube_r399 = osteoderms10.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(34, 136).addBox(-1.9972F, -0.6464F, -1.4919F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5795F, -3.8239F, 0.4294F, -0.2182F, 0.0F, 0.2182F));

		PartDefinition osteoderms14 = neck.addOrReplaceChild("osteoderms14", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4205F, 0.1003F, -1.7233F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r400 = osteoderms14.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(45, 149).mirror().addBox(-0.5F, 0.1739F, -0.4364F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4133F, -2.0974F, -2.6844F, 1.8397F, -0.057F, -1.2216F));

		PartDefinition cube_r401 = osteoderms14.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(113, 121).mirror().addBox(-0.5F, -1.8261F, -0.4365F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5986F, -2.4334F, -1.1089F, 2.2324F, -0.057F, -1.2216F));

		PartDefinition cube_r402 = osteoderms14.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(84, 150).mirror().addBox(-0.5F, -0.5F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(153, 26).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.7455F, -2.4689F, -0.813F, 0.1816F, -0.057F, -1.2216F));

		PartDefinition cube_r403 = osteoderms14.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(100, 126).mirror().addBox(-0.5F, 1.0F, -2.9F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-3.8513F, 2.4977F, -0.2674F, 0.393F, -0.2592F, -2.221F));

		PartDefinition cube_r404 = osteoderms14.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(27, 136).mirror().addBox(-0.5F, -1.3129F, -1.0846F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5022F, 1.0961F, -1.3945F, 2.4961F, -0.2592F, -2.221F));

		PartDefinition cube_r405 = osteoderms14.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(18, 136).mirror().addBox(-0.5F, -0.5F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-0.1596F, -4.2267F, -1.2339F, 0.3054F, 0.0F, -0.2182F));

		PartDefinition cube_r406 = osteoderms14.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(34, 136).mirror().addBox(-0.0028F, -0.6464F, -1.4919F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5795F, -3.8239F, 0.4294F, -0.2182F, 0.0F, -0.2182F));

		PartDefinition osteoderms2 = neck.addOrReplaceChild("osteoderms2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.8471F, 0.9936F, -3.9968F, 0.0F, 0.2443F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4617F, -4.7211F, -0.4248F, 0.1652F, -0.178F));

		PartDefinition cube_r407 = neck2.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(75, 67).addBox(-3.0F, -3.4562F, -1.7931F, 7.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0233F, -2.5398F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r408 = neck2.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(111, 147).addBox(0.5F, 0.0F, -2.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.39F, -3.7341F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r409 = neck2.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(52, 113).addBox(0.5F, -2.1F, -0.9F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.8546F, 0.0465F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r410 = neck2.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(119, 155).addBox(0.5F, -2.7F, -0.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 77).addBox(-0.5F, -1.1F, -4.4F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 0.0233F, -2.5398F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r411 = neck2.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(151, 24).mirror().addBox(-2.0145F, 0.5087F, -0.8699F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4115F, -0.7731F, -0.4411F, 0.195F, 0.48F, -0.5667F));

		PartDefinition cube_r412 = neck2.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(150, 131).mirror().addBox(-4.0423F, -0.3278F, -0.8699F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4115F, -0.7731F, -0.4411F, -0.0256F, 0.5146F, -1.0227F));

		PartDefinition cube_r413 = neck2.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(150, 131).addBox(2.0423F, -0.3278F, -0.8699F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4115F, -0.7731F, -0.4411F, -0.0256F, -0.5146F, 1.0227F));

		PartDefinition cube_r414 = neck2.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(151, 24).addBox(0.0145F, 0.5087F, -0.8699F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4115F, -0.7731F, -0.4411F, 0.195F, -0.48F, 0.5667F));

		PartDefinition osteoderms = neck2.addOrReplaceChild("osteoderms", CubeListBuilder.create(), PartPose.offset(2.4205F, 0.4551F, -2.0821F));

		PartDefinition cube_r415 = osteoderms.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(94, 81).addBox(-0.5F, -1.8261F, -0.4365F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0986F, -2.4334F, -1.1089F, 1.9865F, -0.0334F, 1.2187F));

		PartDefinition cube_r416 = osteoderms.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(108, 141).addBox(-0.5F, -0.6735F, -0.2167F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.0986F, -2.4334F, -1.1089F, -0.326F, -0.0334F, 1.2187F));

		PartDefinition cube_r417 = osteoderms.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(53, 139).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.7688F, 0.1636F, -0.4528F, -0.6348F, 0.2096F, 2.0403F));

		PartDefinition cube_r418 = osteoderms.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(12, 151).addBox(-0.5F, -1.2F, -0.55F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7674F, 0.013F, -1.0813F, 1.9919F, 0.2096F, 2.0403F));

		PartDefinition cube_r419 = osteoderms.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(144, 22).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.9404F, -4.2267F, -1.2339F, 0.3054F, 0.0F, 0.2182F));

		PartDefinition cube_r420 = osteoderms.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(144, 96).addBox(-0.9972F, -0.6464F, -1.4919F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5205F, -3.8239F, 0.4294F, -0.2182F, 0.0F, 0.2182F));

		PartDefinition osteoderms13 = neck2.addOrReplaceChild("osteoderms13", CubeListBuilder.create(), PartPose.offset(-2.4205F, 0.4551F, -2.0821F));

		PartDefinition cube_r421 = osteoderms13.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(94, 81).mirror().addBox(-0.5F, -1.8261F, -0.4365F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0986F, -2.4334F, -1.1089F, 1.9865F, 0.0334F, -1.2187F));

		PartDefinition cube_r422 = osteoderms13.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(108, 141).mirror().addBox(-0.5F, -0.6735F, -0.2167F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-1.0986F, -2.4334F, -1.1089F, -0.326F, 0.0334F, -1.2187F));

		PartDefinition cube_r423 = osteoderms13.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(53, 139).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-1.7688F, 0.1636F, -0.4528F, -0.6348F, -0.2096F, -2.0403F));

		PartDefinition cube_r424 = osteoderms13.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(12, 151).mirror().addBox(-0.5F, -1.2F, -0.55F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7674F, 0.013F, -1.0813F, 1.9919F, -0.2096F, -2.0403F));

		PartDefinition cube_r425 = osteoderms13.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(144, 22).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(0.9404F, -4.2267F, -1.2339F, 0.3054F, 0.0F, -0.2182F));

		PartDefinition cube_r426 = osteoderms13.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(144, 96).mirror().addBox(-0.0028F, -0.6464F, -1.4919F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5205F, -3.8239F, 0.4294F, -0.2182F, 0.0F, -0.2182F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create().texOffs(25, 68).addBox(-4.0F, -1.3659F, -2.0805F, 8.0F, 3.0F, 3.0F, new CubeDeformation(0.004F))
				.texOffs(86, 18).addBox(-4.0F, -2.1659F, -2.5805F, 8.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8068F, -7.3627F, -0.558F, 0.2028F, -0.0811F));

		PartDefinition cube_r427 = head.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(108, 110).addBox(-2.5F, 0.3F, -0.7F, 5.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F))
				.texOffs(99, 105).addBox(-2.5F, -1.0F, -0.6F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0F, 0.9323F, -5.0831F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r428 = head.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(25, 75).addBox(-5.8F, -0.8F, -3.0F, 7.0F, 2.0F, 4.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(2.3F, 0.3916F, -2.0689F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r429 = head.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(0, 154).addBox(0.3621F, 0.8811F, -1.8084F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.5873F, -0.8469F, -2.0721F, 0.0F, -0.0175F, 0.0F));

		PartDefinition cube_r430 = head.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(154, 72).addBox(0.4444F, -0.0854F, -0.2774F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.5873F, -0.8469F, -2.0721F, -1.4022F, 0.3607F, 0.0661F));

		PartDefinition cube_r431 = head.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(66, 154).mirror().addBox(0.0F, -0.6F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.15F)).mirror(false), PartPose.offsetAndRotation(-3.4066F, -0.2659F, -3.1016F, 0.3491F, -0.0349F, 0.0F));

		PartDefinition cube_r432 = head.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(140, 32).mirror().addBox(-0.1566F, -0.0919F, 2.8252F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-4.1257F, -1.8556F, -4.2571F, 0.436F, 0.0379F, -0.913F));

		PartDefinition cube_r433 = head.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(22, 117).mirror().addBox(-0.4107F, 0.437F, -0.7339F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-4.1257F, -1.8556F, -4.2571F, 0.6142F, 0.1093F, -0.8627F));

		PartDefinition cube_r434 = head.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(36, 131).mirror().addBox(-0.1566F, 3.5914F, 1.515F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.209F)).mirror(false), PartPose.offsetAndRotation(-4.1257F, -1.8556F, -4.2571F, 1.0905F, 0.0379F, -0.913F));

		PartDefinition cube_r435 = head.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(142, 70).mirror().addBox(-0.1566F, -0.896F, 4.365F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-4.1257F, -1.8556F, -4.2571F, 0.2614F, 0.0379F, -0.913F));

		PartDefinition cube_r436 = head.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(140, 124).mirror().addBox(-0.1566F, 3.9688F, 0.7225F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(112, 46).mirror().addBox(-0.6566F, 2.2689F, -1.3775F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-4.1257F, -1.8556F, -4.2571F, 1.3959F, 0.0379F, -0.913F));

		PartDefinition cube_r437 = head.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(141, 100).mirror().addBox(0.1558F, 0.8792F, 1.2841F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(153, 102).mirror().addBox(0.1558F, 0.2792F, 1.4841F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)).mirror(false), PartPose.offsetAndRotation(-3.1624F, 1.5452F, -0.4935F, 1.5369F, 0.13F, -2.4899F));

		PartDefinition cube_r438 = head.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(109, 136).mirror().addBox(0.1558F, -2.3101F, -0.3987F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(73, 141).mirror().addBox(0.1558F, -2.3101F, 0.8012F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.1624F, 1.5452F, -0.4935F, 0.4461F, 0.13F, -2.4899F));

		PartDefinition cube_r439 = head.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(120, 19).mirror().addBox(-0.3442F, -2.2164F, -2.0957F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.1624F, 1.5452F, -0.4935F, 0.8126F, 0.13F, -2.4899F));

		PartDefinition cube_r440 = head.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(64, 126).mirror().addBox(-0.3442F, -1.2495F, -0.9046F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(102, 132).mirror().addBox(0.1558F, -1.2495F, 0.0954F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.213F)).mirror(false), PartPose.offsetAndRotation(-3.1624F, 1.5452F, -0.4935F, 1.4496F, 0.13F, -2.4899F));

		PartDefinition cube_r441 = head.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(153, 102).addBox(-1.1558F, 0.2792F, 1.4841F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F))
				.texOffs(141, 100).addBox(-1.1558F, 0.8792F, 1.2841F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(3.1624F, 1.5452F, -0.4935F, 1.5369F, -0.13F, 2.4899F));

		PartDefinition cube_r442 = head.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(73, 141).addBox(-1.1558F, -2.3101F, 0.8012F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(109, 136).addBox(-1.1558F, -2.3101F, -0.3987F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(3.1624F, 1.5452F, -0.4935F, 0.4461F, -0.13F, 2.4899F));

		PartDefinition cube_r443 = head.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(64, 126).addBox(-1.6558F, -1.2495F, -0.9046F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.203F))
				.texOffs(102, 132).addBox(-1.1558F, -1.2495F, 0.0954F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.213F)), PartPose.offsetAndRotation(3.1624F, 1.5452F, -0.4935F, 1.4496F, -0.13F, 2.4899F));

		PartDefinition cube_r444 = head.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(120, 19).addBox(-1.6558F, -2.2164F, -2.0957F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.1624F, 1.5452F, -0.4935F, 0.8126F, -0.13F, 2.4899F));

		PartDefinition cube_r445 = head.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(36, 131).addBox(-0.8434F, 3.5914F, 1.515F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.209F)), PartPose.offsetAndRotation(4.1257F, -1.8556F, -4.2571F, 1.0905F, -0.0379F, 0.913F));

		PartDefinition cube_r446 = head.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(142, 70).addBox(-0.8434F, -0.896F, 4.365F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(4.1257F, -1.8556F, -4.2571F, 0.2614F, -0.0379F, 0.913F));

		PartDefinition cube_r447 = head.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(140, 32).addBox(-0.8434F, -0.0919F, 2.8252F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(4.1257F, -1.8556F, -4.2571F, 0.436F, -0.0379F, 0.913F));

		PartDefinition cube_r448 = head.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(140, 124).addBox(-0.8434F, 3.9688F, 0.7225F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F))
				.texOffs(112, 46).addBox(-1.3434F, 2.2689F, -1.3775F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(4.1257F, -1.8556F, -4.2571F, 1.3959F, -0.0379F, 0.913F));

		PartDefinition cube_r449 = head.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(22, 117).addBox(-0.5893F, 0.437F, -0.7339F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(4.1257F, -1.8556F, -4.2571F, 0.6142F, -0.1093F, 0.8627F));

		PartDefinition cube_r450 = head.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(86, 33).addBox(-8.1257F, -5.3325F, -0.561F, 8.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(4.1257F, -1.8556F, -4.2571F, -1.6493F, 0.0F, 0.0F));

		PartDefinition cube_r451 = head.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(154, 69).addBox(-1.4444F, -0.0854F, -0.2774F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.5873F, -0.8469F, -2.0721F, -1.4022F, -0.3607F, -0.0661F));

		PartDefinition cube_r452 = head.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(139, 61).addBox(-3.0873F, 0.806F, -0.4351F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.5873F, -0.8469F, -2.0721F, -1.2566F, 0.0F, 0.0F));

		PartDefinition cube_r453 = head.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(78, 40).addBox(-5.0873F, -1.9607F, 0.0033F, 7.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5873F, -1.9384F, -4.2933F, -1.4661F, 0.0F, 0.0F));

		PartDefinition cube_r454 = head.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(67, 85).addBox(-5.0873F, -0.9607F, 0.0033F, 7.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5873F, -1.705F, -5.2657F, -1.3352F, 0.0F, 0.0F));

		PartDefinition cube_r455 = head.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(0, 87).addBox(-4.5873F, -0.9607F, 0.0033F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5873F, -1.3877F, -6.214F, -1.2479F, 0.0F, 0.0F));

		PartDefinition cube_r456 = head.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(36, 86).addBox(-4.5873F, -0.6607F, 0.0033F, 6.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.5873F, -1.0536F, -6.8292F, -1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r457 = head.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(110, 81).addBox(-4.0873F, -0.9607F, -0.0467F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5873F, -0.1277F, -7.7633F, -0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r458 = head.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(78, 119).addBox(-3.5873F, -0.9566F, 0.0378F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5873F, 0.6229F, -8.4022F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r459 = head.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(61, 151).addBox(-0.3F, -1.1F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1231F, 0.1341F, -1.5704F, 0.2182F, 0.0349F, 0.0F));

		PartDefinition cube_r460 = head.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(153, 133).addBox(-1.3621F, 0.8811F, -1.8084F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5873F, -0.8469F, -2.0721F, 0.0F, 0.0175F, 0.0F));

		PartDefinition cube_r461 = head.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(66, 154).addBox(-1.0F, -0.6F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.15F)), PartPose.offsetAndRotation(3.4066F, -0.2659F, -3.1016F, 0.3491F, 0.0349F, 0.0F));

		PartDefinition cube_r462 = head.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(19, 91).addBox(-4.0873F, -2.0096F, 0.0255F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5873F, 2.7125F, -6.0872F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r463 = head.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(114, 40).addBox(-3.5873F, 0.8904F, -4.2745F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.5873F, -0.8469F, -5.0721F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r464 = head.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(135, 96).addBox(-3.0873F, -1.9632F, 0.0368F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5873F, 2.5531F, -9.0721F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r465 = head.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(128, 77).addBox(-2.0F, -0.9F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.4008F, -8.4065F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r466 = head.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(147, 36).addBox(-2.5873F, -0.9176F, -0.0135F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(1.5873F, 3.3616F, -6.938F, 0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r467 = head.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(109, 28).addBox(-4.0873F, -0.9176F, -0.2135F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5873F, 4.2095F, -8.2949F, 0.5585F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5051F, -0.5265F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r468 = jaw.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(136, 93).addBox(0.0F, -0.3153F, -0.0452F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.5F, 2.7446F, -6.8656F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r469 = jaw.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(139, 77).addBox(0.0F, -0.4F, -1.2F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.5F, 2.7446F, -6.4656F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r470 = jaw.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(154, 0).mirror().addBox(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-1.4396F, 2.713F, -6.233F, 0.593F, -0.3519F, -0.1056F));

		PartDefinition cube_r471 = jaw.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(102, 149).mirror().addBox(-0.5F, -1.6F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(102, 149).addBox(5.1F, -1.6F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-2.8F, 1.7172F, -1.8624F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r472 = jaw.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(144, 49).mirror().addBox(-0.5F, -0.7F, -0.575F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)).mirror(false)
				.texOffs(144, 49).addBox(5.1F, -0.7F, -0.575F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-2.8F, 1.2227F, -1.1245F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r473 = jaw.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(153, 105).mirror().addBox(-0.5F, -0.2F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(153, 105).addBox(5.1F, -0.2F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.8F, 0.7674F, -3.0189F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r474 = jaw.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(149, 138).mirror().addBox(-0.5F, -0.1F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(149, 138).addBox(5.1F, -0.1F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.8F, -0.2851F, 0.3191F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r475 = jaw.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(85, 142).mirror().addBox(-2.0F, -1.3F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(85, 142).addBox(3.6F, -1.3F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3F, 0.8387F, -0.5848F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r476 = jaw.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(151, 63).mirror().addBox(-0.9993F, -2.3605F, -4.3008F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.4661F, 2.103F, -1.4401F, 0.4591F, -0.2948F, -0.1181F));

		PartDefinition cube_r477 = jaw.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(154, 12).mirror().addBox(-0.5F, -0.35F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.76F, 1.6646F, -5.6375F, 0.5988F, -0.2948F, -0.1181F));

		PartDefinition cube_r478 = jaw.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(65, 144).mirror().addBox(-0.9993F, -2.0271F, -3.6658F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(93, 132).mirror().addBox(-0.9993F, -1.7521F, -3.6658F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.001F)).mirror(false)
				.texOffs(84, 132).mirror().addBox(-0.9993F, -0.9521F, -3.5658F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-2.4661F, 2.103F, -1.4401F, 0.2846F, -0.2948F, -0.1181F));

		PartDefinition cube_r479 = jaw.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(151, 57).mirror().addBox(-0.9993F, -0.3278F, -4.5046F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-2.4661F, 2.103F, -1.4401F, 0.1101F, -0.2948F, -0.1181F));

		PartDefinition cube_r480 = jaw.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(154, 0).addBox(-0.6F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(1.4396F, 2.713F, -6.233F, 0.593F, 0.3519F, 0.1056F));

		PartDefinition cube_r481 = jaw.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(151, 63).addBox(-0.0007F, -2.3605F, -4.3008F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.4661F, 2.103F, -1.4401F, 0.4591F, 0.2948F, 0.1181F));

		PartDefinition cube_r482 = jaw.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(154, 12).addBox(-0.5F, -0.35F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.76F, 1.6646F, -5.6375F, 0.5988F, 0.2948F, 0.1181F));

		PartDefinition cube_r483 = jaw.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(65, 144).addBox(-0.0007F, -2.0271F, -3.6658F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F))
				.texOffs(93, 132).addBox(-0.0007F, -1.7521F, -3.6658F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.001F))
				.texOffs(84, 132).addBox(-0.0007F, -0.9521F, -3.5658F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(2.4661F, 2.103F, -1.4401F, 0.2846F, 0.2948F, 0.1181F));

		PartDefinition cube_r484 = jaw.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(151, 57).addBox(-0.0007F, -0.3278F, -4.5046F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(2.4661F, 2.103F, -1.4401F, 0.1101F, 0.2948F, 0.1181F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2383F, 5.093F, 0.3783F, -0.244F, -0.0957F));

		PartDefinition cube_r485 = tail.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(50, 156).addBox(0.5F, -2.1025F, 2.0128F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(156, 48).addBox(0.5F, -2.0025F, 0.0128F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.1796F, 6.8424F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r486 = tail.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(156, 18).addBox(0.5F, -2.3025F, 4.9128F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 154).addBox(0.5F, -2.5025F, 2.9128F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(96, 61).addBox(0.5F, -2.1025F, 0.9128F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 54).addBox(-0.5F, -0.4025F, -0.0872F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -0.1016F, 0.0506F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r487 = tail.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(26, 150).addBox(0.0F, 1.3F, 8.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(61, 127).addBox(0.0F, 1.1F, 6.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 99).addBox(0.0F, 0.9F, 4.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(127, 154).addBox(0.0F, 0.6F, 2.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6635F, 0.8173F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r488 = tail.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(140, 128).mirror().addBox(-3.1867F, 0.2875F, -0.0213F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.415F, 2.2267F, 8.6538F, -0.238F, -0.012F, -0.2307F));

		PartDefinition cube_r489 = tail.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(142, 58).mirror().addBox(-3.4867F, 0.2875F, -0.0213F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.7624F, 6.7103F, -0.238F, -0.012F, -0.2307F));

		PartDefinition cube_r490 = tail.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(135, 28).mirror().addBox(-3.9867F, -0.0125F, -0.5213F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.3995F, 5.2549F, -0.238F, -0.012F, -0.2307F));

		PartDefinition cube_r491 = tail.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(136, 37).mirror().addBox(-4.3951F, 0.1304F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9157F, 3.3143F, -0.2421F, -0.0337F, -0.1355F));

		PartDefinition cube_r492 = tail.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(134, 112).mirror().addBox(-4.4924F, 0.1132F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4318F, 1.3737F, -0.2408F, -0.042F, -0.1694F));

		PartDefinition cube_r493 = tail.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(140, 128).addBox(0.1867F, 0.2875F, -0.0213F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.415F, 2.2267F, 8.6538F, -0.238F, 0.012F, 0.2307F));

		PartDefinition cube_r494 = tail.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(142, 58).addBox(0.4867F, 0.2875F, -0.0213F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.7624F, 6.7103F, -0.238F, 0.012F, 0.2307F));

		PartDefinition cube_r495 = tail.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(135, 28).addBox(-0.0133F, -0.0125F, -0.5213F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.3995F, 5.2549F, -0.238F, 0.012F, 0.2307F));

		PartDefinition cube_r496 = tail.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(136, 37).addBox(0.3951F, 0.1304F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9157F, 3.3143F, -0.2421F, 0.0337F, 0.1355F));

		PartDefinition cube_r497 = tail.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(134, 112).addBox(0.4924F, 0.1132F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4318F, 1.3737F, -0.2408F, 0.042F, 0.1694F));

		PartDefinition osteoderms6 = tail.addOrReplaceChild("osteoderms6", CubeListBuilder.create(), PartPose.offset(4.9F, -1.3763F, 0.5049F));

		PartDefinition cube_r498 = osteoderms6.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(145, 88).addBox(-0.49F, -0.8518F, -1.6177F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-2.9059F, 0.121F, 5.9293F, 0.0786F, -0.07F, 0.1912F));

		PartDefinition cube_r499 = osteoderms6.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(55, 154).addBox(-0.5178F, -0.4014F, 0.9298F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F))
				.texOffs(151, 8).addBox(-0.5178F, -0.7014F, 1.5298F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(1.3744F, 2.0872F, 2.5768F, 0.094F, 0.1151F, 1.5128F));

		PartDefinition cube_r500 = osteoderms6.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(97, 149).addBox(-0.4329F, -2.275F, -0.6188F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.3744F, 2.0872F, 2.5768F, -2.0405F, 0.0924F, 1.527F));

		PartDefinition cube_r501 = osteoderms6.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(18, 131).addBox(-0.5201F, -0.1361F, -0.1681F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(1.3744F, 2.0872F, 2.5768F, 0.5932F, 0.1112F, 1.5224F));

		PartDefinition cube_r502 = osteoderms6.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(154, 52).addBox(-0.294F, 1.1634F, 4.2315F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F))
				.texOffs(150, 150).addBox(-0.294F, 0.8634F, 4.8315F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(1.3744F, 1.7872F, 2.5768F, 0.0915F, 0.1576F, 1.6003F));

		PartDefinition cube_r503 = osteoderms6.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(72, 149).addBox(-0.1138F, -5.7941F, -1.0662F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.3744F, 1.7872F, 2.5768F, -2.0424F, 0.135F, 1.6146F));

		PartDefinition cube_r504 = osteoderms6.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(135, 144).addBox(-0.2713F, 2.8138F, 2.5851F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(1.3744F, 1.7872F, 2.5768F, 0.5912F, 0.1538F, 1.6099F));

		PartDefinition cube_r505 = osteoderms6.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(147, 32).addBox(-0.4919F, -0.8718F, -0.3891F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.9059F, 0.121F, 5.9293F, -0.5323F, -0.07F, 0.1912F));

		PartDefinition cube_r506 = osteoderms6.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(30, 145).addBox(-0.4324F, -0.7142F, -1.2529F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-2.3825F, -0.9245F, 1.0454F, 0.1305F, -0.0364F, 0.18F));

		PartDefinition cube_r507 = osteoderms6.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(146, 116).addBox(-0.4343F, -0.9684F, -0.0114F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.3825F, -0.9245F, 1.0454F, -0.4803F, -0.0364F, 0.18F));

		PartDefinition osteoderms20 = tail.addOrReplaceChild("osteoderms20", CubeListBuilder.create(), PartPose.offset(-4.9F, -1.3763F, 0.5049F));

		PartDefinition cube_r508 = osteoderms20.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(145, 88).mirror().addBox(-0.51F, -0.8518F, -1.6177F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(2.9059F, 0.121F, 5.9293F, 0.0786F, 0.07F, -0.1912F));

		PartDefinition cube_r509 = osteoderms20.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(55, 154).mirror().addBox(-0.4822F, -0.4014F, 0.9298F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F)).mirror(false)
				.texOffs(151, 8).mirror().addBox(-0.4822F, -0.7014F, 1.5298F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-1.3744F, 2.0872F, 2.5768F, 0.094F, -0.1151F, -1.5128F));

		PartDefinition cube_r510 = osteoderms20.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(97, 149).mirror().addBox(-0.5671F, -2.275F, -0.6188F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.3744F, 2.0872F, 2.5768F, -2.0405F, -0.0924F, -1.527F));

		PartDefinition cube_r511 = osteoderms20.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(18, 131).mirror().addBox(-0.4799F, -0.1361F, -0.1681F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-1.3744F, 2.0872F, 2.5768F, 0.5932F, -0.1112F, -1.5224F));

		PartDefinition cube_r512 = osteoderms20.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(154, 52).mirror().addBox(-0.706F, 1.1634F, 4.2315F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F)).mirror(false)
				.texOffs(150, 150).mirror().addBox(-0.706F, 0.8634F, 4.8315F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-1.3744F, 1.7872F, 2.5768F, 0.0915F, -0.1576F, -1.6003F));

		PartDefinition cube_r513 = osteoderms20.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(72, 149).mirror().addBox(-0.8862F, -5.7941F, -1.0662F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.3744F, 1.7872F, 2.5768F, -2.0424F, -0.135F, -1.6146F));

		PartDefinition cube_r514 = osteoderms20.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(135, 144).mirror().addBox(-0.7287F, 2.8138F, 2.5851F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-1.3744F, 1.7872F, 2.5768F, 0.5912F, -0.1538F, -1.6099F));

		PartDefinition cube_r515 = osteoderms20.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(147, 32).mirror().addBox(-0.5081F, -0.8718F, -0.3891F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.9059F, 0.121F, 5.9293F, -0.5323F, 0.07F, -0.1912F));

		PartDefinition cube_r516 = osteoderms20.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(30, 145).mirror().addBox(-0.5676F, -0.7142F, -1.2529F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(2.3825F, -0.9245F, 1.0454F, 0.1305F, 0.0364F, -0.18F));

		PartDefinition cube_r517 = osteoderms20.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(146, 116).mirror().addBox(-0.5657F, -0.9684F, -0.0114F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.3825F, -0.9245F, 1.0454F, -0.4803F, 0.0364F, -0.18F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.7046F, 10.4872F, 0.1634F, -0.4312F, -0.0688F));

		PartDefinition cube_r518 = tail2.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(111, 102).addBox(0.0F, -0.826F, 0.0746F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3654F, 7.7536F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r519 = tail2.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(126, 147).addBox(0.0F, -1.026F, -0.0254F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1339F, 5.8678F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r520 = tail2.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(124, 55).addBox(0.0F, -1.426F, -0.0254F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1099F, 3.8827F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r521 = tail2.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(9, 112).addBox(0.0F, -1.826F, -0.0254F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3536F, 1.8976F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r522 = tail2.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(47, 156).addBox(0.0F, -1.926F, -0.4254F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5486F, 0.3095F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r523 = tail2.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(18, 121).addBox(0.0F, 4.1F, 15.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 142).addBox(0.0F, 3.8F, 13.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(131, 9).addBox(0.0F, 3.5F, 11.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 124).addBox(0.0F, 3.2F, 9.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 156).addBox(0.0F, 1.9F, 7.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4165F, -7.7238F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r524 = tail2.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(129, 107).mirror().addBox(-1.3825F, -0.1294F, 1.8789F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(47, 97).mirror().addBox(-1.6825F, -0.1294F, -0.1211F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6222F, 1.853F, -0.118F, 0.0118F, -0.2651F));

		PartDefinition cube_r525 = tail2.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(81, 96).mirror().addBox(-2.283F, -0.1294F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4272F, 0.2649F, -0.118F, -0.0315F, -0.2599F));

		PartDefinition cube_r526 = tail2.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(129, 107).addBox(0.3825F, -0.1294F, 1.8789F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 97).addBox(-0.3175F, -0.1294F, -0.1211F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6222F, 1.853F, -0.118F, -0.0118F, 0.2651F));

		PartDefinition cube_r527 = tail2.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(81, 96).addBox(0.283F, -0.1294F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4272F, 0.2649F, -0.118F, 0.0315F, 0.2599F));

		PartDefinition cube_r528 = tail2.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(27, 55).addBox(-1.0F, -0.026F, -0.4254F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5486F, 0.3095F, -0.1222F, 0.0F, 0.0F));

		PartDefinition osteoderms7 = tail2.addOrReplaceChild("osteoderms7", CubeListBuilder.create(), PartPose.offset(3.3F, -4.0808F, -0.8823F));

		PartDefinition cube_r529 = osteoderms7.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(154, 142).addBox(-0.49F, -0.8518F, -0.6177F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-2.5059F, 3.721F, 9.0293F, 0.0786F, -0.07F, 0.1912F));

		PartDefinition cube_r530 = osteoderms7.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(155, 85).addBox(-0.4919F, -0.8718F, -0.3891F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.5059F, 3.721F, 9.0293F, -0.5323F, -0.07F, 0.1912F));

		PartDefinition cube_r531 = osteoderms7.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(141, 154).addBox(-0.49F, -0.8518F, -0.6177F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-2.2059F, 2.521F, 5.4293F, 0.0786F, -0.07F, 0.1912F));

		PartDefinition cube_r532 = osteoderms7.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(71, 153).addBox(-0.5028F, -0.9743F, -1.4822F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-1.0761F, 5.1021F, 10.4363F, 0.6316F, 0.0543F, 1.6254F));

		PartDefinition cube_r533 = osteoderms7.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(144, 8).addBox(-0.4266F, -0.5422F, -2.3136F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.5239F, 4.5021F, 6.5363F, 0.6364F, 0.1415F, 1.6259F));

		PartDefinition cube_r534 = osteoderms7.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(149, 53).addBox(-0.3785F, -0.5078F, 1.1064F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5239F, 4.5021F, 6.5363F, -1.7797F, 0.1221F, 1.6255F));

		PartDefinition cube_r535 = osteoderms7.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(149, 70).addBox(-0.4229F, -0.1363F, -1.2005F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.5239F, 4.5021F, 6.5363F, 0.3552F, 0.1476F, 1.6176F));

		PartDefinition cube_r536 = osteoderms7.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(149, 142).addBox(-0.5F, -1.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.3705F, 3.5851F, 2.3714F, 0.4925F, 0.2784F, 1.619F));

		PartDefinition cube_r537 = osteoderms7.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(151, 48).addBox(-0.291F, 3.4934F, 1.055F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5239F, 4.5021F, 6.5363F, -1.7723F, 0.2528F, 1.6268F));

		PartDefinition cube_r538 = osteoderms7.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(153, 111).addBox(-0.2639F, -4.2744F, -3.7826F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.5239F, 4.5021F, 6.5363F, 0.8621F, 0.2722F, 1.6274F));

		PartDefinition cube_r539 = osteoderms7.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(155, 82).addBox(-0.4919F, -0.8719F, -0.3891F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.2059F, 2.521F, 5.4293F, -0.5323F, -0.07F, 0.1912F));

		PartDefinition cube_r540 = osteoderms7.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(145, 92).addBox(-0.5439F, -0.6324F, -0.9381F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.2059F, 2.521F, 5.4293F, -0.2007F, -0.07F, 0.1912F));

		PartDefinition cube_r541 = osteoderms7.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(37, 145).addBox(-0.4325F, -0.7142F, -1.2529F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-1.8825F, 1.0755F, 1.6454F, -0.0412F, -0.0048F, 0.1835F));

		PartDefinition cube_r542 = osteoderms7.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(155, 148).addBox(-0.4343F, -0.9684F, -0.0114F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.8825F, 1.0755F, 1.6454F, -0.652F, -0.0048F, 0.1835F));

		PartDefinition osteoderms21 = tail2.addOrReplaceChild("osteoderms21", CubeListBuilder.create(), PartPose.offset(-3.3F, -4.0808F, -0.8823F));

		PartDefinition cube_r543 = osteoderms21.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(154, 142).mirror().addBox(-0.51F, -0.8518F, -0.6177F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(2.5059F, 3.721F, 9.0293F, 0.0786F, 0.07F, -0.1912F));

		PartDefinition cube_r544 = osteoderms21.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(155, 85).mirror().addBox(-0.5081F, -0.8718F, -0.3891F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.5059F, 3.721F, 9.0293F, -0.5323F, 0.07F, -0.1912F));

		PartDefinition cube_r545 = osteoderms21.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(141, 154).mirror().addBox(-0.51F, -0.8518F, -0.6177F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(2.2059F, 2.521F, 5.4293F, 0.0786F, 0.07F, -0.1912F));

		PartDefinition cube_r546 = osteoderms21.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(71, 153).mirror().addBox(-0.4972F, -0.9743F, -1.4822F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(1.0761F, 5.1021F, 10.4363F, 0.6316F, -0.0543F, -1.6254F));

		PartDefinition cube_r547 = osteoderms21.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(144, 8).mirror().addBox(-0.5734F, -0.5422F, -2.3136F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.5239F, 4.5021F, 6.5363F, 0.6364F, -0.1415F, -1.6259F));

		PartDefinition cube_r548 = osteoderms21.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(149, 53).mirror().addBox(-0.6215F, -0.5078F, 1.1064F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.5239F, 4.5021F, 6.5363F, -1.7797F, -0.1221F, -1.6255F));

		PartDefinition cube_r549 = osteoderms21.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(149, 70).mirror().addBox(-0.5771F, -0.1363F, -1.2005F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-0.5239F, 4.5021F, 6.5363F, 0.3552F, -0.1476F, -1.6176F));

		PartDefinition cube_r550 = osteoderms21.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(149, 142).mirror().addBox(-0.5F, -1.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-0.3705F, 3.5851F, 2.3714F, 0.4925F, -0.2784F, -1.619F));

		PartDefinition cube_r551 = osteoderms21.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(151, 48).mirror().addBox(-0.709F, 3.4934F, 1.055F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.5239F, 4.5021F, 6.5363F, -1.7723F, -0.2528F, -1.6268F));

		PartDefinition cube_r552 = osteoderms21.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(153, 111).mirror().addBox(-0.7361F, -4.2744F, -3.7826F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.5239F, 4.5021F, 6.5363F, 0.8621F, -0.2722F, -1.6274F));

		PartDefinition cube_r553 = osteoderms21.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(155, 82).mirror().addBox(-0.5081F, -0.8719F, -0.3891F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.2059F, 2.521F, 5.4293F, -0.5323F, 0.07F, -0.1912F));

		PartDefinition cube_r554 = osteoderms21.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(145, 92).mirror().addBox(-0.4561F, -0.6324F, -0.9381F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.2059F, 2.521F, 5.4293F, -0.2007F, 0.07F, -0.1912F));

		PartDefinition cube_r555 = osteoderms21.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(37, 145).mirror().addBox(-0.5675F, -0.7142F, -1.2529F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(1.8825F, 1.0755F, 1.6454F, -0.0412F, 0.0048F, -0.1835F));

		PartDefinition cube_r556 = osteoderms21.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(155, 148).mirror().addBox(-0.5657F, -0.9684F, -0.0114F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.8825F, 1.0755F, 1.6454F, -0.652F, 0.0048F, -0.1835F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0945F, 9.6161F, 0.1489F, -0.4555F, 0.2586F));

		PartDefinition cube_r557 = tail3.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(0, 32).addBox(-1.5F, -1.0174F, -0.0407F, 3.0F, 1.0F, 20.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.8183F, 1.9038F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r558 = tail3.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.8174F, -13.9407F, 2.0F, 2.0F, 29.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.9162F, 13.6975F, 0.0873F, 0.0F, 0.0F));

		PartDefinition osteoderms12 = tail3.addOrReplaceChild("osteoderms12", CubeListBuilder.create(), PartPose.offset(2.9F, -6.1753F, 2.5016F));

		PartDefinition cube_r559 = osteoderms12.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(114, 155).addBox(-0.4919F, -0.7719F, -0.3891F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.3059F, 3.721F, -0.3707F, -0.7037F, -0.036F, 0.2003F));

		PartDefinition cube_r560 = osteoderms12.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(94, 153).addBox(-0.4948F, -1.0097F, -1.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.8761F, 5.0021F, 0.8363F, 0.7398F, -0.0267F, 1.6171F));

		PartDefinition cube_r561 = osteoderms12.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(109, 155).addBox(-0.4919F, -0.8718F, -0.3891F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.5059F, 3.621F, 6.9293F, -0.7091F, -0.102F, 0.1764F));

		PartDefinition cube_r562 = osteoderms12.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(89, 153).addBox(-0.4948F, -1.0097F, -1.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-1.0761F, 4.5021F, 8.1363F, 0.7378F, -0.0703F, 1.6172F));

		PartDefinition cube_r563 = osteoderms12.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(104, 155).addBox(-0.4919F, -0.8719F, -0.3891F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.5059F, 3.321F, 14.0293F, -0.7532F, -0.1096F, 0.1718F));

		PartDefinition cube_r564 = osteoderms12.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(76, 153).addBox(-0.4948F, -1.0097F, -1.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-1.0761F, 4.0021F, 15.2363F, 0.7357F, -0.1139F, 1.6174F));

		PartDefinition osteoderms22 = tail3.addOrReplaceChild("osteoderms22", CubeListBuilder.create(), PartPose.offset(-2.9F, -6.1753F, 2.5016F));

		PartDefinition cube_r565 = osteoderms22.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(114, 155).mirror().addBox(-0.5081F, -0.7719F, -0.3891F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.3059F, 3.721F, -0.3707F, -0.7037F, 0.036F, -0.2003F));

		PartDefinition cube_r566 = osteoderms22.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(94, 153).mirror().addBox(-0.5052F, -1.0097F, -1.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.8761F, 5.0021F, 0.8363F, 0.7398F, 0.0267F, -1.6171F));

		PartDefinition cube_r567 = osteoderms22.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(109, 155).mirror().addBox(-0.5081F, -0.8718F, -0.3891F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.5059F, 3.621F, 6.9293F, -0.7091F, 0.102F, -0.1764F));

		PartDefinition cube_r568 = osteoderms22.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(89, 153).mirror().addBox(-0.5052F, -1.0097F, -1.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(1.0761F, 4.5021F, 8.1363F, 0.7378F, 0.0703F, -1.6172F));

		PartDefinition cube_r569 = osteoderms22.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(104, 155).mirror().addBox(-0.5081F, -0.8719F, -0.3891F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.5059F, 3.321F, 14.0293F, -0.7532F, 0.1096F, -0.1718F));

		PartDefinition cube_r570 = osteoderms22.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(76, 153).mirror().addBox(-0.5052F, -1.0097F, -1.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(1.0761F, 4.0021F, 15.2363F, 0.7357F, 0.1139F, -1.6174F));

		PartDefinition osteoderms8 = tail3.addOrReplaceChild("osteoderms8", CubeListBuilder.create(), PartPose.offset(-1.0F, -2.4162F, 25.0975F));

		PartDefinition leftClub2 = osteoderms8.addOrReplaceChild("leftClub2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3731F, -1.5886F, -7.3469F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r571 = leftClub2.addOrReplaceChild("cube_r571", CubeListBuilder.create().texOffs(123, 45).addBox(-2.9634F, 0.0405F, -2.0244F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.8937F, -0.2917F, 9.2257F, 0.1133F, -0.0997F, 0.0045F));

		PartDefinition cube_r572 = leftClub2.addOrReplaceChild("cube_r572", CubeListBuilder.create().texOffs(91, 120).addBox(-0.0112F, -0.755F, -0.0025F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.9331F, 0.5017F, 9.3044F, 2.8562F, -1.1695F, -2.878F));

		PartDefinition cube_r573 = leftClub2.addOrReplaceChild("cube_r573", CubeListBuilder.create().texOffs(73, 130).addBox(-1.675F, -0.425F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5674F, 0.2813F, 13.0141F, 3.0255F, 0.0F, 3.1342F));

		PartDefinition cube_r574 = leftClub2.addOrReplaceChild("cube_r574", CubeListBuilder.create().texOffs(36, 82).addBox(-1.0112F, 0.345F, -0.0275F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0216F, -0.4152F, 12.172F, 2.947F, -0.9658F, -2.9811F));

		PartDefinition cube_r575 = leftClub2.addOrReplaceChild("cube_r575", CubeListBuilder.create().texOffs(130, 120).addBox(-1.0F, -1.0F, -0.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8382F, 0.7215F, 11.0342F, -3.054F, -0.7458F, 3.0818F));

		PartDefinition cube_r576 = leftClub2.addOrReplaceChild("cube_r576", CubeListBuilder.create().texOffs(119, 114).addBox(-0.0244F, 0.0346F, -6.3962F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.8937F, -0.2917F, 9.2257F, 0.1285F, 0.5255F, 0.072F));

		PartDefinition cube_r577 = leftClub2.addOrReplaceChild("cube_r577", CubeListBuilder.create().texOffs(131, 32).addBox(-1.5217F, 0.0346F, -3.93F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8937F, -0.2917F, 9.2257F, 0.112F, 0.1269F, 0.0215F));

		PartDefinition cube_r578 = leftClub2.addOrReplaceChild("cube_r578", CubeListBuilder.create().texOffs(136, 14).addBox(-0.2489F, 0.1495F, -3.1108F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.1883F, 1.871F, 8.376F, -0.1127F, 0.3074F, 0.0104F));

		PartDefinition cube_r579 = leftClub2.addOrReplaceChild("cube_r579", CubeListBuilder.create().texOffs(128, 61).addBox(-0.9439F, -0.0411F, -1.1814F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.1883F, 1.871F, 8.376F, 2.7727F, -1.3423F, -2.8117F));

		PartDefinition cube_r580 = leftClub2.addOrReplaceChild("cube_r580", CubeListBuilder.create().texOffs(136, 18).addBox(1.6402F, 0.6212F, -0.6912F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.1883F, 1.871F, 8.376F, 1.5708F, -1.1432F, -1.5708F));

		PartDefinition cube_r581 = leftClub2.addOrReplaceChild("cube_r581", CubeListBuilder.create().texOffs(23, 142).addBox(3.303F, 1.2332F, -0.1912F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F))
				.texOffs(144, 64).addBox(3.803F, 1.2332F, -0.1912F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.1883F, 1.871F, 8.376F, 1.5708F, -0.9687F, -1.5708F));

		PartDefinition cube_r582 = leftClub2.addOrReplaceChild("cube_r582", CubeListBuilder.create().texOffs(65, 148).addBox(-0.8057F, -0.0328F, -1.776F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.1883F, 1.871F, 8.376F, 0.0241F, -0.0973F, 0.0101F));

		PartDefinition cube_r583 = leftClub2.addOrReplaceChild("cube_r583", CubeListBuilder.create().texOffs(148, 60).addBox(-0.9648F, -1.6992F, -1.1227F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0425F, 0.9992F, 7.4388F, 0.195F, -0.0928F, -0.031F));

		PartDefinition cube_r584 = leftClub2.addOrReplaceChild("cube_r584", CubeListBuilder.create().texOffs(136, 0).addBox(-0.6591F, -1.7988F, -2.4797F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0425F, 0.9992F, 7.4388F, 0.3414F, 0.3022F, 0.0585F));

		PartDefinition cube_r585 = leftClub2.addOrReplaceChild("cube_r585", CubeListBuilder.create().texOffs(7, 144).addBox(0.4739F, 0.0F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F))
				.texOffs(143, 130).addBox(-0.0261F, 0.0F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.197F, -0.6624F, 11.8443F, -1.5708F, -1.1868F, 1.5708F));

		PartDefinition cube_r586 = leftClub2.addOrReplaceChild("cube_r586", CubeListBuilder.create().texOffs(136, 4).addBox(-0.0261F, 0.0F, -0.7F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.197F, -1.0782F, 9.888F, -1.5708F, -1.3614F, 1.5708F));

		PartDefinition cube_r587 = leftClub2.addOrReplaceChild("cube_r587", CubeListBuilder.create().texOffs(86, 0).addBox(-0.1024F, -0.3013F, -2.4641F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9075F, 1.5287F, 0.9607F, 0.1119F, 0.1011F, 0.0138F));

		PartDefinition cube_r588 = leftClub2.addOrReplaceChild("cube_r588", CubeListBuilder.create().texOffs(125, 80).addBox(-0.3116F, -1.7163F, -1.0605F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0425F, 0.9992F, 7.4388F, 2.581F, -1.3124F, -2.5657F));

		PartDefinition rightClub2 = osteoderms8.addOrReplaceChild("rightClub2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3731F, -1.5886F, -7.3469F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r589 = rightClub2.addOrReplaceChild("cube_r589", CubeListBuilder.create().texOffs(123, 45).mirror().addBox(-0.0366F, 0.0405F, -2.0244F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.8937F, -0.2917F, 9.2257F, 0.1133F, 0.0997F, -0.0045F));

		PartDefinition cube_r590 = rightClub2.addOrReplaceChild("cube_r590", CubeListBuilder.create().texOffs(91, 120).mirror().addBox(-1.9888F, -0.755F, -0.0025F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.9331F, 0.5017F, 9.3044F, 2.8562F, 1.1695F, 2.878F));

		PartDefinition cube_r591 = rightClub2.addOrReplaceChild("cube_r591", CubeListBuilder.create().texOffs(73, 130).mirror().addBox(-1.325F, -0.425F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5674F, 0.2813F, 13.0141F, 3.0255F, 0.0F, -3.1342F));

		PartDefinition cube_r592 = rightClub2.addOrReplaceChild("cube_r592", CubeListBuilder.create().texOffs(36, 82).mirror().addBox(-1.9888F, 0.345F, -0.0275F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0216F, -0.4152F, 12.172F, 2.947F, 0.9658F, 2.9811F));

		PartDefinition cube_r593 = rightClub2.addOrReplaceChild("cube_r593", CubeListBuilder.create().texOffs(130, 120).mirror().addBox(-1.0F, -1.0F, -0.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8382F, 0.7215F, 11.0342F, -3.054F, 0.7458F, -3.0818F));

		PartDefinition cube_r594 = rightClub2.addOrReplaceChild("cube_r594", CubeListBuilder.create().texOffs(119, 114).mirror().addBox(-1.9756F, 0.0346F, -6.3962F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.8937F, -0.2917F, 9.2257F, 0.1285F, -0.5255F, -0.072F));

		PartDefinition cube_r595 = rightClub2.addOrReplaceChild("cube_r595", CubeListBuilder.create().texOffs(131, 32).mirror().addBox(-0.4783F, 0.0346F, -3.93F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8937F, -0.2917F, 9.2257F, 0.112F, -0.1269F, -0.0215F));

		PartDefinition cube_r596 = rightClub2.addOrReplaceChild("cube_r596", CubeListBuilder.create().texOffs(136, 14).mirror().addBox(-1.7511F, 0.1495F, -3.1108F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.1883F, 1.871F, 8.376F, -0.1127F, -0.3074F, -0.0104F));

		PartDefinition cube_r597 = rightClub2.addOrReplaceChild("cube_r597", CubeListBuilder.create().texOffs(128, 61).mirror().addBox(-2.0561F, -0.0411F, -1.1814F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.1883F, 1.871F, 8.376F, 2.7727F, 1.3423F, 2.8117F));

		PartDefinition cube_r598 = rightClub2.addOrReplaceChild("cube_r598", CubeListBuilder.create().texOffs(136, 18).mirror().addBox(-3.6402F, 0.6212F, -0.6912F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.1883F, 1.871F, 8.376F, 1.5708F, 1.1432F, 1.5708F));

		PartDefinition cube_r599 = rightClub2.addOrReplaceChild("cube_r599", CubeListBuilder.create().texOffs(23, 142).mirror().addBox(-4.303F, 1.2332F, -0.1912F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(144, 64).mirror().addBox(-4.803F, 1.2332F, -0.1912F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.1883F, 1.871F, 8.376F, 1.5708F, 0.9687F, 1.5708F));

		PartDefinition cube_r600 = rightClub2.addOrReplaceChild("cube_r600", CubeListBuilder.create().texOffs(65, 148).mirror().addBox(-1.1943F, -0.0328F, -1.776F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.1883F, 1.871F, 8.376F, 0.0241F, 0.0973F, -0.0101F));

		PartDefinition cube_r601 = rightClub2.addOrReplaceChild("cube_r601", CubeListBuilder.create().texOffs(148, 60).mirror().addBox(-1.0352F, -1.6992F, -1.1227F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.0425F, 0.9992F, 7.4388F, 0.195F, 0.0928F, 0.031F));

		PartDefinition cube_r602 = rightClub2.addOrReplaceChild("cube_r602", CubeListBuilder.create().texOffs(136, 0).mirror().addBox(-1.3409F, -1.7988F, -2.4797F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.0425F, 0.9992F, 7.4388F, 0.3414F, -0.3022F, -0.0585F));

		PartDefinition cube_r603 = rightClub2.addOrReplaceChild("cube_r603", CubeListBuilder.create().texOffs(7, 144).mirror().addBox(-1.4739F, 0.0F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(143, 130).mirror().addBox(-0.9739F, 0.0F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.197F, -0.6624F, 11.8443F, -1.5708F, 1.1868F, -1.5708F));

		PartDefinition cube_r604 = rightClub2.addOrReplaceChild("cube_r604", CubeListBuilder.create().texOffs(136, 4).mirror().addBox(-1.9739F, 0.0F, -0.7F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.197F, -1.0782F, 9.888F, -1.5708F, 1.3614F, -1.5708F));

		PartDefinition cube_r605 = rightClub2.addOrReplaceChild("cube_r605", CubeListBuilder.create().texOffs(86, 0).mirror().addBox(-0.8976F, -0.3013F, -2.4641F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9075F, 1.5287F, 0.9607F, 0.1119F, -0.1011F, -0.0138F));

		PartDefinition cube_r606 = rightClub2.addOrReplaceChild("cube_r606", CubeListBuilder.create().texOffs(125, 80).mirror().addBox(-2.6884F, -1.7163F, -1.0605F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.0425F, 0.9992F, 7.4388F, 2.581F, 1.3124F, 2.5657F));

		return LayerDefinition.create(meshdefinition, 160, 160);
	}

	@Override
	public void setupAnim(float p_170950_, float p_170951_, float p_170952_) {		
		this.fossil.yRot = p_170951_ * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		fossil.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}