package fossils.fossils.client.blockentity.model.mixosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class MixosaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Mixosaurus;
	private final ModelPart Body1;
	private final ModelPart chest;
	private final ModelPart Head;
	private final ModelPart leftFace;
	private final ModelPart leftFace2;
	private final ModelPart Jaw;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart ForelimbsL;
	private final ModelPart ForelimbsL2;
	private final ModelPart Body2;
	private final ModelPart Body3;
	private final ModelPart Body4;
	private final ModelPart Body5;
	private final ModelPart HindlimbsL;
	private final ModelPart HindlimbsL2;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart Tail1;
	private final ModelPart tail4;
	private final ModelPart tail3;
	private final ModelPart bone;
	private final ModelPart bone4;

	public MixosaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Mixosaurus = this.fossil.getChild("Mixosaurus");
		this.Body1 = this.Mixosaurus.getChild("Body1");
		this.chest = this.Body1.getChild("chest");
		this.Head = this.chest.getChild("Head");
		this.leftFace = this.Head.getChild("leftFace");
		this.leftFace2 = this.Head.getChild("leftFace2");
		this.Jaw = this.Head.getChild("Jaw");
		this.bone2 = this.Body1.getChild("bone2");
		this.bone3 = this.Body1.getChild("bone3");
		this.ForelimbsL = this.Body1.getChild("ForelimbsL");
		this.ForelimbsL2 = this.Body1.getChild("ForelimbsL2");
		this.Body2 = this.Body1.getChild("Body2");
		this.Body3 = this.Body2.getChild("Body3");
		this.Body4 = this.Body3.getChild("Body4");
		this.Body5 = this.Body4.getChild("Body5");
		this.HindlimbsL = this.Body5.getChild("HindlimbsL");
		this.HindlimbsL2 = this.Body5.getChild("HindlimbsL2");
		this.tail = this.Body5.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.Tail1 = this.tail2.getChild("Tail1");
		this.tail4 = this.Tail1.getChild("tail4");
		this.tail3 = this.tail4.getChild("tail3");
		this.bone = this.Body5.getChild("bone");
		this.bone4 = this.Body5.getChild("bone4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Mixosaurus = fossil.addOrReplaceChild("Mixosaurus", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -10.6F, -4.7F, 0.1106F, 0.0F, 0.0F));

		PartDefinition Body1 = Mixosaurus.addOrReplaceChild("Body1", CubeListBuilder.create(), PartPose.offset(-1.0F, 1.0F, -7.0F));

		PartDefinition cube_r1 = Body1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(67, 31).addBox(-0.8F, -1.591F, -0.1593F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(67, 28).addBox(-0.8F, -0.891F, -0.1593F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.8F, 3.8F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Body1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(47, 28).addBox(-0.5F, -0.1122F, -0.4656F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.9F, 4.1F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Body1.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(67, 22).addBox(-0.8F, -1.4499F, -0.1698F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(67, 19).addBox(-0.8F, -0.8499F, -0.1698F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.35F, 2.2F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Body1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(32, 52).mirror().addBox(-1.8829F, -0.828F, -0.496F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.3718F, 3.0561F, 0.0509F, -0.2676F, 0.0964F, 0.7608F));

		PartDefinition cube_r5 = Body1.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 30).mirror().addBox(-4.8932F, -1.016F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.35F, -1.6022F, 4.0931F, 0.039F, 0.2413F, -1.3566F));

		PartDefinition cube_r6 = Body1.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(66, 6).mirror().addBox(-0.85F, -0.125F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.35F, -1.6022F, 4.0931F, 0.2147F, 0.1176F, -0.4411F));

		PartDefinition cube_r7 = Body1.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(64, 50).mirror().addBox(-1.4943F, -0.3985F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.35F, -1.6022F, 4.0931F, 0.1523F, 0.1918F, -0.8405F));

		PartDefinition cube_r8 = Body1.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(34, 39).mirror().addBox(-3.8932F, -1.016F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.35F, -1.2022F, 2.5931F, 0.06F, 0.3618F, -1.4027F));

		PartDefinition cube_r9 = Body1.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(50, 64).mirror().addBox(-1.4943F, -0.3985F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.35F, -1.2022F, 2.5931F, 0.2321F, 0.2863F, -0.874F));

		PartDefinition cube_r10 = Body1.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(5, 66).mirror().addBox(-0.85F, -0.125F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.35F, -1.2022F, 2.5931F, 0.3239F, 0.1746F, -0.4775F));

		PartDefinition cube_r11 = Body1.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(64, 50).addBox(0.4944F, -0.3985F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.35F, -1.6022F, 4.0931F, 0.1523F, -0.1918F, 0.8405F));

		PartDefinition cube_r12 = Body1.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(66, 6).addBox(-0.15F, -0.125F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.35F, -1.6022F, 4.0931F, 0.2147F, -0.1176F, 0.4411F));

		PartDefinition cube_r13 = Body1.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 30).addBox(0.8932F, -1.016F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.35F, -1.6022F, 4.0931F, 0.039F, -0.2413F, 1.3566F));

		PartDefinition cube_r14 = Body1.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(34, 39).addBox(0.8932F, -1.016F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.35F, -1.2022F, 2.5931F, 0.06F, -0.3618F, 1.4027F));

		PartDefinition cube_r15 = Body1.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(50, 64).addBox(0.4944F, -0.3985F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.35F, -1.2022F, 2.5931F, 0.2321F, -0.2863F, 0.874F));

		PartDefinition cube_r16 = Body1.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(5, 66).addBox(-0.15F, -0.125F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.35F, -1.2022F, 2.5931F, 0.3239F, -0.1746F, 0.4775F));

		PartDefinition cube_r17 = Body1.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(32, 52).addBox(-0.1171F, -0.828F, -0.496F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3718F, 3.0561F, 0.0509F, -0.2676F, -0.0964F, -0.7608F));

		PartDefinition cube_r18 = Body1.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(9, 33).addBox(-1.6164F, 0.054F, -0.6737F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.1164F, 2.3318F, 0.7795F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r19 = Body1.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 47).addBox(-0.5F, -0.3F, -0.35F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(0.0F, -1.3F, 2.4F, 0.2618F, 0.0F, 0.0F));

		PartDefinition chest = Body1.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.2008F, 2.5174F, 0.088F, 0.1304F, 0.0115F));

		PartDefinition cube_r20 = chest.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(67, 16).addBox(-0.8F, -1.0981F, -0.0987F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(55, 66).addBox(-0.8F, -0.6981F, -0.0987F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5F, -1.9F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r21 = chest.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(40, 66).addBox(-0.8F, -1.3F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 6).addBox(-0.5F, -0.8F, -2.2F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.4F, -2.5F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r22 = chest.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(64, 25).mirror().addBox(-1.8932F, -1.016F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 1.2985F, -3.3243F, -0.1398F, 0.8512F, -1.6083F));

		PartDefinition cube_r23 = chest.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(64, 62).mirror().addBox(-1.4943F, -0.3985F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 1.2985F, -3.3243F, 0.4108F, 0.7786F, -0.8682F));

		PartDefinition cube_r24 = chest.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(20, 66).mirror().addBox(-0.85F, -0.125F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 1.2985F, -3.3243F, 0.6877F, 0.565F, -0.4302F));

		PartDefinition cube_r25 = chest.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(35, 63).mirror().addBox(-2.5932F, -1.016F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(59, 63).mirror().addBox(-1.8932F, -1.016F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 0.5985F, -1.4244F, -0.0129F, 0.5007F, -1.4394F));

		PartDefinition cube_r26 = chest.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(15, 66).mirror().addBox(-0.85F, -0.125F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 0.5985F, -1.4244F, 0.4004F, 0.3094F, -0.4652F));

		PartDefinition cube_r27 = chest.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(64, 59).mirror().addBox(-1.4943F, -0.3985F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 0.5985F, -1.4244F, 0.2487F, 0.4394F, -0.8741F));

		PartDefinition cube_r28 = chest.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(20, 66).addBox(-0.15F, -0.125F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.35F, 1.2985F, -3.3243F, 0.6877F, -0.565F, 0.4302F));

		PartDefinition cube_r29 = chest.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(64, 62).addBox(0.4944F, -0.3985F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.35F, 1.2985F, -3.3243F, 0.4108F, -0.7786F, 0.8682F));

		PartDefinition cube_r30 = chest.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(64, 25).addBox(0.8932F, -1.016F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.35F, 1.2985F, -3.3243F, -0.1398F, -0.8512F, 1.6083F));

		PartDefinition cube_r31 = chest.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(35, 63).addBox(1.5932F, -1.016F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(59, 63).addBox(0.8932F, -1.016F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.35F, 0.5985F, -1.4244F, -0.0129F, -0.5007F, 1.4394F));

		PartDefinition cube_r32 = chest.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(64, 59).addBox(0.4944F, -0.3985F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.35F, 0.5985F, -1.4244F, 0.2487F, -0.4394F, 0.8741F));

		PartDefinition cube_r33 = chest.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(15, 66).addBox(-0.15F, -0.125F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.35F, 0.5985F, -1.4244F, 0.4004F, -0.3094F, 0.4652F));

		PartDefinition Head = chest.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6317F, -3.8176F, -0.0436F, 0.48F, 0.0F));

		PartDefinition cube_r34 = Head.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(54, 28).addBox(-0.5F, -0.2498F, -0.7464F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.1F, -1.6095F, -0.8351F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r35 = Head.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(53, 41).addBox(-0.5F, -0.2728F, -0.7607F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(-0.1F, -1.3595F, -0.3851F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r36 = Head.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(53, 14).addBox(-0.5F, -0.287F, -0.7605F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.1F, -0.9595F, -0.0851F, -0.8988F, 0.0F, 0.0F));

		PartDefinition cube_r37 = Head.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(26, 10).addBox(-1.5F, -1.7511F, -1.7012F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.257F)), PartPose.offsetAndRotation(0.6F, -1.0095F, -2.4851F, 2.0377F, 0.0F, 0.0F));

		PartDefinition cube_r38 = Head.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(35, 10).addBox(-1.5F, -0.6754F, -1.7018F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.6F, -1.0095F, -2.0851F, 1.6319F, 0.0F, 0.0F));

		PartDefinition cube_r39 = Head.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(27, 39).addBox(-0.5F, -1.7686F, -1.7183F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(-0.1F, -1.5095F, -1.2851F, 2.1118F, 0.0F, 0.0F));

		PartDefinition cube_r40 = Head.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(26, 0).addBox(-1.5F, -2.7677F, -0.2507F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(0.6F, 1.4905F, -1.2601F, 1.4573F, 0.0F, 0.0F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.9F, -0.0595F, -0.2601F));

		PartDefinition cube_r41 = leftFace.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(5, 60).addBox(-0.65F, 2.05F, -0.4875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(62, 19).addBox(-0.65F, 1.45F, -0.4875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(25, 63).addBox(-0.65F, 0.85F, -0.4875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(50, 70).addBox(-0.65F, 0.25F, -0.4875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(25, 66).addBox(-0.65F, -0.35F, -0.5125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.2984F, 1.0381F, -6.009F, 1.483F, 0.1131F, -0.0069F));

		PartDefinition cube_r42 = leftFace.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(20, 72).addBox(-0.65F, 1.45F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(72, 18).addBox(-0.65F, 0.85F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(63, 39).addBox(-0.65F, 0.25F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(20, 63).addBox(-0.65F, -0.35F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.5282F, 0.8666F, -8.3921F, 1.4832F, 0.0958F, -0.0053F));

		PartDefinition cube_r43 = leftFace.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(0, 72).addBox(-0.7258F, -0.9854F, -0.9462F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(72, 28).addBox(-0.7258F, -1.5854F, -0.9962F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.45F, 0.475F, -8.325F, 1.4848F, 0.078F, 0.0037F));

		PartDefinition cube_r44 = leftFace.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(72, 15).addBox(-0.7258F, -2.2245F, -0.8997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(72, 21).addBox(-0.7258F, -2.8245F, -0.8997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(47, 22).addBox(-0.7009F, -2.9237F, -0.6747F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.347F)), PartPose.offsetAndRotation(-0.45F, 0.475F, -8.325F, 1.572F, 0.078F, 0.0037F));

		PartDefinition cube_r45 = leftFace.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(44, 56).addBox(-0.7375F, -1.0772F, -0.1021F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.356F))
				.texOffs(25, 56).addBox(-0.7375F, -0.9772F, 0.1979F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.355F)), PartPose.offsetAndRotation(0.3625F, 0.1923F, -1.7394F, 2.2951F, 0.1222F, 0.0F));

		PartDefinition cube_r46 = leftFace.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(46, 5).addBox(-0.7375F, -1.0086F, -1.1963F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.354F))
				.texOffs(45, 37).addBox(-0.7375F, -1.3086F, -1.1963F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.3625F, 0.1923F, -1.7394F, 1.8064F, 0.1222F, 0.0F));

		PartDefinition cube_r47 = leftFace.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(0, 42).addBox(-0.8625F, -1.8794F, -1.5159F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.246F)), PartPose.offsetAndRotation(0.3625F, 0.1923F, -1.7394F, 1.4573F, 0.1222F, 0.0F));

		PartDefinition cube_r48 = leftFace.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(40, 22).addBox(-0.8625F, -1.6956F, -0.4876F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.3625F, 0.1923F, -1.7394F, 2.0377F, 0.1222F, 0.0F));

		PartDefinition cube_r49 = leftFace.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(18, 41).addBox(-0.8625F, -0.2794F, -0.3159F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.2733F, 1.3167F, -2.466F, 1.4579F, 0.0701F, 0.0059F));

		PartDefinition cube_r50 = leftFace.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(44, 18).addBox(-0.8625F, -0.6911F, -0.5564F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(0.3625F, 0.1923F, -1.7394F, 1.6319F, 0.1222F, 0.0F));

		PartDefinition cube_r51 = leftFace.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(0, 33).addBox(-0.7F, -0.85F, -1.175F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F))
				.texOffs(34, 42).addBox(0.025F, -0.85F, -1.175F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.375F, 0.1647F, -1.3311F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r52 = leftFace.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(62, 16).addBox(-0.6728F, -0.893F, 0.4891F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(10, 62).addBox(-0.6728F, -1.193F, 0.4891F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.025F, 1.25F, -3.5F, 1.7358F, 0.0843F, 0.0359F));

		PartDefinition cube_r53 = leftFace.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(44, 9).addBox(-0.5F, -1.6523F, -0.3639F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.125F, -0.7083F, -0.5191F, -2.9234F, 0.0F, 0.0F));

		PartDefinition cube_r54 = leftFace.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(44, 0).addBox(-0.5F, -1.6523F, -1.6639F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.347F)), PartPose.offsetAndRotation(0.125F, -0.9005F, -1.8048F, 2.9932F, 0.0F, 0.0F));

		PartDefinition cube_r55 = leftFace.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(41, 42).addBox(-0.5F, -1.6605F, -0.3963F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.347F)), PartPose.offsetAndRotation(0.125F, 1.375F, -1.175F, 1.431F, 0.0518F, -0.0073F));

		PartDefinition cube_r56 = leftFace.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(7, 42).addBox(-0.5F, -1.9281F, -1.5407F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.354F))
				.texOffs(29, 30).addBox(-1.625F, -1.7782F, -1.3657F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(0.125F, 0.9F, -0.1F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r57 = leftFace.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(51, 0).addBox(-0.7009F, -2.5989F, -0.5857F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.45F, 0.475F, -8.325F, 1.6069F, 0.078F, 0.0037F));

		PartDefinition cube_r58 = leftFace.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(20, 56).addBox(-0.7519F, -1.7513F, 0.0026F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.248F))
				.texOffs(54, 50).addBox(-0.7519F, -1.7513F, -0.2474F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.075F, 1.175F, -4.475F, 1.4748F, 0.1091F, 0.0F));

		PartDefinition cube_r59 = leftFace.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(52, 18).addBox(-0.75F, -2.6422F, -0.2752F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-0.2F, 1.05F, -5.975F, 1.4748F, 0.1091F, 0.0F));

		PartDefinition cube_r60 = leftFace.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(27, 51).addBox(-0.75F, -2.5669F, 0.0477F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2F, 1.05F, -5.975F, 1.6144F, 0.1091F, 0.0F));

		PartDefinition cube_r61 = leftFace.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(32, 55).addBox(0.05F, -0.2572F, -0.2314F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(10, 55).addBox(-0.15F, -0.2572F, -0.7314F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(54, 54).addBox(-0.15F, -0.2572F, -0.2314F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(-1.0F, 0.55F, -4.325F, 1.9548F, 0.0F, 0.0F));

		PartDefinition cube_r62 = leftFace.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(5, 53).addBox(-0.75F, -1.7249F, -0.2658F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.246F))
				.texOffs(0, 56).addBox(-0.75F, -1.7249F, -0.0158F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.025F, 1.25F, -3.5F, 1.4748F, 0.096F, 0.0F));

		PartDefinition cube_r63 = leftFace.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(56, 9).addBox(-0.7519F, -1.5102F, 0.361F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.075F, 1.175F, -4.475F, 1.7366F, 0.1091F, 0.0F));

		PartDefinition cube_r64 = leftFace.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(49, 52).addBox(-0.75F, -0.7599F, 0.7267F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(52, 46).addBox(-0.75F, -0.7599F, 0.2267F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(0.025F, 1.25F, -3.5F, 1.9548F, 0.096F, 0.0F));

		PartDefinition cube_r65 = leftFace.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(37, 5).addBox(-1.5F, -0.2409F, -1.7444F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.246F)), PartPose.offsetAndRotation(0.0F, -1.075F, -0.475F, 0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r66 = leftFace.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(36, 35).addBox(-1.5F, -0.2635F, -1.7612F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.255F)), PartPose.offsetAndRotation(0.0F, -1.125F, -0.95F, 1.501F, 0.0F, 0.0F));

		PartDefinition cube_r67 = leftFace.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(27, 35).addBox(-1.5F, -0.2558F, -1.714F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.246F)), PartPose.offsetAndRotation(0.0F, -1.025F, -1.45F, 1.6755F, 0.0F, 0.0F));

		PartDefinition cube_r68 = leftFace.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(35, 18).addBox(-1.5F, -0.4518F, -1.7222F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, -0.975F, -1.75F, 1.7628F, 0.0F, 0.0F));

		PartDefinition cube_r69 = leftFace.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(22, 51).addBox(-0.8F, -2.598F, -0.5857F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.45F, 0.475F, -8.325F, 1.6069F, 0.0431F, 0.0036F));

		PartDefinition cube_r70 = leftFace.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(7, 47).addBox(-0.8F, -2.9228F, -0.6747F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(-0.45F, 0.475F, -8.325F, 1.572F, 0.0431F, 0.0036F));

		PartDefinition cube_r71 = leftFace.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(17, 51).addBox(-0.5F, -0.2953F, -0.652F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.7F, 0.45F, -8.3F, 1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r72 = leftFace.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(0, 51).addBox(-0.5F, -5.1498F, -0.3158F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(52, 23).addBox(-0.45F, -2.7249F, -0.2658F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(-0.7F, 1.25F, -3.5F, 1.4748F, 0.0F, 0.0F));

		PartDefinition cube_r73 = leftFace.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(15, 56).addBox(-0.5F, -0.2697F, -0.7337F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.65F, 0.3F, -5.875F, 1.7366F, 0.0F, 0.0F));

		PartDefinition cube_r74 = leftFace.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(39, 52).addBox(-0.5F, -0.4354F, 0.2047F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.246F)), PartPose.offsetAndRotation(-0.65F, 1.25F, -5.8F, 1.4748F, 0.0F, 0.0F));

		PartDefinition cube_r75 = leftFace.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(9, 38).addBox(-1.5F, 0.175F, -1.7F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.244F))
				.texOffs(0, 38).addBox(-1.5F, -0.825F, -1.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.242F))
				.texOffs(37, 14).addBox(-1.5F, -0.325F, -1.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.245F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r76 = leftFace.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(21, 48).addBox(-1.5F, -0.2714F, -0.7805F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(0.0F, -0.475F, 0.475F, -0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r77 = leftFace.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(53, 5).addBox(-0.6F, -0.6873F, -0.8465F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.246F)), PartPose.offsetAndRotation(0.1F, 0.1595F, 0.3601F, 0.0785F, 0.0F, 0.0F));

		PartDefinition leftFace2 = Head.addOrReplaceChild("leftFace2", CubeListBuilder.create(), PartPose.offset(-0.9F, -0.0595F, -0.2601F));

		PartDefinition cube_r78 = leftFace2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(5, 60).mirror().addBox(-0.35F, 2.05F, -0.4875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(62, 19).mirror().addBox(-0.35F, 1.45F, -0.4875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(25, 63).mirror().addBox(-0.35F, 0.85F, -0.4875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(50, 70).mirror().addBox(-0.35F, 0.25F, -0.4875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(25, 66).mirror().addBox(-0.35F, -0.35F, -0.5125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.2984F, 1.0381F, -6.009F, 1.483F, -0.1131F, 0.0069F));

		PartDefinition cube_r79 = leftFace2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(20, 72).mirror().addBox(-0.35F, 1.45F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(72, 18).mirror().addBox(-0.35F, 0.85F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(63, 39).mirror().addBox(-0.35F, 0.25F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(20, 63).mirror().addBox(-0.35F, -0.35F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.5282F, 0.8666F, -8.3921F, 1.4832F, -0.0958F, 0.0053F));

		PartDefinition cube_r80 = leftFace2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(0, 72).mirror().addBox(-0.2742F, -0.9854F, -0.9462F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(72, 28).mirror().addBox(-0.2742F, -1.5854F, -0.9962F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.45F, 0.475F, -8.325F, 1.4848F, -0.078F, -0.0037F));

		PartDefinition cube_r81 = leftFace2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(72, 15).mirror().addBox(-0.2742F, -2.2245F, -0.8997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(72, 21).mirror().addBox(-0.2742F, -2.8245F, -0.8997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(47, 22).mirror().addBox(-0.2991F, -2.9237F, -0.6747F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.347F)).mirror(false), PartPose.offsetAndRotation(0.45F, 0.475F, -8.325F, 1.572F, -0.078F, -0.0037F));

		PartDefinition cube_r82 = leftFace2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(44, 56).mirror().addBox(-0.2625F, -1.0772F, -0.1021F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.356F)).mirror(false)
				.texOffs(25, 56).mirror().addBox(-0.2625F, -0.9772F, 0.1979F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.355F)).mirror(false), PartPose.offsetAndRotation(-0.3625F, 0.1923F, -1.7394F, 2.2951F, -0.1222F, 0.0F));

		PartDefinition cube_r83 = leftFace2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(46, 5).mirror().addBox(-0.2625F, -1.0086F, -1.1963F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.354F)).mirror(false)
				.texOffs(45, 37).mirror().addBox(-0.2625F, -1.3086F, -1.1963F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.3625F, 0.1923F, -1.7394F, 1.8064F, -0.1222F, 0.0F));

		PartDefinition cube_r84 = leftFace2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(0, 42).mirror().addBox(-0.1375F, -1.8794F, -1.5159F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.246F)).mirror(false), PartPose.offsetAndRotation(-0.3625F, 0.1923F, -1.7394F, 1.4573F, -0.1222F, 0.0F));

		PartDefinition cube_r85 = leftFace2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(40, 22).mirror().addBox(-0.1375F, -1.6956F, -0.4876F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.3625F, 0.1923F, -1.7394F, 2.0377F, -0.1222F, 0.0F));

		PartDefinition cube_r86 = leftFace2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(18, 41).mirror().addBox(-0.1375F, -0.2794F, -0.3159F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.2733F, 1.3167F, -2.466F, 1.4579F, -0.0701F, -0.0059F));

		PartDefinition cube_r87 = leftFace2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(44, 18).mirror().addBox(-0.1375F, -0.6911F, -0.5564F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(-0.3625F, 0.1923F, -1.7394F, 1.6319F, -0.1222F, 0.0F));

		PartDefinition cube_r88 = leftFace2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(0, 33).mirror().addBox(-1.3F, -0.85F, -1.175F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)).mirror(false)
				.texOffs(34, 42).mirror().addBox(-1.025F, -0.85F, -1.175F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.375F, 0.1647F, -1.3311F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r89 = leftFace2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(62, 16).mirror().addBox(-0.3272F, -0.893F, 0.4891F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(10, 62).mirror().addBox(-0.3272F, -1.193F, 0.4891F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.025F, 1.25F, -3.5F, 1.7358F, -0.0843F, -0.0359F));

		PartDefinition cube_r90 = leftFace2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(44, 9).mirror().addBox(-0.5F, -1.6523F, -0.3639F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.125F, -0.7083F, -0.5191F, -2.9234F, 0.0F, 0.0F));

		PartDefinition cube_r91 = leftFace2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(44, 0).mirror().addBox(-0.5F, -1.6523F, -1.6639F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.347F)).mirror(false), PartPose.offsetAndRotation(-0.125F, -0.9005F, -1.8048F, 2.9932F, 0.0F, 0.0F));

		PartDefinition cube_r92 = leftFace2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(41, 42).mirror().addBox(-0.5F, -1.6605F, -0.3963F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.347F)).mirror(false), PartPose.offsetAndRotation(-0.125F, 1.375F, -1.175F, 1.431F, -0.0518F, 0.0073F));

		PartDefinition cube_r93 = leftFace2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(7, 42).mirror().addBox(-0.5F, -1.9281F, -1.5407F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.354F)).mirror(false)
				.texOffs(29, 30).mirror().addBox(-0.375F, -1.7782F, -1.3657F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.256F)).mirror(false), PartPose.offsetAndRotation(-0.125F, 0.9F, -0.1F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r94 = leftFace2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(51, 0).mirror().addBox(-0.2991F, -2.5989F, -0.5857F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.45F, 0.475F, -8.325F, 1.6069F, -0.078F, -0.0037F));

		PartDefinition cube_r95 = leftFace2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(20, 56).mirror().addBox(-0.2481F, -1.7513F, 0.0026F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false)
				.texOffs(54, 50).mirror().addBox(-0.2481F, -1.7513F, -0.2474F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.075F, 1.175F, -4.475F, 1.4748F, -0.1091F, 0.0F));

		PartDefinition cube_r96 = leftFace2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(52, 18).mirror().addBox(-0.25F, -2.6422F, -0.2752F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(0.2F, 1.05F, -5.975F, 1.4748F, -0.1091F, 0.0F));

		PartDefinition cube_r97 = leftFace2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(27, 51).mirror().addBox(-0.25F, -2.5669F, 0.0477F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2F, 1.05F, -5.975F, 1.6144F, -0.1091F, 0.0F));

		PartDefinition cube_r98 = leftFace2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(32, 55).mirror().addBox(-1.05F, -0.2572F, -0.2314F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(10, 55).mirror().addBox(-0.85F, -0.2572F, -0.7314F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(54, 54).mirror().addBox(-0.85F, -0.2572F, -0.2314F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(1.0F, 0.55F, -4.325F, 1.9548F, 0.0F, 0.0F));

		PartDefinition cube_r99 = leftFace2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(5, 53).mirror().addBox(-0.25F, -1.7249F, -0.2658F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.246F)).mirror(false)
				.texOffs(0, 56).mirror().addBox(-0.25F, -1.7249F, -0.0158F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.025F, 1.25F, -3.5F, 1.4748F, -0.096F, 0.0F));

		PartDefinition cube_r100 = leftFace2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(56, 9).mirror().addBox(-0.2481F, -1.5102F, 0.361F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.075F, 1.175F, -4.475F, 1.7366F, -0.1091F, 0.0F));

		PartDefinition cube_r101 = leftFace2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(49, 52).mirror().addBox(-0.25F, -0.7599F, 0.7267F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(52, 46).mirror().addBox(-0.25F, -0.7599F, 0.2267F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(-0.025F, 1.25F, -3.5F, 1.9548F, -0.096F, 0.0F));

		PartDefinition cube_r102 = leftFace2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(37, 5).mirror().addBox(-0.5F, -0.2409F, -1.7444F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.256F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.075F, -0.475F, 0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r103 = leftFace2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(36, 35).mirror().addBox(-0.5F, -0.2635F, -1.7612F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.245F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.125F, -0.95F, 1.501F, 0.0F, 0.0F));

		PartDefinition cube_r104 = leftFace2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(27, 35).mirror().addBox(-0.5F, -0.2558F, -1.714F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.256F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.025F, -1.45F, 1.6755F, 0.0F, 0.0F));

		PartDefinition cube_r105 = leftFace2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(35, 18).mirror().addBox(-0.5F, -0.4518F, -1.7222F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.245F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.975F, -1.75F, 1.7628F, 0.0F, 0.0F));

		PartDefinition cube_r106 = leftFace2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(22, 51).mirror().addBox(-0.2F, -2.598F, -0.5857F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.45F, 0.475F, -8.325F, 1.6069F, -0.0431F, -0.0036F));

		PartDefinition cube_r107 = leftFace2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(7, 47).mirror().addBox(-0.2F, -2.9228F, -0.6747F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.353F)).mirror(false), PartPose.offsetAndRotation(0.45F, 0.475F, -8.325F, 1.572F, -0.0431F, -0.0036F));

		PartDefinition cube_r108 = leftFace2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(17, 51).mirror().addBox(-0.5F, -0.2953F, -0.652F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.7F, 0.45F, -8.3F, 1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r109 = leftFace2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(0, 51).mirror().addBox(-0.5F, -5.1498F, -0.3158F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(52, 23).mirror().addBox(-0.55F, -2.7249F, -0.2658F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(0.7F, 1.25F, -3.5F, 1.4748F, 0.0F, 0.0F));

		PartDefinition cube_r110 = leftFace2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(15, 56).mirror().addBox(-0.5F, -0.2697F, -0.7337F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.65F, 0.3F, -5.875F, 1.7366F, 0.0F, 0.0F));

		PartDefinition cube_r111 = leftFace2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(39, 52).mirror().addBox(-0.5F, -0.4354F, 0.2047F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.246F)).mirror(false), PartPose.offsetAndRotation(0.65F, 1.25F, -5.8F, 1.4748F, 0.0F, 0.0F));

		PartDefinition cube_r112 = leftFace2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(9, 38).mirror().addBox(-0.5F, 0.175F, -1.7F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.244F)).mirror(false)
				.texOffs(0, 38).mirror().addBox(-0.5F, -0.825F, -1.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.24F)).mirror(false)
				.texOffs(37, 14).mirror().addBox(-0.5F, -0.325F, -1.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.247F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r113 = leftFace2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(21, 48).mirror().addBox(-0.5F, -0.2714F, -0.7805F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.245F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.475F, 0.475F, -0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r114 = leftFace2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(53, 5).mirror().addBox(-0.4F, -0.6873F, -0.8465F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.246F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.1595F, 0.3601F, 0.0785F, 0.0F, 0.0F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1456F, -0.2358F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r115 = Jaw.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(37, 57).mirror().addBox(-0.2F, -0.3558F, -0.3224F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(-1.175F, -0.025F, -0.2F, -1.1345F, -0.0698F, 0.0F));

		PartDefinition cube_r116 = Jaw.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(54, 58).mirror().addBox(-0.2F, -0.3657F, -0.2514F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(58, 41).mirror().addBox(-0.2F, -0.3657F, 0.1486F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)).mirror(false), PartPose.offsetAndRotation(-1.175F, -0.025F, -0.2F, -0.3491F, -0.0698F, 0.0F));

		PartDefinition cube_r117 = Jaw.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(57, 32).mirror().addBox(-0.2F, -0.5718F, -1.0406F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false)
				.texOffs(58, 4).mirror().addBox(-0.2F, -1.0718F, -1.0406F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.175F, -0.025F, -0.2F, 1.5272F, -0.0698F, 0.0F));

		PartDefinition cube_r118 = Jaw.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(64, 47).mirror().addBox(-0.2F, -3.6597F, -1.5162F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(56, 0).mirror().addBox(-0.2F, -3.1597F, -1.5162F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.175F, -0.025F, -0.2F, 1.1301F, -0.0698F, 0.0F));

		PartDefinition cube_r119 = Jaw.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(37, 47).mirror().addBox(-0.2622F, -2.667F, -0.8248F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.925F, -0.825F, -3.6F, 1.1214F, -0.1222F, 0.0F));

		PartDefinition cube_r120 = Jaw.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(47, 47).mirror().addBox(-0.3419F, -2.6222F, -0.7219F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.347F)).mirror(false), PartPose.offsetAndRotation(-0.625F, -1.725F, -5.8F, 1.1912F, -0.1047F, 0.0F));

		PartDefinition cube_r121 = Jaw.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(59, 48).mirror().addBox(-0.3252F, -0.5935F, -0.3315F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(32, 47).mirror().addBox(-0.3252F, -2.7935F, -0.3315F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -2.225F, -8.1F, 1.1999F, -0.0611F, 0.0F));

		PartDefinition cube_r122 = Jaw.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(15, 63).mirror().addBox(-0.2872F, -1.1996F, -0.5227F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(66, 0).mirror().addBox(-0.2872F, -1.7995F, -0.5227F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(0, 66).mirror().addBox(-0.2872F, -2.3995F, -0.5477F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.925F, -0.825F, -3.6F, 1.1432F, -0.1222F, 0.0F));

		PartDefinition cube_r123 = Jaw.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(64, 65).mirror().addBox(-0.3169F, -0.6061F, -0.471F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(45, 65).mirror().addBox(-0.3169F, -1.2061F, -0.471F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(25, 72).mirror().addBox(-0.3169F, -2.4038F, -0.5733F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.625F, -1.725F, -5.8F, 1.1432F, -0.1047F, 0.0F));

		PartDefinition cube_r124 = Jaw.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(30, 65).mirror().addBox(-0.3169F, -1.8008F, -0.4096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.625F, -1.725F, -5.8F, 1.2305F, -0.1047F, 0.0F));

		PartDefinition cube_r125 = Jaw.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(70, 66).mirror().addBox(-0.3002F, -0.6577F, -0.107F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(40, 63).mirror().addBox(-0.3002F, -1.2576F, -0.107F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(10, 65).mirror().addBox(-0.3002F, -1.8576F, -0.107F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(49, 59).mirror().addBox(-0.3002F, -2.4576F, -0.107F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(12, 50).mirror().addBox(-0.3252F, -2.5826F, -0.257F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.347F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -2.225F, -8.1F, 1.2305F, -0.0611F, 0.0F));

		PartDefinition cube_r126 = Jaw.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(52, 32).mirror().addBox(-0.3419F, -2.6292F, -0.5973F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.625F, -1.725F, -5.8F, 1.213F, -0.1047F, 0.0F));

		PartDefinition cube_r127 = Jaw.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(51, 9).mirror().addBox(-0.2622F, -2.6991F, -0.5928F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.305F)).mirror(false), PartPose.offsetAndRotation(-0.925F, -0.825F, -3.6F, 1.213F, -0.1222F, 0.0F));

		PartDefinition cube_r128 = Jaw.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(48, 41).mirror().addBox(-0.2F, -3.7261F, -1.2548F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.247F)).mirror(false), PartPose.offsetAndRotation(-1.175F, -0.025F, -0.2F, 1.165F, -0.0698F, 0.0F));

		PartDefinition cube_r129 = Jaw.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(57, 24).mirror().addBox(-0.2F, -1.8244F, -1.3018F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(-1.175F, -0.025F, -0.2F, 1.2654F, -0.0698F, 0.0F));

		PartDefinition cube_r130 = Jaw.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(57, 18).mirror().addBox(-0.2F, -1.4907F, -1.0993F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(5, 57).mirror().addBox(-0.2F, -1.4407F, -0.9493F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(-1.175F, -0.025F, -0.2F, 1.4399F, -0.0698F, 0.0F));

		PartDefinition cube_r131 = Jaw.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(58, 13).mirror().addBox(-0.2F, -1.0516F, -0.8187F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)).mirror(false), PartPose.offsetAndRotation(-1.175F, -0.025F, -0.2F, 1.6144F, -0.0698F, 0.0F));

		PartDefinition cube_r132 = Jaw.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(57, 38).mirror().addBox(-0.2F, 0.0238F, -0.4909F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(-1.175F, -0.025F, -0.2F, 0.48F, -0.0698F, 0.0F));

		PartDefinition cube_r133 = Jaw.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(37, 57).addBox(-0.8F, -0.3558F, -0.3224F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(1.175F, -0.025F, -0.2F, -1.1345F, 0.0698F, 0.0F));

		PartDefinition cube_r134 = Jaw.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(54, 58).addBox(-0.8F, -0.3657F, -0.2514F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(58, 41).addBox(-0.8F, -0.3657F, 0.1486F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)), PartPose.offsetAndRotation(1.175F, -0.025F, -0.2F, -0.3491F, 0.0698F, 0.0F));

		PartDefinition cube_r135 = Jaw.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(57, 32).addBox(-0.8F, -0.5718F, -1.0406F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F))
				.texOffs(58, 4).addBox(-0.8F, -1.0718F, -1.0406F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.175F, -0.025F, -0.2F, 1.5272F, 0.0698F, 0.0F));

		PartDefinition cube_r136 = Jaw.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(64, 47).addBox(-0.8F, -3.6597F, -1.5162F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(56, 0).addBox(-0.8F, -3.1597F, -1.5162F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.175F, -0.025F, -0.2F, 1.1301F, 0.0698F, 0.0F));

		PartDefinition cube_r137 = Jaw.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(37, 47).addBox(-0.7378F, -2.667F, -0.8248F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.925F, -0.825F, -3.6F, 1.1214F, 0.1222F, 0.0F));

		PartDefinition cube_r138 = Jaw.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(47, 47).addBox(-0.6581F, -2.6222F, -0.7219F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.347F)), PartPose.offsetAndRotation(0.625F, -1.725F, -5.8F, 1.1912F, 0.1047F, 0.0F));

		PartDefinition cube_r139 = Jaw.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(59, 48).addBox(-0.6748F, -0.5935F, -0.3315F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(32, 47).addBox(-0.6748F, -2.7935F, -0.3315F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.4F, -2.225F, -8.1F, 1.1999F, 0.0611F, 0.0F));

		PartDefinition cube_r140 = Jaw.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(15, 63).addBox(-0.7128F, -1.1996F, -0.5227F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(66, 0).addBox(-0.7128F, -1.7995F, -0.5227F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(0, 66).addBox(-0.7128F, -2.3995F, -0.5477F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.925F, -0.825F, -3.6F, 1.1432F, 0.1222F, 0.0F));

		PartDefinition cube_r141 = Jaw.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(64, 65).addBox(-0.6831F, -0.6061F, -0.471F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(45, 65).addBox(-0.6831F, -1.2061F, -0.471F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(25, 72).addBox(-0.6831F, -2.4038F, -0.5733F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.625F, -1.725F, -5.8F, 1.1432F, 0.1047F, 0.0F));

		PartDefinition cube_r142 = Jaw.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(30, 65).addBox(-0.6831F, -1.8008F, -0.4096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.625F, -1.725F, -5.8F, 1.2305F, 0.1047F, 0.0F));

		PartDefinition cube_r143 = Jaw.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(70, 66).addBox(-0.6998F, -0.6577F, -0.107F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(40, 63).addBox(-0.6998F, -1.2576F, -0.107F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(10, 65).addBox(-0.6998F, -1.8576F, -0.107F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(49, 59).addBox(-0.6998F, -2.4576F, -0.107F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(12, 50).addBox(-0.6748F, -2.5826F, -0.257F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.347F)), PartPose.offsetAndRotation(0.4F, -2.225F, -8.1F, 1.2305F, 0.0611F, 0.0F));

		PartDefinition cube_r144 = Jaw.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(52, 32).addBox(-0.6581F, -2.6292F, -0.5973F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.625F, -1.725F, -5.8F, 1.213F, 0.1047F, 0.0F));

		PartDefinition cube_r145 = Jaw.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(51, 9).addBox(-0.7378F, -2.6991F, -0.5928F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.305F)), PartPose.offsetAndRotation(0.925F, -0.825F, -3.6F, 1.213F, 0.1222F, 0.0F));

		PartDefinition cube_r146 = Jaw.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(48, 41).addBox(-0.8F, -3.7261F, -1.2548F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.247F)), PartPose.offsetAndRotation(1.175F, -0.025F, -0.2F, 1.165F, 0.0698F, 0.0F));

		PartDefinition cube_r147 = Jaw.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(57, 24).addBox(-0.8F, -1.8244F, -1.3018F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(1.175F, -0.025F, -0.2F, 1.2654F, 0.0698F, 0.0F));

		PartDefinition cube_r148 = Jaw.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(57, 18).addBox(-0.8F, -1.4907F, -1.0993F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(5, 57).addBox(-0.8F, -1.4407F, -0.9493F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(1.175F, -0.025F, -0.2F, 1.4399F, 0.0698F, 0.0F));

		PartDefinition cube_r149 = Jaw.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(58, 13).addBox(-0.8F, -1.0516F, -0.8187F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)), PartPose.offsetAndRotation(1.175F, -0.025F, -0.2F, 1.6144F, 0.0698F, 0.0F));

		PartDefinition cube_r150 = Jaw.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(57, 38).addBox(-0.8F, 0.0238F, -0.4909F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(1.175F, -0.025F, -0.2F, 0.48F, 0.0698F, 0.0F));

		PartDefinition bone2 = Body1.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.4F, 1.2148F, 1.347F, 0.0F, 0.1309F, -0.2182F));

		PartDefinition cube_r151 = bone2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(59, 51).addBox(-0.3F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.0F, -0.8466F, 1.7614F, 1.5167F, 0.0F, 0.0F));

		PartDefinition cube_r152 = bone2.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(59, 54).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.2F, -0.2847F, 1.3814F, 2.5465F, 0.0F, 0.0F));

		PartDefinition cube_r153 = bone2.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(30, 62).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2F, -0.8644F, 0.7618F, 1.604F, 0.0F, 0.0F));

		PartDefinition cube_r154 = bone2.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(59, 57).addBox(-0.5F, -0.2F, -2.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F))
				.texOffs(25, 44).addBox(-0.5F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.2F, -0.67F, 0.1941F, 1.9007F, 0.0F, 0.0F));

		PartDefinition cube_r155 = bone2.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(44, 52).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.0766F, -0.6107F, 0.6354F, 0.0F, 0.0F));

		PartDefinition cube_r156 = bone2.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(62, 22).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 60).addBox(-0.5F, 0.0F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.0F, 0.491F, -0.3144F, -0.1937F, 0.0F, 0.0F));

		PartDefinition cube_r157 = bone2.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(62, 30).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5878F, 0.0819F, 0.0245F, 0.0F, 0.0F));

		PartDefinition cube_r158 = bone2.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(42, 47).addBox(-0.5F, -0.7081F, -0.0538F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4468F, 1.9987F, 0.6963F, 1.4693F, 0.1313F, 1.2238F));

		PartDefinition cube_r159 = bone2.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(35, 66).addBox(-0.5F, -1.2626F, -0.2203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.4468F, 1.9987F, 0.6963F, 1.1202F, 0.1313F, 1.2238F));

		PartDefinition bone3 = Body1.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.4F, 1.2148F, 1.347F, 0.0F, -0.1309F, 0.2182F));

		PartDefinition cube_r160 = bone3.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(59, 51).mirror().addBox(-0.7F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.8466F, 1.7614F, 1.5167F, 0.0F, 0.0F));

		PartDefinition cube_r161 = bone3.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(59, 54).mirror().addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.2847F, 1.3814F, 2.5465F, 0.0F, 0.0F));

		PartDefinition cube_r162 = bone3.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(30, 62).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.8644F, 0.7618F, 1.604F, 0.0F, 0.0F));

		PartDefinition cube_r163 = bone3.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(59, 57).mirror().addBox(-0.5F, -0.2F, -2.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(25, 44).mirror().addBox(-0.5F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.67F, 0.1941F, 1.9007F, 0.0F, 0.0F));

		PartDefinition cube_r164 = bone3.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(44, 52).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0766F, -0.6107F, 0.6354F, 0.0F, 0.0F));

		PartDefinition cube_r165 = bone3.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(62, 22).mirror().addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(15, 60).mirror().addBox(-0.5F, 0.0F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.491F, -0.3144F, -0.1937F, 0.0F, 0.0F));

		PartDefinition cube_r166 = bone3.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(62, 30).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.5878F, 0.0819F, 0.0245F, 0.0F, 0.0F));

		PartDefinition cube_r167 = bone3.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(42, 47).mirror().addBox(-0.5F, -0.7081F, -0.0538F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4468F, 1.9987F, 0.6963F, 1.4693F, -0.1313F, -1.2238F));

		PartDefinition cube_r168 = bone3.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(35, 66).mirror().addBox(-0.5F, -1.2626F, -0.2203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.4468F, 1.9987F, 0.6963F, 1.1202F, -0.1313F, -1.2238F));

		PartDefinition ForelimbsL = Body1.addOrReplaceChild("ForelimbsL", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3404F, 1.9693F, 2.0419F, -0.1598F, -0.017F, -0.3767F));

		PartDefinition cube_r169 = ForelimbsL.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(22, 24).addBox(0.0F, -2.5F, -1.5F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.762F, 3.8455F, 2.0533F, 2.8337F, -0.3142F, 2.3704F));

		PartDefinition cube_r170 = ForelimbsL.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(30, 71).addBox(-0.5F, -0.3F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(10, 71).addBox(-0.5F, -0.6F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.8116F, 1.6698F, 2.0919F, 0.0025F, 0.3142F, -0.7711F));

		PartDefinition cube_r171 = ForelimbsL.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(71, 9).addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4899F, 1.59F, 1.5532F, 0.7879F, 0.3142F, -0.7711F));

		PartDefinition cube_r172 = ForelimbsL.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(59, 27).addBox(-0.5F, 0.0F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(10, 59).addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.4899F, 2.0549F, 0.5563F, 0.0461F, 0.3142F, -0.7711F));

		PartDefinition cube_r173 = ForelimbsL.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(46, 14).addBox(-0.9F, 0.4F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F))
				.texOffs(52, 37).addBox(-0.9F, -0.6F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.3F, 0.4F, 0.3079F, 0.3142F, -0.7711F));

		PartDefinition ForelimbsL2 = Body1.addOrReplaceChild("ForelimbsL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.3404F, 1.9693F, 2.0419F, -0.159F, 0.0239F, 0.4198F));

		PartDefinition cube_r174 = ForelimbsL2.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(22, 24).mirror().addBox(0.0F, -2.5F, -1.5F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.762F, 3.8455F, 2.0533F, 2.8337F, 0.3142F, -2.3704F));

		PartDefinition cube_r175 = ForelimbsL2.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(30, 71).mirror().addBox(-0.5F, -0.3F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(10, 71).mirror().addBox(-0.5F, -0.6F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.8116F, 1.6698F, 2.0919F, 0.0025F, -0.3142F, 0.7711F));

		PartDefinition cube_r176 = ForelimbsL2.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(71, 9).mirror().addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4899F, 1.59F, 1.5532F, 0.7879F, -0.3142F, 0.7711F));

		PartDefinition cube_r177 = ForelimbsL2.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(59, 27).mirror().addBox(-0.5F, 0.0F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(10, 59).mirror().addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.4899F, 2.0549F, 0.5563F, 0.0461F, -0.3142F, 0.7711F));

		PartDefinition cube_r178 = ForelimbsL2.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(46, 14).mirror().addBox(-0.1F, 0.4F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(52, 37).mirror().addBox(-0.1F, -0.6F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.3F, 0.4F, 0.3079F, -0.3142F, 0.7711F));

		PartDefinition Body2 = Body1.addOrReplaceChild("Body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.7228F, 5.5026F, 0.1571F, -0.3054F, 0.0F));

		PartDefinition cube_r179 = Body2.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(5, 72).addBox(-0.8F, -1.3147F, -0.1301F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(15, 72).addBox(-0.8F, -0.8147F, -0.1301F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0105F, 2.0006F, -0.1789F, 0.0F, 0.0F));

		PartDefinition cube_r180 = Body2.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(67, 42).addBox(-0.8F, -1.4383F, -0.1677F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(67, 34).addBox(-0.8F, -0.8383F, -0.1677F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2355F, 0.0506F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r181 = Body2.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(11, 24).addBox(-0.5F, -0.4F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(0.0F, -0.0105F, -0.0494F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r182 = Body2.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(62, 33).mirror().addBox(-0.85F, -0.125F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 0.3706F, 2.2905F, 0.0153F, 0.0085F, -0.3665F));

		PartDefinition cube_r183 = Body2.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(25, 60).mirror().addBox(-1.4943F, -0.3985F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 0.3706F, 2.2905F, 0.0107F, 0.0138F, -0.7679F));

		PartDefinition cube_r184 = Body2.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(26, 15).mirror().addBox(-4.8932F, -1.016F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(20, 60).mirror().addBox(-5.0932F, -1.016F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 0.3706F, 2.2905F, 0.0027F, 0.0172F, -1.2741F));

		PartDefinition cube_r185 = Body2.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(64, 56).mirror().addBox(-5.1932F, -1.016F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(11, 30).mirror().addBox(-4.8932F, -1.016F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 0.0706F, 0.2904F, 0.0082F, 0.0517F, -1.3088F));

		PartDefinition cube_r186 = Body2.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(64, 53).mirror().addBox(-1.4943F, -0.3985F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 0.0706F, 0.2904F, 0.0323F, 0.0413F, -0.8022F));

		PartDefinition cube_r187 = Body2.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(66, 9).mirror().addBox(-0.85F, -0.125F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 0.0706F, 0.2904F, 0.0458F, 0.0254F, -0.4008F));

		PartDefinition cube_r188 = Body2.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(20, 60).addBox(4.0932F, -1.016F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(26, 15).addBox(0.8932F, -1.016F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.35F, 0.3706F, 2.2905F, 0.0027F, -0.0172F, 1.2741F));

		PartDefinition cube_r189 = Body2.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(25, 60).addBox(0.4944F, -0.3985F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.35F, 0.3706F, 2.2905F, 0.0107F, -0.0138F, 0.7679F));

		PartDefinition cube_r190 = Body2.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(62, 33).addBox(-0.15F, -0.125F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.35F, 0.3706F, 2.2905F, 0.0153F, -0.0085F, 0.3665F));

		PartDefinition cube_r191 = Body2.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(66, 9).addBox(-0.15F, -0.125F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.35F, 0.0706F, 0.2904F, 0.0458F, -0.0254F, 0.4008F));

		PartDefinition cube_r192 = Body2.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(64, 53).addBox(0.4944F, -0.3985F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.35F, 0.0706F, 0.2904F, 0.0323F, -0.0413F, 0.8022F));

		PartDefinition cube_r193 = Body2.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(64, 56).addBox(4.1932F, -1.016F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(11, 30).addBox(0.8932F, -1.016F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.35F, 0.0706F, 0.2904F, 0.0082F, -0.0517F, 1.3088F));

		PartDefinition cube_r194 = Body2.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(0, 26).addBox(-1.5F, -0.7533F, -1.5672F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.9895F, 1.9506F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r195 = Body2.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(26, 6).addBox(-1.5F, -1.0054F, -1.9736F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 6.3645F, 4.3006F, -0.0393F, 0.0F, 0.0F));

		PartDefinition Body3 = Body2.addOrReplaceChild("Body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5582F, 3.6772F, -0.1373F, -0.1729F, 0.0238F));

		PartDefinition cube_r196 = Body3.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(13, 13).addBox(-1.5F, -0.5015F, -2.5228F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.6622F, 3.7914F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r197 = Body3.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(10, 68).addBox(-0.8F, -0.7848F, -0.1568F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(68, 12).addBox(-0.8F, -1.3348F, -0.1568F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, -0.1378F, 1.9914F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r198 = Body3.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(30, 59).mirror().addBox(-4.3932F, -1.016F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(18, 38).mirror().addBox(-3.8932F, -1.016F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 0.2124F, 2.3133F, 0.0276F, 0.1724F, -1.2892F));

		PartDefinition cube_r199 = Body3.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(40, 60).mirror().addBox(-1.4943F, -0.3985F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 0.2124F, 2.3133F, 0.1081F, 0.1373F, -0.778F));

		PartDefinition cube_r200 = Body3.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(62, 44).mirror().addBox(-0.85F, -0.125F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 0.2124F, 2.3133F, 0.153F, 0.0843F, -0.3775F));

		PartDefinition cube_r201 = Body3.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(29, 24).mirror().addBox(-4.8932F, -1.016F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 0.0124F, 0.3133F, 0.0248F, 0.1551F, -1.2722F));

		PartDefinition cube_r202 = Body3.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(35, 60).mirror().addBox(-1.4943F, -0.3985F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 0.0124F, 0.3133F, 0.0972F, 0.1236F, -0.7619F));

		PartDefinition cube_r203 = Body3.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(62, 36).mirror().addBox(-0.85F, -0.125F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 0.0124F, 0.3133F, 0.1377F, 0.0759F, -0.3613F));

		PartDefinition cube_r204 = Body3.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(62, 44).addBox(-0.15F, -0.125F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.35F, 0.2124F, 2.3133F, 0.153F, -0.0843F, 0.3775F));

		PartDefinition cube_r205 = Body3.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(40, 60).addBox(0.4944F, -0.3985F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.35F, 0.2124F, 2.3133F, 0.1081F, -0.1373F, 0.778F));

		PartDefinition cube_r206 = Body3.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(30, 59).addBox(3.3932F, -1.016F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(18, 38).addBox(0.8932F, -1.016F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.35F, 0.2124F, 2.3133F, 0.0276F, -0.1724F, 1.2892F));

		PartDefinition cube_r207 = Body3.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(29, 24).addBox(0.8932F, -1.016F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.35F, 0.0124F, 0.3133F, 0.0248F, -0.1551F, 1.2722F));

		PartDefinition cube_r208 = Body3.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(35, 60).addBox(0.4944F, -0.3985F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.35F, 0.0124F, 0.3133F, 0.0972F, -0.1236F, 0.7619F));

		PartDefinition cube_r209 = Body3.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(62, 36).addBox(-0.15F, -0.125F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.35F, 0.0124F, 0.3133F, 0.1377F, -0.0759F, 0.3613F));

		PartDefinition cube_r210 = Body3.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(68, 3).addBox(-0.8F, -1.2847F, -0.1513F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(50, 67).addBox(-0.8F, -0.7847F, -0.1513F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2878F, -0.0086F, -0.0654F, 0.0F, 0.0F));

		PartDefinition cube_r211 = Body3.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(24, 18).addBox(-0.5F, -0.7F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2622F, -0.2086F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Body4 = Body3.addOrReplaceChild("Body4", CubeListBuilder.create().texOffs(0, 20).addBox(-0.5F, -0.488F, -0.2244F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(0.0F, 0.4108F, 3.7152F, -0.0654F, -0.2618F, 0.0F));

		PartDefinition cube_r212 = Body4.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(30, 68).addBox(-0.8F, -1.25F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(68, 37).addBox(-0.8F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.338F, 1.9256F, -0.0393F, 0.0F, 0.0F));

		PartDefinition cube_r213 = Body4.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(60, 71).addBox(-0.8F, -1.325F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(45, 71).addBox(-0.8F, -0.825F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.363F, -0.0994F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r214 = Body4.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(61, 7).mirror().addBox(-0.85F, -0.125F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 0.0016F, 2.248F, 0.2925F, 0.1585F, -0.4827F));

		PartDefinition cube_r215 = Body4.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(61, 0).mirror().addBox(-1.4943F, -0.3985F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 0.0016F, 2.248F, 0.2089F, 0.2595F, -0.8802F));

		PartDefinition cube_r216 = Body4.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(40, 27).mirror().addBox(-2.8932F, -1.016F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 0.0016F, 2.248F, 0.0538F, 0.3274F, -1.4048F));

		PartDefinition cube_r217 = Body4.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(38, 30).mirror().addBox(-3.8932F, -1.016F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.35F, -0.0484F, 0.248F, 0.0448F, 0.2757F, -1.3551F));

		PartDefinition cube_r218 = Body4.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(59, 60).mirror().addBox(-1.4943F, -0.3985F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.35F, -0.0484F, 0.248F, 0.1747F, 0.219F, -0.836F));

		PartDefinition cube_r219 = Body4.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(45, 62).mirror().addBox(-0.85F, -0.125F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.35F, -0.0484F, 0.248F, 0.2457F, 0.134F, -0.4372F));

		PartDefinition cube_r220 = Body4.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(40, 27).addBox(0.8932F, -1.016F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.35F, 0.0016F, 2.248F, 0.0538F, -0.3274F, 1.4048F));

		PartDefinition cube_r221 = Body4.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(61, 0).addBox(0.4944F, -0.3985F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.35F, 0.0016F, 2.248F, 0.2089F, -0.2595F, 0.8802F));

		PartDefinition cube_r222 = Body4.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(61, 7).addBox(-0.15F, -0.125F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.35F, 0.0016F, 2.248F, 0.2925F, -0.1585F, 0.4827F));

		PartDefinition cube_r223 = Body4.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(45, 62).addBox(-0.15F, -0.125F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.35F, -0.0484F, 0.248F, 0.2457F, -0.134F, 0.4372F));

		PartDefinition cube_r224 = Body4.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(59, 60).addBox(0.4944F, -0.3985F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.35F, -0.0484F, 0.248F, 0.1747F, -0.219F, 0.836F));

		PartDefinition cube_r225 = Body4.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(38, 30).addBox(0.8932F, -1.016F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.35F, -0.0484F, 0.248F, 0.0448F, -0.2757F, 1.3551F));

		PartDefinition cube_r226 = Body4.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -0.4705F, -3.5731F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 2.612F, 3.9756F, 0.4363F, 0.0F, 0.0F));

		PartDefinition Body5 = Body4.addOrReplaceChild("Body5", CubeListBuilder.create().texOffs(18, 33).addBox(-0.5F, -0.4122F, -0.1746F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0804F, 3.6258F, 0.0352F, -0.1308F, -0.0046F));

		PartDefinition cube_r227 = Body5.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(69, 45).addBox(-0.8F, -1.025F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(65, 68).addBox(-0.8F, -0.875F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2372F, 1.9754F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r228 = Body5.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(60, 68).addBox(-0.8F, -1.2F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(45, 68).addBox(-0.8F, -0.875F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2372F, -0.0246F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r229 = Body5.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(63, 3).mirror().addBox(-0.85F, -0.125F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.15F, 0.082F, 2.2222F, 0.3555F, 0.1906F, -0.3671F));

		PartDefinition cube_r230 = Body5.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(54, 61).mirror().addBox(-1.4944F, -0.3985F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.15F, 0.082F, 2.2222F, 0.2556F, 0.313F, -0.7623F));

		PartDefinition cube_r231 = Body5.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(61, 10).mirror().addBox(-1.4943F, -0.3985F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 0.082F, 0.3222F, 0.2556F, 0.313F, -0.867F));

		PartDefinition cube_r232 = Body5.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(0, 60).mirror().addBox(-1.8932F, -1.016F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 0.082F, 0.3222F, 0.0663F, 0.3962F, -1.4004F));

		PartDefinition cube_r233 = Body5.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(0, 63).mirror().addBox(-0.85F, -0.125F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 0.082F, 0.3222F, 0.3555F, 0.1906F, -0.4718F));

		PartDefinition cube_r234 = Body5.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(54, 61).addBox(0.4943F, -0.3985F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.15F, 0.082F, 2.2222F, 0.2556F, -0.313F, 0.7623F));

		PartDefinition cube_r235 = Body5.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(63, 3).addBox(-0.15F, -0.125F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.15F, 0.082F, 2.2222F, 0.3555F, -0.1906F, 0.3671F));

		PartDefinition cube_r236 = Body5.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(0, 63).addBox(-0.15F, -0.125F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.35F, 0.082F, 0.3222F, 0.3555F, -0.1906F, 0.4718F));

		PartDefinition cube_r237 = Body5.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(0, 60).addBox(0.8932F, -1.016F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.35F, 0.082F, 0.3222F, 0.0663F, -0.3962F, 1.4004F));

		PartDefinition cube_r238 = Body5.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(61, 10).addBox(0.4944F, -0.3985F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.35F, 0.082F, 0.3222F, 0.2556F, -0.313F, 0.867F));

		PartDefinition HindlimbsL = Body5.addOrReplaceChild("HindlimbsL", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5359F, 1.7953F, 2.7329F, 0.3509F, 0.1472F, 0.1374F));

		PartDefinition cube_r239 = HindlimbsL.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(29, 27).addBox(-1.5586F, 0.0248F, -0.7366F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7777F, 2.1201F, 1.1489F, -0.2363F, -0.4987F, 0.6467F));

		PartDefinition cube_r240 = HindlimbsL.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(49, 56).addBox(-0.1F, -0.4F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(57, 45).addBox(-0.1F, -0.4F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(57, 35).addBox(-1.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(57, 21).addBox(-1.0F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.15F, 0.8F, 0.15F, -0.219F, -0.3286F, 0.6037F));

		PartDefinition HindlimbsL2 = Body5.addOrReplaceChild("HindlimbsL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.5359F, 1.7953F, 2.7329F, 0.3509F, -0.1472F, -0.1374F));

		PartDefinition cube_r241 = HindlimbsL2.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(29, 27).mirror().addBox(-1.4414F, 0.0248F, -0.7366F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7777F, 2.1201F, 1.1489F, -0.2363F, 0.4987F, -0.6467F));

		PartDefinition cube_r242 = HindlimbsL2.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(49, 56).mirror().addBox(-0.9F, -0.4F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(57, 45).mirror().addBox(-0.9F, -0.4F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(57, 35).mirror().addBox(0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(57, 21).mirror().addBox(0.0F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.15F, 0.8F, 0.15F, -0.219F, 0.3286F, -0.6037F));

		PartDefinition tail = Body5.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(35, 0).addBox(-0.5F, -0.5204F, -0.1448F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.147F))
				.texOffs(0, 69).addBox(-0.8F, -1.2204F, 0.8552F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0934F, 2.6701F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r243 = tail.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(69, 48).addBox(-0.5F, -0.4F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3F, 0.5796F, 1.3552F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r244 = tail.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(5, 63).mirror().addBox(-0.5F, -0.5F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.2817F, 0.3164F, 1.4808F, 0.1373F, 0.1906F, -0.3671F));

		PartDefinition cube_r245 = tail.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(5, 63).addBox(-0.5F, -0.5F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.2817F, 0.3164F, 1.4808F, 0.1373F, -0.1906F, 0.3671F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 13).addBox(-0.5F, -0.503F, -0.1732F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F))
				.texOffs(5, 69).addBox(-0.8F, -1.203F, -0.1732F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(15, 69).addBox(-0.8F, -1.203F, 1.8268F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0152F, 2.7303F, 0.0F, -0.3927F, 0.0F));

		PartDefinition cube_r246 = tail2.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(35, 69).addBox(-0.8F, -1.075F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(40, 69).addBox(-0.8F, -0.875F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.328F, 4.0018F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r247 = tail2.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(63, 13).mirror().addBox(-0.6F, -0.3F, 1.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.2817F, 0.3316F, -1.2495F, 0.1373F, 0.1906F, -0.3671F));

		PartDefinition cube_r248 = tail2.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(63, 13).addBox(-0.4F, -0.3F, 1.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.2817F, 0.3316F, -1.2495F, 0.1373F, -0.1906F, 0.3671F));

		PartDefinition cube_r249 = tail2.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(69, 54).addBox(-0.5F, 0.8F, 3.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(69, 51).addBox(-0.5F, 0.2F, 1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3F, 0.5948F, -1.375F, 0.3491F, 0.0F, 0.0F));

		PartDefinition Tail1 = tail2.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(55, 69).addBox(-0.8F, 0.8811F, 1.3051F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0428F, 4.6948F, 0.0785F, -0.3927F, 0.0F));

		PartDefinition cube_r250 = Tail1.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(20, 69).addBox(-0.8F, -0.8023F, -0.8587F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.9733F, 3.525F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r251 = Tail1.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(72, 34).addBox(-0.8F, -1.1523F, -0.1633F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(72, 31).addBox(-0.8F, -0.8523F, -0.1633F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0983F, 0.975F, -0.2749F, 0.0F, 0.0F));

		PartDefinition cube_r252 = Tail1.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(35, 72).addBox(-0.5F, -0.7F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3F, 0.9516F, 0.9616F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r253 = Tail1.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(15, 0).addBox(-0.5F, 1.0F, -0.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(0.0F, -1.3267F, 0.575F, -0.3491F, 0.0F, 0.0F));

		PartDefinition tail4 = Tail1.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(69, 57).addBox(-0.8F, 0.0828F, -0.1699F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(69, 60).addBox(-0.8F, 0.6828F, 1.6301F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.2983F, 3.375F, 0.0647F, 0.0862F, 0.0323F));

		PartDefinition cube_r254 = tail4.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(69, 25).addBox(-0.8F, -0.7042F, 2.7924F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(25, 69).addBox(-0.8F, -0.9042F, 0.7924F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(13, 18).addBox(-0.5F, -0.5042F, -0.2076F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2967F, 0.0F, 0.0F));

		PartDefinition tail3 = tail4.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(65, 71).addBox(-0.8F, 0.0828F, 0.1551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(69, 63).addBox(-0.8F, 0.3328F, 2.1551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.025F, 0.95F, 3.475F, 0.047F, 0.3481F, 0.0442F));

		PartDefinition cube_r255 = tail3.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(13, 6).addBox(-0.5276F, -0.417F, -0.1804F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bone = Body5.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.962F, 1.8748F, 2.3575F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r256 = bone.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(14, 46).addBox(-0.8F, -0.7F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.2065F, 0.5477F, -0.1854F, 1.1903F, 0.1613F, 1.3015F));

		PartDefinition cube_r257 = bone.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(45, 33).addBox(-0.7F, -0.7F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.053F, 0.2108F, 0.6104F, 2.1852F, -0.6121F, 1.0577F));

		PartDefinition cube_r258 = bone.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(71, 6).addBox(-0.5818F, -0.1384F, -0.3543F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F))
				.texOffs(71, 0).addBox(-0.5818F, -0.1384F, -0.6543F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(70, 69).addBox(-0.5818F, -0.1384F, -1.1543F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.438F, -0.5704F, -0.4126F, 1.6084F, 0.0598F, -0.2121F));

		PartDefinition bone4 = Body5.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.962F, 1.8748F, 2.3575F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r259 = bone4.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(14, 46).mirror().addBox(-0.2F, -0.7F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.2065F, 0.5477F, -0.1854F, 1.1903F, -0.1613F, -1.3015F));

		PartDefinition cube_r260 = bone4.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(45, 33).mirror().addBox(-0.3F, -0.7F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.053F, 0.2108F, 0.6104F, 2.1852F, 0.6121F, -1.0577F));

		PartDefinition cube_r261 = bone4.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(71, 6).mirror().addBox(-0.4182F, -0.1384F, -0.3543F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false)
				.texOffs(71, 0).mirror().addBox(-0.4182F, -0.1384F, -0.6543F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(70, 69).mirror().addBox(-0.4182F, -0.1384F, -1.1543F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.438F, -0.5704F, -0.4126F, 1.6084F, -0.0598F, 0.2121F));

		return LayerDefinition.create(meshdefinition, 77, 77);
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