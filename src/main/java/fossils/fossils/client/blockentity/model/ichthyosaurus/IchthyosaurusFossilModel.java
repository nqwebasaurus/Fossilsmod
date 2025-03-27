package fossils.fossils.client.blockentity.model.ichthyosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class IchthyosaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Ophthalmosaurus;
	private final ModelPart Body1;
	private final ModelPart ForelimbL;
	private final ModelPart ForelimbL2;
	private final ModelPart Body2;
	private final ModelPart Body3;
	private final ModelPart Body4;
	private final ModelPart HindlimbL;
	private final ModelPart HindlimbL2;
	private final ModelPart Body5;
	private final ModelPart Body6;
	private final ModelPart Body7;
	private final ModelPart Body8;
	private final ModelPart Head;
	private final ModelPart eye;
	private final ModelPart Jaw;

	public IchthyosaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Ophthalmosaurus = this.fossil.getChild("Ophthalmosaurus");
		this.Body1 = this.Ophthalmosaurus.getChild("Body1");
		this.ForelimbL = this.Body1.getChild("ForelimbL");
		this.ForelimbL2 = this.Body1.getChild("ForelimbL2");
		this.Body2 = this.Body1.getChild("Body2");
		this.Body3 = this.Body2.getChild("Body3");
		this.Body4 = this.Body3.getChild("Body4");
		this.HindlimbL = this.Body4.getChild("HindlimbL");
		this.HindlimbL2 = this.Body4.getChild("HindlimbL2");
		this.Body5 = this.Body4.getChild("Body5");
		this.Body6 = this.Body5.getChild("Body6");
		this.Body7 = this.Body6.getChild("Body7");
		this.Body8 = this.Body7.getChild("Body8");
		this.Head = this.Ophthalmosaurus.getChild("Head");
		this.eye = this.Head.getChild("eye");
		this.Jaw = this.Head.getChild("Jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Ophthalmosaurus = fossil.addOrReplaceChild("Ophthalmosaurus", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -22.75F));

		PartDefinition Body1 = Ophthalmosaurus.addOrReplaceChild("Body1", CubeListBuilder.create(), PartPose.offset(0.0F, -11.9183F, 9.1578F));

		PartDefinition cube_r1 = Body1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(12, 57).addBox(0.0F, -0.5F, -0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 31).addBox(0.0F, -0.1F, -2.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4817F, 1.7672F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Body1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(38, 61).addBox(-0.5F, -0.5F, -2.4F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, -0.4817F, 1.7672F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Body1.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(74, 64).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5658F, 2.1526F, 0.4074F, 0.5125F, -0.7585F));

		PartDefinition cube_r4 = Body1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(59, 38).mirror().addBox(-8.9916F, -2.5101F, -0.4852F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5658F, 2.1526F, 0.0995F, 0.6366F, -1.3138F));

		PartDefinition cube_r5 = Body1.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(74, 56).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5658F, 2.1526F, 0.5794F, 0.3093F, -0.3357F));

		PartDefinition cube_r6 = Body1.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(61, 43).mirror().addBox(-6.8126F, -0.8451F, -0.4852F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1342F, 0.3526F, 0.1655F, 0.7485F, -0.9506F));

		PartDefinition cube_r7 = Body1.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(74, 54).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1342F, 0.3526F, 0.5064F, 0.6079F, -0.4164F));

		PartDefinition cube_r8 = Body1.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(74, 54).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1342F, 0.3526F, 0.5064F, -0.6079F, 0.4164F));

		PartDefinition cube_r9 = Body1.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(61, 43).addBox(1.8126F, -0.8451F, -0.4852F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1342F, 0.3526F, 0.1655F, -0.7485F, 0.9506F));

		PartDefinition cube_r10 = Body1.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(59, 38).addBox(2.9916F, -2.5101F, -0.4852F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5658F, 2.1526F, 0.0995F, -0.6366F, 1.3138F));

		PartDefinition cube_r11 = Body1.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(74, 64).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5658F, 2.1526F, 0.4074F, -0.5125F, 0.7585F));

		PartDefinition cube_r12 = Body1.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(74, 56).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5658F, 2.1526F, 0.5794F, -0.3093F, 0.3357F));

		PartDefinition ForelimbL = Body1.addOrReplaceChild("ForelimbL", CubeListBuilder.create(), PartPose.offsetAndRotation(4.2F, 3.4183F, 4.0422F, 0.1641F, -0.0805F, -0.0568F));

		PartDefinition cube_r13 = ForelimbL.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(10, 14).addBox(4.0F, 0.7F, -0.2F, 9.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(71, 60).addBox(2.0F, 0.2F, 2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(41, 72).addBox(2.0F, 0.2F, 0.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(65, 64).addBox(-1.0F, 0.2F, 1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.8996F, -0.0329F, -2.1116F, 0.0F, 0.0F, 0.6545F));

		PartDefinition ForelimbL2 = Body1.addOrReplaceChild("ForelimbL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.2F, 3.4183F, 4.0422F, 0.4166F, 0.2554F, -0.1642F));

		PartDefinition cube_r14 = ForelimbL2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(10, 8).addBox(-13.0F, 0.7F, -0.2F, 9.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(38, 54).addBox(-4.0F, 0.2F, 2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(72, 20).addBox(-4.0F, 0.2F, 0.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(65, 45).addBox(-2.0F, 0.2F, 1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.8996F, -0.0329F, -2.1116F, 0.0F, 0.0F, -0.6545F));

		PartDefinition Body2 = Body1.addOrReplaceChild("Body2", CubeListBuilder.create(), PartPose.offset(0.0F, -1.026F, 3.1368F));

		PartDefinition cube_r15 = Body2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(22, 20).addBox(-3.5F, -1.0419F, -3.9452F, 7.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.4103F, 5.0876F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r16 = Body2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(10, 0).addBox(-4.5F, -0.5F, -1.4F, 9.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.0103F, 6.5876F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r17 = Body2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(46, 23).mirror().addBox(-10.9916F, -2.5101F, -0.4852F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7398F, 8.2159F, 0.1361F, 0.4285F, -1.2822F));

		PartDefinition cube_r18 = Body2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(44, 76).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7398F, 8.2159F, 0.3226F, 0.3169F, -0.7799F));

		PartDefinition cube_r19 = Body2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(37, 76).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7398F, 8.2159F, 0.4242F, 0.1624F, -0.3591F));

		PartDefinition cube_r20 = Body2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(16, 76).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6398F, 6.2159F, 0.4741F, 0.1806F, -0.3506F));

		PartDefinition cube_r21 = Body2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(70, 75).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6398F, 6.2159F, 0.3623F, 0.3534F, -0.7668F));

		PartDefinition cube_r22 = Body2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(46, 47).mirror().addBox(-10.9916F, -2.5101F, -0.4852F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6398F, 6.2159F, 0.1528F, 0.4786F, -1.2749F));

		PartDefinition cube_r23 = Body2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(28, 48).mirror().addBox(-10.9916F, -2.5101F, -0.4852F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5398F, 4.2159F, 0.1645F, 0.512F, -1.2693F));

		PartDefinition cube_r24 = Body2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(23, 76).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5398F, 4.2159F, 0.3894F, 0.3775F, -0.7572F));

		PartDefinition cube_r25 = Body2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(30, 76).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5398F, 4.2159F, 0.5075F, 0.1925F, -0.3444F));

		PartDefinition cube_r26 = Body2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(76, 32).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4398F, 2.4159F, 0.5242F, 0.1984F, -0.3412F));

		PartDefinition cube_r27 = Body2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(76, 34).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4398F, 2.4159F, 0.4031F, 0.3895F, -0.7521F));

		PartDefinition cube_r28 = Body2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(46, 49).mirror().addBox(-10.9916F, -2.5101F, -0.4852F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4398F, 2.4159F, 0.1705F, 0.5287F, -1.2663F));

		PartDefinition cube_r29 = Body2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(28, 46).mirror().addBox(-10.9916F, -2.5101F, -0.4852F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0398F, 0.4159F, 0.1453F, 0.6082F, -1.2807F));

		PartDefinition cube_r30 = Body2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(76, 51).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0398F, 0.4159F, 0.4267F, 0.469F, -0.743F));

		PartDefinition cube_r31 = Body2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(76, 46).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0398F, 0.4159F, 0.5772F, 0.2626F, -0.3298F));

		PartDefinition cube_r32 = Body2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(46, 23).addBox(2.9916F, -2.5101F, -0.4852F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7398F, 8.2159F, 0.1361F, -0.4285F, 1.2822F));

		PartDefinition cube_r33 = Body2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(44, 76).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7398F, 8.2159F, 0.3226F, -0.3169F, 0.7799F));

		PartDefinition cube_r34 = Body2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(37, 76).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7398F, 8.2159F, 0.4242F, -0.1624F, 0.3591F));

		PartDefinition cube_r35 = Body2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(16, 76).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6398F, 6.2159F, 0.4741F, -0.1806F, 0.3506F));

		PartDefinition cube_r36 = Body2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(70, 75).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6398F, 6.2159F, 0.3623F, -0.3534F, 0.7668F));

		PartDefinition cube_r37 = Body2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(46, 47).addBox(2.9916F, -2.5101F, -0.4852F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6398F, 6.2159F, 0.1528F, -0.4786F, 1.2749F));

		PartDefinition cube_r38 = Body2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(30, 76).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5398F, 4.2159F, 0.5075F, -0.1925F, 0.3444F));

		PartDefinition cube_r39 = Body2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(23, 76).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5398F, 4.2159F, 0.3894F, -0.3775F, 0.7572F));

		PartDefinition cube_r40 = Body2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(28, 48).addBox(2.9916F, -2.5101F, -0.4852F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5398F, 4.2159F, 0.1645F, -0.512F, 1.2693F));

		PartDefinition cube_r41 = Body2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(28, 46).addBox(2.9916F, -2.5101F, -0.4852F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0398F, 0.4159F, 0.1453F, -0.6082F, 1.2807F));

		PartDefinition cube_r42 = Body2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(76, 51).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0398F, 0.4159F, 0.4267F, -0.469F, 0.743F));

		PartDefinition cube_r43 = Body2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(76, 46).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0398F, 0.4159F, 0.5772F, -0.2626F, 0.3298F));

		PartDefinition cube_r44 = Body2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(76, 32).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4398F, 2.4159F, 0.5242F, -0.1984F, 0.3412F));

		PartDefinition cube_r45 = Body2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(46, 49).addBox(2.9916F, -2.5101F, -0.4852F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4398F, 2.4159F, 0.1705F, -0.5287F, 1.2663F));

		PartDefinition cube_r46 = Body2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(76, 34).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4398F, 2.4159F, 0.4031F, -0.3895F, 0.7521F));

		PartDefinition cube_r47 = Body2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(13, 40).addBox(-1.0F, -1.5753F, 4.9926F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(41, 19).addBox(-1.0F, -1.6753F, 2.9926F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 42).addBox(-1.0F, -1.5753F, 0.9926F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 10).addBox(-1.5F, 0.0247F, -0.0074F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, -1.1557F, 2.7054F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r48 = Body2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(26, 54).mirror().addBox(-2.5364F, -0.8372F, -0.2546F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 5.3941F, -2.7687F, -0.3096F, 0.3636F, 0.5251F));

		PartDefinition cube_r49 = Body2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(20, 31).mirror().addBox(-3.9525F, -0.9051F, -0.2276F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.6F, 4.2941F, -1.9687F, -0.2327F, 0.5178F, 1.1225F));

		PartDefinition cube_r50 = Body2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(10, 20).mirror().addBox(-0.4514F, -0.2298F, -2.7596F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.6F, 4.4491F, -1.008F, 1.4693F, -0.1313F, -1.0841F));

		PartDefinition cube_r51 = Body2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(68, 55).mirror().addBox(-0.4514F, -0.2298F, -2.6596F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.6F, 4.4491F, -1.008F, 1.1202F, -0.1313F, -1.0841F));

		PartDefinition cube_r52 = Body2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(72, 1).mirror().addBox(-6.5F, -0.8F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(34, 28).mirror().addBox(-6.5F, -1.0F, -0.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(34, 28).addBox(1.1F, -1.0F, -0.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(72, 1).addBox(1.1F, -0.8F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.2F, 2.7181F, 0.5697F, 1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r53 = Body2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(20, 31).addBox(-0.0475F, -0.9051F, -0.2276F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.6F, 4.2941F, -1.9687F, -0.2327F, -0.5178F, -1.1225F));

		PartDefinition cube_r54 = Body2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(26, 54).addBox(-0.4636F, -0.8372F, -0.2546F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.6F, 5.3941F, -2.7687F, -0.3096F, -0.3636F, -0.5251F));

		PartDefinition cube_r55 = Body2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(50, 68).addBox(-0.5F, -0.5F, -3.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 6.4941F, 1.3313F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r56 = Body2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(44, 0).addBox(-1.0F, -1.15F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 55).addBox(-1.0F, -1.05F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 70).addBox(-1.5F, -0.05F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3557F, -0.1946F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r57 = Body2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(68, 55).addBox(-0.5486F, -0.2298F, -2.6596F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.6F, 4.4491F, -1.008F, 1.1202F, 0.1313F, 1.0841F));

		PartDefinition cube_r58 = Body2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(10, 20).addBox(-0.5486F, -0.2298F, -2.7596F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.6F, 4.4491F, -1.008F, 1.4693F, 0.1313F, 1.0841F));

		PartDefinition Body3 = Body2.addOrReplaceChild("Body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6931F, 9.6655F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r59 = Body3.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(45, 28).addBox(-1.0F, -1.3F, 6.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 0).addBox(-1.0F, -1.4F, 4.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 48).addBox(-1.0F, -1.5F, 2.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 28).addBox(-1.0F, -1.5F, 0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 26).addBox(-1.5F, 0.0F, 0.05F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.0F, -0.5626F, -0.0601F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r60 = Body3.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(16, 55).mirror().addBox(-4.9916F, -2.5101F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2534F, 6.2503F, 0.1356F, 0.4644F, -1.4043F));

		PartDefinition cube_r61 = Body3.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(24, 59).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2534F, 6.2503F, 0.3406F, 0.3485F, -0.8959F));

		PartDefinition cube_r62 = Body3.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(48, 56).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2534F, 6.2503F, 0.4531F, 0.1844F, -0.476F));

		PartDefinition cube_r63 = Body3.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(51, 8).mirror().addBox(-6.9916F, -2.5101F, -0.4852F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7534F, 4.2503F, 0.127F, 0.4036F, -1.3382F));

		PartDefinition cube_r64 = Body3.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(71, 68).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7534F, 4.2503F, 0.3025F, 0.299F, -0.8384F));

		PartDefinition cube_r65 = Body3.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(31, 62).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7534F, 4.2503F, 0.3991F, 0.154F, -0.4154F));

		PartDefinition cube_r66 = Body3.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(20, 36).mirror().addBox(-8.9916F, -2.5101F, -0.4852F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3534F, 2.2503F, 0.128F, 0.4034F, -1.2855F));

		PartDefinition cube_r67 = Body3.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(73, 42).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3534F, 2.2503F, 0.3032F, 0.2984F, -0.7858F));

		PartDefinition cube_r68 = Body3.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(73, 18).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3534F, 2.2503F, 0.3994F, 0.1532F, -0.363F));

		PartDefinition cube_r69 = Body3.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(73, 49).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0534F, 0.3503F, 0.3994F, 0.1532F, -0.363F));

		PartDefinition cube_r70 = Body3.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(74, 44).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0534F, 0.3503F, 0.3032F, 0.2984F, -0.7858F));

		PartDefinition cube_r71 = Body3.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(50, 45).mirror().addBox(-9.9916F, -2.5101F, -0.4852F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0534F, 0.3503F, 0.128F, 0.4034F, -1.2855F));

		PartDefinition cube_r72 = Body3.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(24, 59).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2534F, 6.2503F, 0.3406F, -0.3485F, 0.8959F));

		PartDefinition cube_r73 = Body3.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(48, 56).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2534F, 6.2503F, 0.4531F, -0.1844F, 0.476F));

		PartDefinition cube_r74 = Body3.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(16, 55).addBox(2.9916F, -2.5101F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2534F, 6.2503F, 0.1356F, -0.4644F, 1.4043F));

		PartDefinition cube_r75 = Body3.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(71, 68).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7534F, 4.2503F, 0.3025F, -0.299F, 0.8384F));

		PartDefinition cube_r76 = Body3.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(31, 62).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7534F, 4.2503F, 0.3991F, -0.154F, 0.4154F));

		PartDefinition cube_r77 = Body3.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(51, 8).addBox(2.9916F, -2.5101F, -0.4852F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7534F, 4.2503F, 0.127F, -0.4036F, 1.3382F));

		PartDefinition cube_r78 = Body3.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(20, 36).addBox(2.9916F, -2.5101F, -0.4852F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3534F, 2.2503F, 0.128F, -0.4034F, 1.2855F));

		PartDefinition cube_r79 = Body3.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(50, 45).addBox(2.9916F, -2.5101F, -0.4852F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0534F, 0.3503F, 0.128F, -0.4034F, 1.2855F));

		PartDefinition cube_r80 = Body3.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(74, 44).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0534F, 0.3503F, 0.3032F, -0.2984F, 0.7858F));

		PartDefinition cube_r81 = Body3.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(73, 49).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0534F, 0.3503F, 0.3994F, -0.1532F, 0.363F));

		PartDefinition cube_r82 = Body3.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(73, 42).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3534F, 2.2503F, 0.3032F, -0.2984F, 0.7858F));

		PartDefinition cube_r83 = Body3.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(73, 18).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3534F, 2.2503F, 0.3994F, -0.1532F, 0.363F));

		PartDefinition Body4 = Body3.addOrReplaceChild("Body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4387F, 7.7183F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r84 = Body4.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(10, 68).mirror().addBox(-0.4F, -0.5F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 3.7736F, 3.6072F, 1.0627F, 0.0607F, 0.2118F));

		PartDefinition cube_r85 = Body4.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(41, 67).mirror().addBox(-0.2747F, -0.7851F, -3.1545F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4802F, 4.3789F, 3.3392F, 1.3772F, -0.4113F, -0.9899F));

		PartDefinition cube_r86 = Body4.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(18, 65).mirror().addBox(-0.2747F, -0.2851F, -3.0545F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4802F, 4.3789F, 3.3392F, 1.9426F, 0.303F, -0.9995F));

		PartDefinition cube_r87 = Body4.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(18, 65).addBox(-0.7253F, -0.2851F, -3.0545F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4802F, 4.3789F, 3.3392F, 1.9426F, -0.303F, 0.9995F));

		PartDefinition cube_r88 = Body4.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(41, 67).addBox(-0.7253F, -0.7851F, -3.1545F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4802F, 4.3789F, 3.3392F, 1.3772F, 0.4113F, 0.9899F));

		PartDefinition cube_r89 = Body4.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(10, 68).addBox(-0.6F, -0.5F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 3.7736F, 3.6072F, 1.0627F, -0.0607F, -0.2118F));

		PartDefinition cube_r90 = Body4.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(65, 68).addBox(-1.5F, -1.0354F, 0.0444F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.0F, 1.3988F, 3.7216F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r91 = Body4.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(28, 44).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0147F, 5.832F, 0.4679F, 0.4555F, -0.9183F));

		PartDefinition cube_r92 = Body4.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(18, 48).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0147F, 4.232F, 0.4864F, 0.4355F, -0.8753F));

		PartDefinition cube_r93 = Body4.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(10, 11).mirror().addBox(-2.8126F, -0.8451F, -0.4852F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5147F, 2.332F, 0.3826F, 0.5209F, -1.1018F));

		PartDefinition cube_r94 = Body4.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(51, 17).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5147F, 2.332F, 0.5623F, 0.3258F, -0.672F));

		PartDefinition cube_r95 = Body4.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(10, 27).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1147F, 0.332F, 0.2428F, 0.413F, -1.0376F));

		PartDefinition cube_r96 = Body4.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(19, 40).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1147F, 0.332F, 0.396F, 0.281F, -0.5945F));

		PartDefinition cube_r97 = Body4.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(28, 44).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0147F, 5.832F, 0.4679F, -0.4555F, 0.9183F));

		PartDefinition cube_r98 = Body4.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(18, 48).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0147F, 4.232F, 0.4864F, -0.4355F, 0.8753F));

		PartDefinition cube_r99 = Body4.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(10, 11).addBox(1.8126F, -0.8451F, -0.4852F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5147F, 2.332F, 0.3826F, -0.5209F, 1.1018F));

		PartDefinition cube_r100 = Body4.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(51, 17).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5147F, 2.332F, 0.5623F, -0.3258F, 0.672F));

		PartDefinition cube_r101 = Body4.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(46, 19).addBox(0.0F, -0.6F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3273F, 6.3392F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r102 = Body4.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(53, 0).addBox(0.0F, -0.5F, -0.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1079F, 4.5526F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r103 = Body4.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(10, 27).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1147F, 0.332F, 0.2428F, -0.413F, 1.0376F));

		PartDefinition cube_r104 = Body4.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(19, 40).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1147F, 0.332F, 0.396F, -0.281F, 0.5945F));

		PartDefinition cube_r105 = Body4.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(53, 25).addBox(-1.0F, -0.9648F, 2.1356F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 31).addBox(-1.0F, -1.0648F, 0.1356F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 61).addBox(-1.5F, -0.0648F, 0.1356F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4012F, -0.0784F, -0.2094F, 0.0F, 0.0F));

		PartDefinition HindlimbL = Body4.addOrReplaceChild("HindlimbL", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, 5.0988F, 3.5216F, 0.4974F, -0.3175F, -0.0903F));

		PartDefinition cube_r106 = HindlimbL.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(31, 50).addBox(2.0F, 0.5F, -2.0F, 5.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(34, 14).addBox(0.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2391F, -0.3442F, 0.4927F, 0.0F, 0.0F, 0.6109F));

		PartDefinition HindlimbL2 = Body4.addOrReplaceChild("HindlimbL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 5.0988F, 3.5216F, 0.4041F, 0.4322F, -0.1629F));

		PartDefinition cube_r107 = HindlimbL2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(46, 19).addBox(-7.0F, 0.5F, -2.0F, 5.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(34, 10).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2391F, -0.3442F, 0.4927F, 0.0F, 0.0F, -0.6109F));

		PartDefinition Body5 = Body4.addOrReplaceChild("Body5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8617F, 6.7871F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r108 = Body5.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(38, 3).addBox(-1.0F, -0.55F, 5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 10).addBox(-1.0F, -0.55F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(45, 38).addBox(-1.0F, -0.65F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 29).addBox(-1.5F, 0.05F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3629F, -0.0655F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r109 = Body5.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(38, 38).addBox(0.0F, -0.4002F, -0.4825F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.713F, 1.3985F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r110 = Body5.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(22, 20).addBox(0.0F, -0.4002F, -0.4825F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.413F, 5.3985F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r111 = Body5.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(10, 40).addBox(0.0F, -0.4002F, -0.4825F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.513F, 3.3985F, 0.637F, 0.0F, 0.0F));

		PartDefinition Body6 = Body5.addOrReplaceChild("Body6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1222F, 6.7884F, 0.0F, -0.2182F, 0.0F));

		PartDefinition cube_r112 = Body6.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(16, 20).addBox(-1.0F, -0.95F, 1.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 3).addBox(-1.0F, -1.05F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 58).addBox(-1.5F, -0.55F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, 0.2149F, 0.1461F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r113 = Body6.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(10, 20).addBox(0.0F, 0.0998F, -0.4825F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2908F, 0.6101F, 0.637F, 0.0F, 0.0F));

		PartDefinition Body7 = Body6.addOrReplaceChild("Body7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0209F, 4.003F, 0.0F, -0.2182F, 0.0F));

		PartDefinition cube_r114 = Body7.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(10, 40).addBox(-1.5F, -0.0162F, -0.0096F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3642F, 0.0431F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Body8 = Body7.addOrReplaceChild("Body8", CubeListBuilder.create(), PartPose.offset(0.0F, 0.1165F, 6.0478F));

		PartDefinition cube_r115 = Body8.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(17, 59).addBox(-1.5F, -1.0367F, 0.0419F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, 5.6193F, 3.6953F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r116 = Body8.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(19, 44).addBox(-1.5F, -0.0196F, -2.0574F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.9193F, 2.0953F, -0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r117 = Body8.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(35, 0).addBox(-1.5F, -0.0739F, 0.0534F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, -0.2807F, -0.1047F, -0.6109F, 0.0F, 0.0F));

		PartDefinition Head = Ophthalmosaurus.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(54, 25).addBox(-1.0536F, 0.9909F, -11.3572F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(62, 0).addBox(-1.5536F, 0.9909F, -7.3572F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(18, 52).addBox(-0.5536F, 0.9909F, -16.3572F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(42, 54).addBox(0.2964F, 1.3659F, -16.2572F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(38, 19).addBox(0.8964F, 1.3659F, -11.2572F, 0.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(38, 19).mirror().addBox(-1.0036F, 1.3659F, -11.2572F, 0.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(42, 54).mirror().addBox(-0.4036F, 1.3659F, -16.2572F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0536F, -11.7409F, 8.7822F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r118 = Head.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(53, 0).addBox(-1.0F, -0.0336F, -2.8542F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.0536F, 0.1725F, -5.8672F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r119 = Head.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(22, 26).addBox(-1.0F, 1.2148F, -4.2476F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(71, 13).addBox(-0.5F, 0.2148F, -5.7476F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0536F, 0.1725F, -5.8672F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r120 = Head.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(44, 10).addBox(-2.5F, 0.0201F, -0.3933F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0536F, -1.2726F, -2.8565F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r121 = Head.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(45, 38).addBox(-2.5F, -0.0181F, -3.0794F, 5.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0536F, -1.1726F, -3.1565F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r122 = Head.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(48, 51).addBox(-2.5F, -1.9834F, -0.0109F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0536F, 1.9909F, -0.5072F, 1.309F, 0.0F, 0.0F));

		PartDefinition cube_r123 = Head.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(60, 18).addBox(-2.5F, -1.9363F, 0.0182F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0536F, 2.3909F, -1.4072F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r124 = Head.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(23, 38).addBox(-3.0F, -0.9414F, -2.9769F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.003F))
				.texOffs(70, 29).addBox(-2.5F, -0.9414F, -3.9769F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.4464F, 2.2909F, -2.4072F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r125 = Head.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(62, 40).addBox(-2.0F, -0.6F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.0536F, 0.7923F, -5.7457F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r126 = Head.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(10, 0).mirror().addBox(-2.5F, 0.0396F, -0.925F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(10, 0).addBox(1.5F, 0.0396F, -0.925F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0536F, -1.4091F, -0.3072F, 0.5934F, 0.0F, 0.0F));

		PartDefinition eye = Head.addOrReplaceChild("eye", CubeListBuilder.create(), PartPose.offsetAndRotation(2.2214F, -0.1591F, -4.1822F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r127 = eye.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(45, 61).mirror().addBox(1.0F, -0.6F, -4.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(32, 64).mirror().addBox(-0.7F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(64, 29).mirror().addBox(-0.62F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.8F)).mirror(false)
				.texOffs(45, 61).addBox(2.5F, -0.6F, -4.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(64, 29).addBox(4.12F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.8F))
				.texOffs(32, 64).addBox(4.2F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-4.525F, 1.2F, 1.3F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r128 = eye.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(10, 31).mirror().addBox(0.0F, -2.9892F, 0.433F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.11F)).mirror(false)
				.texOffs(10, 31).addBox(4.3F, -2.9892F, 0.433F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-4.925F, 2.1619F, -0.2739F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r129 = eye.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(31, 54).mirror().addBox(-0.4F, -0.8385F, -0.8636F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.8F)).mirror(false), PartPose.offsetAndRotation(-4.625F, 0.0977F, -1.1423F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r130 = eye.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(17, 71).mirror().addBox(-0.5F, -0.4031F, -0.3786F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.41F)).mirror(false)
				.texOffs(17, 71).addBox(3.4F, -0.4031F, -0.3786F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.41F)), PartPose.offsetAndRotation(-4.725F, 1.4315F, -0.9553F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r131 = eye.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(65, 4).mirror().addBox(-0.5F, -0.4072F, -0.3919F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(65, 4).addBox(3.4F, -0.4072F, -0.3919F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-4.725F, 2.3315F, -0.1553F, 1.2566F, 0.0F, 0.0F));

		PartDefinition cube_r132 = eye.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(65, 22).mirror().addBox(-0.7F, -1.5929F, -0.4205F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.49F)).mirror(false)
				.texOffs(65, 22).addBox(3.4F, -1.5929F, -0.4205F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.49F)), PartPose.offsetAndRotation(-4.625F, 2.1315F, 2.8447F, 2.8623F, 0.0F, 0.0F));

		PartDefinition cube_r133 = eye.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(31, 54).addBox(-0.6F, -0.8385F, -0.8636F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.8F)), PartPose.offsetAndRotation(0.075F, 0.0977F, -1.1423F, 0.2094F, 0.0F, 0.0F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create().texOffs(74, 24).addBox(1.5F, 0.6768F, -3.2733F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F))
				.texOffs(32, 71).addBox(1.5F, 0.6768F, -6.1483F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F))
				.texOffs(49, 62).addBox(0.0F, 0.6518F, -11.9983F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.03F))
				.texOffs(50, 73).addBox(1.0F, 0.6518F, -7.1983F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.03F))
				.texOffs(10, 14).addBox(0.5F, 0.6518F, -8.0983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.03F))
				.texOffs(10, 55).addBox(0.4F, 0.1518F, -16.9733F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(65, 10).addBox(0.9F, 0.1518F, -11.8733F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(74, 24).mirror().addBox(-2.5F, 0.6768F, -3.2733F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)).mirror(false)
				.texOffs(32, 71).mirror().addBox(-2.5F, 0.6768F, -6.1483F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(49, 62).mirror().addBox(-1.0F, 0.6518F, -11.9983F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.03F)).mirror(false)
				.texOffs(50, 73).mirror().addBox(-2.0F, 0.6518F, -7.1983F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.03F)).mirror(false)
				.texOffs(10, 14).mirror().addBox(-1.5F, 0.6518F, -8.0983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.03F)).mirror(false)
				.texOffs(10, 55).mirror().addBox(-0.4F, 0.1518F, -16.9733F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(65, 10).mirror().addBox(-0.9F, 0.1518F, -11.8733F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(45, 28).addBox(-0.5F, 0.6518F, -17.0483F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-0.0536F, 1.3667F, 0.8161F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r134 = Jaw.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(10, 8).mirror().addBox(-1.5F, -1.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false)
				.texOffs(10, 8).addBox(0.5F, -1.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 1.6518F, -12.0983F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r135 = Jaw.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(73, 38).mirror().addBox(-1.5F, -1.0F, 5.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)).mirror(false)
				.texOffs(73, 38).addBox(1.5F, -1.0F, 5.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-0.5F, 1.6518F, -12.1983F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r136 = Jaw.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(10, 62).mirror().addBox(-1.5F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.02F)).mirror(false)
				.texOffs(10, 62).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.5F, 1.6518F, -11.9983F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r137 = Jaw.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(70, 33).mirror().addBox(-2.0F, -0.9465F, -2.9357F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(70, 33).addBox(2.0F, -0.9465F, -2.9357F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, 1.2768F, 0.3267F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r138 = Jaw.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(63, 73).mirror().addBox(-2.0F, -1.0208F, -1.6151F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)).mirror(false)
				.texOffs(63, 73).addBox(2.0F, -1.0208F, -1.6151F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-0.5F, -0.0232F, 1.2267F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r139 = Jaw.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(71, 7).mirror().addBox(-2.0F, -0.5F, -0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.03F)).mirror(false)
				.texOffs(71, 7).addBox(2.0F, -0.5F, -0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(-0.5F, 1.1768F, -1.7733F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r140 = Jaw.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(60, 52).mirror().addBox(-0.5F, -1.0F, -0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.03F)).mirror(false)
				.texOffs(60, 52).addBox(3.5F, -1.0F, -0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(-2.0F, 1.9768F, -6.1733F, -0.0524F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 85, 80);
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