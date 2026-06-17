package fossils.fossils.client.blockentity.model.exaeretodon;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ExaeretodonFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart Hips;
	private final ModelPart Belly;
	private final ModelPart body3;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart Bodyfront;
	private final ModelPart Rightupperarm;
	private final ModelPart Rightlowerarm;
	private final ModelPart Rightfrontfoot;
	private final ModelPart Rightfrontfoot2;
	private final ModelPart Leftupperarm;
	private final ModelPart Leftlowerarm;
	private final ModelPart Leftfrontfoot;
	private final ModelPart Leftfrontfoot2;
	private final ModelPart Neck;
	private final ModelPart Neck2;
	private final ModelPart Neck3;
	private final ModelPart Head;
	private final ModelPart Lowerjaw1;
	private final ModelPart bone2;
	private final ModelPart leftFace;
	private final ModelPart bone3;
	private final ModelPart rightFace;
	private final ModelPart bone5;
	private final ModelPart bone;
	private final ModelPart bone7;
	private final ModelPart Rightthigh;
	private final ModelPart Rightshin;
	private final ModelPart Righthindfoot;
	private final ModelPart Righthindfoot2;
	private final ModelPart Leftthigh;
	private final ModelPart Leftshin;
	private final ModelPart Lefthindfoot;
	private final ModelPart Lefthindfoot2;
	private final ModelPart Tail1;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart bone4;
	private final ModelPart bone6;

	public ExaeretodonFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.Hips = this.root.getChild("Hips");
		this.Belly = this.Hips.getChild("Belly");
		this.body3 = this.Belly.getChild("body3");
		this.body = this.body3.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.Bodyfront = this.body2.getChild("Bodyfront");
		this.Rightupperarm = this.Bodyfront.getChild("Rightupperarm");
		this.Rightlowerarm = this.Rightupperarm.getChild("Rightlowerarm");
		this.Rightfrontfoot = this.Rightlowerarm.getChild("Rightfrontfoot");
		this.Rightfrontfoot2 = this.Rightfrontfoot.getChild("Rightfrontfoot2");
		this.Leftupperarm = this.Bodyfront.getChild("Leftupperarm");
		this.Leftlowerarm = this.Leftupperarm.getChild("Leftlowerarm");
		this.Leftfrontfoot = this.Leftlowerarm.getChild("Leftfrontfoot");
		this.Leftfrontfoot2 = this.Leftfrontfoot.getChild("Leftfrontfoot2");
		this.Neck = this.Bodyfront.getChild("Neck");
		this.Neck2 = this.Neck.getChild("Neck2");
		this.Neck3 = this.Neck2.getChild("Neck3");
		this.Head = this.Neck3.getChild("Head");
		this.Lowerjaw1 = this.Head.getChild("Lowerjaw1");
		this.bone2 = this.Lowerjaw1.getChild("bone2");
		this.leftFace = this.Head.getChild("leftFace");
		this.bone3 = this.leftFace.getChild("bone3");
		this.rightFace = this.Head.getChild("rightFace");
		this.bone5 = this.rightFace.getChild("bone5");
		this.bone = this.Bodyfront.getChild("bone");
		this.bone7 = this.Bodyfront.getChild("bone7");
		this.Rightthigh = this.Hips.getChild("Rightthigh");
		this.Rightshin = this.Rightthigh.getChild("Rightshin");
		this.Righthindfoot = this.Rightshin.getChild("Righthindfoot");
		this.Righthindfoot2 = this.Righthindfoot.getChild("Righthindfoot2");
		this.Leftthigh = this.Hips.getChild("Leftthigh");
		this.Leftshin = this.Leftthigh.getChild("Leftshin");
		this.Lefthindfoot = this.Leftshin.getChild("Lefthindfoot");
		this.Lefthindfoot2 = this.Lefthindfoot.getChild("Lefthindfoot2");
		this.Tail1 = this.Hips.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.bone4 = this.Hips.getChild("bone4");
		this.bone6 = this.Hips.getChild("bone6");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -23.5F, 8.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 12.2815F, 6.1072F, -0.4842F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(42, 89).addBox(0.0F, -1.1617F, 0.0069F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6503F, -0.613F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(88, 16).addBox(0.0F, -1.357F, 0.0041F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6503F, -2.613F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(33, 89).mirror().addBox(-0.5F, -1.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(36, 89).mirror().addBox(-0.5F, -1.5F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(39, 89).mirror().addBox(-0.5F, -1.5F, 3.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5717F, -4.1151F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r4 = Hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(39, 89).addBox(0.5F, -1.5F, 3.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 89).addBox(0.5F, -1.5F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 89).addBox(0.5F, -1.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5717F, -4.1151F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r5 = Hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(88, 12).addBox(0.0F, -1.3F, 1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 9).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6503F, -5.613F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Belly = Hips.addOrReplaceChild("Belly", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8723F, -5.5976F, 0.2813F, 0.0F, 0.0F));

		PartDefinition cube_r6 = Belly.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(61, 87).addBox(0.0F, -1.3809F, -0.0101F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.1574F, -0.9404F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r7 = Belly.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(88, 27).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1433F, -0.5278F, 0.1954F, 0.102F, -0.705F));

		PartDefinition cube_r8 = Belly.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(5, 69).mirror().addBox(-2.7767F, -0.525F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1433F, -0.5278F, 0.0733F, 0.1852F, -1.2491F));

		PartDefinition cube_r9 = Belly.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(88, 27).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1433F, -0.5278F, 0.1954F, -0.102F, 0.705F));

		PartDefinition cube_r10 = Belly.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(5, 69).addBox(0.7767F, -0.525F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1433F, -0.5278F, 0.0733F, -0.1852F, 1.2491F));

		PartDefinition cube_r11 = Belly.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(56, 46).addBox(-0.5F, 0.0F, 11.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.6574F, -12.9404F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body3 = Belly.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1574F, -1.9404F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r12 = body3.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 89).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2007F, -2.5874F, 0.2698F, 0.1484F, -0.5561F));

		PartDefinition cube_r13 = body3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(72, 21).mirror().addBox(-4.9922F, -2.343F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2007F, -2.5874F, -0.0368F, 0.2838F, -1.6444F));

		PartDefinition cube_r14 = body3.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(59, 13).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2007F, -2.5874F, 0.1135F, 0.2632F, -1.1005F));

		PartDefinition cube_r15 = body3.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(87, 82).mirror().addBox(-3.9922F, -2.343F, -0.4258F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2007F, -0.5874F, -0.0303F, 0.1967F, -1.6429F));

		PartDefinition cube_r16 = body3.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(59, 15).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2007F, -0.5874F, 0.0733F, 0.1852F, -1.1095F));

		PartDefinition cube_r17 = body3.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(10, 89).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2007F, -0.5874F, 0.1954F, 0.102F, -0.5654F));

		PartDefinition cube_r18 = body3.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(10, 89).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2007F, -0.5874F, 0.1954F, -0.102F, 0.5654F));

		PartDefinition cube_r19 = body3.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(59, 15).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2007F, -0.5874F, 0.0733F, -0.1852F, 1.1095F));

		PartDefinition cube_r20 = body3.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(87, 82).addBox(2.9922F, -2.343F, -0.4258F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2007F, -0.5874F, -0.0303F, -0.1967F, 1.6429F));

		PartDefinition cube_r21 = body3.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 89).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2007F, -2.5874F, 0.2698F, -0.1484F, 0.5561F));

		PartDefinition cube_r22 = body3.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(72, 21).addBox(2.9922F, -2.343F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2007F, -2.5874F, -0.0368F, -0.2838F, 1.6444F));

		PartDefinition cube_r23 = body3.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(59, 13).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2007F, -2.5874F, 0.1135F, -0.2632F, 1.1005F));

		PartDefinition cube_r24 = body3.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(26, 18).addBox(-0.5F, 0.0F, 7.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.5F, -11.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r25 = body3.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(58, 87).addBox(0.0F, -1.4008F, -0.0079F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.1F, -1.0F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r26 = body3.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(55, 87).addBox(0.0F, -1.3956F, -0.0056F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.2F, -3.0F, -0.1134F, 0.0F, 0.0F));

		PartDefinition body = body3.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1809F, -3.9018F, 0.0699F, 0.0435F, 0.003F));

		PartDefinition cube_r27 = body.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(67, 87).addBox(0.0F, -1.2155F, -0.0033F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.5F, -1.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r28 = body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(46, 32).mirror().addBox(-6.9922F, -2.343F, -0.4258F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0552F, -2.5856F, -0.0027F, 0.1975F, -1.5728F));

		PartDefinition cube_r29 = body.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(57, 7).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0552F, -2.5856F, 0.0974F, 0.1721F, -1.0405F));

		PartDefinition cube_r30 = body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(50, 56).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0552F, -2.5856F, 0.2089F, 0.0785F, -0.4995F));

		PartDefinition cube_r31 = body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(88, 87).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0198F, -0.6855F, 0.2325F, 0.1253F, -0.5612F));

		PartDefinition cube_r32 = body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(57, 9).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0198F, -0.6855F, 0.0932F, 0.2242F, -1.1054F));

		PartDefinition cube_r33 = body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(57, 11).mirror().addBox(-5.9922F, -2.343F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0198F, -0.6855F, -0.0335F, 0.2403F, -1.6436F));

		PartDefinition cube_r34 = body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(9, 37).mirror().addBox(-4.5F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8211F, 7.823F, -8.7334F, -0.0553F, 1.0007F, 0.1817F));

		PartDefinition cube_r35 = body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(11, 23).mirror().addBox(-0.2F, 0.0F, -0.4F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.009F, 7.6359F, -3.2707F, -0.2216F, 1.1612F, 0.0835F));

		PartDefinition cube_r36 = body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(11, 23).addBox(-5.8F, 0.0F, -0.4F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.009F, 7.6359F, -3.2707F, -0.2216F, -1.1612F, -0.0835F));

		PartDefinition cube_r37 = body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(9, 37).addBox(-0.5F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8211F, 7.823F, -8.7334F, -0.0553F, -1.0007F, -0.1817F));

		PartDefinition cube_r38 = body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(57, 11).addBox(2.9922F, -2.343F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0198F, -0.6855F, -0.0335F, -0.2403F, 1.6436F));

		PartDefinition cube_r39 = body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(57, 9).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0198F, -0.6855F, 0.0932F, -0.2242F, 1.1054F));

		PartDefinition cube_r40 = body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(88, 87).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0198F, -0.6855F, 0.2325F, -0.1253F, 0.5612F));

		PartDefinition cube_r41 = body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(50, 56).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0552F, -2.5856F, 0.2089F, -0.0785F, 0.4995F));

		PartDefinition cube_r42 = body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(57, 7).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0552F, -2.5856F, 0.0974F, -0.1721F, 1.0405F));

		PartDefinition cube_r43 = body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(46, 32).addBox(2.9922F, -2.343F, -0.4258F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0552F, -2.5856F, -0.0027F, -0.1975F, 1.5728F));

		PartDefinition cube_r44 = body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(64, 87).addBox(0.0F, -1.1853F, -0.001F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.6F, -3.0F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r45 = body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(0, 29).addBox(-0.5F, 0.0F, 3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.7F, -7.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.207F, -3.9505F, -0.0526F, 0.0871F, -0.0046F));

		PartDefinition cube_r46 = body2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(87, 78).addBox(0.0F, -1.2552F, 0.0012F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.5F, -1.0F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r47 = body2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(30, 16).mirror().addBox(-7.9922F, -2.343F, -0.4258F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0017F, -2.5851F, 0.017F, 0.2317F, -1.5011F));

		PartDefinition cube_r48 = body2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(57, 32).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0017F, -2.5851F, 0.132F, 0.1918F, -0.9668F));

		PartDefinition cube_r49 = body2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(87, 39).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0017F, -2.5851F, 0.2483F, 0.078F, -0.429F));

		PartDefinition cube_r50 = body2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(59, 19).mirror().addBox(-2.5F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6782F, 7.8211F, -5.478F, -0.089F, 0.2806F, 0.1259F));

		PartDefinition cube_r51 = body2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(48, 18).mirror().addBox(-3.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5106F, 8.1418F, -4.415F, -0.0398F, 0.5575F, 0.2204F));

		PartDefinition cube_r52 = body2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(88, 55).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1017F, -0.5851F, 0.2621F, 0.0899F, -0.4445F));

		PartDefinition cube_r53 = body2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(58, 22).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1017F, -0.5851F, 0.1378F, 0.209F, -0.9824F));

		PartDefinition cube_r54 = body2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(33, 30).mirror().addBox(-7.9922F, -2.343F, -0.4258F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1017F, -0.5851F, 0.013F, 0.2494F, -1.5188F));

		PartDefinition cube_r55 = body2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(33, 30).addBox(2.9922F, -2.343F, -0.4258F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1017F, -0.5851F, 0.013F, -0.2494F, 1.5188F));

		PartDefinition cube_r56 = body2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(58, 22).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1017F, -0.5851F, 0.1378F, -0.209F, 0.9824F));

		PartDefinition cube_r57 = body2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(88, 55).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1017F, -0.5851F, 0.2621F, -0.0899F, 0.4445F));

		PartDefinition cube_r58 = body2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(11, 31).addBox(-1.4607F, 1.0753F, -3.3272F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.9607F, 6.6711F, -4.3229F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r59 = body2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(48, 18).addBox(-1.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5106F, 8.1418F, -4.415F, -0.0398F, -0.5575F, -0.2204F));

		PartDefinition cube_r60 = body2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(59, 19).addBox(-0.5F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6782F, 7.8211F, -5.478F, -0.089F, -0.2806F, -0.1259F));

		PartDefinition cube_r61 = body2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(87, 39).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0017F, -2.5851F, 0.2483F, -0.078F, 0.429F));

		PartDefinition cube_r62 = body2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(57, 32).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0017F, -2.5851F, 0.132F, -0.1918F, 0.9668F));

		PartDefinition cube_r63 = body2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(30, 16).addBox(2.9922F, -2.343F, -0.4258F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0017F, -2.5851F, 0.017F, -0.2317F, 1.5011F));

		PartDefinition cube_r64 = body2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(87, 67).addBox(0.0F, -1.35F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.5F, -3.0F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r65 = body2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(11, 25).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.5F, -3.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Bodyfront = body2.addOrReplaceChild("Bodyfront", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.3029F, -6.9476F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2092F, -4.0323F, 0.0112F, 0.0F, 0.0F));

		PartDefinition cube_r66 = Bodyfront.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(88, 8).addBox(0.0F, -1.55F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3029F, -0.8476F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r67 = Bodyfront.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(53, 69).addBox(0.0F, -1.9F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3029F, -2.9476F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r68 = Bodyfront.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(88, 4).addBox(0.0F, -1.9F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3029F, -4.9476F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r69 = Bodyfront.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(88, 0).addBox(0.0F, -1.7F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3029F, -6.9476F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r70 = Bodyfront.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(65, 42).addBox(-1.0F, 2.3461F, -1.8328F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.5893F, -4.6934F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r71 = Bodyfront.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(5, 78).addBox(-0.5F, 1.5835F, -3.1838F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.8971F, -3.8476F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r72 = Bodyfront.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(87, 53).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2109F, -0.5483F, 0.2019F, 0.0731F, -0.4472F));

		PartDefinition cube_r73 = Bodyfront.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(33, 32).mirror().addBox(-7.9922F, -2.343F, -0.4258F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2109F, -0.5483F, -0.0012F, 0.1887F, -1.5197F));

		PartDefinition cube_r74 = Bodyfront.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(58, 24).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2109F, -0.5483F, 0.0942F, 0.1638F, -0.9882F));

		PartDefinition cube_r75 = Bodyfront.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(37, 22).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2109F, -2.5483F, 0.2301F, 0.0945F, -0.4614F));

		PartDefinition cube_r76 = Bodyfront.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(30, 14).mirror().addBox(-7.9922F, -2.343F, -0.4258F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2109F, -2.5483F, -0.0068F, 0.2236F, -1.5374F));

		PartDefinition cube_r77 = Bodyfront.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(52, 5).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2109F, -2.5483F, 0.1074F, 0.1966F, -1.0024F));

		PartDefinition cube_r78 = Bodyfront.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(80, 87).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2109F, -4.5483F, 0.2607F, 0.1274F, -0.4911F));

		PartDefinition cube_r79 = Bodyfront.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(48, 20).mirror().addBox(-6.9922F, -2.343F, -0.4258F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2109F, -4.5483F, -0.0219F, 0.266F, -1.5741F));

		PartDefinition cube_r80 = Bodyfront.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(58, 34).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2109F, -4.5483F, 0.1167F, 0.2405F, -1.0335F));

		PartDefinition cube_r81 = Bodyfront.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(49, 44).mirror().addBox(-1.9F, -0.225F, -0.3F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1942F, 7.3771F, -5.2345F, -0.3029F, 0.6568F, 0.1593F));

		PartDefinition cube_r82 = Bodyfront.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(50, 58).mirror().addBox(-2.8F, -0.1F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4558F, 7.9402F, -3.8963F, -0.2672F, 0.4728F, 0.2828F));

		PartDefinition cube_r83 = Bodyfront.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(49, 39).mirror().addBox(-6.9922F, -2.343F, -0.4258F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2109F, -6.5483F, -0.0408F, 0.361F, -1.6308F));

		PartDefinition cube_r84 = Bodyfront.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(20, 88).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2109F, -6.5483F, 0.3377F, 0.1872F, -0.5299F));

		PartDefinition cube_r85 = Bodyfront.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(59, 17).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2109F, -6.5483F, 0.1524F, 0.331F, -1.0743F));

		PartDefinition cube_r86 = Bodyfront.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(50, 58).addBox(-0.2F, -0.1F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4558F, 7.9402F, -3.8963F, -0.2672F, -0.4728F, -0.2828F));

		PartDefinition cube_r87 = Bodyfront.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(49, 44).addBox(-1.1F, -0.225F, -0.3F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1942F, 7.3771F, -5.2345F, -0.3029F, -0.6568F, -0.1593F));

		PartDefinition cube_r88 = Bodyfront.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(0, 41).addBox(-0.5F, 1.4698F, -2.4581F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.8971F, -3.7476F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r89 = Bodyfront.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(59, 17).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2109F, -6.5483F, 0.1524F, -0.331F, 1.0743F));

		PartDefinition cube_r90 = Bodyfront.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(20, 88).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2109F, -6.5483F, 0.3377F, -0.1872F, 0.5299F));

		PartDefinition cube_r91 = Bodyfront.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(49, 39).addBox(2.9922F, -2.343F, -0.4258F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2109F, -6.5483F, -0.0408F, -0.361F, 1.6308F));

		PartDefinition cube_r92 = Bodyfront.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(58, 34).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2109F, -4.5483F, 0.1167F, -0.2405F, 1.0335F));

		PartDefinition cube_r93 = Bodyfront.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(48, 20).addBox(2.9922F, -2.343F, -0.4258F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2109F, -4.5483F, -0.0219F, -0.266F, 1.5741F));

		PartDefinition cube_r94 = Bodyfront.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(80, 87).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2109F, -4.5483F, 0.2607F, -0.1274F, 0.4911F));

		PartDefinition cube_r95 = Bodyfront.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(52, 5).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2109F, -2.5483F, 0.1074F, -0.1966F, 1.0024F));

		PartDefinition cube_r96 = Bodyfront.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(30, 14).addBox(2.9922F, -2.343F, -0.4258F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2109F, -2.5483F, -0.0068F, -0.2236F, 1.5374F));

		PartDefinition cube_r97 = Bodyfront.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(37, 22).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2109F, -2.5483F, 0.2301F, -0.0945F, 0.4614F));

		PartDefinition cube_r98 = Bodyfront.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(58, 24).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2109F, -0.5483F, 0.0942F, -0.1638F, 0.9882F));

		PartDefinition cube_r99 = Bodyfront.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(33, 32).addBox(2.9922F, -2.343F, -0.4258F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2109F, -0.5483F, -0.0012F, -0.1887F, 1.5197F));

		PartDefinition cube_r100 = Bodyfront.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(87, 53).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2109F, -0.5483F, 0.2019F, -0.0731F, 0.4472F));

		PartDefinition Rightupperarm = Bodyfront.addOrReplaceChild("Rightupperarm", CubeListBuilder.create().texOffs(79, 66).addBox(-0.5F, 4.6086F, -0.4238F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.6409F, 5.8031F, -7.4629F, 1.0436F, 0.2125F, -0.53F));

		PartDefinition cube_r101 = Rightupperarm.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(10, 80).addBox(-0.5F, -1.0F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(0, 80).addBox(-0.5F, -0.775F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 4.3836F, 0.0762F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r102 = Rightupperarm.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(20, 79).addBox(-0.5F, -1.1F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 0.0259F, 0.1856F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r103 = Rightupperarm.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(12, 69).addBox(-0.5F, -0.5F, -0.275F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0259F, 0.1856F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r104 = Rightupperarm.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(82, 35).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4945F, -0.1912F, -1.1445F, 0.669F, -0.4116F, 0.6694F));

		PartDefinition cube_r105 = Rightupperarm.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(77, 40).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1253F, -0.4366F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r106 = Rightupperarm.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(67, 78).addBox(-0.5F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.1104F, 0.0043F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r107 = Rightupperarm.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(72, 49).addBox(-0.5F, -1.05F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 3.6224F, -0.1479F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r108 = Rightupperarm.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(5, 71).addBox(-0.5F, -0.7F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.346F, 0.4214F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r109 = Rightupperarm.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(21, 65).addBox(0.0F, 0.3F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, -0.2962F, -0.1114F, 0.0854F, 0.0181F, -0.2087F));

		PartDefinition cube_r110 = Rightupperarm.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(52, 64).addBox(-0.5F, -1.3F, -0.675F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.9836F, 0.1762F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm = Rightupperarm.addOrReplaceChild("Rightlowerarm", CubeListBuilder.create().texOffs(15, 84).addBox(0.2F, -0.2242F, 0.3792F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.3335F, 5.4253F, 0.2955F, -1.2184F, 0.2395F, 0.5652F));

		PartDefinition cube_r111 = Rightlowerarm.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(79, 63).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.4F, 4.6888F, -0.6026F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r112 = Rightlowerarm.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(55, 81).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 3.6926F, -0.5155F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r113 = Rightlowerarm.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(73, 0).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.4F, 1.9564F, 0.8937F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r114 = Rightlowerarm.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(67, 70).addBox(-0.5F, -1.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 1.0758F, 0.1292F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r115 = Rightlowerarm.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(84, 58).addBox(-0.5F, -0.8F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F))
				.texOffs(84, 30).addBox(-0.5F, -0.8F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.7F, 4.7852F, 0.2726F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r116 = Rightlowerarm.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(55, 84).addBox(-0.5F, -0.875F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.7F, 3.8132F, 1.0504F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r117 = Rightlowerarm.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(84, 21).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7F, 4.2301F, -0.2487F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r118 = Rightlowerarm.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(38, 68).addBox(-0.5F, 0.3F, -0.925F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.7F, 0.7758F, 1.2292F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r119 = Rightlowerarm.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(83, 9).addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7F, 0.6758F, 1.2792F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Rightfrontfoot = Rightlowerarm.addOrReplaceChild("Rightfrontfoot", CubeListBuilder.create().texOffs(41, 0).addBox(-1.4F, -0.4383F, -1.743F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.561F, 0.527F, 0.2615F, -0.0843F, -0.0225F));

		PartDefinition Rightfrontfoot2 = Rightfrontfoot.addOrReplaceChild("Rightfrontfoot2", CubeListBuilder.create().texOffs(0, 18).addBox(-1.4F, -0.4859F, -3.0181F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.0594F, -1.455F, -0.071F, 0.0F, 0.0F));

		PartDefinition Leftupperarm = Bodyfront.addOrReplaceChild("Leftupperarm", CubeListBuilder.create().texOffs(5, 81).addBox(-0.5F, 4.6086F, -0.4238F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-3.6409F, 5.8031F, -7.4629F, -0.285F, -0.1128F, 0.9152F));

		PartDefinition cube_r120 = Leftupperarm.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(25, 81).addBox(-0.5F, -1.0F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(15, 81).addBox(-0.5F, -0.775F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 4.3836F, 0.0762F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r121 = Leftupperarm.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(79, 60).addBox(-0.5F, -1.1F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 0.0259F, 0.1856F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r122 = Leftupperarm.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(17, 70).addBox(-0.5F, -0.5F, -0.275F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0259F, 0.1856F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r123 = Leftupperarm.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(82, 78).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4945F, -0.1912F, -1.1445F, 0.669F, 0.4116F, -0.6694F));

		PartDefinition cube_r124 = Leftupperarm.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(77, 48).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1253F, -0.4366F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r125 = Leftupperarm.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(79, 32).addBox(-0.5F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.1104F, 0.0043F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r126 = Leftupperarm.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(0, 73).addBox(-0.5F, -1.05F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 3.6224F, -0.1479F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r127 = Leftupperarm.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(72, 41).addBox(-0.5F, -0.7F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.346F, 0.4214F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r128 = Leftupperarm.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(26, 67).addBox(-1.0F, 0.3F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, -0.2962F, -0.1114F, 0.0854F, -0.0181F, 0.2087F));

		PartDefinition cube_r129 = Leftupperarm.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(67, 21).addBox(-0.5F, -1.3F, -0.675F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.9836F, 0.1762F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm = Leftupperarm.addOrReplaceChild("Leftlowerarm", CubeListBuilder.create().texOffs(84, 24).addBox(-1.2F, -0.2242F, 0.3792F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.3335F, 5.4253F, 0.2955F, -1.0002F, -0.2395F, -0.5652F));

		PartDefinition cube_r130 = Leftlowerarm.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(77, 80).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4F, 4.6888F, -0.6026F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r131 = Leftlowerarm.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(81, 72).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 3.6926F, -0.5155F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r132 = Leftlowerarm.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(73, 4).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4F, 1.9564F, 0.8937F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r133 = Leftlowerarm.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(72, 37).addBox(-0.5F, -1.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 1.0758F, 0.1292F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r134 = Leftlowerarm.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(80, 84).addBox(-0.5F, -0.8F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F))
				.texOffs(84, 64).addBox(-0.5F, -0.8F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.7F, 4.7852F, 0.2726F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r135 = Leftlowerarm.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(65, 84).addBox(-0.5F, -0.875F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.7F, 3.8132F, 1.0504F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r136 = Leftlowerarm.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(25, 84).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7F, 4.2301F, -0.2487F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r137 = Leftlowerarm.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(43, 68).addBox(-0.5F, 0.3F, -0.925F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.7F, 0.7758F, 1.2292F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r138 = Leftlowerarm.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(50, 83).addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7F, 0.6758F, 1.2792F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Leftfrontfoot = Leftlowerarm.addOrReplaceChild("Leftfrontfoot", CubeListBuilder.create().texOffs(41, 4).addBox(-1.6F, -0.4383F, -1.743F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.561F, 0.527F, 1.154F, 0.4736F, 0.038F));

		PartDefinition Leftfrontfoot2 = Leftfrontfoot.addOrReplaceChild("Leftfrontfoot2", CubeListBuilder.create().texOffs(13, 18).addBox(-1.6F, -0.4859F, -3.0181F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.0594F, -1.455F, -0.071F, 0.0F, 0.0F));

		PartDefinition Neck = Bodyfront.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(14, 57).addBox(-0.5F, 0.081F, -2.013F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.3723F, -6.9384F, 0.1914F, -0.0857F, -0.0166F));

		PartDefinition cube_r139 = Neck.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(85, 87).addBox(0.0F, -1.8F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.081F, -2.013F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r140 = Neck.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(58, 36).mirror().addBox(-2.9348F, -0.0436F, -0.4066F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6023F, -1.582F, 0.2366F, 0.2079F, -1.0934F));

		PartDefinition cube_r141 = Neck.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(58, 36).addBox(-0.0652F, -0.0436F, -0.4066F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6023F, -1.582F, 0.2366F, -0.2079F, 1.0934F));

		PartDefinition Neck2 = Neck.addOrReplaceChild("Neck2", CubeListBuilder.create().texOffs(62, 66).addBox(-0.5F, -0.5503F, -1.9759F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6667F, -1.875F, -0.3261F, -0.1108F, -0.0544F));

		PartDefinition Neck_r1 = Neck2.addOrReplaceChild("Neck_r1", CubeListBuilder.create().texOffs(89, 20).addBox(0.0F, -1.2F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.5503F, -1.4759F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r142 = Neck2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(74, 27).mirror().addBox(-1.9348F, -0.0436F, -0.4066F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0043F, -1.57F, 0.159F, 0.792F, -1.2119F));

		PartDefinition cube_r143 = Neck2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(74, 27).addBox(-0.0652F, -0.0436F, -0.4066F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0043F, -1.57F, 0.159F, -0.792F, 1.2119F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create().texOffs(36, 56).addBox(-0.5F, -0.5167F, -1.9615F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F))
				.texOffs(89, 29).addBox(0.0F, -1.4153F, -2.0445F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.0478F, -1.9295F, 0.1122F, 0.0434F, 0.0049F));

		PartDefinition Head = Neck3.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4804F, -1.8728F, 0.6967F, 0.1344F, 0.1117F));

		PartDefinition cube_r144 = Head.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(49, 41).addBox(-1.5F, -1.7696F, -2.7719F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -5.8237F, -7.0828F, 1.1083F, 0.0F, 0.0F));

		PartDefinition cube_r145 = Head.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(17, 0).addBox(0.0F, -2.0F, -0.975F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0F, -2.2222F, -3.86F, -0.432F, 0.0F, 0.0F));

		PartDefinition cube_r146 = Head.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(9, 48).addBox(-1.5F, -0.1346F, -2.6076F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(0.0F, -5.8237F, -7.0828F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r147 = Head.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(60, 38).addBox(-0.5F, -0.0346F, -1.0076F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -5.6487F, -8.0078F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r148 = Head.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(67, 54).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.5019F, -7.0233F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r149 = Head.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(27, 51).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -3.3111F, 1.9037F, 1.5184F, 0.0F, 0.0F));

		PartDefinition cube_r150 = Head.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(74, 34).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -4.2211F, 1.489F, 0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r151 = Head.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(68, 17).addBox(0.5F, -0.0585F, -0.0087F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, -4.6348F, 0.5863F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r152 = Head.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(0, 35).addBox(0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0F, -4.4521F, -1.412F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r153 = Head.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(33, 34).addBox(0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, -4.5132F, -2.4101F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r154 = Head.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(20, 42).addBox(-1.0F, 0.1153F, 3.0923F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(41, 8).addBox(-1.0F, 0.1153F, 1.0923F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -5.4536F, -7.1212F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r155 = Head.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(78, 6).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -5.0111F, -4.6354F, -1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r156 = Head.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(59, 58).addBox(-0.5F, -0.25F, 2.425F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(33, 24).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -5.5019F, -7.0233F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Lowerjaw1 = Head.addOrReplaceChild("Lowerjaw1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, -0.5235F, -1.3789F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r157 = Lowerjaw1.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(79, 21).mirror().addBox(-0.0777F, -0.2135F, -0.6082F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-2.7466F, -1.3023F, -1.4851F, -0.2849F, -0.233F, 0.0389F));

		PartDefinition cube_r158 = Lowerjaw1.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(42, 22).mirror().addBox(-0.0777F, -0.5192F, -2.282F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.7466F, -1.3023F, -1.4851F, 0.2736F, -0.233F, 0.0389F));

		PartDefinition cube_r159 = Lowerjaw1.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(50, 8).mirror().addBox(0.0827F, 0.379F, -3.0494F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.7466F, -1.3023F, -1.4851F, -0.2649F, -0.1593F, -0.016F));

		PartDefinition cube_r160 = Lowerjaw1.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(0, 51).mirror().addBox(0.014F, -0.5849F, -1.3887F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.1216F, -1.3023F, -4.7851F, -0.419F, -0.2293F, 0.0694F));

		PartDefinition cube_r161 = Lowerjaw1.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(72, 53).mirror().addBox(-0.0056F, -1.1942F, -0.4408F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(-1.7216F, -1.3023F, -6.4851F, -0.3278F, -0.1776F, 0.0477F));

		PartDefinition cube_r162 = Lowerjaw1.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(0, 69).mirror().addBox(-0.0056F, -0.9104F, -1.0678F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(73, 8).mirror().addBox(-0.0056F, -1.9104F, -0.5678F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.093F)).mirror(false), PartPose.offsetAndRotation(-1.7216F, -1.3023F, -6.4851F, 0.894F, -0.1776F, 0.0477F));

		PartDefinition cube_r163 = Lowerjaw1.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(75, 86).mirror().addBox(-0.0056F, -1.2789F, 0.3512F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.7216F, -1.3023F, -6.4851F, 2.1332F, -0.1776F, 0.0477F));

		PartDefinition cube_r164 = Lowerjaw1.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(77, 51).mirror().addBox(0.4845F, 1.343F, 2.1324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.0216F, -1.3023F, -4.7851F, -2.8278F, -0.0205F, -0.0027F));

		PartDefinition cube_r165 = Lowerjaw1.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(30, 80).mirror().addBox(0.4845F, 2.585F, -2.3428F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(-2.0216F, -1.3023F, -4.7851F, -1.5014F, -0.0205F, -0.0027F));

		PartDefinition cube_r166 = Lowerjaw1.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(60, 81).mirror().addBox(-0.55F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(60, 81).mirror().addBox(-1.15F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.3019F, -3.3571F, -8.0461F, -1.8386F, 0.1377F, -0.0692F));

		PartDefinition cube_r167 = Lowerjaw1.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(62, 26).mirror().addBox(0.059F, 0.4608F, -1.0418F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(26, 63).mirror().addBox(0.059F, 1.0858F, -0.9668F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.1216F, -1.3023F, -4.7851F, -1.9719F, -0.2924F, 0.1148F));

		PartDefinition cube_r168 = Lowerjaw1.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(58, 41).mirror().addBox(0.059F, -0.143F, -1.1168F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.1216F, -1.3023F, -4.7851F, -1.9021F, -0.2924F, 0.1148F));

		PartDefinition cube_r169 = Lowerjaw1.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(66, 4).mirror().addBox(-0.0508F, 2.4478F, -0.0616F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.7466F, -1.3023F, -1.4851F, -1.9045F, -0.2224F, 0.0634F));

		PartDefinition cube_r170 = Lowerjaw1.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(66, 58).mirror().addBox(-0.0508F, 1.7767F, 0.1903F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.7466F, -1.3023F, -1.4851F, -1.9918F, -0.2224F, 0.0634F));

		PartDefinition cube_r171 = Lowerjaw1.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(35, 80).mirror().addBox(0.4845F, 0.7539F, -3.4926F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-2.0216F, -1.3023F, -4.7851F, -0.8731F, -0.0205F, -0.0027F));

		PartDefinition cube_r172 = Lowerjaw1.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(63, 45).mirror().addBox(-0.0117F, -1.2133F, -1.8401F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.7216F, -1.3023F, -6.4851F, -0.4772F, -0.1736F, 0.0546F));

		PartDefinition cube_r173 = Lowerjaw1.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(45, 86).mirror().addBox(-0.1418F, -2.2028F, 1.5976F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.08F)).mirror(false), PartPose.offsetAndRotation(-2.7466F, -1.3023F, -1.4851F, -3.0372F, -0.2235F, 0.0133F));

		PartDefinition cube_r174 = Lowerjaw1.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(7, 56).mirror().addBox(-0.1418F, 1.0959F, 1.676F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.092F)).mirror(false), PartPose.offsetAndRotation(-2.7466F, -1.3023F, -1.4851F, -2.0511F, -0.2235F, 0.0133F));

		PartDefinition cube_r175 = Lowerjaw1.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(55, 27).mirror().addBox(-0.0297F, -0.4485F, 0.1249F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.092F)).mirror(false), PartPose.offsetAndRotation(-2.1216F, -1.3023F, -4.7851F, -2.2283F, -0.2933F, 0.0637F));

		PartDefinition cube_r176 = Lowerjaw1.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(52, 77).mirror().addBox(-0.0297F, 0.744F, 0.011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.092F)).mirror(false), PartPose.offsetAndRotation(-2.1216F, -1.3023F, -4.7851F, -2.0887F, -0.2933F, 0.0637F));

		PartDefinition cube_r177 = Lowerjaw1.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(70, 86).mirror().addBox(-0.2418F, 0.6859F, 2.2554F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(86, 72).mirror().addBox(-0.2418F, 0.0859F, 2.2554F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.7466F, -1.3023F, -1.4851F, -1.7456F, -0.2235F, 0.0133F));

		PartDefinition cube_r178 = Lowerjaw1.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(50, 60).mirror().addBox(-0.1418F, 1.3909F, 1.12F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-2.7466F, -1.3023F, -1.4851F, -1.7282F, -0.2235F, 0.0133F));

		PartDefinition cube_r179 = Lowerjaw1.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(60, 50).mirror().addBox(-0.0777F, 0.1405F, -0.7164F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.109F)).mirror(false), PartPose.offsetAndRotation(-2.7466F, -1.3023F, -1.4851F, 1.0241F, -0.233F, 0.0389F));

		PartDefinition cube_r180 = Lowerjaw1.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(60, 54).mirror().addBox(-0.5F, -0.525F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.6706F, -0.7995F, -0.0585F, 1.4168F, -0.233F, 0.0389F));

		PartDefinition cube_r181 = Lowerjaw1.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(47, 77).mirror().addBox(-0.0777F, 0.7015F, -1.7972F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.107F)).mirror(false), PartPose.offsetAndRotation(-2.7466F, -1.3023F, -1.4851F, 1.6349F, -0.233F, 0.0389F));

		PartDefinition cube_r182 = Lowerjaw1.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(46, 27).mirror().addBox(-0.0777F, -0.2603F, -3.0627F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-2.7466F, -1.3023F, -1.4851F, 2.1149F, -0.233F, 0.0389F));

		PartDefinition cube_r183 = Lowerjaw1.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(29, 46).mirror().addBox(-0.0777F, -1.2738F, -2.3332F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.107F)).mirror(false), PartPose.offsetAndRotation(-2.7466F, -1.3023F, -1.4851F, 2.5512F, -0.233F, 0.0389F));

		PartDefinition cube_r184 = Lowerjaw1.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(47, 46).mirror().addBox(-0.0777F, -1.7272F, -0.9122F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-2.7466F, -1.3023F, -1.4851F, 2.9876F, -0.233F, 0.0389F));

		PartDefinition cube_r185 = Lowerjaw1.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(50, 86).mirror().addBox(-0.1418F, -2.6631F, 0.4541F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.085F)).mirror(false), PartPose.offsetAndRotation(-2.7466F, -1.3023F, -1.4851F, 2.6788F, -0.2235F, 0.0133F));

		PartDefinition cube_r186 = Lowerjaw1.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(78, 57).mirror().addBox(0.9049F, 2.4878F, -2.3428F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.09F)).mirror(false)
				.texOffs(62, 78).mirror().addBox(1.4049F, 2.4878F, -2.3428F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.0216F, -1.3023F, -4.7851F, -1.501F, 0.1014F, 0.0058F));

		PartDefinition cube_r187 = Lowerjaw1.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(40, 80).mirror().addBox(-0.65F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.9678F, -3.1783F, -7.4656F, -2.2244F, 0.034F, 0.011F));

		PartDefinition cube_r188 = Lowerjaw1.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(0, 61).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.112F)).mirror(false), PartPose.offsetAndRotation(-2.3802F, -1.3654F, -1.1884F, 0.4917F, -0.233F, 0.0389F));

		PartDefinition cube_r189 = Lowerjaw1.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(52, 77).addBox(-0.9703F, 0.744F, 0.011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.092F)), PartPose.offsetAndRotation(1.9216F, -1.3023F, -4.7851F, -2.0887F, 0.2933F, -0.0637F));

		PartDefinition cube_r190 = Lowerjaw1.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(55, 27).addBox(-0.9703F, -0.4485F, 0.1249F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.092F)), PartPose.offsetAndRotation(1.9216F, -1.3023F, -4.7851F, -2.2283F, 0.2933F, -0.0637F));

		PartDefinition cube_r191 = Lowerjaw1.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(7, 56).addBox(-0.8582F, 1.0959F, 1.676F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.092F)), PartPose.offsetAndRotation(2.5466F, -1.3023F, -1.4851F, -2.0511F, 0.2235F, -0.0133F));

		PartDefinition cube_r192 = Lowerjaw1.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(50, 60).addBox(-0.8582F, 1.3909F, 1.12F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(2.5466F, -1.3023F, -1.4851F, -1.7282F, 0.2235F, -0.0133F));

		PartDefinition cube_r193 = Lowerjaw1.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(86, 72).addBox(-0.7582F, 0.0859F, 2.2554F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(70, 86).addBox(-0.7582F, 0.6859F, 2.2554F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.5466F, -1.3023F, -1.4851F, -1.7456F, 0.2235F, -0.0133F));

		PartDefinition cube_r194 = Lowerjaw1.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(50, 86).addBox(-0.8582F, -2.6631F, 0.4541F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.085F)), PartPose.offsetAndRotation(2.5466F, -1.3023F, -1.4851F, 2.6788F, 0.2235F, -0.0133F));

		PartDefinition cube_r195 = Lowerjaw1.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(45, 86).addBox(-0.8582F, -2.2028F, 1.5976F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.08F)), PartPose.offsetAndRotation(2.5466F, -1.3023F, -1.4851F, -3.0372F, 0.2235F, -0.0133F));

		PartDefinition cube_r196 = Lowerjaw1.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(63, 45).addBox(-0.9883F, -1.2133F, -1.8401F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.5216F, -1.3023F, -6.4851F, -0.4772F, 0.1736F, -0.0546F));

		PartDefinition cube_r197 = Lowerjaw1.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(35, 80).addBox(-1.4845F, 0.7539F, -3.4926F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.8216F, -1.3023F, -4.7851F, -0.8731F, 0.0205F, 0.0027F));

		PartDefinition cube_r198 = Lowerjaw1.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(66, 58).addBox(-0.9492F, 1.7767F, 0.1903F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.5466F, -1.3023F, -1.4851F, -1.9918F, 0.2224F, -0.0634F));

		PartDefinition cube_r199 = Lowerjaw1.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(66, 4).addBox(-0.9492F, 2.4478F, -0.0616F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.5466F, -1.3023F, -1.4851F, -1.9045F, 0.2224F, -0.0634F));

		PartDefinition cube_r200 = Lowerjaw1.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(58, 41).addBox(-1.059F, -0.143F, -1.1168F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.9216F, -1.3023F, -4.7851F, -1.9021F, 0.2924F, -0.1148F));

		PartDefinition cube_r201 = Lowerjaw1.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(26, 63).addBox(-1.059F, 1.0858F, -0.9668F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F))
				.texOffs(62, 26).addBox(-1.059F, 0.4608F, -1.0418F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.9216F, -1.3023F, -4.7851F, -1.9719F, 0.2924F, -0.1148F));

		PartDefinition cube_r202 = Lowerjaw1.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(40, 80).addBox(-0.35F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.7678F, -3.1783F, -7.4656F, -2.2244F, -0.034F, -0.011F));

		PartDefinition cube_r203 = Lowerjaw1.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(60, 81).addBox(0.15F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(60, 81).addBox(-0.45F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1019F, -3.3571F, -8.0461F, -1.8386F, -0.1377F, 0.0692F));

		PartDefinition cube_r204 = Lowerjaw1.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(62, 78).addBox(-2.4049F, 2.4878F, -2.3428F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(78, 57).addBox(-1.9049F, 2.4878F, -2.3428F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(1.8216F, -1.3023F, -4.7851F, -1.501F, -0.1014F, -0.0058F));

		PartDefinition cube_r205 = Lowerjaw1.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(30, 80).addBox(-1.4845F, 2.585F, -2.3428F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(1.8216F, -1.3023F, -4.7851F, -1.5014F, 0.0205F, 0.0027F));

		PartDefinition cube_r206 = Lowerjaw1.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(77, 51).addBox(-1.4845F, 1.343F, 2.1324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.8216F, -1.3023F, -4.7851F, -2.8278F, 0.0205F, 0.0027F));

		PartDefinition cube_r207 = Lowerjaw1.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(75, 86).addBox(-0.9944F, -1.2789F, 0.3512F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.5216F, -1.3023F, -6.4851F, 2.1332F, 0.1776F, -0.0477F));

		PartDefinition cube_r208 = Lowerjaw1.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(73, 8).addBox(-0.9944F, -1.9104F, -0.5678F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.093F))
				.texOffs(0, 69).addBox(-0.9944F, -0.9104F, -1.0678F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.5216F, -1.3023F, -6.4851F, 0.894F, 0.1776F, -0.0477F));

		PartDefinition cube_r209 = Lowerjaw1.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(72, 53).addBox(-0.9944F, -1.1942F, -0.4408F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(1.5216F, -1.3023F, -6.4851F, -0.3278F, 0.1776F, -0.0477F));

		PartDefinition cube_r210 = Lowerjaw1.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(0, 51).addBox(-1.014F, -0.5849F, -1.3887F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.9216F, -1.3023F, -4.7851F, -0.419F, 0.2293F, -0.0694F));

		PartDefinition cube_r211 = Lowerjaw1.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(50, 8).addBox(-1.0828F, 0.379F, -3.0494F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.5466F, -1.3023F, -1.4851F, -0.2649F, 0.1593F, 0.016F));

		PartDefinition cube_r212 = Lowerjaw1.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(0, 61).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.112F)), PartPose.offsetAndRotation(2.1802F, -1.3654F, -1.1884F, 0.4917F, 0.233F, -0.0389F));

		PartDefinition cube_r213 = Lowerjaw1.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(42, 22).addBox(-0.9223F, -0.5192F, -2.282F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.5466F, -1.3023F, -1.4851F, 0.2736F, 0.233F, -0.0389F));

		PartDefinition cube_r214 = Lowerjaw1.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(47, 46).addBox(-0.9223F, -1.7272F, -0.9122F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(2.5466F, -1.3023F, -1.4851F, 2.9876F, 0.233F, -0.0389F));

		PartDefinition cube_r215 = Lowerjaw1.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(29, 46).addBox(-0.9223F, -1.2738F, -2.3332F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.107F)), PartPose.offsetAndRotation(2.5466F, -1.3023F, -1.4851F, 2.5512F, 0.233F, -0.0389F));

		PartDefinition cube_r216 = Lowerjaw1.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(46, 27).addBox(-0.9223F, -0.2603F, -3.0627F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(2.5466F, -1.3023F, -1.4851F, 2.1149F, 0.233F, -0.0389F));

		PartDefinition cube_r217 = Lowerjaw1.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(47, 77).addBox(-0.9223F, 0.7015F, -1.7972F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.107F)), PartPose.offsetAndRotation(2.5466F, -1.3023F, -1.4851F, 1.6349F, 0.233F, -0.0389F));

		PartDefinition cube_r218 = Lowerjaw1.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(60, 54).addBox(-0.5F, -0.525F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.4706F, -0.7995F, -0.0585F, 1.4168F, 0.233F, -0.0389F));

		PartDefinition cube_r219 = Lowerjaw1.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(60, 50).addBox(-0.9223F, 0.1405F, -0.7164F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(2.5466F, -1.3023F, -1.4851F, 1.0241F, 0.233F, -0.0389F));

		PartDefinition cube_r220 = Lowerjaw1.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(79, 21).addBox(-0.9223F, -0.2135F, -0.6082F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(2.5466F, -1.3023F, -1.4851F, -0.2849F, 0.233F, -0.0389F));

		PartDefinition bone2 = Lowerjaw1.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(2.3725F, -0.2223F, -0.2661F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(1.4667F, -4.2203F, -9.1702F, 0.0F, -0.0524F, 0.0F));

		PartDefinition cube_r221 = leftFace.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(69, 66).addBox(-0.5F, -1.025F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(69, 62).addBox(-0.5F, -1.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0477F, 1.7244F, 3.3779F, -0.3261F, 0.2911F, 0.0283F));

		PartDefinition cube_r222 = leftFace.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(48, 69).addBox(-0.5F, -1.075F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.1921F, 1.3441F, 2.86F, -0.3523F, 0.2911F, 0.0283F));

		PartDefinition cube_r223 = leftFace.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(69, 26).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.3261F, 1.021F, 2.3825F, -0.3523F, 0.2911F, 0.0283F));

		PartDefinition cube_r224 = leftFace.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(22, 72).addBox(-0.5F, -1.0F, -0.325F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2694F, 0.4826F, -0.5235F, -0.367F, -0.0494F, -0.0636F));

		PartDefinition cube_r225 = leftFace.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(78, 18).addBox(-0.5F, 0.1F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(78, 3).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2526F, 0.7938F, -0.8686F, 0.1823F, -0.0281F, -0.0755F));

		PartDefinition cube_r226 = leftFace.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(78, 0).addBox(-0.4999F, -1.4214F, -0.4266F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.1954F, 1.5191F, -0.9527F, -0.289F, -0.0281F, -0.0755F));

		PartDefinition cube_r227 = leftFace.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(76, 77).addBox(-0.4999F, -1.6515F, -0.791F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.197F, 1.4986F, -0.9523F, -0.7951F, -0.0281F, -0.0755F));

		PartDefinition cube_r228 = leftFace.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(42, 77).addBox(-0.5F, -0.625F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.0954F, 0.3919F, -0.4965F, -0.5515F, -0.0578F, -0.0572F));

		PartDefinition cube_r229 = leftFace.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(77, 69).addBox(-0.4999F, -1.7327F, -0.7022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.197F, 1.4986F, -0.9523F, -0.5508F, -0.0281F, -0.0755F));

		PartDefinition cube_r230 = leftFace.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(22, 31).addBox(-1.8896F, -0.1025F, -3.035F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.4229F, 1.7462F, 4.6022F, -0.5659F, 0.1874F, -0.0883F));

		PartDefinition cube_r231 = leftFace.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(43, 56).addBox(-0.9134F, -0.0722F, 0.7554F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0361F, -0.6001F, -0.6728F, -0.2038F, -0.1387F, 0.0993F));

		PartDefinition cube_r232 = leftFace.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(37, 77).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.8607F, 0.3687F, 4.4974F, -0.5495F, 0.2529F, -0.9673F));

		PartDefinition cube_r233 = leftFace.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(32, 77).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.8607F, 0.3687F, 4.4974F, -0.5745F, -0.1816F, -1.6272F));

		PartDefinition cube_r234 = leftFace.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(77, 37).addBox(-1.0F, -1.0F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.8607F, 0.3687F, 4.4974F, -0.6425F, 0.2686F, -1.0338F));

		PartDefinition cube_r235 = leftFace.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(10, 77).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.8607F, 0.3687F, 4.4974F, -0.6712F, -0.1689F, -1.5831F));

		PartDefinition cube_r236 = leftFace.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(22, 36).addBox(-1.0F, -0.95F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.1197F, 0.0948F, 2.7322F, -0.2737F, 0.0864F, -0.0848F));

		PartDefinition cube_r237 = leftFace.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(51, 22).addBox(-0.5F, -0.95F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.4827F, 0.0292F, 2.3677F, -0.279F, 0.2123F, -0.1208F));

		PartDefinition cube_r238 = leftFace.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(77, 54).addBox(-0.5F, -0.425F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.856F, 0.7399F, 6.178F, -0.2547F, -0.0121F, 0.0762F));

		PartDefinition cube_r239 = leftFace.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(32, 0).addBox(-1.0F, 0.0F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2635F, 1.8477F, 11.4727F, -0.7818F, -0.9583F, 2.2319F));

		PartDefinition cube_r240 = leftFace.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(57, 68).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.3911F, 1.372F, 11.3601F, -1.7679F, -0.9583F, 2.2319F));

		PartDefinition cube_r241 = leftFace.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(67, 49).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5005F, 1.0339F, 11.059F, -2.1035F, -0.9361F, 2.3766F));

		PartDefinition cube_r242 = leftFace.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(68, 12).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.4634F, 1.6079F, 9.9777F, -2.5417F, -0.6464F, 2.7413F));

		PartDefinition cube_r243 = leftFace.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(0, 46).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.7479F, 1.0598F, 6.2374F, -0.4315F, -0.7559F, 0.4726F));

		PartDefinition cube_r244 = leftFace.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(57, 78).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.0715F, -0.1261F, 6.5015F, 2.1484F, -1.2367F, 1.4692F));

		PartDefinition cube_r245 = leftFace.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(78, 29).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0808F, -0.2403F, 6.5758F, -2.9131F, -1.2367F, 1.4692F));

		PartDefinition cube_r246 = leftFace.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(25, 78).addBox(-0.5F, 0.15F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.1251F, -0.5329F, 6.1458F, -2.1534F, -1.2323F, 2.0036F));

		PartDefinition cube_r247 = leftFace.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(31, 70).addBox(-0.3802F, -1.177F, -0.18F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.254F, 2.1109F, 3.7958F, -0.3379F, 0.5951F, -0.3005F));

		PartDefinition cube_r248 = leftFace.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(43, 60).addBox(-0.4F, -0.9F, -1.075F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0594F, 0.8559F, 3.611F, -1.156F, 0.5254F, -0.3135F));

		PartDefinition cube_r249 = leftFace.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(50, 80).addBox(-0.9F, -0.325F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.1764F, 2.0726F, 4.7093F, -0.44F, 0.6799F, -0.3487F));

		PartDefinition cube_r250 = leftFace.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(45, 80).addBox(-0.625F, -0.125F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F))
				.texOffs(80, 43).addBox(-0.625F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.0678F, 2.0473F, 5.2223F, -0.3614F, 0.3577F, -0.1926F));

		PartDefinition cube_r251 = leftFace.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(21, 59).addBox(-0.5F, -3.9F, -0.9F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.572F, 3.9625F, 7.0955F, -1.3854F, 0.2969F, -0.0774F));

		PartDefinition cube_r252 = leftFace.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(72, 80).addBox(-0.9F, 0.225F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1034F))
				.texOffs(14, 61).addBox(-0.9F, 0.225F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F))
				.texOffs(18, 47).addBox(-0.9F, -0.1F, -0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(2.4533F, 1.7351F, 5.6089F, -0.5605F, 0.2111F, -0.0939F));

		PartDefinition cube_r253 = leftFace.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(72, 70).addBox(-0.9F, -0.1F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(2.0363F, 1.0111F, 4.9875F, -1.2254F, 0.6799F, -0.3487F));

		PartDefinition cube_r254 = leftFace.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(38, 46).addBox(-0.175F, 0.7F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5513F, 0.6175F, 4.5807F, -0.7454F, 0.6799F, -0.3487F));

		PartDefinition cube_r255 = leftFace.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(42, 34).addBox(-0.175F, 0.1F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.5513F, 0.6175F, 4.5807F, -0.5273F, 0.6799F, -0.3487F));

		PartDefinition cube_r256 = leftFace.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(15, 74).addBox(-0.5F, -1.9F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(1.8134F, 2.7335F, 4.7773F, -0.5271F, 0.813F, -0.4795F));

		PartDefinition cube_r257 = leftFace.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(73, 57).addBox(-0.4595F, -0.8653F, 0.7463F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.106F))
				.texOffs(51, 73).addBox(-0.4595F, -0.8653F, 0.3463F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(0.254F, 2.1109F, 3.7958F, -0.1518F, 0.813F, -0.4795F));

		PartDefinition cube_r258 = leftFace.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(27, 74).addBox(-0.4595F, -2.5757F, -0.7283F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.254F, 2.1109F, 3.7958F, -1.5219F, 0.813F, -0.4795F));

		PartDefinition cube_r259 = leftFace.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(40, 40).addBox(-0.147F, -1.8134F, -2.0935F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.554F, 2.5109F, 6.5958F, -1.9014F, 0.2646F, -0.1636F));

		PartDefinition cube_r260 = leftFace.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(31, 40).addBox(-0.976F, -1.7117F, -2.7247F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(2.154F, 2.5109F, 4.6958F, -1.8864F, 0.1256F, -0.1217F));

		PartDefinition cube_r261 = leftFace.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(36, 73).addBox(-0.147F, 0.3261F, -1.1775F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.106F))
				.texOffs(41, 51).addBox(-0.147F, 0.3261F, -2.4025F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.554F, 2.5109F, 6.5958F, 2.9767F, 0.2646F, -0.1636F));

		PartDefinition cube_r262 = leftFace.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(82, 69).addBox(-0.8F, -0.225F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.2971F, 1.4733F, 10.9096F, -1.3764F, 0.2214F, 0.0657F));

		PartDefinition cube_r263 = leftFace.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(82, 52).addBox(-0.8F, -0.825F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.0153F, 1.0908F, 10.5432F, -2.3838F, 0.4766F, -0.2255F));

		PartDefinition cube_r264 = leftFace.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(82, 49).addBox(-0.8F, -0.825F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(3.7156F, 0.8604F, 10.0772F, 2.634F, 0.4766F, -0.2255F));

		PartDefinition cube_r265 = leftFace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(0, 65).addBox(-0.8F, -0.825F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.9675F, 0.4411F, 8.8466F, 2.7475F, 0.4766F, -0.2255F));

		PartDefinition cube_r266 = leftFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(30, 8).addBox(-0.7F, -0.525F, -3.7F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8185F, 0.3647F, 5.5263F, 2.986F, 0.2982F, -0.1488F));

		PartDefinition cube_r267 = leftFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(52, 0).addBox(-0.976F, 0.6683F, -2.1817F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(2.154F, 2.5109F, 4.6958F, 2.9918F, 0.1256F, -0.1217F));

		PartDefinition cube_r268 = leftFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(51, 34).addBox(-0.1F, -1.8465F, -2.0845F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.004F, 2.5109F, 8.5958F, -1.9253F, 0.4365F, -0.1837F));

		PartDefinition cube_r269 = leftFace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(0, 86).addBox(-0.1F, -2.2955F, 1.3725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(2.004F, 2.5109F, 8.5958F, -0.4854F, 0.4365F, -0.1837F));

		PartDefinition cube_r270 = leftFace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(10, 86).addBox(-0.1F, 0.3664F, 2.2253F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(2.004F, 2.5109F, 8.5958F, 0.4309F, 0.4365F, -0.1837F));

		PartDefinition cube_r271 = leftFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(74, 65).addBox(-0.1F, 1.0072F, 0.8085F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(2.004F, 2.5109F, 8.5958F, 1.0854F, 0.4365F, -0.1837F));

		PartDefinition cube_r272 = leftFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(66, 0).addBox(-0.1F, 1.3404F, -2.1635F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(2.004F, 2.5109F, 8.5958F, 2.1326F, 0.4365F, -0.1837F));

		PartDefinition cube_r273 = leftFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(73, 30).addBox(-0.1F, -1.9578F, -1.7974F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(2.004F, 2.5109F, 8.5958F, -2.7107F, 0.4365F, -0.1837F));

		PartDefinition cube_r274 = leftFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(45, 64).addBox(-0.1F, -1.7539F, -0.6665F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(2.004F, 2.5109F, 8.5958F, -1.6198F, 0.4365F, -0.1837F));

		PartDefinition cube_r275 = leftFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(48, 51).addBox(-0.147F, -2.2793F, -0.1231F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(1.554F, 2.5109F, 6.5958F, -1.4128F, 0.2646F, -0.1636F));

		PartDefinition cube_r276 = leftFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(38, 64).addBox(-0.1F, -1.0334F, -0.5276F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(2.004F, 2.5109F, 8.5958F, -1.4453F, 0.4365F, -0.1837F));

		PartDefinition cube_r277 = leftFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(52, 13).addBox(-0.147F, -0.9792F, -0.3337F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(1.554F, 2.5109F, 6.5958F, -0.671F, 0.2646F, -0.1636F));

		PartDefinition cube_r278 = leftFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(34, 51).addBox(-0.976F, -1.8405F, -0.0635F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(2.154F, 2.5109F, 4.6958F, -0.4814F, 0.1256F, -0.1217F));

		PartDefinition cube_r279 = leftFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(56, 73).addBox(-0.9F, -1.9F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(2.0056F, 2.7002F, 4.6125F, -2.4509F, 1.086F, -2.6669F));

		PartDefinition cube_r280 = leftFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(46, 73).addBox(-0.4595F, -1.3256F, 0.9864F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(0.254F, 2.1109F, 3.7958F, -0.4117F, 0.7348F, -0.4415F));

		PartDefinition cube_r281 = leftFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(66, 74).addBox(0.0F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.9051F, 3.8657F, 9.8806F, 2.3273F, 1.205F, -2.2094F));

		PartDefinition cube_r282 = leftFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(71, 74).addBox(-0.5881F, -0.6551F, -1.0135F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.2819F, 3.51F, 9.4373F, 3.0127F, 0.7502F, -1.4731F));

		PartDefinition cube_r283 = leftFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(79, 24).addBox(-0.2618F, -0.7603F, -0.9505F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.2819F, 3.51F, 9.4373F, -2.7471F, 0.6564F, -0.839F));

		PartDefinition cube_r284 = leftFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(43, 13).addBox(-1.0F, -0.125F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.9667F, -1.2816F, 2.1469F, -0.0989F, -0.2947F, -1.2969F));

		PartDefinition cube_r285 = leftFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(36, 60).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.9667F, -0.4901F, 5.4886F, -0.1201F, -0.2815F, -1.1611F));

		PartDefinition cube_r286 = leftFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(78, 15).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.9667F, -0.7908F, 4.5348F, -1.5875F, -0.0403F, -1.1778F));

		PartDefinition cube_r287 = leftFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(78, 9).addBox(-0.8F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(78, 12).addBox(-0.8F, -0.2F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.9667F, -1.2816F, 2.1469F, -0.0503F, -0.1854F, -1.3043F));

		PartDefinition cube_r288 = leftFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(15, 78).addBox(-0.5F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5614F, -0.9274F, 1.7724F, -0.3557F, -0.1854F, -1.3043F));

		PartDefinition cube_r289 = leftFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(61, 4).addBox(-0.8F, 0.1654F, -0.1076F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.2911F, -1.1463F, 0.4813F, 0.4051F, -0.2415F, -0.1022F));

		PartDefinition cube_r290 = leftFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(7, 51).addBox(-1.15F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.7667F, 0.6681F, 7.7582F, -0.0834F, -0.7488F, 0.0569F));

		PartDefinition bone3 = leftFace.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5207F, 1.8701F, 3.8858F, 0.0F, -0.0218F, 0.0F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.4667F, -4.2203F, -9.1702F, 0.0F, 0.0524F, 0.0F));

		PartDefinition cube_r291 = rightFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(69, 66).mirror().addBox(-0.5F, -1.025F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(69, 62).mirror().addBox(-0.5F, -1.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0477F, 1.7244F, 3.3779F, -0.3261F, -0.2911F, -0.0283F));

		PartDefinition cube_r292 = rightFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(48, 69).mirror().addBox(-0.5F, -1.075F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.1921F, 1.3441F, 2.86F, -0.3523F, -0.2911F, -0.0283F));

		PartDefinition cube_r293 = rightFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(69, 26).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.3261F, 1.021F, 2.3825F, -0.3523F, -0.2911F, -0.0283F));

		PartDefinition cube_r294 = rightFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(22, 72).mirror().addBox(-0.5F, -1.0F, -0.325F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2694F, 0.4826F, -0.5235F, -0.367F, 0.0494F, 0.0636F));

		PartDefinition cube_r295 = rightFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(78, 18).mirror().addBox(-0.5F, 0.1F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(78, 3).mirror().addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2526F, 0.7938F, -0.8686F, 0.1823F, 0.0281F, 0.0755F));

		PartDefinition cube_r296 = rightFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(78, 0).mirror().addBox(-0.5001F, -1.4214F, -0.4266F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(0.1954F, 1.5191F, -0.9527F, -0.289F, 0.0281F, 0.0755F));

		PartDefinition cube_r297 = rightFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(76, 77).mirror().addBox(-0.5001F, -1.6515F, -0.791F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.197F, 1.4986F, -0.9523F, -0.7951F, 0.0281F, 0.0755F));

		PartDefinition cube_r298 = rightFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(42, 77).mirror().addBox(-0.5F, -0.625F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.0954F, 0.3919F, -0.4965F, -0.5515F, 0.0578F, 0.0572F));

		PartDefinition cube_r299 = rightFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(77, 69).mirror().addBox(-0.5001F, -1.7327F, -0.7022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.197F, 1.4986F, -0.9523F, -0.5508F, 0.0281F, 0.0755F));

		PartDefinition cube_r300 = rightFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(22, 31).mirror().addBox(-0.1104F, -0.1025F, -3.035F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.4229F, 1.7462F, 4.6022F, -0.5659F, -0.1874F, 0.0883F));

		PartDefinition cube_r301 = rightFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(43, 56).mirror().addBox(-0.0866F, -0.0722F, 0.7554F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.0361F, -0.6001F, -0.6728F, -0.2038F, 0.1387F, -0.0993F));

		PartDefinition cube_r302 = rightFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(37, 77).mirror().addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.8607F, 0.3687F, 4.4974F, -0.5495F, -0.2529F, 0.9673F));

		PartDefinition cube_r303 = rightFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(32, 77).mirror().addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.8607F, 0.3687F, 4.4974F, -0.5745F, 0.1816F, 1.6272F));

		PartDefinition cube_r304 = rightFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(77, 37).mirror().addBox(0.0F, -1.0F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.8607F, 0.3687F, 4.4974F, -0.6425F, -0.2686F, 1.0338F));

		PartDefinition cube_r305 = rightFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(10, 77).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.8607F, 0.3687F, 4.4974F, -0.6712F, 0.1689F, 1.5831F));

		PartDefinition cube_r306 = rightFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(22, 36).mirror().addBox(0.0F, -0.95F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1197F, 0.0948F, 2.7322F, -0.2737F, -0.0864F, 0.0848F));

		PartDefinition cube_r307 = rightFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(51, 22).mirror().addBox(-0.5F, -0.95F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.4827F, 0.0292F, 2.3677F, -0.279F, -0.2123F, 0.1208F));

		PartDefinition cube_r308 = rightFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(77, 54).mirror().addBox(-0.5F, -0.425F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.856F, 0.7399F, 6.178F, -0.2547F, 0.0121F, -0.0762F));

		PartDefinition cube_r309 = rightFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(32, 0).mirror().addBox(0.0F, 0.0F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2635F, 1.8477F, 11.4727F, -0.7818F, 0.9583F, -2.2319F));

		PartDefinition cube_r310 = rightFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(57, 68).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3911F, 1.372F, 11.3601F, -1.7679F, 0.9583F, -2.2319F));

		PartDefinition cube_r311 = rightFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(67, 49).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.5005F, 1.0339F, 11.059F, -2.1035F, 0.9361F, -2.3766F));

		PartDefinition cube_r312 = rightFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(68, 12).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.4634F, 1.6079F, 9.9777F, -2.5417F, 0.6464F, -2.7413F));

		PartDefinition cube_r313 = rightFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(0, 46).mirror().addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.7479F, 1.0598F, 6.2374F, -0.4315F, 0.7559F, -0.4726F));

		PartDefinition cube_r314 = rightFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(57, 78).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0715F, -0.1261F, 6.5015F, 2.1484F, 1.2367F, -1.4692F));

		PartDefinition cube_r315 = rightFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(78, 29).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.0808F, -0.2403F, 6.5758F, -2.9131F, 1.2367F, -1.4692F));

		PartDefinition cube_r316 = rightFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(25, 78).mirror().addBox(-0.5F, 0.15F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1251F, -0.5329F, 6.1458F, -2.1534F, 1.2323F, -2.0036F));

		PartDefinition cube_r317 = rightFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(31, 70).mirror().addBox(-0.6198F, -1.177F, -0.18F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.254F, 2.1109F, 3.7958F, -0.3379F, -0.5951F, 0.3005F));

		PartDefinition cube_r318 = rightFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(43, 60).mirror().addBox(-0.6F, -0.9F, -1.075F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0594F, 0.8559F, 3.611F, -1.156F, -0.5254F, 0.3135F));

		PartDefinition cube_r319 = rightFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(50, 80).mirror().addBox(-0.1F, -0.325F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.1764F, 2.0726F, 4.7093F, -0.44F, -0.6799F, 0.3487F));

		PartDefinition cube_r320 = rightFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(45, 80).mirror().addBox(-0.375F, -0.125F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false)
				.texOffs(80, 43).mirror().addBox(-0.375F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.0678F, 2.0473F, 5.2223F, -0.3614F, -0.3577F, 0.1926F));

		PartDefinition cube_r321 = rightFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(21, 59).mirror().addBox(-0.5F, -3.9F, -0.9F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.572F, 3.9625F, 7.0955F, -1.3854F, -0.2969F, 0.0774F));

		PartDefinition cube_r322 = rightFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(72, 80).mirror().addBox(-0.1F, 0.225F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1034F)).mirror(false)
				.texOffs(14, 61).mirror().addBox(-0.1F, 0.225F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(18, 47).mirror().addBox(-0.1F, -0.1F, -0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-2.4533F, 1.7351F, 5.6089F, -0.5605F, -0.2111F, 0.0939F));

		PartDefinition cube_r323 = rightFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(72, 70).mirror().addBox(-0.1F, -0.1F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(-2.0363F, 1.0111F, 4.9875F, -1.2254F, -0.6799F, 0.3487F));

		PartDefinition cube_r324 = rightFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(38, 46).mirror().addBox(-0.825F, 0.7F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.5513F, 0.6175F, 4.5807F, -0.7454F, -0.6799F, 0.3487F));

		PartDefinition cube_r325 = rightFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(42, 34).mirror().addBox(-0.825F, 0.1F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.5513F, 0.6175F, 4.5807F, -0.5273F, -0.6799F, 0.3487F));

		PartDefinition cube_r326 = rightFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(15, 74).mirror().addBox(-0.5F, -1.9F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-1.8134F, 2.7335F, 4.7773F, -0.5271F, -0.813F, 0.4795F));

		PartDefinition cube_r327 = rightFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(73, 57).mirror().addBox(-0.5405F, -0.8653F, 0.7463F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false)
				.texOffs(51, 73).mirror().addBox(-0.5405F, -0.8653F, 0.3463F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.109F)).mirror(false), PartPose.offsetAndRotation(-0.254F, 2.1109F, 3.7958F, -0.1518F, -0.813F, 0.4795F));

		PartDefinition cube_r328 = rightFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(27, 74).mirror().addBox(-0.5405F, -2.5757F, -0.7283F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.254F, 2.1109F, 3.7958F, -1.5219F, -0.813F, 0.4795F));

		PartDefinition cube_r329 = rightFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(40, 40).mirror().addBox(-0.853F, -1.8134F, -2.0935F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.554F, 2.5109F, 6.5958F, -1.9014F, -0.2646F, 0.1636F));

		PartDefinition cube_r330 = rightFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(31, 40).mirror().addBox(-0.024F, -1.7117F, -2.7247F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-2.154F, 2.5109F, 4.6958F, -1.8864F, -0.1256F, 0.1217F));

		PartDefinition cube_r331 = rightFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(36, 73).mirror().addBox(-0.853F, 0.3261F, -1.1775F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false)
				.texOffs(41, 51).mirror().addBox(-0.853F, 0.3261F, -2.4025F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.554F, 2.5109F, 6.5958F, 2.9767F, -0.2646F, 0.1636F));

		PartDefinition cube_r332 = rightFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(82, 69).mirror().addBox(-0.2F, -0.225F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.2971F, 1.4733F, 10.9096F, -1.3764F, -0.2214F, -0.0657F));

		PartDefinition cube_r333 = rightFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(82, 52).mirror().addBox(-0.2F, -0.825F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.0153F, 1.0908F, 10.5432F, -2.3838F, -0.4766F, 0.2255F));

		PartDefinition cube_r334 = rightFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(82, 49).mirror().addBox(-0.2F, -0.825F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-3.7156F, 0.8604F, 10.0772F, 2.634F, -0.4766F, 0.2255F));

		PartDefinition cube_r335 = rightFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(0, 65).mirror().addBox(-0.2F, -0.825F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.9675F, 0.4411F, 8.8466F, 2.7475F, -0.4766F, 0.2255F));

		PartDefinition cube_r336 = rightFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(30, 8).mirror().addBox(-0.3F, -0.525F, -3.7F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8185F, 0.3647F, 5.5263F, 2.986F, -0.2982F, 0.1488F));

		PartDefinition cube_r337 = rightFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(52, 0).mirror().addBox(-0.024F, 0.6683F, -2.1817F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.109F)).mirror(false), PartPose.offsetAndRotation(-2.154F, 2.5109F, 4.6958F, 2.9918F, -0.1256F, 0.1217F));

		PartDefinition cube_r338 = rightFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(51, 34).mirror().addBox(-0.9F, -1.8465F, -2.0845F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.004F, 2.5109F, 8.5958F, -1.9253F, -0.4365F, 0.1837F));

		PartDefinition cube_r339 = rightFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(0, 86).mirror().addBox(-0.9F, -2.2955F, 1.3725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F)).mirror(false), PartPose.offsetAndRotation(-2.004F, 2.5109F, 8.5958F, -0.4854F, -0.4365F, 0.1837F));

		PartDefinition cube_r340 = rightFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(10, 86).mirror().addBox(-0.9F, 0.3664F, 2.2253F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-2.004F, 2.5109F, 8.5958F, 0.4309F, -0.4365F, 0.1837F));

		PartDefinition cube_r341 = rightFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(74, 65).mirror().addBox(-0.9F, 1.0072F, 0.8085F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.109F)).mirror(false), PartPose.offsetAndRotation(-2.004F, 2.5109F, 8.5958F, 1.0854F, -0.4365F, 0.1837F));

		PartDefinition cube_r342 = rightFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(66, 0).mirror().addBox(-0.9F, 1.3404F, -2.1635F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-2.004F, 2.5109F, 8.5958F, 2.1326F, -0.4365F, 0.1837F));

		PartDefinition cube_r343 = rightFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(73, 30).mirror().addBox(-0.9F, -1.9578F, -1.7974F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-2.004F, 2.5109F, 8.5958F, -2.7107F, -0.4365F, 0.1837F));

		PartDefinition cube_r344 = rightFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(45, 64).mirror().addBox(-0.9F, -1.7539F, -0.6665F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.109F)).mirror(false), PartPose.offsetAndRotation(-2.004F, 2.5109F, 8.5958F, -1.6198F, -0.4365F, 0.1837F));

		PartDefinition cube_r345 = rightFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(48, 51).mirror().addBox(-0.853F, -2.2793F, -0.1231F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-1.554F, 2.5109F, 6.5958F, -1.4128F, -0.2646F, 0.1636F));

		PartDefinition cube_r346 = rightFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(38, 64).mirror().addBox(-0.9F, -1.0334F, -0.5276F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-2.004F, 2.5109F, 8.5958F, -1.4453F, -0.4365F, 0.1837F));

		PartDefinition cube_r347 = rightFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(52, 13).mirror().addBox(-0.853F, -0.9792F, -0.3337F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-1.554F, 2.5109F, 6.5958F, -0.671F, -0.2646F, 0.1636F));

		PartDefinition cube_r348 = rightFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(34, 51).mirror().addBox(-0.024F, -1.8405F, -0.0635F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-2.154F, 2.5109F, 4.6958F, -0.4814F, -0.1256F, 0.1217F));

		PartDefinition cube_r349 = rightFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(56, 73).mirror().addBox(-0.1F, -1.9F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-2.0056F, 2.7002F, 4.6125F, -2.4509F, -1.086F, 2.6669F));

		PartDefinition cube_r350 = rightFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(46, 73).mirror().addBox(-0.5405F, -1.3256F, 0.9864F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-0.254F, 2.1109F, 3.7958F, -0.4117F, -0.7348F, 0.4415F));

		PartDefinition cube_r351 = rightFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(66, 74).mirror().addBox(-1.0F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.9051F, 3.8657F, 9.8806F, 2.3273F, -1.205F, 2.2094F));

		PartDefinition cube_r352 = rightFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(71, 74).mirror().addBox(-0.4119F, -0.6551F, -1.0135F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.2819F, 3.51F, 9.4373F, 3.0127F, -0.7502F, 1.4731F));

		PartDefinition cube_r353 = rightFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(79, 24).mirror().addBox(-0.7382F, -0.7603F, -0.9505F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.2819F, 3.51F, 9.4373F, -2.7471F, -0.6564F, 0.839F));

		PartDefinition cube_r354 = rightFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(43, 13).mirror().addBox(0.0F, -0.125F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.9667F, -1.2816F, 2.1469F, -0.0989F, 0.2947F, 1.2969F));

		PartDefinition cube_r355 = rightFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(36, 60).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.9667F, -0.4901F, 5.4886F, -0.1201F, 0.2815F, 1.1611F));

		PartDefinition cube_r356 = rightFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(78, 15).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.9667F, -0.7908F, 4.5348F, -1.5875F, 0.0403F, 1.1778F));

		PartDefinition cube_r357 = rightFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(78, 9).mirror().addBox(-0.2F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(78, 12).mirror().addBox(-0.2F, -0.2F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.9667F, -1.2816F, 2.1469F, -0.0503F, 0.1854F, 1.3043F));

		PartDefinition cube_r358 = rightFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(15, 78).mirror().addBox(-0.5F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.5614F, -0.9274F, 1.7724F, -0.3557F, 0.1854F, 1.3043F));

		PartDefinition cube_r359 = rightFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(61, 4).mirror().addBox(-0.2F, 0.1654F, -0.1076F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.2911F, -1.1463F, 0.4813F, 0.4051F, 0.2415F, 0.1022F));

		PartDefinition cube_r360 = rightFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(7, 51).mirror().addBox(0.15F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(0.7667F, 0.6681F, 7.7582F, -0.0834F, 0.7488F, -0.0569F));

		PartDefinition bone5 = rightFace.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5207F, 1.8701F, 3.8858F, 0.0F, 0.0218F, 0.0F));

		PartDefinition bone = Bodyfront.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6945F, 2.9999F, -6.0663F, -0.0873F, 0.0F, 0.0873F));

		PartDefinition cube_r361 = bone.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(45, 83).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0387F, 2.0514F, -2.3306F, 0.2309F, 0.4573F, -0.1412F));

		PartDefinition cube_r362 = bone.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(65, 38).addBox(-0.5F, -0.325F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5002F, 2.0155F, -1.3918F, -0.729F, 0.4573F, -0.1412F));

		PartDefinition cube_r363 = bone.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(40, 83).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.3808F, 3.1766F, -1.9642F, -0.1181F, 0.4573F, -0.1412F));

		PartDefinition cube_r364 = bone.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(35, 83).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.7618F, 3.9158F, -1.4089F, -0.9035F, 0.4573F, -0.1412F));

		PartDefinition cube_r365 = bone.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(30, 83).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(1.2201F, 4.0996F, -0.5394F, -1.8198F, 0.4573F, -0.1412F));

		PartDefinition cube_r366 = bone.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(14, 52).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(1.0797F, 2.3168F, -0.312F, -2.2998F, 0.4573F, -0.1412F));

		PartDefinition cube_r367 = bone.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(83, 55).addBox(-0.575F, -0.4F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.4105F, 0.6599F, -1.0714F, -0.9717F, 0.3303F, -0.5057F));

		PartDefinition cube_r368 = bone.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(85, 84).addBox(-0.4962F, -0.9802F, -0.5778F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.5032F, 1.666F, -1.2771F, -1.7326F, 0.4573F, -0.1412F));

		PartDefinition cube_r369 = bone.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(73, 16).addBox(-0.5F, -0.025F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(0.3674F, -0.8172F, -0.2501F, -0.3554F, 0.3795F, -0.2414F));

		PartDefinition cube_r370 = bone.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(10, 73).addBox(-0.676F, -4.0728F, -1.2929F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(1.0925F, 1.1513F, -0.1397F, -0.05F, 0.3795F, -0.2414F));

		PartDefinition cube_r371 = bone.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(83, 27).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.6394F, -2.8894F, -1.4589F, -1.1233F, 0.3795F, -0.2414F));

		PartDefinition cube_r372 = bone.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(83, 18).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(-0.4228F, -3.7913F, -0.3913F, -0.1634F, 0.3795F, -0.2414F));

		PartDefinition cube_r373 = bone.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(83, 15).addBox(-0.5F, -0.675F, 0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(83, 12).addBox(-0.5F, -0.675F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(-0.0187F, -2.3416F, -0.2764F, 1.1892F, 0.3795F, -0.2414F));

		PartDefinition cube_r374 = bone.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(10, 83).addBox(-0.676F, -0.5734F, 0.1327F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0925F, 1.1513F, -0.1397F, 2.5419F, 0.3795F, -0.2414F));

		PartDefinition cube_r375 = bone.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(83, 0).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1928F, 1.2859F, -2.3813F, -0.2529F, 0.151F, -1.4575F));

		PartDefinition cube_r376 = bone.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(67, 34).addBox(-1.1333F, -0.6631F, -0.2454F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5011F, 2.1018F, -2.2874F, -0.127F, 0.5691F, -0.9601F));

		PartDefinition cube_r377 = bone.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(74, 61).addBox(-0.4819F, -1.4173F, -0.3871F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5032F, 1.666F, -1.2771F, 0.9011F, 0.4954F, -0.1956F));

		PartDefinition bone7 = Bodyfront.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.6945F, 2.9999F, -6.0663F, -0.0873F, 0.0F, -0.0873F));

		PartDefinition cube_r378 = bone7.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(45, 83).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-0.0387F, 2.0514F, -2.3306F, 0.2309F, -0.4573F, 0.1412F));

		PartDefinition cube_r379 = bone7.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(65, 38).mirror().addBox(-0.5F, -0.325F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5002F, 2.0155F, -1.3918F, -0.729F, -0.4573F, 0.1412F));

		PartDefinition cube_r380 = bone7.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(40, 83).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-0.3808F, 3.1766F, -1.9642F, -0.1181F, -0.4573F, 0.1412F));

		PartDefinition cube_r381 = bone7.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(35, 83).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.7618F, 3.9158F, -1.4089F, -0.9035F, -0.4573F, 0.1412F));

		PartDefinition cube_r382 = bone7.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(30, 83).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-1.2201F, 4.0996F, -0.5394F, -1.8198F, -0.4573F, 0.1412F));

		PartDefinition cube_r383 = bone7.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(14, 52).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.015F)).mirror(false), PartPose.offsetAndRotation(-1.0797F, 2.3168F, -0.312F, -2.2998F, -0.4573F, 0.1412F));

		PartDefinition cube_r384 = bone7.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(83, 55).mirror().addBox(-0.425F, -0.4F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.4105F, 0.6599F, -1.0714F, -0.9717F, -0.3303F, 0.5057F));

		PartDefinition cube_r385 = bone7.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(85, 84).mirror().addBox(-0.5038F, -0.9802F, -0.5778F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5032F, 1.666F, -1.2771F, -1.7326F, -0.4573F, 0.1412F));

		PartDefinition cube_r386 = bone7.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(73, 16).mirror().addBox(-0.5F, -0.025F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.015F)).mirror(false), PartPose.offsetAndRotation(-0.3674F, -0.8172F, -0.2501F, -0.3554F, -0.3795F, 0.2414F));

		PartDefinition cube_r387 = bone7.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(10, 73).mirror().addBox(-0.324F, -4.0728F, -1.2929F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.012F)).mirror(false), PartPose.offsetAndRotation(-1.0925F, 1.1513F, -0.1397F, -0.05F, -0.3795F, 0.2414F));

		PartDefinition cube_r388 = bone7.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(83, 27).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.6394F, -2.8894F, -1.4589F, -1.1233F, -0.3795F, 0.2414F));

		PartDefinition cube_r389 = bone7.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(83, 18).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F)).mirror(false), PartPose.offsetAndRotation(0.4228F, -3.7913F, -0.3913F, -0.1634F, -0.3795F, 0.2414F));

		PartDefinition cube_r390 = bone7.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(83, 15).mirror().addBox(-0.5F, -0.675F, 0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(83, 12).mirror().addBox(-0.5F, -0.675F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F)).mirror(false), PartPose.offsetAndRotation(0.0187F, -2.3416F, -0.2764F, 1.1892F, -0.3795F, 0.2414F));

		PartDefinition cube_r391 = bone7.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(10, 83).mirror().addBox(-0.324F, -0.5734F, 0.1327F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0925F, 1.1513F, -0.1397F, 2.5419F, -0.3795F, 0.2414F));

		PartDefinition cube_r392 = bone7.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(83, 0).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.1928F, 1.2859F, -2.3813F, -0.2529F, -0.151F, 1.4575F));

		PartDefinition cube_r393 = bone7.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(67, 34).mirror().addBox(-0.8667F, -0.6631F, -0.2454F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.5011F, 2.1018F, -2.2874F, -0.127F, -0.5691F, 0.9601F));

		PartDefinition cube_r394 = bone7.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(74, 61).mirror().addBox(-0.5181F, -1.4173F, -0.3871F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5032F, 1.666F, -1.2771F, 0.9011F, -0.4954F, 0.1956F));

		PartDefinition Rightthigh = Hips.addOrReplaceChild("Rightthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3569F, 3.5241F, 0.1782F, 0.8487F, -0.0982F, -0.2383F));

		PartDefinition cube_r395 = Rightthigh.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(83, 3).addBox(-0.5F, -1.2F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.2F, 5.6556F, -0.4486F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r396 = Rightthigh.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(82, 46).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 5.4522F, -0.5089F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r397 = Rightthigh.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(73, 12).addBox(-0.5F, -1.6F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.2F, 5.5267F, 0.6369F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r398 = Rightthigh.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(81, 75).addBox(-0.5F, -0.1F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 4.2901F, 0.3576F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r399 = Rightthigh.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(57, 62).addBox(-0.5F, 0.0F, -0.4F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.2F, 0.6076F, 0.2743F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r400 = Rightthigh.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(82, 38).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.2F, -0.9152F, -0.2874F, -1.9548F, 0.0F, 0.0F));

		PartDefinition cube_r401 = Rightthigh.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(84, 61).addBox(-0.5F, -0.7F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.2F, -0.6487F, -0.1099F, -2.1817F, 0.0F, 0.0F));

		PartDefinition cube_r402 = Rightthigh.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(87, 33).addBox(-0.5F, -0.6F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.3042F, 0.9823F, -2.2078F, 0.0F, 0.0F));

		PartDefinition cube_r403 = Rightthigh.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(86, 75).addBox(-0.5F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.2F, 0.4795F, 0.782F, -1.9199F, 0.0F, 0.0F));

		PartDefinition cube_r404 = Rightthigh.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(15, 87).addBox(-0.5F, -0.7F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.2F, -0.1487F, 0.6151F, -2.4871F, 0.0F, 0.0F));

		PartDefinition cube_r405 = Rightthigh.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(60, 84).addBox(-0.5F, -1.3F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.2F, 0.0269F, -0.8472F, -1.0472F, 0.0F, 0.0F));

		PartDefinition Rightshin = Rightthigh.addOrReplaceChild("Rightshin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1249F, 5.9583F, 0.5153F, 1.4209F, -0.1266F, 0.1772F));

		PartDefinition cube_r406 = Rightshin.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(26, 56).addBox(-0.5F, -2.5F, -0.6F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.0F, 2.2192F, 0.7327F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r407 = Rightshin.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(21, 52).addBox(-0.5F, -5.0F, 0.1F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.7573F, -1.0697F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Righthindfoot = Rightshin.addOrReplaceChild("Righthindfoot", CubeListBuilder.create().texOffs(37, 18).addBox(-1.5F, -0.4F, -1.8F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0742F, 4.3358F, 0.1718F, -0.2123F, 0.0156F, -0.0186F));

		PartDefinition Righthindfoot2 = Righthindfoot.addOrReplaceChild("Righthindfoot2", CubeListBuilder.create().texOffs(17, 8).addBox(-1.5F, -0.7F, -2.9F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.2891F, -1.7934F, -1.0156F, -0.0107F, -0.0071F));

		PartDefinition Leftthigh = Hips.addOrReplaceChild("Leftthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.3569F, 3.5241F, 0.1782F, -0.5476F, 0.0982F, 0.2383F));

		PartDefinition cube_r408 = Leftthigh.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(83, 6).addBox(-0.5F, -1.2F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.2F, 5.6556F, -0.4486F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r409 = Leftthigh.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(0, 83).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 5.4522F, -0.5089F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r410 = Leftthigh.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(41, 73).addBox(-0.5F, -1.6F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.2F, 5.5267F, 0.6369F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r411 = Leftthigh.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(20, 82).addBox(-0.5F, -0.1F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 4.2901F, 0.3576F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r412 = Leftthigh.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(33, 64).addBox(-0.5F, 0.0F, -0.4F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(-0.2F, 0.6076F, 0.2743F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r413 = Leftthigh.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(82, 81).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.2F, -0.9152F, -0.2874F, -1.9548F, 0.0F, 0.0F));

		PartDefinition cube_r414 = Leftthigh.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(85, 41).addBox(-0.5F, -0.7F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2F, -0.6487F, -0.1099F, -2.1817F, 0.0F, 0.0F));

		PartDefinition cube_r415 = Leftthigh.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(87, 36).addBox(-0.5F, -0.6F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 0.3042F, 0.9823F, -2.2078F, 0.0F, 0.0F));

		PartDefinition cube_r416 = Leftthigh.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(5, 87).addBox(-0.5F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2F, 0.4795F, 0.782F, -1.9199F, 0.0F, 0.0F));

		PartDefinition cube_r417 = Leftthigh.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(25, 87).addBox(-0.5F, -0.7F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.2F, -0.1487F, 0.6151F, -2.4871F, 0.0F, 0.0F));

		PartDefinition cube_r418 = Leftthigh.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(20, 85).addBox(-0.5F, -1.3F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.2F, 0.0269F, -0.8472F, -1.0472F, 0.0F, 0.0F));

		PartDefinition Leftshin = Leftthigh.addOrReplaceChild("Leftshin", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1249F, 5.9583F, 0.5153F, 1.4645F, 0.1266F, -0.1772F));

		PartDefinition cube_r419 = Leftshin.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(31, 56).addBox(-0.5F, -2.5F, -0.6F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.0F, 2.2192F, 0.7327F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r420 = Leftshin.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(55, 51).addBox(-0.5F, -5.0F, 0.1F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.7573F, -1.0697F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Lefthindfoot = Leftshin.addOrReplaceChild("Lefthindfoot", CubeListBuilder.create().texOffs(9, 39).addBox(-1.5F, -0.4F, -1.8F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0742F, 4.3358F, 0.1718F, -0.2996F, -0.0156F, 0.0186F));

		PartDefinition Lefthindfoot2 = Lefthindfoot.addOrReplaceChild("Lefthindfoot2", CubeListBuilder.create().texOffs(17, 13).addBox(-1.5F, -0.7F, -2.9F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.2891F, -1.7934F, -0.1429F, 0.0107F, 0.0071F));

		PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(0, 23).addBox(-0.5F, -0.4588F, -0.0143F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(42, 27).addBox(0.0F, -1.1588F, -0.0143F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7491F, 1.3948F, -0.0075F, 0.0873F, -0.0007F));

		PartDefinition cube_r421 = Tail1.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(30, 89).addBox(0.0F, -0.55F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4588F, 1.9857F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(22, 25).addBox(-0.5F, -0.5532F, -0.0142F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0983F, 3.9264F, 0.2349F, 0.1273F, 0.0304F));

		PartDefinition cube_r422 = Tail2.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(89, 24).addBox(0.0F, -0.3F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.5532F, 1.9858F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r423 = Tail2.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(32, 74).addBox(0.0F, -0.45F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.5532F, -0.0142F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(9, 43).addBox(-0.5F, -0.5176F, 0.0216F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.045F, 3.8928F, 0.1586F, 0.3018F, 0.0475F));

		PartDefinition bone4 = Hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6825F, 4.4015F, 0.1532F, 0.1298F, 0.017F, 0.0011F));

		PartDefinition cube_r424 = bone4.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(62, 62).addBox(-0.5F, -0.175F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.7316F, -2.9823F, -0.6102F, 0.8575F, 0.0217F, 0.1353F));

		PartDefinition cube_r425 = bone4.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(66, 30).addBox(-0.4755F, -0.1421F, -0.801F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.7964F, -3.5105F, 0.2005F, 0.203F, 0.0217F, 0.1353F));

		PartDefinition cube_r426 = bone4.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(62, 70).addBox(-0.5F, -1.0F, -0.175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(70, 45).addBox(-0.5F, -1.0F, -0.575F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.7327F, -3.0043F, -1.4318F, 1.3014F, 0.0182F, 0.1296F));

		PartDefinition cube_r427 = bone4.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(59, 0).addBox(-0.5F, 0.325F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.9372F, -4.3919F, 0.0176F, -0.1535F, 0.0422F, 0.1276F));

		PartDefinition cube_r428 = bone4.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(14, 65).addBox(-0.5F, -0.675F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.8251F, -3.7469F, -1.0895F, -0.3381F, 0.0217F, 0.1353F));

		PartDefinition cube_r429 = bone4.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(0, 56).addBox(-0.5F, -1.325F, -1.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.8105F, -3.6986F, -2.4554F, 1.4748F, 0.0F, 0.1047F));

		PartDefinition cube_r430 = bone4.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(66, 8).addBox(-0.5F, -0.625F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.7345F, -2.9751F, -3.7039F, 0.2531F, 0.0F, 0.1047F));

		PartDefinition cube_r431 = bone4.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(76, 74).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9762F, -5.2178F, -3.7782F, -2.7663F, 0.0F, 0.1047F));

		PartDefinition cube_r432 = bone4.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(20, 76).addBox(-0.5F, 0.4F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(75, 45).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.8617F, -4.1282F, -4.6497F, 2.4696F, 0.0F, 0.1047F));

		PartDefinition cube_r433 = bone4.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(5, 75).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.7698F, -3.2542F, -5.1268F, 1.0734F, 0.0F, 0.1047F));

		PartDefinition cube_r434 = bone4.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(7, 61).addBox(-0.5F, -0.175F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9144F, -4.6873F, -1.9774F, -0.5408F, 0.0054F, 0.1037F));

		PartDefinition cube_r435 = bone4.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(40, 86).addBox(-0.5F, -2.975F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5274F, -1.3556F, -1.9145F, -0.925F, 0.0F, 0.1309F));

		PartDefinition cube_r436 = bone4.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(65, 81).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.6382F, -2.1971F, -0.411F, 0.4712F, 0.0F, 0.1309F));

		PartDefinition cube_r437 = bone4.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(5, 84).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.1362F, 0.1781F, 1.6951F, -0.9445F, -0.1172F, 0.3295F));

		PartDefinition cube_r438 = bone4.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(75, 83).addBox(-0.5F, -0.9F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0897F, -0.0395F, 1.9198F, 0.4517F, -0.1172F, 0.3295F));

		PartDefinition cube_r439 = bone4.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(7, 65).addBox(-0.7599F, -1.3094F, -0.5713F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.6134F, -0.6642F, 0.2233F, 0.3412F, -0.105F, 0.2249F));

		PartDefinition cube_r440 = bone4.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(70, 83).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0808F, 0.6883F, -0.1518F, 1.2895F, -0.1172F, 0.3295F));

		PartDefinition cube_r441 = bone4.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(30, 86).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.1781F, 0.6211F, 0.8145F, 1.6036F, -0.1172F, 0.3295F));

		PartDefinition cube_r442 = bone4.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(87, 50).addBox(-0.5F, -1.1F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F))
				.texOffs(87, 47).addBox(-0.5F, -0.6F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.4692F, -1.2108F, 2.3415F, 1.1586F, -0.1172F, 0.3295F));

		PartDefinition cube_r443 = bone4.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(87, 44).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.2244F, -0.7348F, 2.9999F, -3.0302F, -0.1172F, 0.3295F));

		PartDefinition cube_r444 = bone4.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(0, 77).addBox(0.0F, -0.525F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.2454F, -0.7947F, 2.6644F, 2.2058F, -0.1172F, 0.3295F));

		PartDefinition cube_r445 = bone4.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(35, 86).addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.4427F, -1.3869F, 1.2552F, 0.9003F, -0.092F, 0.3031F));

		PartDefinition cube_r446 = bone4.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(74, 23).addBox(-0.5F, 0.125F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.3625F, -0.4629F, -0.3063F, 1.902F, -0.1193F, 0.2417F));

		PartDefinition cube_r447 = bone4.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(61, 74).addBox(-0.5F, -0.375F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.3625F, -0.4629F, -0.3063F, 2.3383F, -0.1193F, 0.2417F));

		PartDefinition bone6 = Hips.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6825F, 4.4015F, 0.1532F, 0.1298F, -0.017F, -0.0011F));

		PartDefinition cube_r448 = bone6.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(62, 62).mirror().addBox(-0.5F, -0.175F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.7316F, -2.9823F, -0.6102F, 0.8575F, -0.0217F, -0.1353F));

		PartDefinition cube_r449 = bone6.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(66, 30).mirror().addBox(-0.5245F, -0.1421F, -0.801F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7964F, -3.5105F, 0.2005F, 0.203F, -0.0217F, -0.1353F));

		PartDefinition cube_r450 = bone6.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(62, 70).mirror().addBox(-0.5F, -1.0F, -0.175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(70, 45).mirror().addBox(-0.5F, -1.0F, -0.575F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.7327F, -3.0043F, -1.4318F, 1.3014F, -0.0182F, -0.1296F));

		PartDefinition cube_r451 = bone6.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(59, 0).mirror().addBox(-0.5F, 0.325F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.9372F, -4.3919F, 0.0176F, -0.1535F, -0.0422F, -0.1276F));

		PartDefinition cube_r452 = bone6.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(14, 65).mirror().addBox(-0.5F, -0.675F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.8251F, -3.7469F, -1.0895F, -0.3381F, -0.0217F, -0.1353F));

		PartDefinition cube_r453 = bone6.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(0, 56).mirror().addBox(-0.5F, -1.325F, -1.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.8105F, -3.6986F, -2.4554F, 1.4748F, 0.0F, -0.1047F));

		PartDefinition cube_r454 = bone6.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(66, 8).mirror().addBox(-0.5F, -0.625F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7345F, -2.9751F, -3.7039F, 0.2531F, 0.0F, -0.1047F));

		PartDefinition cube_r455 = bone6.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(76, 74).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.9762F, -5.2178F, -3.7782F, -2.7663F, 0.0F, -0.1047F));

		PartDefinition cube_r456 = bone6.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(20, 76).mirror().addBox(-0.5F, 0.4F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(75, 45).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.8617F, -4.1282F, -4.6497F, 2.4696F, 0.0F, -0.1047F));

		PartDefinition cube_r457 = bone6.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(5, 75).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7698F, -3.2542F, -5.1268F, 1.0734F, 0.0F, -0.1047F));

		PartDefinition cube_r458 = bone6.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(7, 61).mirror().addBox(-0.5F, -0.175F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.9144F, -4.6873F, -1.9774F, -0.5408F, -0.0054F, -0.1037F));

		PartDefinition cube_r459 = bone6.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(40, 86).mirror().addBox(-0.5F, -2.975F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.5274F, -1.3556F, -1.9145F, -0.925F, 0.0F, -0.1309F));

		PartDefinition cube_r460 = bone6.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(65, 81).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6382F, -2.1971F, -0.411F, 0.4712F, 0.0F, -0.1309F));

		PartDefinition cube_r461 = bone6.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(5, 84).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.1362F, 0.1781F, 1.6951F, -0.9445F, 0.1172F, -0.3295F));

		PartDefinition cube_r462 = bone6.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(75, 83).mirror().addBox(-0.5F, -0.9F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0897F, -0.0395F, 1.9198F, 0.4517F, 0.1172F, -0.3295F));

		PartDefinition cube_r463 = bone6.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(7, 65).mirror().addBox(-0.2401F, -1.3094F, -0.5713F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6134F, -0.6642F, 0.2233F, 0.3412F, 0.105F, -0.2249F));

		PartDefinition cube_r464 = bone6.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(70, 83).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0808F, 0.6883F, -0.1518F, 1.2895F, 0.1172F, -0.3295F));

		PartDefinition cube_r465 = bone6.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(30, 86).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.1781F, 0.6211F, 0.8145F, 1.6036F, 0.1172F, -0.3295F));

		PartDefinition cube_r466 = bone6.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(87, 50).mirror().addBox(-0.5F, -1.1F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false)
				.texOffs(87, 47).mirror().addBox(-0.5F, -0.6F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.4692F, -1.2108F, 2.3415F, 1.1586F, 0.1172F, -0.3295F));

		PartDefinition cube_r467 = bone6.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(87, 44).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.2244F, -0.7348F, 2.9999F, -3.0302F, 0.1172F, -0.3295F));

		PartDefinition cube_r468 = bone6.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(0, 77).mirror().addBox(-1.0F, -0.525F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.2454F, -0.7947F, 2.6644F, 2.2058F, 0.1172F, -0.3295F));

		PartDefinition cube_r469 = bone6.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(35, 86).mirror().addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.4427F, -1.3869F, 1.2552F, 0.9003F, 0.092F, -0.3031F));

		PartDefinition cube_r470 = bone6.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(74, 23).mirror().addBox(-0.5F, 0.125F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.3625F, -0.4629F, -0.3063F, 1.902F, 0.1193F, -0.2417F));

		PartDefinition cube_r471 = bone6.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(61, 74).mirror().addBox(-0.5F, -0.375F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3625F, -0.4629F, -0.3063F, 2.3383F, 0.1193F, -0.2417F));

		return LayerDefinition.create(meshdefinition, 96, 96);
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