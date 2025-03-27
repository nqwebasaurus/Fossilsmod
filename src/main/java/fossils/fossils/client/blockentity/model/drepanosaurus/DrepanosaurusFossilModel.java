package fossils.fossils.client.blockentity.model.drepanosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class DrepanosaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Drepanosaurus;
	private final ModelPart Body;
	private final ModelPart Neck;
	private final ModelPart Neck2;
	private final ModelPart Neck3;
	private final ModelPart Neck4;
	private final ModelPart Head;
	private final ModelPart Jaw;
	private final ModelPart LArm;
	private final ModelPart LArm2;
	private final ModelPart LHand;
	private final ModelPart LClaw;
	private final ModelPart LArm3;
	private final ModelPart LArm4;
	private final ModelPart LHand2;
	private final ModelPart LClaw2;
	private final ModelPart Body2;
	private final ModelPart Tail;
	private final ModelPart LLeg;
	private final ModelPart LLeg3;
	private final ModelPart LFoot;
	private final ModelPart finger;
	private final ModelPart finger2;
	private final ModelPart LFoot2;
	private final ModelPart LLeg2;
	private final ModelPart LLeg4;
	private final ModelPart LFoot3;
	private final ModelPart finger3;
	private final ModelPart finger4;
	private final ModelPart LFoot4;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart Tail5;
	private final ModelPart TailClaw;

	public DrepanosaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Drepanosaurus = this.fossil.getChild("Drepanosaurus");
		this.Body = this.Drepanosaurus.getChild("Body");
		this.Neck = this.Body.getChild("Neck");
		this.Neck2 = this.Neck.getChild("Neck2");
		this.Neck3 = this.Neck2.getChild("Neck3");
		this.Neck4 = this.Neck3.getChild("Neck4");
		this.Head = this.Neck4.getChild("Head");
		this.Jaw = this.Head.getChild("Jaw");
		this.LArm = this.Body.getChild("LArm");
		this.LArm2 = this.LArm.getChild("LArm2");
		this.LHand = this.LArm2.getChild("LHand");
		this.LClaw = this.LHand.getChild("LClaw");
		this.LArm3 = this.Body.getChild("LArm3");
		this.LArm4 = this.LArm3.getChild("LArm4");
		this.LHand2 = this.LArm4.getChild("LHand2");
		this.LClaw2 = this.LHand2.getChild("LClaw2");
		this.Body2 = this.Drepanosaurus.getChild("Body2");
		this.Tail = this.Body2.getChild("Tail");
		this.LLeg = this.Tail.getChild("LLeg");
		this.LLeg3 = this.LLeg.getChild("LLeg3");
		this.LFoot = this.LLeg3.getChild("LFoot");
		this.finger = this.LFoot.getChild("finger");
		this.finger2 = this.finger.getChild("finger2");
		this.LFoot2 = this.LFoot.getChild("LFoot2");
		this.LLeg2 = this.Tail.getChild("LLeg2");
		this.LLeg4 = this.LLeg2.getChild("LLeg4");
		this.LFoot3 = this.LLeg4.getChild("LFoot3");
		this.finger3 = this.LFoot3.getChild("finger3");
		this.finger4 = this.finger3.getChild("finger4");
		this.LFoot4 = this.LFoot3.getChild("LFoot4");
		this.Tail2 = this.Tail.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
		this.TailClaw = this.Tail5.getChild("TailClaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Drepanosaurus = fossil.addOrReplaceChild("Drepanosaurus", CubeListBuilder.create().texOffs(23, 0).addBox(-0.5F, -2.3095F, 0.1967F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.004F))
				.texOffs(53, 57).addBox(0.0F, -4.8443F, 1.2043F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 5).addBox(0.0F, -4.7443F, 3.2043F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -12.0F, 0.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Drepanosaurus.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(32, 56).addBox(0.5F, -2.6128F, 5.0019F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 57).addBox(0.5F, -2.5128F, 3.0019F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 20).addBox(0.5F, -2.3128F, 1.0019F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 21).addBox(0.0F, -0.0128F, 0.0019F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.0872F, -5.8019F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Drepanosaurus.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(58, 28).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.7095F, -4.3033F, 0.1807F, 0.0653F, -0.3955F));

		PartDefinition cube_r3 = Drepanosaurus.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(53, 30).mirror().addBox(-2.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.7095F, -4.3033F, 0.1366F, 0.1353F, -0.8285F));

		PartDefinition cube_r4 = Drepanosaurus.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(36, 9).mirror().addBox(-7.2241F, -1.918F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.7095F, -4.3033F, 0.042F, 0.1874F, -1.401F));

		PartDefinition cube_r5 = Drepanosaurus.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(59, 2).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.8095F, -2.3033F, 0.1313F, 0.0476F, -0.3459F));

		PartDefinition cube_r6 = Drepanosaurus.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(53, 38).mirror().addBox(-2.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.8095F, -2.3033F, 0.0991F, 0.0986F, -0.7805F));

		PartDefinition cube_r7 = Drepanosaurus.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(36, 28).mirror().addBox(-7.2241F, -1.918F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.8095F, -2.3033F, 0.0304F, 0.1363F, -1.3506F));

		PartDefinition cube_r8 = Drepanosaurus.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(59, 16).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.8095F, -0.3033F, 0.1313F, 0.0476F, -0.3459F));

		PartDefinition cube_r9 = Drepanosaurus.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(53, 46).mirror().addBox(-2.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.8095F, -0.3033F, 0.0991F, 0.0986F, -0.7805F));

		PartDefinition cube_r10 = Drepanosaurus.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(37, 16).mirror().addBox(-7.2241F, -1.918F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.8095F, -0.3033F, 0.0304F, 0.1363F, -1.3506F));

		PartDefinition cube_r11 = Drepanosaurus.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(37, 18).mirror().addBox(-7.2241F, -1.918F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.8095F, 3.6967F, 0.0113F, 0.0511F, -1.3523F));

		PartDefinition cube_r12 = Drepanosaurus.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(53, 48).mirror().addBox(-2.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.8095F, 3.6967F, 0.037F, 0.037F, -0.7847F));

		PartDefinition cube_r13 = Drepanosaurus.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(59, 19).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.8095F, 3.6967F, 0.0492F, 0.0179F, -0.3486F));

		PartDefinition cube_r14 = Drepanosaurus.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(19, 37).mirror().addBox(-7.2241F, -1.918F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.8095F, 1.6967F, 0.0189F, 0.0852F, -1.3518F));

		PartDefinition cube_r15 = Drepanosaurus.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(53, 50).mirror().addBox(-2.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.8095F, 1.6967F, 0.0618F, 0.0617F, -0.7835F));

		PartDefinition cube_r16 = Drepanosaurus.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(59, 31).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.8095F, 1.6967F, 0.082F, 0.0298F, -0.3478F));

		PartDefinition cube_r17 = Drepanosaurus.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(59, 19).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.8095F, 3.6967F, 0.0492F, -0.0179F, 0.3486F));

		PartDefinition cube_r18 = Drepanosaurus.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(53, 48).addBox(0.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.8095F, 3.6967F, 0.037F, -0.037F, 0.7847F));

		PartDefinition cube_r19 = Drepanosaurus.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(37, 18).addBox(2.2241F, -1.918F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.8095F, 3.6967F, 0.0113F, -0.0511F, 1.3523F));

		PartDefinition cube_r20 = Drepanosaurus.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(36, 9).addBox(2.2241F, -1.918F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.7095F, -4.3033F, 0.042F, -0.1874F, 1.401F));

		PartDefinition cube_r21 = Drepanosaurus.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(53, 30).addBox(0.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.7095F, -4.3033F, 0.1366F, -0.1353F, 0.8285F));

		PartDefinition cube_r22 = Drepanosaurus.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(58, 28).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.7095F, -4.3033F, 0.1807F, -0.0653F, 0.3955F));

		PartDefinition cube_r23 = Drepanosaurus.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(36, 28).addBox(2.2241F, -1.918F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.8095F, -2.3033F, 0.0304F, -0.1363F, 1.3506F));

		PartDefinition cube_r24 = Drepanosaurus.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(53, 38).addBox(0.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.8095F, -2.3033F, 0.0991F, -0.0986F, 0.7805F));

		PartDefinition cube_r25 = Drepanosaurus.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(59, 2).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.8095F, -2.3033F, 0.1313F, -0.0476F, 0.3459F));

		PartDefinition cube_r26 = Drepanosaurus.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(37, 16).addBox(2.2241F, -1.918F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.8095F, -0.3033F, 0.0304F, -0.1363F, 1.3506F));

		PartDefinition cube_r27 = Drepanosaurus.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(53, 46).addBox(0.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.8095F, -0.3033F, 0.0991F, -0.0986F, 0.7805F));

		PartDefinition cube_r28 = Drepanosaurus.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(59, 16).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.8095F, -0.3033F, 0.1313F, -0.0476F, 0.3459F));

		PartDefinition cube_r29 = Drepanosaurus.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(19, 37).addBox(2.2241F, -1.918F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.8095F, 1.6967F, 0.0189F, -0.0852F, 1.3518F));

		PartDefinition cube_r30 = Drepanosaurus.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(53, 50).addBox(0.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.8095F, 1.6967F, 0.0618F, -0.0617F, 0.7835F));

		PartDefinition cube_r31 = Drepanosaurus.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(59, 31).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.8095F, 1.6967F, 0.082F, -0.0298F, 0.3478F));

		PartDefinition Body = Drepanosaurus.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.8F, -5.7F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r32 = Body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(9, 23).addBox(-0.01F, -0.5F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7987F, -2.563F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r33 = Body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(46, 53).addBox(-0.01F, -0.5F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0626F, -0.3592F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r34 = Body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(60, 21).addBox(0.5F, -2.1278F, -0.116F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.1421F, -0.8593F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r35 = Body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(56, 56).addBox(0.5F, -2.8219F, -0.1007F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.3421F, -2.3593F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r36 = Body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(0, 12).mirror().addBox(-0.2F, -1.7585F, -2.1207F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5F, 5.9815F, -1.7958F, 1.2859F, -0.274F, -0.7459F));

		PartDefinition cube_r37 = Body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(0, 49).mirror().addBox(-0.5F, 0.2303F, -2.2837F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(14, 49).mirror().addBox(-0.5F, -0.0697F, -1.8837F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(0, 49).addBox(5.5F, 0.2303F, -2.2837F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(14, 49).addBox(5.5F, -0.0697F, -1.8837F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-3.0F, 4.1815F, -1.7958F, 1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r38 = Body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(16, 31).mirror().addBox(-0.5F, -1.0108F, 0.0808F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(16, 31).addBox(5.5F, -1.0108F, 0.0808F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 1.0815F, -1.0958F, 1.9111F, 0.0F, 0.0F));

		PartDefinition cube_r39 = Body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(30, 17).mirror().addBox(-0.5F, -1.2F, -2.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(30, 17).addBox(5.5F, -1.2F, -2.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-3.0F, 2.4815F, -0.7958F, 1.6493F, 0.0F, 0.0F));

		PartDefinition cube_r40 = Body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(19, 49).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6198F, -2.1607F, 0.2467F, 0.0886F, -0.5824F));

		PartDefinition cube_r41 = Body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(49, 44).mirror().addBox(-2.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6198F, -2.1607F, 0.1872F, 0.1841F, -1.0124F));

		PartDefinition cube_r42 = Body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(40, 0).mirror().addBox(-6.2241F, -1.918F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6198F, -2.1607F, 0.0579F, 0.2555F, -1.5895F));

		PartDefinition cube_r43 = Body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(57, 10).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2198F, -0.3607F, 0.1807F, 0.0653F, -0.4828F));

		PartDefinition cube_r44 = Body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(51, 0).mirror().addBox(-2.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2198F, -0.3607F, 0.1366F, 0.1353F, -0.9158F));

		PartDefinition cube_r45 = Body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(10, 12).mirror().addBox(-7.2241F, -1.918F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2198F, -0.3607F, 0.042F, 0.1874F, -1.4883F));

		PartDefinition cube_r46 = Body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(40, 0).addBox(2.2241F, -1.918F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6198F, -2.1607F, 0.0579F, -0.2555F, 1.5895F));

		PartDefinition cube_r47 = Body.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(49, 44).addBox(0.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6198F, -2.1607F, 0.1872F, -0.1841F, 1.0124F));

		PartDefinition cube_r48 = Body.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(19, 49).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6198F, -2.1607F, 0.2467F, -0.0886F, 0.5824F));

		PartDefinition cube_r49 = Body.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(10, 12).addBox(2.2241F, -1.918F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2198F, -0.3607F, 0.042F, -0.1874F, 1.4883F));

		PartDefinition cube_r50 = Body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(51, 0).addBox(0.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2198F, -0.3607F, 0.1366F, -0.1353F, 0.9158F));

		PartDefinition cube_r51 = Body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(57, 10).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2198F, -0.3607F, 0.1807F, -0.0653F, 0.4828F));

		PartDefinition cube_r52 = Body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(0, 12).addBox(-0.8F, -1.7585F, -2.1207F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, 5.9815F, -1.7958F, 1.2859F, 0.274F, 0.7459F));

		PartDefinition cube_r53 = Body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(38, 38).addBox(0.0F, -0.0128F, 0.0019F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, 0.5421F, -2.9593F, 0.2967F, 0.0F, 0.0F));

		PartDefinition Neck = Body.addOrReplaceChild("Neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0293F, -2.4574F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r54 = Neck.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(3, 59).addBox(-0.01F, -2.8F, -1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.7179F, 1.2257F, 1.7191F, 0.0F, 0.0F));

		PartDefinition cube_r55 = Neck.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(23, 9).addBox(0.0F, -3.4985F, 0.2653F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 56).addBox(0.0F, -2.5985F, -1.0347F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7562F, -1.066F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r56 = Neck.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(23, 25).addBox(0.0F, -1.6128F, 0.0019F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 31).addBox(-0.5F, -1.0128F, 0.0019F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0438F, -4.166F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r57 = Neck.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(50, 16).mirror().addBox(-2.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3185F, -1.6444F, 0.1117F, 0.0851F, -1.2484F));

		PartDefinition cube_r58 = Neck.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(55, 32).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3185F, -1.6444F, 0.137F, 0.0301F, -0.8148F));

		PartDefinition cube_r59 = Neck.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(50, 16).addBox(0.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3185F, -1.6444F, 0.1117F, -0.0851F, 1.2484F));

		PartDefinition cube_r60 = Neck.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(55, 32).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3185F, -1.6444F, 0.137F, -0.0301F, 0.8148F));

		PartDefinition Neck2 = Neck.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4689F, -3.9641F, -0.354F, -0.1639F, 0.0602F));

		PartDefinition cube_r61 = Neck2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(10, 24).addBox(-0.5F, -0.9128F, 0.0019F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.7069F, -4.7823F, -0.2443F, 0.0F, 0.0F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.2196F, -4.4804F, -0.3862F, 0.1138F, 0.0476F));

		PartDefinition cube_r62 = Neck3.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(38, 30).addBox(-0.5F, -0.0128F, 2.7019F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, -2.6633F, -4.7532F, -0.4363F, 0.0F, 0.0F));

		PartDefinition Neck4 = Neck3.addOrReplaceChild("Neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9633F, -2.4532F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r63 = Neck4.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(17, 39).addBox(-0.5F, -0.0128F, -0.2981F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -1.6F, -2.2F, -0.4363F, 0.0F, 0.0F));

		PartDefinition Head = Neck4.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(23, 25).addBox(-1.5F, -1.1572F, -2.3345F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.002F))
				.texOffs(9, 43).addBox(-1.5F, -1.1572F, -2.9345F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(9, 43).addBox(-1.5F, -1.1572F, -2.9345F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -1.0128F, -2.5981F, -0.0422F, 0.0107F, 0.0186F));

		PartDefinition cube_r64 = Head.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(33, 23).addBox(-1.0F, 0.97F, 2.6F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.1572F, -7.1345F, 0.3395F, 0.0F, 0.0F));

		PartDefinition cube_r65 = Head.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(56, 25).addBox(-0.5F, -0.1246F, -0.4896F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.0F, 1.3428F, -6.4345F, 0.8107F, 0.0F, 0.0F));

		PartDefinition cube_r66 = Head.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(5, 51).addBox(-0.5F, -0.1246F, 0.1104F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F))
				.texOffs(5, 51).addBox(-0.5F, -0.1246F, 0.1104F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 1.3428F, -6.4345F, 0.8237F, 0.1556F, 0.1658F));

		PartDefinition cube_r67 = Head.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(20, 17).addBox(0.12F, -0.7F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F))
				.texOffs(20, 17).mirror().addBox(-1.12F, -0.7F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(20, 17).addBox(0.12F, -0.7F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.2532F, -4.2881F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r68 = Head.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(47, 6).addBox(-1.5F, -0.7F, 0.9F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(44, 25).addBox(-1.5F, 0.0F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(47, 33).addBox(-1.5F, -0.7F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(44, 25).addBox(-1.5F, 0.0F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(47, 6).addBox(-1.5F, -0.7F, 0.9F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(47, 33).addBox(-1.5F, -0.7F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.2572F, -1.9345F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r69 = Head.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(5, 51).mirror().addBox(-0.5F, -0.1246F, 0.1104F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.012F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.3428F, -6.4345F, 0.8237F, -0.1556F, -0.1658F));

		PartDefinition cube_r70 = Head.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(16, 45).addBox(-1.0F, -0.0432F, -1.2386F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7572F, -4.1345F, 0.5489F, 0.0F, 0.0F));

		PartDefinition cube_r71 = Head.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(40, 43).addBox(-1.0F, -0.0742F, -0.0159F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.6903F, 0.4624F, -1.2139F, 0.0F, 0.0F));

		PartDefinition cube_r72 = Head.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(0, 45).addBox(-1.0F, -0.0686F, -0.0159F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, -2.2903F, -0.3376F, -0.6379F, 0.0F, 0.0F));

		PartDefinition cube_r73 = Head.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(48, 13).addBox(-1.0F, -0.9782F, -0.0246F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, -1.3903F, -1.3376F, -0.0096F, 0.0F, 0.0F));

		PartDefinition cube_r74 = Head.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(31, 0).addBox(-1.0F, -0.0427F, 0.0454F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.4903F, -2.2376F, -0.1667F, 0.0F, 0.0F));

		PartDefinition cube_r75 = Head.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(45, 2).addBox(-1.5F, -0.0344F, 0.0302F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -2.0903F, -3.1376F, 0.4267F, 0.0F, 0.0F));

		PartDefinition cube_r76 = Head.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -0.9F, -1.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.0F, -1.1903F, -2.7376F, 0.9154F, 0.0F, 0.0F));

		PartDefinition cube_r77 = Head.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(48, 41).addBox(-1.5F, -0.8993F, 0.1164F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 1.3097F, -2.1376F, 0.2347F, 0.0F, 0.0F));

		PartDefinition cube_r78 = Head.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(44, 30).addBox(-1.5F, -1.3592F, 0.0484F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 38).addBox(-1.5F, -0.9592F, 0.0484F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.7556F, -0.8364F, -1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r79 = Head.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(0, 6).addBox(-1.0F, -1.0252F, -2.0332F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0556F, -3.3364F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r80 = Head.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(30, 37).addBox(-1.5F, -1.0128F, -1.9981F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4556F, -2.1364F, -0.3316F, 0.0F, 0.0F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4428F, 0.8655F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r81 = Jaw.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(14, 38).addBox(-0.5F, -0.0228F, -2.4781F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(31, 41).addBox(-1.0F, -0.0228F, -1.9781F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.4872F, -4.5019F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r82 = Jaw.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(7, 47).addBox(-1.0F, -0.9228F, -1.9781F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.8128F, -2.7019F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r83 = Jaw.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(41, 20).mirror().addBox(-1.5F, 0.0772F, -2.6981F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(41, 20).addBox(0.5F, 0.0772F, -2.6981F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.0872F, -0.0019F, -0.0524F, 0.0F, 0.0F));

		PartDefinition LArm = Body.addOrReplaceChild("LArm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.5F, 5.8293F, -0.3574F, 0.1621F, 0.4955F, -0.7707F));

		PartDefinition cube_r84 = LArm.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(29, 51).addBox(-0.5F, -1.5F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, 3.551F, 0.0169F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r85 = LArm.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(54, 2).addBox(-1.0F, -1.9892F, -0.0075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(1.0F, 0.7F, -1.4F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r86 = LArm.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(0, 53).addBox(-1.5F, -1.9578F, -0.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.5F, 2.5F, -0.6F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r87 = LArm.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(18, 24).addBox(-1.5F, -1.0F, -1.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition LArm2 = LArm.addOrReplaceChild("LArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8F, 4.8F, -0.6F, -0.9192F, 0.3457F, 0.2952F));

		PartDefinition cube_r88 = LArm2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(26, 40).addBox(-0.5F, -3.2F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0402F, 2.815F, -0.2957F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r89 = LArm2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(0, 21).addBox(-0.5F, -0.1389F, -0.3382F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0402F, 1.454F, 2.8766F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r90 = LArm2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(52, 52).addBox(-0.5F, 2.1848F, 0.5401F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0402F, 1.454F, 2.8766F, -0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r91 = LArm2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(29, 7).addBox(-0.5F, -4.5F, -3.4F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0402F, 3.6923F, 1.3896F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r92 = LArm2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(43, 47).addBox(-0.5F, -2.7F, -1.2F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0402F, 3.6923F, 1.3896F, -0.3752F, 0.0F, 0.0F));

		PartDefinition LHand = LArm2.addOrReplaceChild("LHand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4598F, 5.8923F, -0.1104F, 0.035F, 0.2595F, -1.4353F));

		PartDefinition cube_r93 = LHand.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(9, 31).addBox(-0.9F, 0.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));

		PartDefinition LClaw = LHand.addOrReplaceChild("LClaw", CubeListBuilder.create().texOffs(13, 0).addBox(-0.25F, 0.05F, -1.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition LArm3 = Body.addOrReplaceChild("LArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5F, 5.8293F, -0.3574F, 1.3065F, -0.444F, -0.0763F));

		PartDefinition cube_r94 = LArm3.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(29, 51).mirror().addBox(-0.5F, -1.5F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 3.551F, 0.0169F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r95 = LArm3.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(54, 2).mirror().addBox(0.0F, -1.9892F, -0.0075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.012F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.7F, -1.4F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r96 = LArm3.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(0, 53).mirror().addBox(0.5F, -1.9578F, -0.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 2.5F, -0.6F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r97 = LArm3.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(18, 24).mirror().addBox(0.5F, -1.0F, -1.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition LArm4 = LArm3.addOrReplaceChild("LArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8F, 4.8F, -0.6F, -1.0104F, 0.1313F, -0.3355F));

		PartDefinition cube_r98 = LArm4.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(26, 40).mirror().addBox(-0.5F, -3.2F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0402F, 2.815F, -0.2957F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r99 = LArm4.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(0, 21).mirror().addBox(-0.5F, -0.1389F, -0.3382F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0402F, 1.454F, 2.8766F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r100 = LArm4.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(52, 52).mirror().addBox(-0.5F, 2.1848F, 0.5401F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0402F, 1.454F, 2.8766F, -0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r101 = LArm4.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(29, 7).mirror().addBox(-0.5F, -4.5F, -3.4F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0402F, 3.6923F, 1.3896F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r102 = LArm4.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(43, 47).mirror().addBox(-0.5F, -2.7F, -1.2F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0402F, 3.6923F, 1.3896F, -0.3752F, 0.0F, 0.0F));

		PartDefinition LHand2 = LArm4.addOrReplaceChild("LHand2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4598F, 5.8923F, -0.1104F, 0.0F, 0.1745F, 1.5708F));

		PartDefinition cube_r103 = LHand2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(9, 31).mirror().addBox(-0.1F, 0.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1416F, 0.0F, -3.1416F));

		PartDefinition LClaw2 = LHand2.addOrReplaceChild("LClaw2", CubeListBuilder.create().texOffs(13, 0).mirror().addBox(-1.75F, 0.05F, -1.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Body2 = Drepanosaurus.addOrReplaceChild("Body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.8F, 5.0F, -0.0437F, -0.0436F, 0.0019F));

		PartDefinition cube_r104 = Body2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(45, 57).addBox(-0.5F, -2.3F, 4.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 57).addBox(-0.5F, -2.4F, 2.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 12).addBox(-0.5F, -2.4F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 18).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5017F, 0.0785F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r105 = Body2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(40, 11).mirror().addBox(-6.2241F, -1.918F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1888F, 4.5752F, -0.0227F, -0.1022F, -1.4911F));

		PartDefinition cube_r106 = Body2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(51, 11).mirror().addBox(-2.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1888F, 4.5752F, -0.0742F, -0.074F, -0.9223F));

		PartDefinition cube_r107 = Body2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(57, 52).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1888F, 4.5752F, -0.0984F, -0.0358F, -0.4869F));

		PartDefinition cube_r108 = Body2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(41, 36).mirror().addBox(-6.2241F, -1.918F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0888F, 2.5752F, -0.0113F, -0.0511F, -1.4571F));

		PartDefinition cube_r109 = Body2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(52, 36).mirror().addBox(-2.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0888F, 2.5752F, -0.037F, -0.037F, -0.8894F));

		PartDefinition cube_r110 = Body2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(57, 54).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0888F, 2.5752F, -0.0492F, -0.0179F, -0.4533F));

		PartDefinition cube_r111 = Body2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(58, 0).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0112F, 0.5752F, 0.0492F, 0.0179F, -0.4184F));

		PartDefinition cube_r112 = Body2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(53, 18).mirror().addBox(-2.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0112F, 0.5752F, 0.037F, 0.037F, -0.8545F));

		PartDefinition cube_r113 = Body2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(35, 14).mirror().addBox(-7.2241F, -1.918F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0112F, 0.5752F, 0.0113F, 0.0511F, -1.4222F));

		PartDefinition cube_r114 = Body2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(57, 52).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1888F, 4.5752F, -0.0984F, 0.0358F, 0.4869F));

		PartDefinition cube_r115 = Body2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(51, 11).addBox(0.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1888F, 4.5752F, -0.0742F, 0.074F, 0.9223F));

		PartDefinition cube_r116 = Body2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(40, 11).addBox(2.2241F, -1.918F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1888F, 4.5752F, -0.0227F, 0.1022F, 1.4911F));

		PartDefinition cube_r117 = Body2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(57, 54).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0888F, 2.5752F, -0.0492F, 0.0179F, 0.4533F));

		PartDefinition cube_r118 = Body2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(52, 36).addBox(0.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0888F, 2.5752F, -0.037F, 0.037F, 0.8894F));

		PartDefinition cube_r119 = Body2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(41, 36).addBox(2.2241F, -1.918F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0888F, 2.5752F, -0.0113F, 0.0511F, 1.4571F));

		PartDefinition cube_r120 = Body2.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(58, 0).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0112F, 0.5752F, 0.0492F, -0.0179F, 0.4184F));

		PartDefinition cube_r121 = Body2.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(53, 18).addBox(0.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0112F, 0.5752F, 0.037F, -0.037F, 0.8545F));

		PartDefinition cube_r122 = Body2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(35, 14).addBox(2.2241F, -1.918F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0112F, 0.5752F, 0.0113F, -0.0511F, 1.4222F));

		PartDefinition Tail = Body2.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0983F, 5.0785F, 0.2628F, -0.0843F, -0.0226F));

		PartDefinition cube_r123 = Tail.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(22, 60).addBox(0.0F, -1.3F, 5.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(25, 60).addBox(0.0F, -1.5F, 3.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(51, 26).mirror().addBox(-1.5F, 0.0F, 3.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(0, 57).addBox(0.0F, -2.3F, 1.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(51, 26).addBox(0.5F, 0.0F, 3.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F))
				.texOffs(0, 12).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.3409F, 0.0894F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r124 = Tail.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(31, 31).mirror().addBox(0.0F, 2.1273F, -2.3651F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.012F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 3.0077F, 4.105F, 0.2356F, 0.0F, -0.4363F));

		PartDefinition cube_r125 = Tail.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(10, 14).mirror().addBox(0.0F, 0.4473F, -0.9011F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 3.0077F, 4.105F, 0.48F, 0.0F, -0.4363F));

		PartDefinition cube_r126 = Tail.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(23, 0).mirror().addBox(0.0F, 0.5505F, -0.4548F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 3.0077F, 4.105F, -0.48F, 0.0F, -0.4363F));

		PartDefinition cube_r127 = Tail.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(31, 45).mirror().addBox(0.0F, -0.0126F, -0.7779F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 3.0077F, 4.105F, 0.0436F, 0.0F, -0.4363F));

		PartDefinition cube_r128 = Tail.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(0, 40).mirror().addBox(-0.5F, -0.0572F, 0.086F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(0, 40).addBox(3.5F, -0.0572F, 0.086F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-2.0F, -0.2923F, 3.605F, -0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r129 = Tail.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(12, 53).mirror().addBox(-0.5F, -0.0029F, -1.1309F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.012F)).mirror(false)
				.texOffs(12, 53).addBox(3.5F, -0.0029F, -1.1309F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(-2.0F, -0.3923F, 3.805F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r130 = Tail.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(48, 18).mirror().addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(48, 18).addBox(3.5F, -1.5F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 2.6077F, 3.805F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r131 = Tail.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(56, 34).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5496F, 1.1861F, -0.413F, -0.1451F, -0.5804F));

		PartDefinition cube_r132 = Tail.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(50, 23).mirror().addBox(-2.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5496F, 1.1861F, -0.3185F, -0.3035F, -0.9981F));

		PartDefinition cube_r133 = Tail.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(49, 9).mirror().addBox(-5.2241F, -1.918F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5496F, 1.1861F, -0.1006F, -0.4253F, -1.5927F));

		PartDefinition cube_r134 = Tail.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(56, 34).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5496F, 1.1861F, -0.413F, 0.1451F, 0.5804F));

		PartDefinition cube_r135 = Tail.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(50, 23).addBox(0.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5496F, 1.1861F, -0.3185F, 0.3035F, 0.9981F));

		PartDefinition cube_r136 = Tail.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(49, 9).addBox(2.2241F, -1.918F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5496F, 1.1861F, -0.1006F, 0.4253F, 1.5927F));

		PartDefinition cube_r137 = Tail.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(23, 0).addBox(-1.0F, 0.5505F, -0.4548F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.5F, 3.0077F, 4.105F, -0.48F, 0.0F, 0.4363F));

		PartDefinition cube_r138 = Tail.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(31, 31).addBox(-1.0F, 2.1273F, -2.3651F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(2.5F, 3.0077F, 4.105F, 0.2356F, 0.0F, 0.4363F));

		PartDefinition cube_r139 = Tail.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(10, 14).addBox(-1.0F, 0.4473F, -0.9011F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.5F, 3.0077F, 4.105F, 0.48F, 0.0F, 0.4363F));

		PartDefinition cube_r140 = Tail.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(31, 45).addBox(-1.0F, -0.0126F, -0.7779F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 3.0077F, 4.105F, 0.0436F, 0.0F, 0.4363F));

		PartDefinition LLeg = Tail.addOrReplaceChild("LLeg", CubeListBuilder.create().texOffs(24, 48).addBox(-0.4829F, -0.0028F, -0.3623F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 4.4591F, 4.9894F, 0.0076F, -0.5725F, -0.7303F));

		PartDefinition LLeg3 = LLeg.addOrReplaceChild("LLeg3", CubeListBuilder.create().texOffs(38, 47).addBox(-0.5F, -0.7F, -1.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 46).addBox(-0.5F, -0.4F, -0.6F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3171F, 4.5972F, 1.1377F, 1.5264F, 0.5574F, 0.4268F));

		PartDefinition LFoot = LLeg3.addOrReplaceChild("LFoot", CubeListBuilder.create().texOffs(0, 29).addBox(-1.3053F, -0.5F, -2.5706F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 4.7F, -0.2F, 0.6109F, -0.192F, 0.0F));

		PartDefinition finger = LFoot.addOrReplaceChild("finger", CubeListBuilder.create().texOffs(8, 38).addBox(-0.394F, -0.4F, -2.7068F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2053F, -0.1F, 0.0294F, 0.0F, 0.5672F, 0.0F));

		PartDefinition finger2 = finger.addOrReplaceChild("finger2", CubeListBuilder.create().texOffs(27, 31).addBox(-0.4F, -0.4F, -2.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.006F, 0.0F, -2.6068F));

		PartDefinition LFoot2 = LFoot.addOrReplaceChild("LFoot2", CubeListBuilder.create().texOffs(36, 5).addBox(-1.0F, -1.1F, -2.1F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.3053F, 0.6F, -2.4706F));

		PartDefinition LLeg2 = Tail.addOrReplaceChild("LLeg2", CubeListBuilder.create().texOffs(24, 48).mirror().addBox(-0.5171F, -0.0028F, -0.3623F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 4.4591F, 4.9894F, -0.9317F, 1.0521F, -0.2735F));

		PartDefinition LLeg4 = LLeg2.addOrReplaceChild("LLeg4", CubeListBuilder.create().texOffs(38, 47).mirror().addBox(-0.5F, -0.7F, -1.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(48, 46).mirror().addBox(-0.5F, -0.4F, -0.6F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3171F, 4.5972F, 1.1377F, 0.6973F, -0.5574F, -0.4268F));

		PartDefinition LFoot3 = LLeg4.addOrReplaceChild("LFoot3", CubeListBuilder.create().texOffs(0, 29).mirror().addBox(-1.6947F, -0.5F, -2.5706F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3F, 4.7F, -0.2F, 0.0F, 0.192F, 0.0F));

		PartDefinition finger3 = LFoot3.addOrReplaceChild("finger3", CubeListBuilder.create().texOffs(8, 38).mirror().addBox(-0.606F, -0.4F, -2.7068F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.2053F, -0.1F, 0.0294F, 0.0F, -0.5672F, 0.0F));

		PartDefinition finger4 = finger3.addOrReplaceChild("finger4", CubeListBuilder.create().texOffs(27, 31).mirror().addBox(-0.6F, -0.4F, -2.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-0.006F, 0.0F, -2.6068F));

		PartDefinition LFoot4 = LFoot3.addOrReplaceChild("LFoot4", CubeListBuilder.create().texOffs(36, 5).mirror().addBox(-2.0F, -1.1F, -2.1F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.3053F, 0.6F, -2.4706F));

		PartDefinition Tail2 = Tail.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.8972F, -0.1265F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 2.8591F, 6.3894F, 0.1839F, -0.0858F, -0.0159F));

		PartDefinition cube_r141 = Tail2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(60, 39).addBox(0.0F, -1.6024F, 2.03F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 43).addBox(0.0F, -1.7024F, 0.03F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8972F, 6.0735F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r142 = Tail2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(60, 47).addBox(0.0F, -1.5326F, 0.0288F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8972F, 4.0735F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r143 = Tail2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(17, 60).addBox(0.0F, -2.2F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 40).addBox(0.0F, -2.2F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8972F, -0.1265F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r144 = Tail2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(23, 55).addBox(0.0F, 1.4436F, 7.7395F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 55).addBox(0.0F, 0.9436F, 5.7395F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 56).addBox(0.0F, 0.6436F, 3.7395F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(29, 56).addBox(0.0F, 0.4436F, 1.7395F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 56).addBox(0.0F, 0.0436F, -0.2605F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0972F, -0.1265F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(13, 0).addBox(-0.5F, -0.3021F, 0.096F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.004F))
				.texOffs(60, 12).addBox(0.0F, -2.1021F, 0.096F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(6, 60).addBox(0.0F, -2.1021F, 2.096F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(59, 56).addBox(0.0F, -1.9021F, 4.096F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(41, 59).addBox(0.0F, -1.5021F, 6.096F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.5972F, 9.6735F, 0.1294F, -0.2615F, 0.0117F));

		PartDefinition cube_r145 = Tail3.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(42, 54).addBox(0.0F, 2.5436F, 15.7395F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 55).addBox(0.0F, 2.0436F, 13.7395F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(8, 55).addBox(0.0F, 1.6436F, 11.7395F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(17, 55).addBox(0.0F, 1.6436F, 9.7395F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -9.8F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(10, 14).addBox(-0.5F, -0.3833F, -0.0547F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.02F))
				.texOffs(60, 35).addBox(0.0F, -1.7833F, 0.9453F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 59).addBox(0.0F, -1.6833F, 2.9453F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 40).addBox(0.0F, -1.3833F, 4.9453F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0979F, 7.096F, -0.1919F, 0.3002F, -0.0574F));

		PartDefinition cube_r146 = Tail4.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(30, 17).addBox(0.0F, 3.8436F, 21.7395F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 34).addBox(0.0F, 3.8436F, 19.7395F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(39, 54).addBox(0.0F, 2.5436F, 17.7395F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4021F, -16.896F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(20, 9).addBox(-0.5F, -0.4F, -0.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F))
				.texOffs(23, 39).addBox(0.0F, -1.4F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 30).addBox(0.0F, -1.4F, 1.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 29).addBox(0.0F, -1.3F, 3.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.9F, -0.4548F, 0.276F, -0.1325F));

		PartDefinition cube_r147 = Tail5.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(48, 60).addBox(0.0F, 4.7436F, 27.7395F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 44).addBox(0.0F, 4.2436F, 25.7395F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 7).addBox(0.0F, 3.7436F, 23.7395F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4021F, -23.796F, 0.1745F, 0.0F, 0.0F));

		PartDefinition TailClaw = Tail5.addOrReplaceChild("TailClaw", CubeListBuilder.create().texOffs(0, 34).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(61, 4).addBox(0.0F, -0.7F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 60).addBox(0.0F, -0.7F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2833F, 6.0253F, -0.7918F, -0.0294F, -0.3379F));

		PartDefinition cube_r148 = TailClaw.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(34, 52).addBox(0.0F, -0.0018F, 0.0497F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9F, 4.9F, -1.85F, 0.0F, 0.0F));

		PartDefinition cube_r149 = TailClaw.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(19, 51).addBox(0.0F, -1.0F, -0.1F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, -1.6232F, 0.0F, 0.0F));

		PartDefinition cube_r150 = TailClaw.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(41, 20).addBox(0.0F, 5.1436F, 31.7395F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 2).addBox(0.0F, 4.9436F, 29.7395F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6854F, -29.8213F, 0.1745F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
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