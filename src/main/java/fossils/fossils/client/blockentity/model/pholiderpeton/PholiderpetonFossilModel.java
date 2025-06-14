package fossils.fossils.client.blockentity.model.pholiderpeton;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PholiderpetonFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart Hips;
	private final ModelPart Bodymiddle;
	private final ModelPart body2;
	private final ModelPart Bodyfront;
	private final ModelPart Rightupperarm;
	private final ModelPart Rightlowerarm;
	private final ModelPart Rightfrontfoot;
	private final ModelPart Leftupperarm;
	private final ModelPart Leftlowerarm;
	private final ModelPart Leftfrontfoot;
	private final ModelPart body;
	private final ModelPart Head;
	private final ModelPart Lowerjawback;
	private final ModelPart Lowerjawmidbase;
	private final ModelPart Lowerjawmidfront;
	private final ModelPart Lowerjawfront;
	private final ModelPart Lowerjawslopefront;
	private final ModelPart Lowerfrontteeth;
	private final ModelPart Rightlowerteeth;
	private final ModelPart Leftlowerteeth;
	private final ModelPart Upperjawbase;
	private final ModelPart Upperjawmiddle;
	private final ModelPart Upperjawfront;
	private final ModelPart Snoutmiddle;
	private final ModelPart Rightupperteeth;
	private final ModelPart Leftupperteeth;
	private final ModelPart Snoutbase;
	private final ModelPart Tailbase;
	private final ModelPart Tailmiddlebase;
	private final ModelPart Tailmiddle;
	private final ModelPart Tailmiddleend;
	private final ModelPart Tailend;
	private final ModelPart Rightthigh;
	private final ModelPart Rightshin;
	private final ModelPart Righthindfoot;
	private final ModelPart Leftthigh;
	private final ModelPart Leftshin;
	private final ModelPart Lefthindfoot;

	public PholiderpetonFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.Hips = this.root.getChild("Hips");
		this.Bodymiddle = this.Hips.getChild("Bodymiddle");
		this.body2 = this.Bodymiddle.getChild("body2");
		this.Bodyfront = this.body2.getChild("Bodyfront");
		this.Rightupperarm = this.Bodyfront.getChild("Rightupperarm");
		this.Rightlowerarm = this.Rightupperarm.getChild("Rightlowerarm");
		this.Rightfrontfoot = this.Rightlowerarm.getChild("Rightfrontfoot");
		this.Leftupperarm = this.Bodyfront.getChild("Leftupperarm");
		this.Leftlowerarm = this.Leftupperarm.getChild("Leftlowerarm");
		this.Leftfrontfoot = this.Leftlowerarm.getChild("Leftfrontfoot");
		this.body = this.Bodyfront.getChild("body");
		this.Head = this.body.getChild("Head");
		this.Lowerjawback = this.Head.getChild("Lowerjawback");
		this.Lowerjawmidbase = this.Lowerjawback.getChild("Lowerjawmidbase");
		this.Lowerjawmidfront = this.Lowerjawmidbase.getChild("Lowerjawmidfront");
		this.Lowerjawfront = this.Lowerjawmidfront.getChild("Lowerjawfront");
		this.Lowerjawslopefront = this.Lowerjawfront.getChild("Lowerjawslopefront");
		this.Lowerfrontteeth = this.Lowerjawfront.getChild("Lowerfrontteeth");
		this.Rightlowerteeth = this.Lowerjawmidfront.getChild("Rightlowerteeth");
		this.Leftlowerteeth = this.Lowerjawmidfront.getChild("Leftlowerteeth");
		this.Upperjawbase = this.Head.getChild("Upperjawbase");
		this.Upperjawmiddle = this.Upperjawbase.getChild("Upperjawmiddle");
		this.Upperjawfront = this.Upperjawmiddle.getChild("Upperjawfront");
		this.Snoutmiddle = this.Upperjawmiddle.getChild("Snoutmiddle");
		this.Rightupperteeth = this.Upperjawmiddle.getChild("Rightupperteeth");
		this.Leftupperteeth = this.Upperjawmiddle.getChild("Leftupperteeth");
		this.Snoutbase = this.Upperjawbase.getChild("Snoutbase");
		this.Tailbase = this.Hips.getChild("Tailbase");
		this.Tailmiddlebase = this.Tailbase.getChild("Tailmiddlebase");
		this.Tailmiddle = this.Tailmiddlebase.getChild("Tailmiddle");
		this.Tailmiddleend = this.Tailmiddle.getChild("Tailmiddleend");
		this.Tailend = this.Tailmiddleend.getChild("Tailend");
		this.Rightthigh = this.Hips.getChild("Rightthigh");
		this.Rightshin = this.Rightthigh.getChild("Rightshin");
		this.Righthindfoot = this.Rightshin.getChild("Righthindfoot");
		this.Leftthigh = this.Hips.getChild("Leftthigh");
		this.Leftshin = this.Leftthigh.getChild("Leftshin");
		this.Lefthindfoot = this.Leftshin.getChild("Lefthindfoot");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 17.0F, 0.0F, 1.069F, -0.0133F, 0.0862F));

		PartDefinition cube_r1 = Hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(80, 53).mirror().addBox(-1.0014F, -0.0526F, -0.499F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4844F, 11.3246F, 0.1637F, 0.1209F, -0.2862F));

		PartDefinition cube_r2 = Hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(80, 47).mirror().addBox(-1.0014F, -0.0526F, -0.499F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7844F, 9.3246F, 0.1637F, 0.1209F, -0.2862F));

		PartDefinition cube_r3 = Hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(80, 45).mirror().addBox(-1.0014F, -0.0526F, -0.499F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.0844F, 7.3246F, 0.2823F, 0.1545F, -0.2699F));

		PartDefinition cube_r4 = Hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(80, 43).mirror().addBox(-1.8293F, -0.5634F, -0.5197F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.0844F, 7.3246F, 0.1212F, 0.2747F, -0.8142F));

		PartDefinition cube_r5 = Hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(46, 32).mirror().addBox(-1.0F, -0.6F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9306F, 3.4761F, 14.4034F, -0.0557F, 0.208F, 0.5539F));

		PartDefinition cube_r6 = Hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(20, 63).mirror().addBox(-0.5F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9719F, 1.8167F, 14.1524F, -0.2656F, 0.0221F, 0.6103F));

		PartDefinition cube_r7 = Hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(59, 47).mirror().addBox(-0.5F, -0.1479F, -2.1622F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1264F, 0.6201F, 14.468F, -0.4314F, 0.0221F, 0.2176F));

		PartDefinition cube_r8 = Hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(59, 19).mirror().addBox(-0.5F, -0.5F, -0.75F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1264F, 0.6201F, 14.468F, 0.0573F, 0.0221F, 0.2176F));

		PartDefinition cube_r9 = Hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(59, 19).addBox(-0.5F, -0.5F, -0.75F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1264F, 0.6201F, 14.468F, 0.0573F, -0.0221F, -0.2176F));

		PartDefinition cube_r10 = Hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(59, 47).addBox(-0.5F, -0.1479F, -2.1622F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1264F, 0.6201F, 14.468F, -0.4314F, -0.0221F, -0.2176F));

		PartDefinition cube_r11 = Hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(20, 63).addBox(-0.5F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9719F, 1.8167F, 14.1524F, -0.2656F, -0.0221F, -0.6103F));

		PartDefinition cube_r12 = Hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(46, 32).addBox(-1.0F, -0.6F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9306F, 3.4761F, 14.4034F, -0.0557F, -0.208F, -0.5539F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(0, 0).addBox(1.5F, -0.5F, -0.2F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-2.0F, -1.0194F, 6.9966F, -0.1484F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r1 = Hips.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(77, 63).addBox(2.0F, -1.1F, 5.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(39, 48).addBox(2.0F, -0.9F, 3.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 81).addBox(2.0F, -0.5F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 81).addBox(2.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -1.1621F, 11.4812F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r13 = Hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(80, 53).addBox(0.0014F, -0.0526F, -0.499F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4844F, 11.3246F, 0.1637F, -0.1209F, 0.2862F));

		PartDefinition cube_r14 = Hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(80, 47).addBox(0.0014F, -0.0526F, -0.499F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7844F, 9.3246F, 0.1637F, -0.1209F, 0.2862F));

		PartDefinition cube_r15 = Hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(80, 45).addBox(0.0014F, -0.0526F, -0.499F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0844F, 7.3246F, 0.2823F, -0.1545F, 0.2699F));

		PartDefinition cube_r16 = Hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(80, 43).addBox(0.8293F, -0.5634F, -0.5197F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0844F, 7.3246F, 0.1212F, -0.2747F, 0.8142F));

		PartDefinition Bodyfront_r2 = Hips.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(82, 0).addBox(2.0F, -0.5F, 9.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 83).addBox(2.0F, -0.6F, 7.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -2.5368F, -0.6415F, -0.1047F, 0.0F, 0.0F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1956F, 6.8969F, -0.2422F, -0.1271F, 0.0313F));

		PartDefinition Bodymiddle_r1 = Bodymiddle.addOrReplaceChild("Bodymiddle_r1", CubeListBuilder.create().texOffs(27, 0).addBox(1.5F, -0.5F, -0.1F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -0.5F, -8.9F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r3 = Bodymiddle.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(74, 81).addBox(2.0F, -0.6F, 5.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 83).addBox(2.0F, -0.6F, 3.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 81).addBox(2.0F, -0.6F, 1.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 81).addBox(2.0F, -0.5F, -0.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -1.3174F, -7.5381F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r17 = Bodymiddle.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(80, 16).mirror().addBox(-1.0014F, -0.0526F, -0.499F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0112F, -1.5723F, 0.3849F, 0.1816F, -0.2527F));

		PartDefinition cube_r18 = Bodymiddle.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(72, 11).mirror().addBox(-2.8293F, -0.5634F, -0.5197F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0112F, -1.5723F, 0.1976F, 0.35F, -0.7907F));

		PartDefinition cube_r19 = Bodymiddle.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(13, 80).mirror().addBox(-1.0014F, -0.0526F, -0.499F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1888F, -3.5723F, 0.412F, 0.116F, -0.1799F));

		PartDefinition cube_r20 = Bodymiddle.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(72, 9).mirror().addBox(-2.8293F, -0.5634F, -0.5197F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1888F, -3.5723F, 0.2571F, 0.3071F, -0.7027F));

		PartDefinition cube_r21 = Bodymiddle.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(79, 78).mirror().addBox(-3.1685F, -1.9026F, -0.5197F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1888F, -3.5723F, 0.0637F, 0.393F, -1.2536F));

		PartDefinition cube_r22 = Bodymiddle.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(79, 76).mirror().addBox(-1.0014F, -0.0526F, -0.499F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2888F, -5.5723F, 0.4289F, 0.0655F, -0.0917F));

		PartDefinition cube_r23 = Bodymiddle.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(72, 7).mirror().addBox(-2.8293F, -0.5634F, -0.5197F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2888F, -5.5723F, 0.2984F, 0.2715F, -0.6041F));

		PartDefinition cube_r24 = Bodymiddle.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 74).mirror().addBox(-4.1685F, -1.9026F, -0.5197F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2888F, -5.5723F, 0.1202F, 0.3832F, -1.1454F));

		PartDefinition cube_r25 = Bodymiddle.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(74, 79).mirror().addBox(-1.0014F, -0.0526F, -0.499F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3888F, -7.5723F, 0.4378F, 0.0484F, 0.0133F));

		PartDefinition cube_r26 = Bodymiddle.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 72).mirror().addBox(-2.8293F, -0.5634F, -0.5197F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3888F, -7.5723F, 0.3151F, 0.2609F, -0.4953F));

		PartDefinition cube_r27 = Bodymiddle.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(64, 61).mirror().addBox(-5.1685F, -1.9026F, -0.5197F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3888F, -7.5723F, 0.141F, 0.3824F, -1.0333F));

		PartDefinition cube_r28 = Bodymiddle.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(72, 11).addBox(0.8293F, -0.5634F, -0.5197F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0112F, -1.5723F, 0.1976F, -0.35F, 0.7907F));

		PartDefinition cube_r29 = Bodymiddle.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(80, 16).addBox(0.0014F, -0.0526F, -0.499F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0112F, -1.5723F, 0.3849F, -0.1816F, 0.2527F));

		PartDefinition cube_r30 = Bodymiddle.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(79, 78).addBox(2.1685F, -1.9026F, -0.5197F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1888F, -3.5723F, 0.0637F, -0.393F, 1.2536F));

		PartDefinition cube_r31 = Bodymiddle.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(72, 9).addBox(0.8293F, -0.5634F, -0.5197F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1888F, -3.5723F, 0.2571F, -0.3071F, 0.7027F));

		PartDefinition cube_r32 = Bodymiddle.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(13, 80).addBox(0.0014F, -0.0526F, -0.499F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1888F, -3.5723F, 0.412F, -0.116F, 0.1799F));

		PartDefinition cube_r33 = Bodymiddle.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(0, 74).addBox(2.1685F, -1.9026F, -0.5197F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2888F, -5.5723F, 0.1202F, -0.3832F, 1.1454F));

		PartDefinition cube_r34 = Bodymiddle.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(72, 7).addBox(0.8293F, -0.5634F, -0.5197F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2888F, -5.5723F, 0.2984F, -0.2715F, 0.6041F));

		PartDefinition cube_r35 = Bodymiddle.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(79, 76).addBox(0.0014F, -0.0526F, -0.499F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2888F, -5.5723F, 0.4289F, -0.0655F, 0.0917F));

		PartDefinition cube_r36 = Bodymiddle.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(74, 79).addBox(0.0014F, -0.0526F, -0.499F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3888F, -7.5723F, 0.4378F, -0.0484F, -0.0133F));

		PartDefinition cube_r37 = Bodymiddle.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(0, 72).addBox(0.8293F, -0.5634F, -0.5197F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3888F, -7.5723F, 0.3151F, -0.2609F, 0.4953F));

		PartDefinition cube_r38 = Bodymiddle.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(64, 61).addBox(2.1685F, -1.9026F, -0.5197F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3888F, -7.5723F, 0.141F, -0.3824F, 1.0333F));

		PartDefinition body2 = Bodymiddle.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(0, 14).addBox(-0.5F, -0.5255F, -10.965F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.4745F, -8.935F, -0.22F, -0.1278F, 0.0285F));

		PartDefinition Bodyfront_r4 = body2.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(62, 81).addBox(2.0F, -0.4F, 6.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(59, 81).addBox(2.0F, -0.4F, 4.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(81, 57).addBox(2.0F, -0.4F, 2.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(56, 81).addBox(2.0F, -0.4F, 0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(53, 81).addBox(2.0F, -0.4F, -1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -1.1F, -7.6F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r5 = body2.addOrReplaceChild("Bodyfront_r5", CubeListBuilder.create().texOffs(42, 81).addBox(2.0F, -1.7F, 7.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.3744F, -18.065F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r39 = body2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(63, 79).mirror().addBox(-2.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.1144F, -10.6372F, 0.4369F, -0.0214F, 0.0482F));

		PartDefinition cube_r40 = body2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(0, 63).mirror().addBox(-6.6959F, -2.752F, -0.5375F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.1144F, -10.6372F, 0.2047F, 0.346F, -0.9757F));

		PartDefinition cube_r41 = body2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(61, 72).mirror().addBox(-3.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.1144F, -10.6372F, 0.349F, 0.1994F, -0.4527F));

		PartDefinition cube_r42 = body2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(58, 79).mirror().addBox(-2.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.1144F, -8.6372F, 0.4369F, -0.0214F, 0.0482F));

		PartDefinition cube_r43 = body2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(9, 61).mirror().addBox(-6.6959F, -2.752F, -0.5375F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.1144F, -8.6372F, 0.2047F, 0.346F, -0.9757F));

		PartDefinition cube_r44 = body2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(70, 71).mirror().addBox(-3.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.1144F, -8.6372F, 0.349F, 0.1994F, -0.4527F));

		PartDefinition cube_r45 = body2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(79, 10).mirror().addBox(-2.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.1144F, -0.6372F, 0.4369F, -0.0214F, 0.0482F));

		PartDefinition cube_r46 = body2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(61, 16).mirror().addBox(-6.6959F, -2.752F, -0.5375F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.1144F, -0.6372F, 0.2047F, 0.346F, -0.9757F));

		PartDefinition cube_r47 = body2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(71, 59).mirror().addBox(-3.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.1144F, -0.6372F, 0.349F, 0.1994F, -0.4527F));

		PartDefinition cube_r48 = body2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(77, 71).mirror().addBox(-2.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.1144F, -2.6372F, 0.4369F, -0.0214F, 0.0482F));

		PartDefinition cube_r49 = body2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(61, 14).mirror().addBox(-6.6959F, -2.752F, -0.5375F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.1144F, -2.6372F, 0.2047F, 0.346F, -0.9757F));

		PartDefinition cube_r50 = body2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(71, 57).mirror().addBox(-3.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.1144F, -2.6372F, 0.349F, 0.1994F, -0.4527F));

		PartDefinition cube_r51 = body2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(77, 27).mirror().addBox(-2.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.1144F, -4.6372F, 0.4369F, -0.0214F, 0.0482F));

		PartDefinition cube_r52 = body2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(61, 12).mirror().addBox(-6.6959F, -2.752F, -0.5375F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.1144F, -4.6372F, 0.2047F, 0.346F, -0.9757F));

		PartDefinition cube_r53 = body2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(70, 28).mirror().addBox(-3.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.1144F, -4.6372F, 0.349F, 0.1994F, -0.4527F));

		PartDefinition cube_r54 = body2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(68, 55).mirror().addBox(-3.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.1144F, -6.6372F, 0.349F, 0.1994F, -0.4527F));

		PartDefinition cube_r55 = body2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(59, 24).mirror().addBox(-6.6959F, -2.752F, -0.5375F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.1144F, -6.6372F, 0.2047F, 0.346F, -0.9757F));

		PartDefinition cube_r56 = body2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(15, 67).mirror().addBox(-2.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.1144F, -6.6372F, 0.4369F, -0.0214F, 0.0482F));

		PartDefinition cube_r57 = body2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(61, 72).addBox(1.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.1144F, -10.6372F, 0.349F, -0.1994F, 0.4527F));

		PartDefinition cube_r58 = body2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(0, 63).addBox(2.6959F, -2.752F, -0.5375F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.1144F, -10.6372F, 0.2047F, -0.346F, 0.9757F));

		PartDefinition cube_r59 = body2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(63, 79).addBox(1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.1144F, -10.6372F, 0.4369F, 0.0214F, -0.0482F));

		PartDefinition cube_r60 = body2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(70, 71).addBox(1.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.1144F, -8.6372F, 0.349F, -0.1994F, 0.4527F));

		PartDefinition cube_r61 = body2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(9, 61).addBox(2.6959F, -2.752F, -0.5375F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.1144F, -8.6372F, 0.2047F, -0.346F, 0.9757F));

		PartDefinition cube_r62 = body2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(58, 79).addBox(1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.1144F, -8.6372F, 0.4369F, 0.0214F, -0.0482F));

		PartDefinition cube_r63 = body2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(71, 59).addBox(1.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.1144F, -0.6372F, 0.349F, -0.1994F, 0.4527F));

		PartDefinition cube_r64 = body2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(61, 16).addBox(2.6959F, -2.752F, -0.5375F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.1144F, -0.6372F, 0.2047F, -0.346F, 0.9757F));

		PartDefinition cube_r65 = body2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(79, 10).addBox(1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.1144F, -0.6372F, 0.4369F, 0.0214F, -0.0482F));

		PartDefinition cube_r66 = body2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(71, 57).addBox(1.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.1144F, -2.6372F, 0.349F, -0.1994F, 0.4527F));

		PartDefinition cube_r67 = body2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(61, 14).addBox(2.6959F, -2.752F, -0.5375F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.1144F, -2.6372F, 0.2047F, -0.346F, 0.9757F));

		PartDefinition cube_r68 = body2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(77, 71).addBox(1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.1144F, -2.6372F, 0.4369F, 0.0214F, -0.0482F));

		PartDefinition cube_r69 = body2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(70, 28).addBox(1.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.1144F, -4.6372F, 0.349F, -0.1994F, 0.4527F));

		PartDefinition cube_r70 = body2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(61, 12).addBox(2.6959F, -2.752F, -0.5375F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.1144F, -4.6372F, 0.2047F, -0.346F, 0.9757F));

		PartDefinition cube_r71 = body2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(77, 27).addBox(1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.1144F, -4.6372F, 0.4369F, 0.0214F, -0.0482F));

		PartDefinition cube_r72 = body2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(15, 67).addBox(1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.1144F, -6.6372F, 0.4369F, 0.0214F, -0.0482F));

		PartDefinition cube_r73 = body2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(59, 24).addBox(2.6959F, -2.752F, -0.5375F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.1144F, -6.6372F, 0.2047F, -0.346F, 0.9757F));

		PartDefinition cube_r74 = body2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(68, 55).addBox(1.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.1144F, -6.6372F, 0.349F, -0.1994F, 0.4527F));

		PartDefinition Bodyfront = body2.addOrReplaceChild("Bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0445F, -10.8813F, -0.2899F, 0.2093F, -0.0619F));

		PartDefinition Bodyfront_r6 = Bodyfront.addOrReplaceChild("Bodyfront_r6", CubeListBuilder.create().texOffs(39, 81).addBox(2.0F, -1.7F, 5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 80).addBox(2.0F, -1.7F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 81).addBox(2.0F, -1.5F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 37).addBox(1.5F, -0.7F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.3F, -7.0F, 0.0262F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r7 = Bodyfront.addOrReplaceChild("Bodyfront_r7", CubeListBuilder.create().texOffs(63, 68).mirror().addBox(-1.0F, -1.1F, 0.1F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.7737F, 4.7475F, -7.0656F, 1.4445F, 0.0995F, 0.1231F));

		PartDefinition Bodyfront_r8 = Bodyfront.addOrReplaceChild("Bodyfront_r8", CubeListBuilder.create().texOffs(0, 56).mirror().addBox(-0.3F, -1.0F, -3.9F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 0.297F, -6.484F, 1.417F, 0.2405F, 0.3135F));

		PartDefinition Bodyfront_r9 = Bodyfront.addOrReplaceChild("Bodyfront_r9", CubeListBuilder.create().texOffs(11, 63).mirror().addBox(-1.9F, -1.0F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8836F, 3.6066F, -8.7136F, 0.9042F, 0.0921F, 0.1164F));

		PartDefinition Bodyfront_r10 = Bodyfront.addOrReplaceChild("Bodyfront_r10", CubeListBuilder.create().texOffs(48, 19).mirror().addBox(-0.3F, -0.8F, -4.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 0.297F, -6.484F, 0.937F, 0.2405F, 0.3135F));

		PartDefinition cube_r75 = Bodyfront.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(80, 31).mirror().addBox(-1.0014F, -0.0526F, -0.499F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0412F, -5.5559F, 0.6634F, -0.0081F, -0.0599F));

		PartDefinition cube_r76 = Bodyfront.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(73, 32).mirror().addBox(-2.8293F, -0.5634F, -0.5197F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0412F, -5.5559F, 0.5511F, 0.3148F, -0.5058F));

		PartDefinition cube_r77 = Bodyfront.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(22, 74).mirror().addBox(-4.1685F, -1.9026F, -0.5197F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0412F, -5.5559F, 0.3288F, 0.5435F, -1.0267F));

		PartDefinition cube_r78 = Bodyfront.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(80, 29).mirror().addBox(-1.0014F, -0.0526F, -0.499F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0588F, -3.5559F, 0.5127F, -0.0234F, 0.0043F));

		PartDefinition cube_r79 = Bodyfront.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(73, 30).mirror().addBox(-2.8293F, -0.5634F, -0.5197F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0588F, -3.5559F, 0.4184F, 0.2334F, -0.4799F));

		PartDefinition cube_r80 = Bodyfront.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(7, 74).mirror().addBox(-4.1685F, -1.9026F, -0.5197F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0588F, -3.5559F, 0.2496F, 0.4093F, -1.0012F));

		PartDefinition cube_r81 = Bodyfront.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(80, 18).mirror().addBox(-1.0014F, -0.0526F, -0.499F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0588F, -1.5559F, 0.4369F, -0.0214F, 0.0482F));

		PartDefinition cube_r82 = Bodyfront.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(15, 73).mirror().addBox(-2.8293F, -0.5634F, -0.5197F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0588F, -1.5559F, 0.349F, 0.1994F, -0.4527F));

		PartDefinition cube_r83 = Bodyfront.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(68, 22).mirror().addBox(-5.1685F, -1.9026F, -0.5197F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0588F, -1.5559F, 0.2047F, 0.346F, -0.9757F));

		PartDefinition Bodyfront_r11 = Bodyfront.addOrReplaceChild("Bodyfront_r11", CubeListBuilder.create().texOffs(48, 19).addBox(-0.7F, -0.8F, -4.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.0F, 0.297F, -6.484F, 0.937F, -0.2405F, -0.3135F));

		PartDefinition Bodyfront_r12 = Bodyfront.addOrReplaceChild("Bodyfront_r12", CubeListBuilder.create().texOffs(11, 63).addBox(-1.1F, -1.0F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8836F, 3.6066F, -8.7136F, 0.9042F, -0.0921F, -0.1164F));

		PartDefinition Bodyfront_r13 = Bodyfront.addOrReplaceChild("Bodyfront_r13", CubeListBuilder.create().texOffs(0, 56).addBox(-0.7F, -1.0F, -3.9F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 0.297F, -6.484F, 1.417F, -0.2405F, -0.3135F));

		PartDefinition Bodyfront_r14 = Bodyfront.addOrReplaceChild("Bodyfront_r14", CubeListBuilder.create().texOffs(63, 68).addBox(-1.0F, -1.1F, 0.1F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7737F, 4.7475F, -7.0656F, 1.4445F, -0.0995F, -0.1231F));

		PartDefinition Bodyfront_r15 = Bodyfront.addOrReplaceChild("Bodyfront_r15", CubeListBuilder.create().texOffs(38, 11).addBox(-1.5F, -0.8F, -0.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.7164F, -9.5647F, -0.7767F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r16 = Bodyfront.addOrReplaceChild("Bodyfront_r16", CubeListBuilder.create().texOffs(59, 42).addBox(0.0F, -0.3F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.1614F, -7.6046F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r84 = Bodyfront.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(22, 74).addBox(2.1685F, -1.9026F, -0.5197F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0412F, -5.5559F, 0.3288F, -0.5435F, 1.0267F));

		PartDefinition cube_r85 = Bodyfront.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(73, 32).addBox(0.8293F, -0.5634F, -0.5197F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0412F, -5.5559F, 0.5511F, -0.3148F, 0.5058F));

		PartDefinition cube_r86 = Bodyfront.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(80, 31).addBox(0.0014F, -0.0526F, -0.499F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0412F, -5.5559F, 0.6634F, 0.0081F, 0.0599F));

		PartDefinition cube_r87 = Bodyfront.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(7, 74).addBox(2.1685F, -1.9026F, -0.5197F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0588F, -3.5559F, 0.2496F, -0.4093F, 1.0012F));

		PartDefinition cube_r88 = Bodyfront.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(73, 30).addBox(0.8293F, -0.5634F, -0.5197F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0588F, -3.5559F, 0.4184F, -0.2334F, 0.4799F));

		PartDefinition cube_r89 = Bodyfront.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(80, 29).addBox(0.0014F, -0.0526F, -0.499F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0588F, -3.5559F, 0.5127F, 0.0234F, -0.0043F));

		PartDefinition cube_r90 = Bodyfront.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(68, 22).addBox(2.1685F, -1.9026F, -0.5197F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0588F, -1.5559F, 0.0862F, -0.417F, 1.0199F));

		PartDefinition cube_r91 = Bodyfront.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(15, 73).addBox(0.8293F, -0.5634F, -0.5197F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0588F, -1.5559F, 0.2889F, -0.3167F, 0.4681F));

		PartDefinition cube_r92 = Bodyfront.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(80, 18).addBox(0.0014F, -0.0526F, -0.499F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0588F, -1.5559F, 0.4432F, -0.1094F, -0.0484F));

		PartDefinition Rightupperarm = Bodyfront.addOrReplaceChild("Rightupperarm", CubeListBuilder.create().texOffs(27, 11).addBox(-0.2403F, -0.5155F, -0.4669F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6437F, 4.05F, -7.3306F, 0.9933F, -1.3436F, -1.2166F));

		PartDefinition Rightlowerarm = Rightupperarm.addOrReplaceChild("Rightlowerarm", CubeListBuilder.create().texOffs(27, 63).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 63).addBox(-1.5F, -0.5F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.0857F, 0.1059F, 0.5969F, -0.1966F, -0.3035F, -1.1647F));

		PartDefinition Rightfrontfoot = Rightlowerarm.addOrReplaceChild("Rightfrontfoot", CubeListBuilder.create().texOffs(46, 26).addBox(-2.0F, 0.0F, -3.5F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4513F, 4.656F, -0.6013F, 1.8885F, 0.1575F, 0.1734F));

		PartDefinition Leftupperarm = Bodyfront.addOrReplaceChild("Leftupperarm", CubeListBuilder.create().texOffs(24, 60).addBox(-3.7597F, -0.5155F, -0.4669F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.6437F, 4.05F, -7.3306F, 0.5335F, 1.2773F, 0.7387F));

		PartDefinition Leftlowerarm = Leftupperarm.addOrReplaceChild("Leftlowerarm", CubeListBuilder.create().texOffs(32, 63).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(51, 63).addBox(0.5F, -0.5F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-4.0857F, 0.1059F, 0.5969F, -0.1966F, 0.3035F, 1.1647F));

		PartDefinition Leftfrontfoot = Leftlowerarm.addOrReplaceChild("Leftfrontfoot", CubeListBuilder.create().texOffs(42, 46).addBox(-2.0F, 0.0F, -3.5F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4513F, 4.656F, -0.6013F, 1.8885F, -0.1575F, -0.1734F));

		PartDefinition body = Bodyfront.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1F, -7.0F, -0.3985F, 0.2114F, -0.0341F));

		PartDefinition Bodyfront_r17 = body.addOrReplaceChild("Bodyfront_r17", CubeListBuilder.create().texOffs(81, 49).addBox(2.0F, -1.0F, -3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(45, 81).addBox(2.0F, -1.3F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.2F, 0.0F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(80, 37).mirror().addBox(-1.0014F, -0.0526F, -0.499F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3412F, -2.5559F, 0.802F, 0.4301F, -0.2723F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(80, 35).mirror().addBox(-1.8293F, -0.5634F, -0.5197F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3412F, -2.5559F, 0.4543F, 0.7659F, -0.7991F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(80, 33).mirror().addBox(-1.0014F, -0.0526F, -0.499F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1411F, -0.5559F, 0.6106F, 0.1946F, -0.2569F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(36, 73).mirror().addBox(-2.8293F, -0.5634F, -0.5197F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1411F, -0.5559F, 0.4006F, 0.4717F, -0.7557F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(80, 35).addBox(0.8293F, -0.5634F, -0.5197F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3412F, -2.5559F, 0.4543F, -0.7659F, 0.7991F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(80, 37).addBox(0.0014F, -0.0526F, -0.499F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3412F, -2.5559F, 0.802F, -0.4301F, 0.2723F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(36, 73).addBox(0.8293F, -0.5634F, -0.5197F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1411F, -0.5559F, 0.4006F, -0.4717F, 0.7557F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(80, 33).addBox(0.0014F, -0.0526F, -0.499F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1411F, -0.5559F, 0.6106F, -0.1946F, 0.2569F));

		PartDefinition Bodyfront_r18 = body.addOrReplaceChild("Bodyfront_r18", CubeListBuilder.create().texOffs(0, 48).addBox(1.5F, -0.5F, -2.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.4F, -3.7F, 0.096F, 0.0F, 0.0F));

		PartDefinition Head = body.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4566F, -5.3203F, -0.432F, 0.3299F, -0.0996F));

		PartDefinition Lowerjawback = Head.addOrReplaceChild("Lowerjawback", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.484F, 3.5363F, -0.3491F, 0.0F, 0.0F));

		PartDefinition Lowerjawmidbase = Lowerjawback.addOrReplaceChild("Lowerjawmidbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4526F, -1.8984F, 1.4961F, 0.0F, 0.0F));

		PartDefinition Lowerjawmidbase_r1 = Lowerjawmidbase.addOrReplaceChild("Lowerjawmidbase_r1", CubeListBuilder.create().texOffs(15, 55).mirror().addBox(-0.133F, -0.9935F, -5.6274F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.7235F, 0.5992F, 0.0491F, -0.0274F, -0.2792F, 0.0178F));

		PartDefinition Lowerjawmidbase_r2 = Lowerjawmidbase.addOrReplaceChild("Lowerjawmidbase_r2", CubeListBuilder.create().texOffs(50, 74).mirror().addBox(-0.0804F, 1.9388F, -4.8653F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.7235F, 0.5992F, 0.0491F, -0.5388F, -0.2771F, 0.0478F));

		PartDefinition Lowerjawmidbase_r3 = Lowerjawmidbase.addOrReplaceChild("Lowerjawmidbase_r3", CubeListBuilder.create().texOffs(56, 72).mirror().addBox(-0.133F, 1.3762F, -4.3663F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-3.7235F, 0.5992F, 0.0491F, -0.394F, -0.2792F, 0.0178F));

		PartDefinition Lowerjawmidbase_r4 = Lowerjawmidbase.addOrReplaceChild("Lowerjawmidbase_r4", CubeListBuilder.create().texOffs(9, 56).mirror().addBox(-0.133F, 0.6083F, -3.9926F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-3.7235F, 0.5992F, 0.0491F, -0.1845F, -0.2792F, 0.0178F));

		PartDefinition Lowerjawmidbase_r5 = Lowerjawmidbase.addOrReplaceChild("Lowerjawmidbase_r5", CubeListBuilder.create().texOffs(51, 70).mirror().addBox(-0.133F, -0.4353F, -3.6494F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-3.7235F, 0.5992F, 0.0491F, 0.1296F, -0.2792F, 0.0178F));

		PartDefinition Lowerjawmidbase_r6 = Lowerjawmidbase.addOrReplaceChild("Lowerjawmidbase_r6", CubeListBuilder.create().texOffs(75, 17).mirror().addBox(-0.133F, -1.1671F, -2.9617F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.7235F, 0.5992F, 0.0491F, 0.3914F, -0.2792F, 0.0178F));

		PartDefinition Lowerjawmidbase_r7 = Lowerjawmidbase.addOrReplaceChild("Lowerjawmidbase_r7", CubeListBuilder.create().texOffs(68, 51).mirror().addBox(-0.133F, -0.787F, -2.1187F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-3.7235F, 0.5992F, 0.0491F, 0.6969F, -0.2792F, 0.0178F));

		PartDefinition Lowerjawmidbase_r8 = Lowerjawmidbase.addOrReplaceChild("Lowerjawmidbase_r8", CubeListBuilder.create().texOffs(82, 26).mirror().addBox(0.1983F, -0.8629F, 1.4023F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1F, -0.8289F, -6.3455F, -0.5542F, -0.145F, 0.0605F));

		PartDefinition Lowerjawmidbase_r9 = Lowerjawmidbase.addOrReplaceChild("Lowerjawmidbase_r9", CubeListBuilder.create().texOffs(5, 76).mirror().addBox(-0.1252F, -0.0998F, -2.234F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(72, 13).mirror().addBox(-0.1252F, -0.8998F, -2.734F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.7235F, 0.5992F, 0.0491F, -0.0727F, -0.279F, 0.0272F));

		PartDefinition Lowerjawmidbase_r10 = Lowerjawmidbase.addOrReplaceChild("Lowerjawmidbase_r10", CubeListBuilder.create().texOffs(68, 47).mirror().addBox(-0.1252F, -0.6563F, -1.8373F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.7235F, 0.5992F, 0.0491F, -0.2036F, -0.279F, 0.0272F));

		PartDefinition Lowerjawmidbase_r11 = Lowerjawmidbase.addOrReplaceChild("Lowerjawmidbase_r11", CubeListBuilder.create().texOffs(15, 55).addBox(-0.867F, -0.9935F, -5.6274F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.7235F, 0.5992F, 0.0491F, -0.0274F, 0.2792F, -0.0178F));

		PartDefinition Lowerjawmidbase_r12 = Lowerjawmidbase.addOrReplaceChild("Lowerjawmidbase_r12", CubeListBuilder.create().texOffs(50, 74).addBox(-0.9196F, 1.9388F, -4.8653F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.7235F, 0.5992F, 0.0491F, -0.5388F, 0.2771F, -0.0478F));

		PartDefinition Lowerjawmidbase_r13 = Lowerjawmidbase.addOrReplaceChild("Lowerjawmidbase_r13", CubeListBuilder.create().texOffs(56, 72).addBox(-0.867F, 1.3762F, -4.3663F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(3.7235F, 0.5992F, 0.0491F, -0.394F, 0.2792F, -0.0178F));

		PartDefinition Lowerjawmidbase_r14 = Lowerjawmidbase.addOrReplaceChild("Lowerjawmidbase_r14", CubeListBuilder.create().texOffs(9, 56).addBox(-0.867F, 0.6083F, -3.9926F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(3.7235F, 0.5992F, 0.0491F, -0.1845F, 0.2792F, -0.0178F));

		PartDefinition Lowerjawmidbase_r15 = Lowerjawmidbase.addOrReplaceChild("Lowerjawmidbase_r15", CubeListBuilder.create().texOffs(51, 70).addBox(-0.867F, -0.4353F, -3.6494F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(3.7235F, 0.5992F, 0.0491F, 0.1296F, 0.2792F, -0.0178F));

		PartDefinition Lowerjawmidbase_r16 = Lowerjawmidbase.addOrReplaceChild("Lowerjawmidbase_r16", CubeListBuilder.create().texOffs(75, 17).addBox(-0.867F, -1.1671F, -2.9617F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.7235F, 0.5992F, 0.0491F, 0.3914F, 0.2792F, -0.0178F));

		PartDefinition Lowerjawmidbase_r17 = Lowerjawmidbase.addOrReplaceChild("Lowerjawmidbase_r17", CubeListBuilder.create().texOffs(68, 51).addBox(-0.867F, -0.787F, -2.1187F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(3.7235F, 0.5992F, 0.0491F, 0.6969F, 0.2792F, -0.0178F));

		PartDefinition Lowerjawmidbase_r18 = Lowerjawmidbase.addOrReplaceChild("Lowerjawmidbase_r18", CubeListBuilder.create().texOffs(82, 26).addBox(-0.1983F, -0.8629F, 1.4023F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1F, -0.8289F, -6.3455F, -0.5542F, 0.145F, -0.0605F));

		PartDefinition Lowerjawmidbase_r19 = Lowerjawmidbase.addOrReplaceChild("Lowerjawmidbase_r19", CubeListBuilder.create().texOffs(5, 76).addBox(-0.8748F, -0.0998F, -2.234F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(72, 13).addBox(-0.8748F, -0.8998F, -2.734F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7235F, 0.5992F, 0.0491F, -0.0727F, 0.279F, -0.0272F));

		PartDefinition Lowerjawmidbase_r20 = Lowerjawmidbase.addOrReplaceChild("Lowerjawmidbase_r20", CubeListBuilder.create().texOffs(68, 47).addBox(-0.8748F, -0.6563F, -1.8373F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.7235F, 0.5992F, 0.0491F, -0.2036F, 0.279F, -0.0272F));

		PartDefinition Lowerjawmidfront = Lowerjawmidbase.addOrReplaceChild("Lowerjawmidfront", CubeListBuilder.create(), PartPose.offset(0.0F, -0.2255F, -5.7775F));

		PartDefinition Lowerjawmidfront_r1 = Lowerjawmidfront.addOrReplaceChild("Lowerjawmidfront_r1", CubeListBuilder.create().texOffs(56, 68).mirror().addBox(0.6719F, 0.763F, -0.5498F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7F, -0.8624F, -0.1564F, -0.5387F, -0.2756F, 0.1003F));

		PartDefinition Lowerjawmidfront_r2 = Lowerjawmidfront.addOrReplaceChild("Lowerjawmidfront_r2", CubeListBuilder.create().texOffs(56, 68).addBox(-1.6719F, 0.763F, -0.5498F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7F, -0.8624F, -0.1564F, -0.5387F, 0.2756F, -0.1003F));

		PartDefinition Lowerjawfront = Lowerjawmidfront.addOrReplaceChild("Lowerjawfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0F, -2.0F, -0.0213F, 0.0F, 0.0F));

		PartDefinition Lowerjawfront_r1 = Lowerjawfront.addOrReplaceChild("Lowerjawfront_r1", CubeListBuilder.create().texOffs(6, 83).mirror().addBox(0.5665F, 1.0927F, -4.646F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7F, -1.8624F, 1.8436F, -0.8323F, -0.3873F, 0.1264F));

		PartDefinition Lowerjawfront_r2 = Lowerjawfront.addOrReplaceChild("Lowerjawfront_r2", CubeListBuilder.create().texOffs(79, 80).mirror().addBox(0.5665F, -0.1017F, -3.5025F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(80, 73).mirror().addBox(0.5665F, -0.1017F, -1.8025F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7F, -1.8624F, 1.8436F, -0.5269F, -0.3873F, 0.1264F));

		PartDefinition Lowerjawfront_r3 = Lowerjawfront.addOrReplaceChild("Lowerjawfront_r3", CubeListBuilder.create().texOffs(80, 73).addBox(-0.5665F, -0.1017F, -1.8025F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 80).addBox(-0.5665F, -0.1017F, -3.5025F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7F, -1.8624F, 1.8436F, -0.5269F, 0.3873F, -0.1264F));

		PartDefinition Lowerjawfront_r4 = Lowerjawfront.addOrReplaceChild("Lowerjawfront_r4", CubeListBuilder.create().texOffs(6, 83).addBox(-0.5665F, 1.0927F, -4.646F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7F, -1.8624F, 1.8436F, -0.8323F, 0.3873F, -0.1264F));

		PartDefinition Lowerjawslopefront = Lowerjawfront.addOrReplaceChild("Lowerjawslopefront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0F, 0.1F, -0.3396F, 0.0F, 0.0F));

		PartDefinition Lowerjawslopefront_r1 = Lowerjawslopefront.addOrReplaceChild("Lowerjawslopefront_r1", CubeListBuilder.create().texOffs(77, 3).mirror().addBox(0.3732F, 2.6622F, -5.1782F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(13, 77).mirror().addBox(0.3732F, 2.6622F, -5.6782F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.7F, -2.8624F, 1.7436F, -0.7285F, -0.2742F, -0.0046F));

		PartDefinition Lowerjawslopefront_r2 = Lowerjawslopefront.addOrReplaceChild("Lowerjawslopefront_r2", CubeListBuilder.create().texOffs(68, 35).mirror().addBox(0.3732F, 1.2682F, -5.1329F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.7F, -2.8624F, 1.7436F, -0.4274F, -0.2742F, -0.0046F));

		PartDefinition Lowerjawslopefront_r3 = Lowerjawslopefront.addOrReplaceChild("Lowerjawslopefront_r3", CubeListBuilder.create().texOffs(68, 39).mirror().addBox(0.3732F, 0.0209F, -5.5062F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.7F, -2.8624F, 1.7436F, -0.2049F, -0.2742F, -0.0046F));

		PartDefinition Lowerjawslopefront_r4 = Lowerjawslopefront.addOrReplaceChild("Lowerjawslopefront_r4", CubeListBuilder.create().texOffs(64, 57).mirror().addBox(0.3732F, -0.1654F, -3.5577F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.7F, -2.8624F, 1.7436F, -0.1525F, -0.2742F, -0.0046F));

		PartDefinition Lowerjawslopefront_r5 = Lowerjawslopefront.addOrReplaceChild("Lowerjawslopefront_r5", CubeListBuilder.create().texOffs(65, 7).mirror().addBox(0.3732F, 1.2447F, -3.4121F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.7F, -2.8624F, 1.7436F, -0.4231F, -0.2742F, -0.0046F));

		PartDefinition Lowerjawslopefront_r6 = Lowerjawslopefront.addOrReplaceChild("Lowerjawslopefront_r6", CubeListBuilder.create().texOffs(68, 18).mirror().addBox(0.3732F, 1.0382F, -1.6903F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.7F, -2.8624F, 1.7436F, -0.2922F, -0.2742F, -0.0046F));

		PartDefinition Lowerjawslopefront_r7 = Lowerjawslopefront.addOrReplaceChild("Lowerjawslopefront_r7", CubeListBuilder.create().texOffs(68, 35).addBox(-1.3732F, 1.2682F, -5.1329F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.7F, -2.8624F, 1.7436F, -0.4274F, 0.2742F, 0.0046F));

		PartDefinition Lowerjawslopefront_r8 = Lowerjawslopefront.addOrReplaceChild("Lowerjawslopefront_r8", CubeListBuilder.create().texOffs(13, 77).addBox(-1.3732F, 2.6622F, -5.6782F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F))
				.texOffs(77, 3).addBox(-1.3732F, 2.6622F, -5.1782F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.7F, -2.8624F, 1.7436F, -0.7285F, 0.2742F, 0.0046F));

		PartDefinition Lowerjawslopefront_r9 = Lowerjawslopefront.addOrReplaceChild("Lowerjawslopefront_r9", CubeListBuilder.create().texOffs(68, 39).addBox(-1.3732F, 0.0209F, -5.5062F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.7F, -2.8624F, 1.7436F, -0.2049F, 0.2742F, 0.0046F));

		PartDefinition Lowerjawslopefront_r10 = Lowerjawslopefront.addOrReplaceChild("Lowerjawslopefront_r10", CubeListBuilder.create().texOffs(64, 57).addBox(-1.3732F, -0.1654F, -3.5577F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.7F, -2.8624F, 1.7436F, -0.1525F, 0.2742F, 0.0046F));

		PartDefinition Lowerjawslopefront_r11 = Lowerjawslopefront.addOrReplaceChild("Lowerjawslopefront_r11", CubeListBuilder.create().texOffs(65, 7).addBox(-1.3732F, 1.2447F, -3.4121F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.7F, -2.8624F, 1.7436F, -0.4231F, 0.2742F, 0.0046F));

		PartDefinition Lowerjawslopefront_r12 = Lowerjawslopefront.addOrReplaceChild("Lowerjawslopefront_r12", CubeListBuilder.create().texOffs(68, 18).addBox(-1.3732F, 1.0382F, -1.6903F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.7F, -2.8624F, 1.7436F, -0.2922F, 0.2742F, 0.0046F));

		PartDefinition Lowerfrontteeth = Lowerjawfront.addOrReplaceChild("Lowerfrontteeth", CubeListBuilder.create(), PartPose.offset(0.0F, -0.5F, -2.6F));

		PartDefinition Rightlowerteeth = Lowerjawmidfront.addOrReplaceChild("Rightlowerteeth", CubeListBuilder.create(), PartPose.offsetAndRotation(2.45F, 0.5F, -1.0F, 0.0F, 0.1911F, 0.0F));

		PartDefinition Rightlowerteeth_r1 = Rightlowerteeth.addOrReplaceChild("Rightlowerteeth_r1", CubeListBuilder.create().texOffs(80, 68).addBox(-0.9277F, -0.2502F, -0.3038F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.25F, -1.3624F, 0.8436F, -0.4226F, 0.0816F, -0.103F));

		PartDefinition Rightlowerteeth_r2 = Rightlowerteeth.addOrReplaceChild("Rightlowerteeth_r2", CubeListBuilder.create().texOffs(29, 70).addBox(-1.7721F, 0.0332F, -0.663F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.25F, -1.3624F, 0.8436F, -0.3698F, 0.0653F, -0.0966F));

		PartDefinition Leftlowerteeth = Lowerjawmidfront.addOrReplaceChild("Leftlowerteeth", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.45F, 0.5F, -1.0F, 0.0F, -0.1911F, 0.0F));

		PartDefinition Leftlowerteeth_r1 = Leftlowerteeth.addOrReplaceChild("Leftlowerteeth_r1", CubeListBuilder.create().texOffs(80, 68).mirror().addBox(0.9277F, -0.2502F, -0.3038F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.25F, -1.3624F, 0.8436F, -0.4226F, -0.0816F, 0.103F));

		PartDefinition Leftlowerteeth_r2 = Leftlowerteeth.addOrReplaceChild("Leftlowerteeth_r2", CubeListBuilder.create().texOffs(29, 70).mirror().addBox(0.7721F, 0.0332F, -0.663F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.25F, -1.3624F, 0.8436F, -0.3698F, -0.0653F, 0.0966F));

		PartDefinition Upperjawbase = Head.addOrReplaceChild("Upperjawbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.516F, -0.4637F, 0.0213F, 0.0F, 0.0F));

		PartDefinition Upperjawbase_r1 = Upperjawbase.addOrReplaceChild("Upperjawbase_r1", CubeListBuilder.create().texOffs(70, 24).mirror().addBox(0.4128F, 0.5158F, 1.443F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9385F, -1.0053F, -1.5884F, 0.005F, -0.557F, 0.0436F));

		PartDefinition Upperjawbase_r2 = Upperjawbase.addOrReplaceChild("Upperjawbase_r2", CubeListBuilder.create().texOffs(70, 24).addBox(-1.4127F, 0.5158F, 1.443F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9385F, -1.0053F, -1.5884F, 0.005F, 0.557F, -0.0436F));

		PartDefinition Upperjawbase_r3 = Upperjawbase.addOrReplaceChild("Upperjawbase_r3", CubeListBuilder.create().texOffs(50, 52).mirror().addBox(0.1392F, -1.8297F, 0.5347F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-2.1887F, 2.6827F, -3.7697F, -0.1393F, -0.4011F, 0.1002F));

		PartDefinition Upperjawbase_r4 = Upperjawbase.addOrReplaceChild("Upperjawbase_r4", CubeListBuilder.create().texOffs(63, 76).mirror().addBox(-0.1894F, -1.2944F, 0.5532F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(-3.0125F, 1.2047F, -0.6712F, -0.0057F, -0.3497F, 0.8874F));

		PartDefinition Upperjawbase_r5 = Upperjawbase.addOrReplaceChild("Upperjawbase_r5", CubeListBuilder.create().texOffs(37, 69).mirror().addBox(-0.1894F, -2.2944F, -0.4468F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0125F, 1.2047F, -0.6712F, -0.7474F, -0.3497F, 0.8874F));

		PartDefinition Upperjawbase_r6 = Upperjawbase.addOrReplaceChild("Upperjawbase_r6", CubeListBuilder.create().texOffs(36, 75).mirror().addBox(-1.0635F, 1.1393F, 4.8002F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(75, 34).mirror().addBox(-1.0635F, 1.7393F, 4.8002F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(-2.1887F, 2.6827F, -3.7697F, 0.5362F, -0.1438F, 0.3409F));

		PartDefinition Upperjawbase_r7 = Upperjawbase.addOrReplaceChild("Upperjawbase_r7", CubeListBuilder.create().texOffs(0, 76).mirror().addBox(-0.607F, -4.8469F, 3.5122F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.1887F, 2.6827F, -3.7697F, -0.7556F, -0.2136F, 0.3418F));

		PartDefinition Upperjawbase_r8 = Upperjawbase.addOrReplaceChild("Upperjawbase_r8", CubeListBuilder.create().texOffs(77, 0).mirror().addBox(-0.2204F, 0.7833F, 4.6927F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1887F, 2.6827F, -3.7697F, 0.2804F, -0.2784F, 0.208F));

		PartDefinition Upperjawbase_r9 = Upperjawbase.addOrReplaceChild("Upperjawbase_r9", CubeListBuilder.create().texOffs(15, 69).mirror().addBox(-0.2204F, -0.4193F, 3.1386F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(22, 70).mirror().addBox(-0.2204F, -0.8193F, 3.9386F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(70, 0).mirror().addBox(-0.2204F, 0.5807F, 3.1386F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(-2.1887F, 2.6827F, -3.7697F, 0.2411F, -0.2784F, 0.208F));

		PartDefinition Upperjawbase_r10 = Upperjawbase.addOrReplaceChild("Upperjawbase_r10", CubeListBuilder.create().texOffs(58, 76).mirror().addBox(-0.2204F, -3.3781F, 3.5225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.1887F, 2.6827F, -3.7697F, -0.4614F, -0.2784F, 0.208F));

		PartDefinition Upperjawbase_r11 = Upperjawbase.addOrReplaceChild("Upperjawbase_r11", CubeListBuilder.create().texOffs(63, 76).addBox(-0.8106F, -1.2944F, 0.5532F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(3.0125F, 1.2047F, -0.6712F, -0.0057F, 0.3497F, -0.8874F));

		PartDefinition Upperjawbase_r12 = Upperjawbase.addOrReplaceChild("Upperjawbase_r12", CubeListBuilder.create().texOffs(37, 69).addBox(-0.8106F, -2.2944F, -0.4468F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0125F, 1.2047F, -0.6712F, -0.7474F, 0.3497F, -0.8874F));

		PartDefinition Upperjawbase_r13 = Upperjawbase.addOrReplaceChild("Upperjawbase_r13", CubeListBuilder.create().texOffs(0, 76).addBox(-0.393F, -4.8469F, 3.5122F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.1887F, 2.6827F, -3.7697F, -0.7556F, 0.2136F, -0.3418F));

		PartDefinition Upperjawbase_r14 = Upperjawbase.addOrReplaceChild("Upperjawbase_r14", CubeListBuilder.create().texOffs(36, 75).addBox(0.0635F, 1.1393F, 4.8002F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(75, 34).addBox(0.0635F, 1.7393F, 4.8002F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(2.1887F, 2.6827F, -3.7697F, 0.5362F, 0.1438F, -0.3409F));

		PartDefinition Upperjawbase_r15 = Upperjawbase.addOrReplaceChild("Upperjawbase_r15", CubeListBuilder.create().texOffs(58, 76).addBox(-0.7796F, -3.3781F, 3.5225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.1887F, 2.6827F, -3.7697F, -0.4614F, 0.2784F, -0.208F));

		PartDefinition Upperjawbase_r16 = Upperjawbase.addOrReplaceChild("Upperjawbase_r16", CubeListBuilder.create().texOffs(77, 0).addBox(-0.7796F, 0.7833F, 4.6927F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1887F, 2.6827F, -3.7697F, 0.2804F, 0.2784F, -0.208F));

		PartDefinition Upperjawbase_r17 = Upperjawbase.addOrReplaceChild("Upperjawbase_r17", CubeListBuilder.create().texOffs(70, 0).addBox(-0.7796F, 0.5807F, 3.1386F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.015F))
				.texOffs(22, 70).addBox(-0.7796F, -0.8193F, 3.9386F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F))
				.texOffs(15, 69).addBox(-0.7796F, -0.4193F, 3.1386F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1887F, 2.6827F, -3.7697F, 0.2411F, 0.2784F, -0.208F));

		PartDefinition Upperjawbase_r18 = Upperjawbase.addOrReplaceChild("Upperjawbase_r18", CubeListBuilder.create().texOffs(50, 52).addBox(-1.1392F, -1.8297F, 0.5347F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(2.1887F, 2.6827F, -3.7697F, -0.1393F, 0.4011F, -0.1002F));

		PartDefinition Upperjawmiddle = Upperjawbase.addOrReplaceChild("Upperjawmiddle", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0F, -3.0F));

		PartDefinition Upperjawmiddle_r1 = Upperjawmiddle.addOrReplaceChild("Upperjawmiddle_r1", CubeListBuilder.create().texOffs(83, 68).mirror().addBox(0.3491F, -0.5144F, 0.5972F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1887F, 1.6827F, -0.7697F, -0.0279F, -0.3301F, 0.1185F));

		PartDefinition Upperjawmiddle_r2 = Upperjawmiddle.addOrReplaceChild("Upperjawmiddle_r2", CubeListBuilder.create().texOffs(83, 65).mirror().addBox(1.0313F, -0.4085F, 0.2104F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1887F, 1.6827F, -0.7697F, -0.1391F, -0.305F, 0.1553F));

		PartDefinition Upperjawmiddle_r3 = Upperjawmiddle.addOrReplaceChild("Upperjawmiddle_r3", CubeListBuilder.create().texOffs(68, 83).mirror().addBox(0.0F, -0.55F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6975F, 1.6349F, -0.9948F, -0.1433F, -0.2603F, 0.028F));

		PartDefinition Upperjawmiddle_r4 = Upperjawmiddle.addOrReplaceChild("Upperjawmiddle_r4", CubeListBuilder.create().texOffs(83, 39).mirror().addBox(0.7F, -0.5F, 1.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(68, 80).mirror().addBox(0.5F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1315F, 1.5319F, -3.4179F, -0.1211F, -0.2359F, 0.0644F));

		PartDefinition Upperjawmiddle_r5 = Upperjawmiddle.addOrReplaceChild("Upperjawmiddle_r5", CubeListBuilder.create().texOffs(75, 73).mirror().addBox(-0.2252F, -1.0038F, -0.9464F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 1.85F, -1.325F, -0.4051F, -0.2603F, 0.028F));

		PartDefinition Upperjawmiddle_r6 = Upperjawmiddle.addOrReplaceChild("Upperjawmiddle_r6", CubeListBuilder.create().texOffs(75, 54).mirror().addBox(0.0F, -0.14F, 0.894F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 0.9F, -2.1F, -0.1084F, -0.2603F, 0.028F));

		PartDefinition Upperjawmiddle_r7 = Upperjawmiddle.addOrReplaceChild("Upperjawmiddle_r7", CubeListBuilder.create().texOffs(70, 63).mirror().addBox(0.7F, 0.0F, -1.725F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(77, 21).mirror().addBox(0.7F, 0.0F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(44, 70).mirror().addBox(0.0F, 0.0F, -1.875F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.0451F, -0.073F, -0.6814F, 0.3841F, 0.0414F, -0.6604F));

		PartDefinition Upperjawmiddle_r8 = Upperjawmiddle.addOrReplaceChild("Upperjawmiddle_r8", CubeListBuilder.create().texOffs(77, 13).mirror().addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.3451F, 0.0058F, -0.5844F, 0.3921F, -0.2011F, -0.7596F));

		PartDefinition Upperjawmiddle_r9 = Upperjawmiddle.addOrReplaceChild("Upperjawmiddle_r9", CubeListBuilder.create().texOffs(70, 67).mirror().addBox(-0.2097F, 0.0168F, -1.4611F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.7887F, 0.0076F, -0.9911F, 0.2793F, -0.2443F, 0.0F));

		PartDefinition Upperjawmiddle_r10 = Upperjawmiddle.addOrReplaceChild("Upperjawmiddle_r10", CubeListBuilder.create().texOffs(68, 43).mirror().addBox(0.2435F, -0.1336F, -2.9927F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.0125F, 0.2047F, 2.3288F, 0.2897F, -0.1711F, -0.9283F));

		PartDefinition Upperjawmiddle_r11 = Upperjawmiddle.addOrReplaceChild("Upperjawmiddle_r11", CubeListBuilder.create().texOffs(66, 31).mirror().addBox(1.1851F, -0.3995F, -2.9927F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0125F, 0.2047F, 2.3288F, 0.2469F, -0.2292F, -0.7136F));

		PartDefinition Upperjawmiddle_r12 = Upperjawmiddle.addOrReplaceChild("Upperjawmiddle_r12", CubeListBuilder.create().texOffs(39, 52).mirror().addBox(0.1685F, -0.1336F, -0.4676F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0331F, 0.3263F, -0.5042F, 0.2951F, -0.2547F, -0.954F));

		PartDefinition Upperjawmiddle_r13 = Upperjawmiddle.addOrReplaceChild("Upperjawmiddle_r13", CubeListBuilder.create().texOffs(63, 26).mirror().addBox(0.0608F, -1.8204F, -0.0899F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1887F, 1.6827F, -0.7697F, -0.1399F, -0.3145F, 0.0897F));

		PartDefinition Upperjawmiddle_r14 = Upperjawmiddle.addOrReplaceChild("Upperjawmiddle_r14", CubeListBuilder.create().texOffs(74, 76).mirror().addBox(1.3296F, -0.2474F, -0.0574F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.0125F, 0.2047F, 2.3288F, 0.4486F, 0.9175F, -0.4167F));

		PartDefinition Upperjawmiddle_r15 = Upperjawmiddle.addOrReplaceChild("Upperjawmiddle_r15", CubeListBuilder.create().texOffs(75, 40).mirror().addBox(1.4202F, -0.3483F, -1.7556F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-3.0125F, 0.2047F, 2.3288F, 0.2504F, -0.14F, -0.7429F));

		PartDefinition Upperjawmiddle_r16 = Upperjawmiddle.addOrReplaceChild("Upperjawmiddle_r16", CubeListBuilder.create().texOffs(77, 24).mirror().addBox(1.9363F, -0.3483F, -1.3023F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.0125F, 0.2047F, 2.3288F, 0.266F, 0.367F, -0.6098F));

		PartDefinition Upperjawmiddle_r17 = Upperjawmiddle.addOrReplaceChild("Upperjawmiddle_r17", CubeListBuilder.create().texOffs(77, 21).addBox(-1.7F, 0.0F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 63).addBox(-1.7F, 0.0F, -1.725F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F))
				.texOffs(44, 70).addBox(-1.0F, 0.0F, -1.875F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.0451F, -0.073F, -0.6814F, 0.3841F, -0.0414F, 0.6604F));

		PartDefinition Upperjawmiddle_r18 = Upperjawmiddle.addOrReplaceChild("Upperjawmiddle_r18", CubeListBuilder.create().texOffs(77, 13).addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.3451F, 0.0058F, -0.5844F, 0.3921F, 0.2011F, 0.7596F));

		PartDefinition Upperjawmiddle_r19 = Upperjawmiddle.addOrReplaceChild("Upperjawmiddle_r19", CubeListBuilder.create().texOffs(77, 24).addBox(-2.9363F, -0.3483F, -1.3023F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.0125F, 0.2047F, 2.3288F, 0.266F, -0.367F, 0.6098F));

		PartDefinition Upperjawmiddle_r20 = Upperjawmiddle.addOrReplaceChild("Upperjawmiddle_r20", CubeListBuilder.create().texOffs(74, 76).addBox(-2.3296F, -0.2474F, -0.0574F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.0125F, 0.2047F, 2.3288F, 0.4486F, -0.9175F, 0.4167F));

		PartDefinition Upperjawmiddle_r21 = Upperjawmiddle.addOrReplaceChild("Upperjawmiddle_r21", CubeListBuilder.create().texOffs(75, 40).addBox(-2.4202F, -0.3483F, -1.7556F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(3.0125F, 0.2047F, 2.3288F, 0.2504F, 0.14F, 0.7429F));

		PartDefinition Upperjawmiddle_r22 = Upperjawmiddle.addOrReplaceChild("Upperjawmiddle_r22", CubeListBuilder.create().texOffs(39, 52).addBox(-1.1685F, -0.1336F, -0.4676F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0331F, 0.3263F, -0.5042F, 0.2951F, 0.2547F, 0.954F));

		PartDefinition Upperjawmiddle_r23 = Upperjawmiddle.addOrReplaceChild("Upperjawmiddle_r23", CubeListBuilder.create().texOffs(68, 43).addBox(-1.2435F, -0.1336F, -2.9927F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(3.0125F, 0.2047F, 2.3288F, 0.2897F, 0.1711F, 0.9283F));

		PartDefinition Upperjawmiddle_r24 = Upperjawmiddle.addOrReplaceChild("Upperjawmiddle_r24", CubeListBuilder.create().texOffs(66, 31).addBox(-2.1851F, -0.3995F, -2.9927F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0125F, 0.2047F, 2.3288F, 0.2469F, 0.2292F, 0.7136F));

		PartDefinition Upperjawmiddle_r25 = Upperjawmiddle.addOrReplaceChild("Upperjawmiddle_r25", CubeListBuilder.create().texOffs(70, 67).addBox(-0.7903F, 0.0168F, -1.4611F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.7887F, 0.0076F, -0.9911F, 0.2793F, 0.2443F, 0.0F));

		PartDefinition Upperjawmiddle_r26 = Upperjawmiddle.addOrReplaceChild("Upperjawmiddle_r26", CubeListBuilder.create().texOffs(83, 65).addBox(-1.0313F, -0.4085F, 0.2104F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1887F, 1.6827F, -0.7697F, -0.1391F, 0.305F, -0.1553F));

		PartDefinition Upperjawmiddle_r27 = Upperjawmiddle.addOrReplaceChild("Upperjawmiddle_r27", CubeListBuilder.create().texOffs(83, 39).addBox(-0.7F, -0.5F, 1.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 80).addBox(-0.5F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1315F, 1.5319F, -3.4179F, -0.1211F, 0.2359F, -0.0644F));

		PartDefinition Upperjawmiddle_r28 = Upperjawmiddle.addOrReplaceChild("Upperjawmiddle_r28", CubeListBuilder.create().texOffs(63, 26).addBox(-1.0608F, -1.8204F, -0.0899F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1887F, 1.6827F, -0.7697F, -0.1399F, 0.3145F, -0.0897F));

		PartDefinition Upperjawmiddle_r29 = Upperjawmiddle.addOrReplaceChild("Upperjawmiddle_r29", CubeListBuilder.create().texOffs(83, 68).addBox(-0.3491F, -0.5144F, 0.5972F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1887F, 1.6827F, -0.7697F, -0.0279F, 0.3301F, -0.1185F));

		PartDefinition Upperjawmiddle_r30 = Upperjawmiddle.addOrReplaceChild("Upperjawmiddle_r30", CubeListBuilder.create().texOffs(68, 83).addBox(0.0F, -0.55F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6975F, 1.6349F, -0.9948F, -0.1433F, 0.2603F, -0.028F));

		PartDefinition Upperjawmiddle_r31 = Upperjawmiddle.addOrReplaceChild("Upperjawmiddle_r31", CubeListBuilder.create().texOffs(75, 73).addBox(-0.7748F, -1.0038F, -0.9464F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.7F, 1.85F, -1.325F, -0.4051F, 0.2603F, -0.028F));

		PartDefinition Upperjawmiddle_r32 = Upperjawmiddle.addOrReplaceChild("Upperjawmiddle_r32", CubeListBuilder.create().texOffs(75, 54).addBox(-1.0F, -0.14F, 0.894F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(1.7F, 0.9F, -2.1F, -0.1084F, 0.2603F, -0.028F));

		PartDefinition Upperjawfront = Upperjawmiddle.addOrReplaceChild("Upperjawfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0F, -2.0F, -0.0213F, 0.0F, 0.0F));

		PartDefinition Upperjawfront_r1 = Upperjawfront.addOrReplaceChild("Upperjawfront_r1", CubeListBuilder.create().texOffs(48, 82).mirror().addBox(0.0F, -0.525F, 0.925F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(80, 65).mirror().addBox(0.0F, -0.55F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2146F, -0.7226F, -1.6883F, -0.0468F, -0.141F, -0.0235F));

		PartDefinition Upperjawfront_r2 = Upperjawfront.addOrReplaceChild("Upperjawfront_r2", CubeListBuilder.create().texOffs(36, 82).mirror().addBox(0.0F, -0.4F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5961F, -0.8168F, -3.1332F, 0.0432F, -0.6863F, -0.0439F));

		PartDefinition Upperjawfront_r3 = Upperjawfront.addOrReplaceChild("Upperjawfront_r3", CubeListBuilder.create().texOffs(75, 46).mirror().addBox(-0.4393F, -0.4909F, -1.3995F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(75, 43).mirror().addBox(-0.4393F, -0.4909F, -0.6995F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(75, 37).mirror().addBox(-0.6642F, -0.3909F, -1.0995F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7748F, -1.1058F, -2.3348F, -0.0284F, -0.6948F, 0.0569F));

		PartDefinition Upperjawfront_r4 = Upperjawfront.addOrReplaceChild("Upperjawfront_r4", CubeListBuilder.create().texOffs(57, 32).mirror().addBox(-0.0725F, -1.0167F, 0.0576F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, -0.6F, -2.5F, -0.0822F, -0.1758F, -0.0206F));

		PartDefinition Upperjawfront_r5 = Upperjawfront.addOrReplaceChild("Upperjawfront_r5", CubeListBuilder.create().texOffs(46, 58).mirror().addBox(-0.4F, -0.5F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.855F, -1.3769F, -0.8908F, 0.2303F, -0.102F, -0.8241F));

		PartDefinition Upperjawfront_r6 = Upperjawfront.addOrReplaceChild("Upperjawfront_r6", CubeListBuilder.create().texOffs(55, 58).mirror().addBox(-0.9911F, -0.0068F, -2.8814F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5066F, -2.9215F, 0.4793F, 0.2349F, 0.2209F, -0.7479F));

		PartDefinition Upperjawfront_r7 = Upperjawfront.addOrReplaceChild("Upperjawfront_r7", CubeListBuilder.create().texOffs(75, 46).addBox(-0.5608F, -0.4909F, -1.3995F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(75, 37).addBox(-0.3357F, -0.3909F, -1.0995F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(75, 43).addBox(-0.5608F, -0.4909F, -0.6995F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7748F, -1.1058F, -2.3348F, -0.0284F, 0.6948F, -0.0569F));

		PartDefinition Upperjawfront_r8 = Upperjawfront.addOrReplaceChild("Upperjawfront_r8", CubeListBuilder.create().texOffs(36, 82).addBox(0.0F, -0.4F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5961F, -0.8168F, -3.1332F, 0.0432F, 0.6863F, 0.0439F));

		PartDefinition Upperjawfront_r9 = Upperjawfront.addOrReplaceChild("Upperjawfront_r9", CubeListBuilder.create().texOffs(46, 58).addBox(-0.6F, -0.5F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.855F, -1.3769F, -0.8908F, 0.2303F, 0.102F, 0.8241F));

		PartDefinition Upperjawfront_r10 = Upperjawfront.addOrReplaceChild("Upperjawfront_r10", CubeListBuilder.create().texOffs(55, 58).addBox(-0.0089F, -0.0068F, -2.8814F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5066F, -2.9215F, 0.4793F, 0.2349F, -0.2209F, 0.7479F));

		PartDefinition Upperjawfront_r11 = Upperjawfront.addOrReplaceChild("Upperjawfront_r11", CubeListBuilder.create().texOffs(48, 82).addBox(0.0F, -0.525F, 0.925F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 65).addBox(0.0F, -0.55F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2146F, -0.7226F, -1.6883F, -0.0468F, 0.141F, 0.0235F));

		PartDefinition Upperjawfront_r12 = Upperjawfront.addOrReplaceChild("Upperjawfront_r12", CubeListBuilder.create().texOffs(57, 32).addBox(-0.9275F, -1.0167F, 0.0576F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, -0.6F, -2.5F, -0.0822F, 0.1758F, 0.0206F));

		PartDefinition Upperjawfront_r13 = Upperjawfront.addOrReplaceChild("Upperjawfront_r13", CubeListBuilder.create().texOffs(28, 48).addBox(-0.6349F, 0.0279F, -4.0032F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.1385F, -2.958F, 0.462F, 0.3099F, -0.0005F, 0.003F));

		PartDefinition Snoutmiddle = Upperjawmiddle.addOrReplaceChild("Snoutmiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0559F, -1.3767F, 0.3721F, 0.0F, 0.0F));

		PartDefinition Snoutmiddle_r1 = Snoutmiddle.addOrReplaceChild("Snoutmiddle_r1", CubeListBuilder.create().texOffs(56, 63).mirror().addBox(0.0402F, -0.0237F, -0.0722F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5385F, 0.1111F, -0.0568F, -0.1079F, -0.2438F, 0.0231F));

		PartDefinition Snoutmiddle_r2 = Snoutmiddle.addOrReplaceChild("Snoutmiddle_r2", CubeListBuilder.create().texOffs(56, 63).addBox(-1.0402F, -0.0237F, -0.0722F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5385F, 0.1111F, -0.0568F, -0.1079F, 0.2438F, -0.0231F));

		PartDefinition Snoutmiddle_r3 = Snoutmiddle.addOrReplaceChild("Snoutmiddle_r3", CubeListBuilder.create().texOffs(63, 63).addBox(-0.6402F, -0.0237F, -0.0722F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1385F, 0.1099F, -0.0565F, -0.1047F, 0.0008F, 0.0029F));

		PartDefinition Rightupperteeth = Upperjawmiddle.addOrReplaceChild("Rightupperteeth", CubeListBuilder.create(), PartPose.offsetAndRotation(2.45F, 1.5F, -1.1F, 0.0F, 0.1911F, 0.0F));

		PartDefinition Leftupperteeth = Upperjawmiddle.addOrReplaceChild("Leftupperteeth", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.45F, 1.5F, -1.1F, 0.0F, -0.1911F, 0.0F));

		PartDefinition Snoutbase = Upperjawbase.addOrReplaceChild("Snoutbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.3187F, 0.0F, 0.0F));

		PartDefinition Snoutbase_r1 = Snoutbase.addOrReplaceChild("Snoutbase_r1", CubeListBuilder.create().texOffs(59, 52).mirror().addBox(-0.525F, -0.475F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4554F, 0.8457F, -1.3057F, -0.0328F, -0.4351F, -0.5858F));

		PartDefinition Snoutbase_r2 = Snoutbase.addOrReplaceChild("Snoutbase_r2", CubeListBuilder.create().texOffs(59, 37).mirror().addBox(-0.4F, -0.5F, -1.75F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1222F, 1.4667F, -1.5358F, 0.092F, -0.5161F, -0.8632F));

		PartDefinition Snoutbase_r3 = Snoutbase.addOrReplaceChild("Snoutbase_r3", CubeListBuilder.create().texOffs(59, 52).addBox(-0.475F, -0.475F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4554F, 0.8457F, -1.3057F, -0.0328F, 0.4351F, 0.5858F));

		PartDefinition Snoutbase_r4 = Snoutbase.addOrReplaceChild("Snoutbase_r4", CubeListBuilder.create().texOffs(59, 37).addBox(-0.6F, -0.5F, -1.75F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1222F, 1.4667F, -1.5358F, 0.092F, 0.5161F, 0.8632F));

		PartDefinition Snoutbase_r5 = Snoutbase.addOrReplaceChild("Snoutbase_r5", CubeListBuilder.create().texOffs(37, 64).addBox(-1.1352F, -0.0777F, -0.0076F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1385F, -0.208F, -2.588F, -0.2443F, 0.0005F, 0.003F));

		PartDefinition Snoutbase_r6 = Snoutbase.addOrReplaceChild("Snoutbase_r6", CubeListBuilder.create().texOffs(70, 4).addBox(-1.1353F, -0.0299F, 1.9737F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 54).addBox(-1.1353F, -0.0299F, -0.0263F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1385F, -0.008F, -1.588F, -0.2792F, 0.0005F, 0.003F));

		PartDefinition Snoutbase_r7 = Snoutbase.addOrReplaceChild("Snoutbase_r7", CubeListBuilder.create().texOffs(37, 58).mirror().addBox(-0.2617F, 0.0698F, -0.9014F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9385F, -0.0053F, -1.5884F, -0.2924F, -0.2979F, 0.085F));

		PartDefinition Snoutbase_r8 = Snoutbase.addOrReplaceChild("Snoutbase_r8", CubeListBuilder.create().texOffs(37, 58).addBox(-0.7383F, 0.0698F, -0.9014F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9385F, -0.0053F, -1.5884F, -0.2924F, 0.2979F, -0.085F));

		PartDefinition Tailbase = Hips.addOrReplaceChild("Tailbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8209F, 18.5953F, -0.1487F, 0.2759F, -0.2928F));

		PartDefinition Tailbase_r1 = Tailbase.addOrReplaceChild("Tailbase_r1", CubeListBuilder.create().texOffs(61, 74).mirror().addBox(-4.1F, 0.1F, 8.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(73, 61).mirror().addBox(-4.2F, 0.1F, 6.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(43, 74).mirror().addBox(-4.1F, 0.1F, 4.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(29, 74).mirror().addBox(-3.9F, 0.1F, 2.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(80, 55).mirror().addBox(-3.5F, 0.1F, 0.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(61, 74).addBox(-1.9F, 0.1F, 8.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(73, 61).addBox(-1.8F, 0.1F, 6.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 74).addBox(-1.9F, 0.1F, 4.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(29, 74).addBox(-2.1F, 0.1F, 2.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 55).addBox(-1.5F, 0.1F, 0.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(25, 14).addBox(-2.5F, -0.4F, 0.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -0.2002F, 0.0192F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r19 = Tailbase.addOrReplaceChild("Bodyfront_r19", CubeListBuilder.create().texOffs(21, 27).addBox(2.0F, -2.9F, 15.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 76).addBox(2.0F, -2.8F, 13.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 76).addBox(2.0F, -2.7F, 11.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 76).addBox(2.0F, -2.3F, 9.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 76).addBox(2.0F, -1.8F, 7.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -1.9427F, -7.3154F, -0.1571F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r20 = Tailbase.addOrReplaceChild("Bodyfront_r20", CubeListBuilder.create().texOffs(44, 76).addBox(2.0F, -9.7F, 17.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(41, 76).addBox(2.0F, -10.2F, 15.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 76).addBox(2.0F, -10.9F, 13.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 75).addBox(2.0F, -11.6F, 11.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(78, 57).addBox(2.0F, -11.9F, 9.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 13.7427F, -7.3154F, 0.1571F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase = Tailbase.addOrReplaceChild("Tailmiddlebase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2998F, 10.0192F, -0.0582F, 0.3461F, -0.2658F));

		PartDefinition Tailmiddlebase_r1 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r1", CubeListBuilder.create().texOffs(80, 63).mirror().addBox(-3.3F, 0.0F, 6.9F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(80, 61).mirror().addBox(-3.5F, 0.0F, 4.9F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(68, 73).mirror().addBox(-3.8F, 0.0F, 2.9F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(14, 75).mirror().addBox(-4.0F, 0.0F, 0.9F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(80, 63).addBox(-1.7F, 0.0F, 6.9F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(80, 61).addBox(-1.5F, 0.0F, 4.9F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(68, 73).addBox(-2.2F, 0.0F, 2.9F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(14, 75).addBox(-2.0F, 0.0F, 0.9F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(21, 37).addBox(-2.5F, -0.5F, 0.9F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(2.0F, -0.2349F, -0.9994F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r21 = Tailmiddlebase.addOrReplaceChild("Bodyfront_r21", CubeListBuilder.create().texOffs(68, 75).addBox(2.0F, -2.9F, 25.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(75, 49).addBox(2.0F, -2.9F, 23.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 55).addBox(2.0F, -2.9F, 21.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 77).addBox(2.0F, -2.9F, 19.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 32).addBox(2.0F, -2.9F, 17.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -3.2774F, -17.334F, -0.1571F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r22 = Tailmiddlebase.addOrReplaceChild("Bodyfront_r22", CubeListBuilder.create().texOffs(80, 39).addBox(2.0F, -7.7F, 26.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 79).addBox(2.0F, -7.8F, 25.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 76).addBox(2.0F, -8.8F, 23.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(55, 76).addBox(2.0F, -9.0F, 21.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 76).addBox(2.0F, -9.2F, 19.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 12.408F, -17.334F, 0.1571F, 0.0F, 0.0F));

		PartDefinition Tailmiddle = Tailmiddlebase.addOrReplaceChild("Tailmiddle", CubeListBuilder.create().texOffs(0, 27).addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4651F, 8.9006F, -0.0971F, 0.5138F, -0.2487F));

		PartDefinition Bodyfront_r23 = Tailmiddle.addOrReplaceChild("Bodyfront_r23", CubeListBuilder.create().texOffs(50, 78).addBox(2.0F, -3.0F, 31.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(78, 49).addBox(2.0F, -2.9F, 29.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 78).addBox(2.0F, -2.7F, 27.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(77, 67).addBox(2.0F, -2.6F, 25.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -3.7425F, -24.4346F, -0.1571F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r24 = Tailmiddle.addOrReplaceChild("Bodyfront_r24", CubeListBuilder.create().texOffs(0, 79).addBox(2.0F, -7.8F, 27.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 79).addBox(2.0F, -7.6F, 29.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 6).addBox(2.0F, -7.4F, 31.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 20).addBox(2.0F, -6.4F, 33.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 11.9429F, -24.4346F, 0.1571F, 0.0F, 0.0F));

		PartDefinition Tailmiddleend = Tailmiddle.addOrReplaceChild("Tailmiddleend", CubeListBuilder.create().texOffs(25, 26).addBox(-0.5F, -0.9F, 0.3F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 0.3919F, 8.5998F, -0.0971F, 0.4279F, -0.3175F));

		PartDefinition Bodyfront_r25 = Tailmiddleend.addOrReplaceChild("Bodyfront_r25", CubeListBuilder.create().texOffs(82, 80).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8307F, 8.7881F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r26 = Tailmiddleend.addOrReplaceChild("Bodyfront_r26", CubeListBuilder.create().texOffs(82, 12).addBox(2.0F, -3.9F, 41.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 82).addBox(2.0F, -3.7F, 39.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 6).addBox(2.0F, -3.5F, 37.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 3).addBox(2.0F, -3.2F, 35.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -4.1425F, -35.1346F, -0.1571F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r27 = Tailmiddleend.addOrReplaceChild("Bodyfront_r27", CubeListBuilder.create().texOffs(82, 23).addBox(2.0F, -0.25F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 81).addBox(2.0F, -0.35F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 81).addBox(2.0F, -0.35F, -2.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -0.3155F, 2.9796F, 0.0698F, 0.0F, 0.0F));

		PartDefinition Tailend = Tailmiddleend.addOrReplaceChild("Tailend", CubeListBuilder.create().texOffs(0, 38).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 9.1F, 0.0512F, -0.3486F, -0.0175F));

		PartDefinition Bodyfront_r28 = Tailend.addOrReplaceChild("Bodyfront_r28", CubeListBuilder.create().texOffs(18, 82).addBox(0.0F, -0.575F, 0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 82).addBox(0.0F, -0.575F, -1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.196F, 2.4696F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Rightthigh = Hips.addOrReplaceChild("Rightthigh", CubeListBuilder.create().texOffs(48, 12).addBox(-0.7852F, -0.0787F, -5.1284F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2223F, 2.6235F, 14.2081F, 2.6478F, -0.1761F, -1.6876F));

		PartDefinition Rightshin = Rightthigh.addOrReplaceChild("Rightshin", CubeListBuilder.create().texOffs(5, 65).addBox(-1.0F, -0.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 65).addBox(0.4F, -0.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.455F, 0.9656F, -5.3113F, -1.118F, 0.0967F, -0.1959F));

		PartDefinition Righthindfoot = Rightshin.addOrReplaceChild("Righthindfoot", CubeListBuilder.create().texOffs(48, 0).addBox(-1.5F, 0.0F, -3.5F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4686F, 4.3979F, -0.315F, 1.1832F, -0.0389F, -0.0921F));

		PartDefinition Leftthigh = Hips.addOrReplaceChild("Leftthigh", CubeListBuilder.create().texOffs(15, 48).addBox(-0.2148F, -0.0787F, -5.1284F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.2223F, 2.6235F, 14.2081F, 3.0405F, 0.1761F, 1.6876F));

		PartDefinition Leftshin = Leftthigh.addOrReplaceChild("Leftshin", CubeListBuilder.create().texOffs(10, 67).addBox(0.0F, -0.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 0).addBox(-1.4F, -0.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.455F, 0.9656F, -5.3113F, -1.118F, -0.0967F, 0.1959F));

		PartDefinition Lefthindfoot = Leftshin.addOrReplaceChild("Lefthindfoot", CubeListBuilder.create().texOffs(48, 6).addBox(-2.5F, 0.0F, -3.5F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4686F, 4.3979F, -0.315F, 1.1832F, 0.0389F, 0.0921F));

		return LayerDefinition.create(meshdefinition, 87, 87);
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