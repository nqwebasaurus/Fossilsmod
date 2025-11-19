package fossils.fossils.client.blockentity.model.eoraptor;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class EoraptorFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Eoraptor;
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
	private final ModelPart Tail7;
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

	public EoraptorFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Eoraptor = this.fossil.getChild("Eoraptor");
		this.bone = this.Eoraptor.getChild("bone");
		this.bone4 = this.Eoraptor.getChild("bone4");
		this.Body = this.Eoraptor.getChild("Body");
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
		this.Head = this.Neck5.getChild("Head");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.Jaw = this.Head.getChild("Jaw");
		this.RArm = this.Body2.getChild("RArm");
		this.RArm2 = this.RArm.getChild("RArm2");
		this.RHand = this.RArm2.getChild("RHand");
		this.RArm3 = this.Body2.getChild("RArm3");
		this.RArm4 = this.RArm3.getChild("RArm4");
		this.RHand2 = this.RArm4.getChild("RHand2");
		this.Tail = this.Eoraptor.getChild("Tail");
		this.Tail2 = this.Tail.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
		this.Tail6 = this.Tail5.getChild("Tail6");
		this.Tail7 = this.Tail6.getChild("Tail7");
		this.RLeg = this.Eoraptor.getChild("RLeg");
		this.RLeg2 = this.RLeg.getChild("RLeg2");
		this.RLeg3 = this.RLeg2.getChild("RLeg3");
		this.digit = this.RLeg3.getChild("digit");
		this.digit2 = this.digit.getChild("digit2");
		this.RFoot = this.RLeg3.getChild("RFoot");
		this.RFoot2 = this.RFoot.getChild("RFoot2");
		this.RLeg4 = this.Eoraptor.getChild("RLeg4");
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

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -28.0F, -1.4F, 1.0F, 28.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-0.2F, -11.0F, -0.5F, 1.0F, 32.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-5.5F, -21.0F, -18.4F, 0.0F, 0.5236F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -4.7F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-5.5F, -25.2F, -18.4F, 0.5219F, 0.0436F, 1.4952F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(-5.8F, -3.5F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -21.0F, -0.9F, 0.0F, 0.0F, 1.5708F));

		PartDefinition Eoraptor = fossil.addOrReplaceChild("Eoraptor", CubeListBuilder.create().texOffs(38, 41).addBox(-0.5F, -0.0891F, -2.6147F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F))
				.texOffs(43, 46).addBox(-0.5F, -0.0891F, 3.0853F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -28.1673F, -0.7865F, -0.4843F, 0.0F, 0.0F));

		PartDefinition bone = Eoraptor.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1F, -1.8868F, 1.3911F, 0.0523F, -0.0027F, 0.0523F));

		PartDefinition bone4 = Eoraptor.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.1F, -1.8868F, 1.3911F, 0.0523F, 0.0027F, -0.0523F));

		PartDefinition Body = Eoraptor.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1891F, -1.9147F, 0.3099F, 0.1664F, 0.053F));

		PartDefinition cube_r4 = Body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(53, 41).addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2747F, -5.164F, -0.1746F, 0.0215F, -0.0038F));

		PartDefinition body3 = Body.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.129F, -5.0401F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r5 = body3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(48, 0).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.9F, -5.0F, 0.0698F, 0.0F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4F, -5.0F, 0.0715F, 0.2176F, 0.0155F));

		PartDefinition cube_r6 = body4.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(41, 58).addBox(-0.5F, -0.2F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(39, 56).addBox(-0.5F, -0.2F, -4.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 0.0698F, 0.0F, 0.0F));

		PartDefinition Body2 = body4.addOrReplaceChild("Body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4905F, -4.0274F, 0.0266F, 0.1745F, 0.0046F));

		PartDefinition cube_r7 = Body2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(15, 51).addBox(-0.5F, -0.5F, -4.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.6951F, -0.3766F, 0.1572F, 0.0345F, 0.0055F));

		PartDefinition bone2 = Body2.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(3.4F, 6.1675F, -2.8554F));

		PartDefinition bone3 = Body2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-3.4F, 6.1675F, -2.8554F));

		PartDefinition Neck = Body2.addOrReplaceChild("Neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5099F, -4.6814F, -0.3304F, 0.4285F, 0.3166F));

		PartDefinition cube_r8 = Neck.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(25, 64).addBox(-0.5F, -0.4727F, 2.7598F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(25, 64).addBox(-0.5F, -0.4727F, 2.2598F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(23, 62).addBox(-0.5F, -0.4727F, -0.4402F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2728F, -2.9387F, -0.1396F, 0.0F, 0.0F));

		PartDefinition Neck2 = Neck.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3272F, -2.6387F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r9 = Neck2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(43, 64).addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(41, 62).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5473F, -0.8092F, -0.2445F, 0.0339F, -0.0084F));

		PartDefinition neck4 = Neck2.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.483F, -2.8502F, -0.5121F, 0.2295F, -0.1272F));

		PartDefinition cube_r10 = neck4.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(50, 62).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.632F, -0.1091F, -0.2445F, 0.0339F, -0.0084F));

		PartDefinition Neck3 = neck4.addOrReplaceChild("Neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7698F, -2.902F, -0.1333F, -0.0446F, 0.3142F));

		PartDefinition cube_r11 = Neck3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(61, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.6773F, -2.6813F, 0.0F, 0.0698F, 0.0F));

		PartDefinition Neck5 = Neck3.addOrReplaceChild("Neck5", CubeListBuilder.create().texOffs(61, 11).addBox(-0.5F, 0.1773F, -2.8813F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0276F, -2.7779F, 0.5934F, 0.0F, 0.0F));

		PartDefinition Head = Neck5.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0592F, -2.735F, 0.8727F, 0.0F, 0.0F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.5427F, -0.3278F, -5.1282F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.5427F, -0.3278F, -5.1282F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 1.5151F, -0.5963F, 0.0873F, 0.0F, 0.0F));

		PartDefinition RArm = Body2.addOrReplaceChild("RArm", CubeListBuilder.create(), PartPose.offsetAndRotation(2.6602F, 7.543F, -2.0141F, -0.4498F, 0.2368F, -0.0429F));

		PartDefinition RArm2 = RArm.addOrReplaceChild("RArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0771F, -0.5932F, 5.1985F, 0.5149F, 0.0F, 0.0F));

		PartDefinition RHand = RArm2.addOrReplaceChild("RHand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8934F, 4.9741F, 0.4F, 0.0F, 0.0F, 0.2618F));

		PartDefinition RArm3 = Body2.addOrReplaceChild("RArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.6602F, 7.543F, -2.0141F, -0.4498F, -0.2368F, 0.0429F));

		PartDefinition RArm4 = RArm3.addOrReplaceChild("RArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0771F, -0.5932F, 5.1985F, 0.5149F, 0.0F, 0.0F));

		PartDefinition RHand2 = RArm4.addOrReplaceChild("RHand2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8934F, 4.9741F, 0.4F, 0.0F, 0.0F, -0.2618F));

		PartDefinition Tail = Eoraptor.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(25, 12).addBox(-0.5F, 0.0987F, -0.2611F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F))
				.texOffs(33, 20).addBox(-0.5F, 0.0987F, 8.4389F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1852F, 3.8355F, 0.1489F, -0.0863F, -0.0129F));

		PartDefinition Tail2 = Tail.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(25, 0).addBox(-0.5F, 0.0416F, -0.0376F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F))
				.texOffs(34, 9).addBox(-0.5F, 0.0416F, 9.5624F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.0F, 0.0958F, 8.9416F, 0.2452F, -0.0847F, -0.0212F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.2853F, 0.0474F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.15F))
				.texOffs(10, 10).addBox(-0.5F, 0.2853F, 10.6474F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, -0.2087F, 9.8515F, 0.3275F, -0.1654F, -0.0559F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(0, 13).addBox(-0.5F, 0.2853F, 0.0474F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.044F, 10.9706F, 0.2903F, 0.1255F, 0.0374F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(0, 26).addBox(-0.5F, 0.2852F, -0.0526F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0366F, 10.9354F, -0.2409F, 0.3398F, -0.0817F));

		PartDefinition Tail6 = Tail5.addOrReplaceChild("Tail6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 7.925F, -0.5476F, 0.2249F, -0.1352F));

		PartDefinition cube_r12 = Tail6.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(19, 33).addBox(-0.5F, -0.5F, -0.175F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.7852F, 0.1474F, 0.0F, 0.0175F, 0.0F));

		PartDefinition Tail7 = Tail6.addOrReplaceChild("Tail7", CubeListBuilder.create().texOffs(0, 36).addBox(-0.5F, 0.2852F, 0.0474F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.8F, -0.7785F, 0.39F, -0.3587F));

		PartDefinition RLeg = Eoraptor.addOrReplaceChild("RLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(1.8F, 1.5056F, 0.4703F, -1.0647F, 0.0F, 0.0F));

		PartDefinition RLeg2 = RLeg.addOrReplaceChild("RLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 9.0769F, 3.9441F, 2.138F, 0.0F, 0.0F));

		PartDefinition RLeg3 = RLeg2.addOrReplaceChild("RLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 10.6502F, 1.3547F, -0.4451F, 0.0F, 0.0F));

		PartDefinition digit = RLeg3.addOrReplaceChild("digit", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9458F, 0.2629F, 0.0F, -0.0055F, -0.1046F, 0.009F));

		PartDefinition digit2 = digit.addOrReplaceChild("digit2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7F, 5.5092F, 0.3943F, -0.6981F, 0.0F, 0.0F));

		PartDefinition RFoot = RLeg3.addOrReplaceChild("RFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4782F, 6.4836F, -0.1585F, 0.9165F, 0.0F, 0.0F));

		PartDefinition RFoot2 = RFoot.addOrReplaceChild("RFoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2972F, -2.202F, -0.3401F, 0.0F, 0.0F));

		PartDefinition RLeg4 = Eoraptor.addOrReplaceChild("RLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.8F, 1.5056F, 0.4703F, -0.3665F, 0.0F, 0.0F));

		PartDefinition RLeg5 = RLeg4.addOrReplaceChild("RLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 9.0769F, 3.9441F, 1.1345F, 0.0F, 0.0F));

		PartDefinition RLeg6 = RLeg5.addOrReplaceChild("RLeg6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 10.6502F, 1.3547F, -0.4451F, 0.0F, 0.0F));

		PartDefinition digit3 = RLeg6.addOrReplaceChild("digit3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9458F, 0.2629F, 0.0F, -0.0055F, 0.1046F, -0.009F));

		PartDefinition digit4 = digit3.addOrReplaceChild("digit4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7F, 5.5092F, 0.3943F, -0.6981F, 0.0F, 0.0F));

		PartDefinition RFoot3 = RLeg6.addOrReplaceChild("RFoot3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4782F, 6.4836F, -0.1585F, 0.8293F, 0.0F, 0.0F));

		PartDefinition RFoot4 = RFoot3.addOrReplaceChild("RFoot4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2972F, -2.202F, -0.6455F, 0.0F, 0.0F));

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