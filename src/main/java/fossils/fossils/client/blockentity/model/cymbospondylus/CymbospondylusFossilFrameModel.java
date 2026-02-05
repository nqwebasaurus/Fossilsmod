package fossils.fossils.client.blockentity.model.cymbospondylus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class CymbospondylusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Cymbospondylus;
	private final ModelPart Body1;
	private final ModelPart Body2;
	private final ModelPart ForelimbL;
	private final ModelPart ForelimbL2;
	private final ModelPart ForelimbL3;
	private final ModelPart ForelimbL4;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart Body3;
	private final ModelPart Body10;
	private final ModelPart Body11;
	private final ModelPart Body23;
	private final ModelPart Body24;
	private final ModelPart Body25;
	private final ModelPart Body26;
	private final ModelPart Body4;
	private final ModelPart bone;
	private final ModelPart bone5;
	private final ModelPart HindlimbL;
	private final ModelPart HindlimbL2;
	private final ModelPart HindlimbL3;
	private final ModelPart HindlimbL4;
	private final ModelPart Body5;
	private final ModelPart Body6;
	private final ModelPart Body9;
	private final ModelPart Body7;
	private final ModelPart Body8;
	private final ModelPart Body12;
	private final ModelPart Body13;
	private final ModelPart Body14;
	private final ModelPart Body15;
	private final ModelPart Body16;
	private final ModelPart Body17;
	private final ModelPart Body18;
	private final ModelPart Body19;
	private final ModelPart Body20;
	private final ModelPart Body21;
	private final ModelPart Body22;
	private final ModelPart Head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart Jaw;
	private final ModelPart bone3;

	public CymbospondylusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Cymbospondylus = this.fossil.getChild("Cymbospondylus");
		this.Body1 = this.Cymbospondylus.getChild("Body1");
		this.Body2 = this.Body1.getChild("Body2");
		this.ForelimbL = this.Body2.getChild("ForelimbL");
		this.ForelimbL2 = this.ForelimbL.getChild("ForelimbL2");
		this.ForelimbL3 = this.Body2.getChild("ForelimbL3");
		this.ForelimbL4 = this.ForelimbL3.getChild("ForelimbL4");
		this.bone2 = this.Body2.getChild("bone2");
		this.bone4 = this.Body2.getChild("bone4");
		this.Body3 = this.Body2.getChild("Body3");
		this.Body10 = this.Body3.getChild("Body10");
		this.Body11 = this.Body10.getChild("Body11");
		this.Body23 = this.Body11.getChild("Body23");
		this.Body24 = this.Body23.getChild("Body24");
		this.Body25 = this.Body24.getChild("Body25");
		this.Body26 = this.Body25.getChild("Body26");
		this.Body4 = this.Body26.getChild("Body4");
		this.bone = this.Body4.getChild("bone");
		this.bone5 = this.Body4.getChild("bone5");
		this.HindlimbL = this.Body4.getChild("HindlimbL");
		this.HindlimbL2 = this.HindlimbL.getChild("HindlimbL2");
		this.HindlimbL3 = this.Body4.getChild("HindlimbL3");
		this.HindlimbL4 = this.HindlimbL3.getChild("HindlimbL4");
		this.Body5 = this.Body4.getChild("Body5");
		this.Body6 = this.Body5.getChild("Body6");
		this.Body9 = this.Body6.getChild("Body9");
		this.Body7 = this.Body9.getChild("Body7");
		this.Body8 = this.Body7.getChild("Body8");
		this.Body12 = this.Body8.getChild("Body12");
		this.Body13 = this.Body12.getChild("Body13");
		this.Body14 = this.Body13.getChild("Body14");
		this.Body15 = this.Body14.getChild("Body15");
		this.Body16 = this.Body15.getChild("Body16");
		this.Body17 = this.Body16.getChild("Body17");
		this.Body18 = this.Body17.getChild("Body18");
		this.Body19 = this.Body18.getChild("Body19");
		this.Body20 = this.Body19.getChild("Body20");
		this.Body21 = this.Body20.getChild("Body21");
		this.Body22 = this.Body21.getChild("Body22");
		this.Head = this.Cymbospondylus.getChild("Head");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.Jaw = this.Head.getChild("Jaw");
		this.bone3 = root.getChild("bone3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Cymbospondylus = fossil.addOrReplaceChild("Cymbospondylus", CubeListBuilder.create(), PartPose.offset(0.0F, -31.6181F, -10.325F));

		PartDefinition Body1 = Cymbospondylus.addOrReplaceChild("Body1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8586F, -16.9926F, -0.1748F, -0.0416F, 0.0131F));

		PartDefinition cube_r1 = Body1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(27, 60).addBox(-0.5F, 0.5F, -4.275F, 1.0F, 2.0F, 9.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, -0.4817F, 1.7672F, 0.3491F, 0.0F, 0.0F));

		PartDefinition Body2 = Body1.addOrReplaceChild("Body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.021F, 6.027F, 0.2998F, -0.1707F, -0.0366F));

		PartDefinition cube_r2 = Body2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(-3, 44).addBox(0.6F, -0.5F, -6.5F, 1.0F, 1.0F, 13.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 7.1785F, 2.4148F, -1.5708F, -0.1658F, 1.5708F));

		PartDefinition cube_r3 = Body2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(3, 50).addBox(-0.5F, -0.3398F, 0.9701F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, 0.6967F, 1.4925F, -1.405F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Body2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 47).addBox(-1.5F, -0.0495F, -9.9375F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, -1.0557F, 9.7054F, 0.1658F, 0.0F, 0.0F));

		PartDefinition ForelimbL = Body2.addOrReplaceChild("ForelimbL", CubeListBuilder.create(), PartPose.offsetAndRotation(6.4709F, 8.2848F, 2.6061F, 0.3321F, -0.0066F, 0.0861F));

		PartDefinition ForelimbL2 = ForelimbL.addOrReplaceChild("ForelimbL2", CubeListBuilder.create(), PartPose.offset(5.0229F, 3.7227F, -1.9116F));

		PartDefinition ForelimbL3 = Body2.addOrReplaceChild("ForelimbL3", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.4709F, 8.2848F, 2.6061F, 0.5774F, 0.5336F, 0.2267F));

		PartDefinition ForelimbL4 = ForelimbL3.addOrReplaceChild("ForelimbL4", CubeListBuilder.create(), PartPose.offset(-5.0229F, 3.7227F, -1.9116F));

		PartDefinition bone2 = Body2.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.8738F, 7.146F, 2.2042F, -0.4363F, 0.0F, 0.0F));

		PartDefinition bone4 = Body2.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.8738F, 7.146F, 2.2042F, -0.4363F, 0.0F, 0.0F));

		PartDefinition Body3 = Body2.addOrReplaceChild("Body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.5931F, 9.6655F, 0.4453F, -0.042F, -0.0117F));

		PartDefinition cube_r5 = Body3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 69).addBox(-1.5F, 1.0F, -0.05F, 1.0F, 2.0F, 8.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.0F, -0.5626F, -0.0601F, -0.192F, 0.0F, 0.0F));

		PartDefinition Body10 = Body3.addOrReplaceChild("Body10", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5541F, 7.803F, -0.0263F, -0.0872F, 0.0023F));

		PartDefinition cube_r6 = Body10.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(70, 11).addBox(-1.5F, 1.0F, 0.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.0F, -0.5626F, -0.0601F, -0.192F, 0.0F, 0.0F));

		PartDefinition Body11 = Body10.addOrReplaceChild("Body11", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4644F, 7.7689F, 0.0174F, -0.0872F, 0.0023F));

		PartDefinition cube_r7 = Body11.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(70, 22).addBox(-1.5F, 1.0F, -0.075F, 1.0F, 2.0F, 8.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.0F, -0.5625F, -0.0601F, -0.192F, 0.0F, 0.0F));

		PartDefinition Body23 = Body11.addOrReplaceChild("Body23", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5537F, 7.762F, -0.0891F, -0.0397F, 0.0454F));

		PartDefinition cube_r8 = Body23.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(70, 33).addBox(-1.5F, 1.0F, 0.05F, 1.0F, 2.0F, 8.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.0F, -0.5626F, -0.0601F, -0.192F, 0.0F, 0.0F));

		PartDefinition Body24 = Body23.addOrReplaceChild("Body24", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5434F, 7.8401F, -0.0438F, -0.0872F, 0.0038F));

		PartDefinition cube_r9 = Body24.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(21, 72).addBox(-1.5F, 1.0F, 0.05F, 1.0F, 2.0F, 8.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.0F, -0.5626F, -0.0601F, -0.192F, 0.0F, 0.0F));

		PartDefinition Body25 = Body24.addOrReplaceChild("Body25", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5434F, 7.8401F, -0.1228F, -0.1305F, 0.0103F));

		PartDefinition cube_r10 = Body25.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(68, 0).addBox(-1.5F, 1.0F, 0.05F, 1.0F, 2.0F, 8.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.0F, -0.5626F, -0.0601F, -0.192F, 0.0F, 0.0F));

		PartDefinition Body26 = Body25.addOrReplaceChild("Body26", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.517F, 7.805F, -0.0611F, -0.0436F, 0.0027F));

		PartDefinition cube_r11 = Body26.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(35, 46).addBox(-1.5F, 1.0F, 0.175F, 1.0F, 2.0F, 11.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.0F, -0.5625F, -0.0601F, -0.192F, 0.0F, 0.0F));

		PartDefinition Body4 = Body26.addOrReplaceChild("Body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9766F, 10.6792F, 0.0089F, 0.2182F, 0.0019F));

		PartDefinition cube_r12 = Body4.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(49, 59).addBox(-0.2F, -0.5F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 7.6196F, 7.0302F, -1.5708F, -0.1571F, -1.5708F));

		PartDefinition cube_r13 = Body4.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(55, 65).addBox(-0.5F, -3.4F, 0.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, 2.2275F, 4.948F, -1.7279F, 0.0F, 0.0F));

		PartDefinition cube_r14 = Body4.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(50, 60).addBox(-2.0F, 0.9352F, 0.0857F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -0.4012F, -0.0784F, -0.1571F, 0.0F, 0.0F));

		PartDefinition bone = Body4.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(2.6044F, 7.4494F, 6.7491F, -0.134F, 0.2163F, -0.0289F));

		PartDefinition bone5 = Body4.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.6044F, 7.4494F, 6.7491F, -0.134F, -0.2163F, 0.0289F));

		PartDefinition HindlimbL = Body4.addOrReplaceChild("HindlimbL", CubeListBuilder.create(), PartPose.offsetAndRotation(4.8532F, 7.2403F, 6.7028F, 0.477F, -0.921F, -0.2703F));

		PartDefinition HindlimbL2 = HindlimbL.addOrReplaceChild("HindlimbL2", CubeListBuilder.create(), PartPose.offset(4.3162F, 2.9717F, 1.2927F));

		PartDefinition HindlimbL3 = Body4.addOrReplaceChild("HindlimbL3", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.8532F, 7.2403F, 6.7028F, 0.3054F, 0.3927F, 0.0F));

		PartDefinition HindlimbL4 = HindlimbL3.addOrReplaceChild("HindlimbL4", CubeListBuilder.create(), PartPose.offset(-4.3162F, 2.9717F, 1.2927F));

		PartDefinition Body5 = Body4.addOrReplaceChild("Body5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0617F, 8.8871F, -0.0532F, 0.1743F, -0.0092F));

		PartDefinition cube_r15 = Body5.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(80, 78).addBox(-1.5F, 1.05F, -0.225F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.1599F, -0.1352F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Body6 = Body5.addOrReplaceChild("Body6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0748F, 6.7186F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r16 = Body6.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(78, 105).addBox(-1.5828F, -45.8982F, -11.9712F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0828F, 45.7515F, 12.664F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Body9 = Body6.addOrReplaceChild("Body9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1999F, 3.9145F, 0.0532F, 0.1743F, 0.0092F));

		PartDefinition cube_r17 = Body9.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(106, 94).addBox(-1.5828F, -46.2821F, -5.7629F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0828F, 46.3464F, 6.3325F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Body7 = Body9.addOrReplaceChild("Body7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0208F, 4.0118F, -0.0435F, -0.0872F, -0.0038F));

		PartDefinition cube_r18 = Body7.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(18, 93).addBox(-1.5828F, -46.282F, -1.6285F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0828F, 46.4243F, 0.296F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Body8 = Body7.addOrReplaceChild("Body8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2255F, 4.9468F, -0.0173F, 0.0F, -0.0038F));

		PartDefinition cube_r19 = Body8.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(33, 93).addBox(-1.5828F, -46.1802F, 4.6393F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0828F, 46.0612F, -5.8585F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Body12 = Body8.addOrReplaceChild("Body12", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.225F, 5.0052F, -0.0173F, -0.0436F, -0.003F));

		PartDefinition cube_r20 = Body12.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(48, 93).addBox(-1.5828F, -45.9176F, 10.8505F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0828F, 45.5361F, -12.0599F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Body13 = Body12.addOrReplaceChild("Body13", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1F, 5.0061F, -0.0088F, 0.0873F, -0.0008F));

		PartDefinition cube_r21 = Body13.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(99, 60).addBox(-1.5828F, -46.0854F, 15.3566F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0828F, 45.5833F, -16.6688F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Body14 = Body13.addOrReplaceChild("Body14", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1436F, 4.9989F, 0.0263F, 0.0872F, 0.0023F));

		PartDefinition cube_r22 = Body14.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(63, 98).addBox(-1.5F, 0.9838F, -0.2596F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0642F, 0.0492F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Body15 = Body14.addOrReplaceChild("Body15", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.161F, 4.9012F, -0.0792F, 0.1305F, -0.0103F));

		PartDefinition cube_r23 = Body15.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(15, 101).addBox(-1.5F, 0.8088F, -0.3096F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -1.0642F, 0.0492F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Body16 = Body15.addOrReplaceChild("Body16", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1296F, 4.781F, -0.22F, 0.1278F, -0.0285F));

		PartDefinition cube_r24 = Body16.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(41, 101).addBox(-1.5F, 1.0147F, -0.1078F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -1.0642F, 5.0492F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r25 = Body16.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(28, 101).addBox(-1.5F, 0.8838F, -0.2096F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -1.0642F, 0.0492F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Body17 = Body16.addOrReplaceChild("Body17", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1503F, 9.5781F, -0.3364F, 0.2137F, -0.0442F));

		PartDefinition cube_r26 = Body17.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(49, 85).addBox(-1.5F, 0.8838F, 7.5154F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F))
				.texOffs(42, 78).addBox(-1.5F, 0.8838F, -0.1846F, 1.0F, 2.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -1.0642F, 0.0492F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Body18 = Body17.addOrReplaceChild("Body18", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2132F, 7.8269F, 0.0482F, -0.0872F, -0.0042F));

		PartDefinition cube_r27 = Body18.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(61, 78).addBox(-1.5F, 0.8838F, 0.2154F, 1.0F, 2.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -1.0642F, 0.0492F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Body19 = Body18.addOrReplaceChild("Body19", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2191F, 7.9447F, 0.0137F, -0.3054F, -0.0041F));

		PartDefinition cube_r28 = Body19.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(0, 80).addBox(-1.5F, 0.8838F, -0.1096F, 1.0F, 2.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -1.0642F, 0.0492F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Body20 = Body19.addOrReplaceChild("Body20", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2446F, 8.0115F, 0.031F, -0.1745F, -0.0054F));

		PartDefinition cube_r29 = Body20.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(26, 90).addBox(-1.5F, 0.7338F, 7.1404F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(19, 83).addBox(-1.5F, 0.7338F, -0.5596F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.5644F, 0.0339F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Body21 = Body20.addOrReplaceChild("Body21", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.207F, 7.96F, 0.0849F, -0.2174F, -0.0184F));

		PartDefinition cube_r30 = Body21.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(87, 95).addBox(-1.5F, 0.7338F, 7.4404F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(80, 88).addBox(-1.5F, 0.7338F, -0.2596F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.5644F, 0.0339F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Body22 = Body21.addOrReplaceChild("Body22", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2199F, 7.9204F, 0.0858F, -0.2609F, -0.0222F));

		PartDefinition cube_r31 = Body22.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(0, 91).addBox(-1.5F, 0.7338F, -0.0596F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.5644F, 0.0339F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Head = Cymbospondylus.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0536F, 1.0848F, -19.2102F, -0.2649F, 0.2608F, -0.0233F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.4464F, 0.454F, -6.2482F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.5536F, 0.454F, -6.2482F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0536F, 1.1559F, 0.2816F, 0.6894F, 0.0F, 0.0F));

		PartDefinition bone3 = partdefinition.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 144, 144);
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