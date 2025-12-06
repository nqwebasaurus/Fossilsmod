package fossils.fossils.client.blockentity.model.adeopapposaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class AdeopapposaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Adeopapposaurus;
	private final ModelPart bone;
	private final ModelPart bone4;
	private final ModelPart Body;
	private final ModelPart body3;
	private final ModelPart body4;
	private final ModelPart Body2;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart Neck;
	private final ModelPart Neck2;
	private final ModelPart neck4;
	private final ModelPart Neck3;
	private final ModelPart Neck5;
	private final ModelPart Neck6;
	private final ModelPart Neck7;
	private final ModelPart Head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart Jaw;
	private final ModelPart RArm;
	private final ModelPart RArm2;
	private final ModelPart RHand;
	private final ModelPart RArm3;
	private final ModelPart RArm4;
	private final ModelPart RHand2;
	private final ModelPart Tail;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart Tail5;
	private final ModelPart Tail6;
	private final ModelPart RLeg;
	private final ModelPart RLeg2;
	private final ModelPart RLeg3;
	private final ModelPart digit;
	private final ModelPart digit2;
	private final ModelPart RFoot;
	private final ModelPart RFoot2;
	private final ModelPart RLeg4;
	private final ModelPart RLeg5;
	private final ModelPart RLeg6;
	private final ModelPart digit3;
	private final ModelPart digit4;
	private final ModelPart RFoot3;
	private final ModelPart RFoot4;

	public AdeopapposaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Adeopapposaurus = this.fossil.getChild("Adeopapposaurus");
		this.bone = this.Adeopapposaurus.getChild("bone");
		this.bone4 = this.Adeopapposaurus.getChild("bone4");
		this.Body = this.Adeopapposaurus.getChild("Body");
		this.body3 = this.Body.getChild("body3");
		this.body4 = this.body3.getChild("body4");
		this.Body2 = this.body4.getChild("Body2");
		this.bone2 = this.Body2.getChild("bone2");
		this.bone3 = this.Body2.getChild("bone3");
		this.Neck = this.Body2.getChild("Neck");
		this.Neck2 = this.Neck.getChild("Neck2");
		this.neck4 = this.Neck2.getChild("neck4");
		this.Neck3 = this.neck4.getChild("Neck3");
		this.Neck5 = this.Neck3.getChild("Neck5");
		this.Neck6 = this.Neck5.getChild("Neck6");
		this.Neck7 = this.Neck6.getChild("Neck7");
		this.Head = this.Neck7.getChild("Head");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.Jaw = this.Head.getChild("Jaw");
		this.RArm = this.Body2.getChild("RArm");
		this.RArm2 = this.RArm.getChild("RArm2");
		this.RHand = this.RArm2.getChild("RHand");
		this.RArm3 = this.Body2.getChild("RArm3");
		this.RArm4 = this.RArm3.getChild("RArm4");
		this.RHand2 = this.RArm4.getChild("RHand2");
		this.Tail = this.Adeopapposaurus.getChild("Tail");
		this.Tail2 = this.Tail.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
		this.Tail6 = this.Tail5.getChild("Tail6");
		this.RLeg = this.Adeopapposaurus.getChild("RLeg");
		this.RLeg2 = this.RLeg.getChild("RLeg2");
		this.RLeg3 = this.RLeg2.getChild("RLeg3");
		this.digit = this.RLeg3.getChild("digit");
		this.digit2 = this.digit.getChild("digit2");
		this.RFoot = this.RLeg3.getChild("RFoot");
		this.RFoot2 = this.RFoot.getChild("RFoot2");
		this.RLeg4 = this.Adeopapposaurus.getChild("RLeg4");
		this.RLeg5 = this.RLeg4.getChild("RLeg5");
		this.RLeg6 = this.RLeg5.getChild("RLeg6");
		this.digit3 = this.RLeg6.getChild("digit3");
		this.digit4 = this.digit3.getChild("digit4");
		this.RFoot3 = this.RLeg6.getChild("RFoot3");
		this.RFoot4 = this.RFoot3.getChild("RFoot4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -24.0F, 5.8F, 1.0F, 24.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-0.2F, -8.6F, -0.5F, 1.0F, 27.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-1.5F, -18.4F, -17.4F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(1.4F, -2.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.5F, -18.4F, -17.4F, -0.1309F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(6.6F, -3.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -16.5F, 6.3F, 0.0F, 0.0F, -1.5708F));

		PartDefinition Adeopapposaurus = fossil.addOrReplaceChild("Adeopapposaurus", CubeListBuilder.create().texOffs(17, 42).addBox(-0.5F, -0.0891F, -2.1147F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -24.5358F, 5.379F, -0.3098F, 0.0F, 0.0F));

		PartDefinition bone = Adeopapposaurus.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1471F, -2.0999F, 2.4084F, -0.0175F, -0.0027F, 0.0523F));

		PartDefinition bone4 = Adeopapposaurus.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.1471F, -2.8314F, 2.2429F, -0.0175F, 0.0027F, -0.0523F));

		PartDefinition Body = Adeopapposaurus.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1891F, -1.9147F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(32, 60).addBox(-0.5F, -0.2495F, 4.1913F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(28, 56).addBox(-0.5F, -0.2495F, -0.5088F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.5025F, -5.0134F, -0.1745F, 0.0F, 0.0F));

		PartDefinition body3 = Body.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.129F, -5.0401F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r5 = body3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(54, 56).addBox(-0.5F, -0.2F, -0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.9F, -5.0F, 0.0698F, 0.0F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4F, -5.0F, 0.0699F, 0.0435F, 0.003F));

		PartDefinition cube_r6 = body4.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(37, 63).addBox(-0.5F, -0.2F, -3.825F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 0.0698F, 0.0F, 0.0F));

		PartDefinition Body2 = body4.addOrReplaceChild("Body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4905F, -4.0274F, 0.0263F, 0.0872F, 0.0023F));

		PartDefinition cube_r7 = Body2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(49, 53).addBox(-0.5F, -0.4F, 6.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(45, 49).addBox(-0.5F, -0.4F, 1.7F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.5975F, -6.7134F, 0.1571F, 0.0F, 0.0F));

		PartDefinition bone2 = Body2.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.6F, 6.8675F, -5.3488F, 0.0F, 0.0F, -0.0873F));

		PartDefinition bone3 = Body2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.6F, 6.8675F, -5.3488F, 0.0F, 0.0F, 0.0873F));

		PartDefinition Neck = Body2.addOrReplaceChild("Neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5099F, -4.6814F, 0.3058F, 0.0403F, 0.0167F));

		PartDefinition cube_r8 = Neck.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(15, 50).addBox(-0.5F, -0.2727F, -2.2402F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2728F, -2.9387F, -0.1396F, 0.0F, 0.0F));

		PartDefinition Neck2 = Neck.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6272F, -4.6387F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r9 = Neck2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(55, 45).addBox(-0.5F, 0.7F, 6.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(51, 41).addBox(-0.5F, 0.7F, 1.6F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.9471F, -6.6802F, -0.2443F, 0.0F, 0.0F));

		PartDefinition neck4 = Neck2.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.883F, -4.8502F, -0.2862F, 0.1088F, 0.053F));

		PartDefinition cube_r10 = neck4.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(4, 56).addBox(-0.5F, 0.7F, 3.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 52).addBox(-0.5F, 0.7F, -1.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.5F, -3.7F, -0.2443F, 0.0F, 0.0F));

		PartDefinition Neck3 = neck4.addOrReplaceChild("Neck3", CubeListBuilder.create().texOffs(13, 57).addBox(-0.5F, 0.1773F, -4.8813F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.2698F, -4.902F, -0.4163F, 0.1332F, 0.0838F));

		PartDefinition Neck5 = Neck3.addOrReplaceChild("Neck5", CubeListBuilder.create().texOffs(53, 29).addBox(-0.5F, 0.1773F, -4.8813F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0276F, -4.7779F, 0.1222F, 0.0F, 0.0F));

		PartDefinition Neck6 = Neck5.addOrReplaceChild("Neck6", CubeListBuilder.create().texOffs(41, 56).addBox(-0.5F, 0.1773F, -4.7813F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0242F, -4.903F, 0.3429F, 0.2004F, 0.0845F));

		PartDefinition Neck7 = Neck6.addOrReplaceChild("Neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0149F, -4.9265F, 0.4021F, 0.1117F, 0.2004F));

		PartDefinition cube_r11 = Neck7.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(46, 12).addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.6773F, -5.4813F, 0.0F, 0.0175F, 0.0F));

		PartDefinition Head = Neck7.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0406F, -4.5147F, 0.3054F, 0.0F, 0.0F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.5427F, -0.2278F, -5.1282F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.5427F, -0.2278F, -5.1282F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 0.5482F, -0.3966F, 0.5411F, 0.0F, 0.0F));

		PartDefinition RArm = Body2.addOrReplaceChild("RArm", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9641F, 8.2188F, -5.0165F, -1.4225F, 0.2752F, -0.265F));

		PartDefinition RArm2 = RArm.addOrReplaceChild("RArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0771F, -2.4592F, 4.8869F, 0.9728F, 0.1946F, -0.4967F));

		PartDefinition RHand = RArm2.addOrReplaceChild("RHand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9035F, 4.9363F, 0.1026F, -0.0436F, 0.0F, 0.2618F));

		PartDefinition RArm3 = Body2.addOrReplaceChild("RArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9641F, 8.2188F, -5.0165F, -1.4584F, -0.1308F, 0.7452F));

		PartDefinition RArm4 = RArm3.addOrReplaceChild("RArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0771F, -2.4592F, 4.8869F, 0.9127F, 0.1711F, 0.9484F));

		PartDefinition RHand2 = RArm4.addOrReplaceChild("RHand2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9035F, 4.9363F, 0.1026F, -0.0436F, 0.0F, -0.2618F));

		PartDefinition Tail = Adeopapposaurus.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(25, 12).addBox(-0.5F, 0.0987F, -0.3611F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F))
				.texOffs(32, 19).addBox(-0.5F, 0.0987F, 8.3389F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1852F, 3.8355F, -0.0087F, -0.0436F, -0.0015F));

		PartDefinition Tail2 = Tail.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(25, 0).addBox(-0.5F, 0.0416F, -0.0376F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0958F, 8.9416F, 0.0972F, -0.1296F, -0.0183F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.2853F, -0.2526F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.15F))
				.texOffs(10, 10).addBox(-0.5F, 0.2853F, 10.4474F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2087F, 9.8515F, -0.0345F, -0.1307F, -0.0069F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(0, 13).addBox(-0.5F, 0.2853F, 0.1474F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.044F, 10.9706F, -0.0699F, 0.0435F, -0.003F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(0, 26).addBox(-0.5F, 0.2852F, 0.0474F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0366F, 10.9354F, -0.2023F, 0.1687F, -0.0499F));

		PartDefinition Tail6 = Tail5.addOrReplaceChild("Tail6", CubeListBuilder.create().texOffs(19, 33).addBox(-0.5F, 0.2852F, -0.0526F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.925F, -0.2388F, 0.2086F, -0.0698F));

		PartDefinition RLeg = Adeopapposaurus.addOrReplaceChild("RLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(1.8F, 0.2293F, 1.014F, 0.0698F, 0.0F, 0.0F));

		PartDefinition RLeg2 = RLeg.addOrReplaceChild("RLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 10.5589F, 2.1111F, 0.9861F, 0.0F, 0.0F));

		PartDefinition RLeg3 = RLeg2.addOrReplaceChild("RLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 10.6502F, 1.3547F, -0.7767F, 0.0F, 0.0F));

		PartDefinition digit = RLeg3.addOrReplaceChild("digit", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9458F, 0.2629F, 0.0F, -0.2324F, -0.1046F, 0.009F));

		PartDefinition digit2 = digit.addOrReplaceChild("digit2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5808F, 4.3039F, 0.6057F, -2.5972F, 0.2635F, 0.1564F));

		PartDefinition RFoot = RLeg3.addOrReplaceChild("RFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4782F, 5.2271F, 0.089F, 0.4802F, 0.0F, 0.0F));

		PartDefinition RFoot2 = RFoot.addOrReplaceChild("RFoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2972F, -2.202F, -0.3837F, 0.0F, 0.0F));

		PartDefinition RLeg4 = Adeopapposaurus.addOrReplaceChild("RLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.8F, 0.2293F, 1.014F, -0.3665F, 0.0F, 0.0F));

		PartDefinition RLeg5 = RLeg4.addOrReplaceChild("RLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 10.5589F, 2.1111F, 1.0297F, 0.0F, 0.0F));

		PartDefinition RLeg6 = RLeg5.addOrReplaceChild("RLeg6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 10.6502F, 1.3547F, -0.6458F, 0.0F, 0.0F));

		PartDefinition digit3 = RLeg6.addOrReplaceChild("digit3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9458F, 0.2629F, 0.0F, -0.2324F, 0.1046F, -0.009F));

		PartDefinition digit4 = digit3.addOrReplaceChild("digit4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5808F, 4.3039F, 0.6057F, -2.5972F, -0.2635F, -0.1564F));

		PartDefinition RFoot3 = RLeg6.addOrReplaceChild("RFoot3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4782F, 5.2271F, 0.089F, 0.3057F, 0.0F, 0.0F));

		PartDefinition RFoot4 = RFoot3.addOrReplaceChild("RFoot4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2972F, -2.202F, 0.009F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 108, 108);
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