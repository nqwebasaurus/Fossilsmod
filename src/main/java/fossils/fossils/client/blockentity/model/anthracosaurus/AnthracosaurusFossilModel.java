package fossils.fossils.client.blockentity.model.anthracosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class AnthracosaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart Hips;
	private final ModelPart Bodymiddle;
	private final ModelPart Bodyfront;
	private final ModelPart Shoulderslope;
	private final ModelPart Head;
	private final ModelPart Lowerjawback;
	private final ModelPart Lowerjawmidbase;
	private final ModelPart Lowerjawmidfront;
	private final ModelPart Lowerjawfront;
	private final ModelPart Lowerjawslopefront;
	private final ModelPart Lowerfrontteeth;
	private final ModelPart Rightlowerteeth;
	private final ModelPart Rightlowerteeth2;
	private final ModelPart Leftlowerteeth;
	private final ModelPart Upperjawbase;
	private final ModelPart Upperjawmiddle;
	private final ModelPart Upperjawfront;
	private final ModelPart Snoutfront;
	private final ModelPart Upperfrontteeth;
	private final ModelPart Snoutmiddle;
	private final ModelPart Rightupperteeth;
	private final ModelPart Leftupperteeth;
	private final ModelPart Snoutbase;
	private final ModelPart Upperjawbase2;
	private final ModelPart Upperjawmiddle2;
	private final ModelPart Upperjawfront2;
	private final ModelPart Snoutfront2;
	private final ModelPart Upperfrontteeth2;
	private final ModelPart Snoutmiddle2;
	private final ModelPart Rightupperteeth2;
	private final ModelPart Leftupperteeth2;
	private final ModelPart Snoutbase2;
	private final ModelPart Rightupperarm;
	private final ModelPart Rightlowerarm;
	private final ModelPart Rightfrontfoot;
	private final ModelPart Leftupperarm;
	private final ModelPart Leftlowerarm;
	private final ModelPart Leftfrontfoot;
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

	public AnthracosaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.Hips = this.root.getChild("Hips");
		this.Bodymiddle = this.Hips.getChild("Bodymiddle");
		this.Bodyfront = this.Bodymiddle.getChild("Bodyfront");
		this.Shoulderslope = this.Bodyfront.getChild("Shoulderslope");
		this.Head = this.Bodyfront.getChild("Head");
		this.Lowerjawback = this.Head.getChild("Lowerjawback");
		this.Lowerjawmidbase = this.Lowerjawback.getChild("Lowerjawmidbase");
		this.Lowerjawmidfront = this.Lowerjawmidbase.getChild("Lowerjawmidfront");
		this.Lowerjawfront = this.Lowerjawmidfront.getChild("Lowerjawfront");
		this.Lowerjawslopefront = this.Lowerjawfront.getChild("Lowerjawslopefront");
		this.Lowerfrontteeth = this.Lowerjawfront.getChild("Lowerfrontteeth");
		this.Rightlowerteeth = this.Lowerjawmidfront.getChild("Rightlowerteeth");
		this.Rightlowerteeth2 = this.Lowerjawmidfront.getChild("Rightlowerteeth2");
		this.Leftlowerteeth = this.Lowerjawmidfront.getChild("Leftlowerteeth");
		this.Upperjawbase = this.Head.getChild("Upperjawbase");
		this.Upperjawmiddle = this.Upperjawbase.getChild("Upperjawmiddle");
		this.Upperjawfront = this.Upperjawmiddle.getChild("Upperjawfront");
		this.Snoutfront = this.Upperjawfront.getChild("Snoutfront");
		this.Upperfrontteeth = this.Upperjawfront.getChild("Upperfrontteeth");
		this.Snoutmiddle = this.Upperjawmiddle.getChild("Snoutmiddle");
		this.Rightupperteeth = this.Upperjawmiddle.getChild("Rightupperteeth");
		this.Leftupperteeth = this.Upperjawmiddle.getChild("Leftupperteeth");
		this.Snoutbase = this.Upperjawbase.getChild("Snoutbase");
		this.Upperjawbase2 = this.Head.getChild("Upperjawbase2");
		this.Upperjawmiddle2 = this.Upperjawbase2.getChild("Upperjawmiddle2");
		this.Upperjawfront2 = this.Upperjawmiddle2.getChild("Upperjawfront2");
		this.Snoutfront2 = this.Upperjawfront2.getChild("Snoutfront2");
		this.Upperfrontteeth2 = this.Upperjawfront2.getChild("Upperfrontteeth2");
		this.Snoutmiddle2 = this.Upperjawmiddle2.getChild("Snoutmiddle2");
		this.Rightupperteeth2 = this.Upperjawmiddle2.getChild("Rightupperteeth2");
		this.Leftupperteeth2 = this.Upperjawmiddle2.getChild("Leftupperteeth2");
		this.Snoutbase2 = this.Upperjawbase2.getChild("Snoutbase2");
		this.Rightupperarm = this.Bodyfront.getChild("Rightupperarm");
		this.Rightlowerarm = this.Rightupperarm.getChild("Rightlowerarm");
		this.Rightfrontfoot = this.Rightlowerarm.getChild("Rightfrontfoot");
		this.Leftupperarm = this.Bodyfront.getChild("Leftupperarm");
		this.Leftlowerarm = this.Leftupperarm.getChild("Leftlowerarm");
		this.Leftfrontfoot = this.Leftlowerarm.getChild("Leftfrontfoot");
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

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 9.0F, 0.0F, -0.1958F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(9, 60).mirror().addBox(-0.5F, -0.5F, -0.75F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1265F, 0.6201F, 14.468F, 0.0573F, 0.0221F, 0.2176F));

		PartDefinition cube_r2 = Hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(61, 35).mirror().addBox(-0.5F, -0.1479F, -2.1622F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1265F, 0.6201F, 14.468F, -0.4314F, 0.0221F, 0.2176F));

		PartDefinition cube_r3 = Hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(63, 63).mirror().addBox(-0.5F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9719F, 1.8166F, 14.1523F, -0.2656F, 0.0221F, 0.6103F));

		PartDefinition cube_r4 = Hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(11, 55).mirror().addBox(-1.0F, -0.6F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9306F, 3.4761F, 14.4034F, -0.0557F, 0.208F, 0.5539F));

		PartDefinition Bodyfront_r1 = Hips.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(74, 18).mirror().addBox(-2.5867F, -1.2175F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.2586F, 11.3909F, -0.0635F, -0.0843F, -0.8696F));

		PartDefinition Bodyfront_r2 = Hips.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(21, 72).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(74, 5).mirror().addBox(-1.4F, 0.3F, 5.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.2586F, 11.3909F, -0.1017F, -0.0283F, -0.2164F));

		PartDefinition Bodyfront_r3 = Hips.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(14, 72).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.4586F, 9.3909F, -0.111F, 0.0144F, -0.2163F));

		PartDefinition Bodyfront_r4 = Hips.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(7, 72).mirror().addBox(-3.5867F, -1.2175F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.4586F, 9.3909F, -0.0969F, -0.0561F, -0.8673F));

		PartDefinition Bodyfront_r5 = Hips.addOrReplaceChild("Bodyfront_r5", CubeListBuilder.create().texOffs(72, 3).mirror().addBox(-3.5867F, -1.2175F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.7586F, 7.3909F, -0.0635F, -0.0843F, -0.8696F));

		PartDefinition Bodyfront_r6 = Hips.addOrReplaceChild("Bodyfront_r6", CubeListBuilder.create().texOffs(70, 67).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.7586F, 7.3909F, -0.1017F, -0.0283F, -0.2164F));

		PartDefinition cube_r5 = Hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(9, 60).addBox(-0.5F, -0.5F, -0.75F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1265F, 0.6201F, 14.468F, 0.0573F, -0.0221F, -0.2176F));

		PartDefinition cube_r6 = Hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(61, 35).addBox(-0.5F, -0.1479F, -2.1622F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1265F, 0.6201F, 14.468F, -0.4314F, -0.0221F, -0.2176F));

		PartDefinition cube_r7 = Hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(63, 63).addBox(-0.5F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9719F, 1.8166F, 14.1523F, -0.2656F, -0.0221F, -0.6103F));

		PartDefinition cube_r8 = Hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(11, 55).addBox(-1.0F, -0.6F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9306F, 3.4761F, 14.4034F, -0.0557F, -0.208F, -0.5539F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-1.0F, -1.0194F, 6.9966F, -0.1484F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r7 = Hips.addOrReplaceChild("Bodyfront_r7", CubeListBuilder.create().texOffs(74, 18).addBox(1.5867F, -1.2175F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.2586F, 11.3909F, -0.0635F, 0.0843F, 0.8696F));

		PartDefinition Bodyfront_r8 = Hips.addOrReplaceChild("Bodyfront_r8", CubeListBuilder.create().texOffs(21, 72).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(74, 5).addBox(-0.6F, 0.3F, 5.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.2586F, 11.3909F, -0.1017F, 0.0283F, 0.2164F));

		PartDefinition Bodyfront_r9 = Hips.addOrReplaceChild("Bodyfront_r9", CubeListBuilder.create().texOffs(14, 72).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.4586F, 9.3909F, -0.111F, -0.0144F, 0.2163F));

		PartDefinition Bodyfront_r10 = Hips.addOrReplaceChild("Bodyfront_r10", CubeListBuilder.create().texOffs(7, 72).addBox(1.5867F, -1.2175F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.4586F, 9.3909F, -0.0969F, 0.0561F, 0.8673F));

		PartDefinition Bodyfront_r11 = Hips.addOrReplaceChild("Bodyfront_r11", CubeListBuilder.create().texOffs(3, 76).addBox(0.0F, -1.1F, 5.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 76).addBox(0.0F, -0.9F, 3.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 79).addBox(0.0F, -0.5F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 79).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -1.1621F, 11.4812F, -0.1571F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r12 = Hips.addOrReplaceChild("Bodyfront_r12", CubeListBuilder.create().texOffs(29, 79).addBox(0.0F, -0.5F, 9.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 80).addBox(0.0F, -0.6F, 7.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -2.5368F, -0.6415F, -0.1047F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r13 = Hips.addOrReplaceChild("Bodyfront_r13", CubeListBuilder.create().texOffs(72, 3).addBox(1.5867F, -1.2175F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.7586F, 7.3909F, -0.0635F, 0.0843F, 0.8696F));

		PartDefinition Bodyfront_r14 = Hips.addOrReplaceChild("Bodyfront_r14", CubeListBuilder.create().texOffs(70, 67).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.7586F, 7.3909F, -0.1017F, 0.0283F, 0.2164F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -1.2194F, 6.8966F, 0.1991F, -0.1712F, -0.0344F));

		PartDefinition Bodymiddle_r1 = Bodymiddle.addOrReplaceChild("Bodymiddle_r1", CubeListBuilder.create().texOffs(0, 27).addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4762F, -8.9003F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r2 = Bodymiddle.addOrReplaceChild("Bodymiddle_r2", CubeListBuilder.create().texOffs(0, 14).addBox(-0.5F, -0.3256F, -10.965F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.6507F, -8.9353F, 0.1222F, -0.192F, 0.0F));

		PartDefinition Bodyfront_r15 = Bodymiddle.addOrReplaceChild("Bodyfront_r15", CubeListBuilder.create().texOffs(0, 66).mirror().addBox(-4.5867F, -1.2175F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1846F, -1.506F, -0.0635F, -0.0843F, -0.8696F));

		PartDefinition Bodyfront_r16 = Bodymiddle.addOrReplaceChild("Bodyfront_r16", CubeListBuilder.create().texOffs(72, 69).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1846F, -1.506F, -0.1017F, -0.0283F, -0.2164F));

		PartDefinition Bodyfront_r17 = Bodymiddle.addOrReplaceChild("Bodyfront_r17", CubeListBuilder.create().texOffs(72, 61).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0846F, -3.506F, -0.1017F, -0.0283F, -0.2164F));

		PartDefinition Bodyfront_r18 = Bodymiddle.addOrReplaceChild("Bodyfront_r18", CubeListBuilder.create().texOffs(65, 57).mirror().addBox(-4.5867F, -1.2175F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0846F, -3.506F, -0.0635F, -0.0843F, -0.8696F));

		PartDefinition Bodyfront_r19 = Bodymiddle.addOrReplaceChild("Bodyfront_r19", CubeListBuilder.create().texOffs(63, 33).mirror().addBox(-5.5867F, -1.2175F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1154F, -5.506F, -0.0635F, -0.0843F, -0.8696F));

		PartDefinition Bodyfront_r20 = Bodymiddle.addOrReplaceChild("Bodyfront_r20", CubeListBuilder.create().texOffs(7, 74).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1154F, -5.506F, -0.1017F, -0.0283F, -0.2164F));

		PartDefinition Bodyfront_r21 = Bodymiddle.addOrReplaceChild("Bodyfront_r21", CubeListBuilder.create().texOffs(63, 31).mirror().addBox(-5.5867F, -1.2175F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2154F, -7.506F, -0.0635F, -0.0843F, -0.8696F));

		PartDefinition Bodyfront_r22 = Bodymiddle.addOrReplaceChild("Bodyfront_r22", CubeListBuilder.create().texOffs(72, 59).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2154F, -7.506F, -0.1017F, -0.0283F, -0.2164F));

		PartDefinition Bodyfront_r23 = Bodymiddle.addOrReplaceChild("Bodyfront_r23", CubeListBuilder.create().texOffs(63, 29).mirror().addBox(-6.1748F, -1.3809F, -1.0617F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(63, 27).mirror().addBox(-6.2098F, -1.3663F, -3.0614F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(63, 25).mirror().addBox(-6.2448F, -1.3517F, -5.061F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(63, 5).mirror().addBox(-6.2798F, -1.3372F, -7.0607F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6507F, -8.9353F, 0.2179F, -0.0481F, -0.8681F));

		PartDefinition Bodyfront_r24 = Bodymiddle.addOrReplaceChild("Bodyfront_r24", CubeListBuilder.create().texOffs(72, 55).mirror().addBox(-2.566F, 0.2285F, -1.0617F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(72, 53).mirror().addBox(-2.5849F, 0.2613F, -3.0614F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(72, 41).mirror().addBox(-2.6038F, 0.2941F, -5.061F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(72, 39).mirror().addBox(-2.6227F, 0.327F, -7.0607F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6507F, -8.9353F, 0.1447F, -0.1704F, -0.2207F));

		PartDefinition Bodyfront_r25 = Bodymiddle.addOrReplaceChild("Bodyfront_r25", CubeListBuilder.create().texOffs(46, 35).mirror().addBox(-5.7874F, -1.2767F, -9.0893F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6507F, -8.9353F, 0.2123F, 0.012F, -0.8554F));

		PartDefinition Bodyfront_r26 = Bodymiddle.addOrReplaceChild("Bodyfront_r26", CubeListBuilder.create().texOffs(35, 72).mirror().addBox(-2.1953F, 0.0753F, -9.0893F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6507F, -8.9353F, 0.1767F, -0.119F, -0.2127F));

		PartDefinition Bodyfront_r27 = Bodymiddle.addOrReplaceChild("Bodyfront_r27", CubeListBuilder.create().texOffs(65, 18).mirror().addBox(-4.9964F, -1.6046F, -11.0729F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6507F, -8.9353F, 0.2458F, -0.0155F, -0.8607F));

		PartDefinition Bodyfront_r28 = Bodymiddle.addOrReplaceChild("Bodyfront_r28", CubeListBuilder.create().texOffs(28, 72).mirror().addBox(-2.5607F, -0.0577F, -11.0729F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6507F, -8.9353F, 0.187F, -0.1611F, -0.2194F));

		PartDefinition Bodyfront_r29 = Bodymiddle.addOrReplaceChild("Bodyfront_r29", CubeListBuilder.create().texOffs(0, 66).addBox(1.5867F, -1.2175F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1846F, -1.506F, -0.0635F, 0.0843F, 0.8696F));

		PartDefinition Bodyfront_r30 = Bodymiddle.addOrReplaceChild("Bodyfront_r30", CubeListBuilder.create().texOffs(72, 69).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1846F, -1.506F, -0.1017F, 0.0283F, 0.2164F));

		PartDefinition Bodyfront_r31 = Bodymiddle.addOrReplaceChild("Bodyfront_r31", CubeListBuilder.create().texOffs(72, 61).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0846F, -3.506F, -0.1017F, 0.0283F, 0.2164F));

		PartDefinition Bodyfront_r32 = Bodymiddle.addOrReplaceChild("Bodyfront_r32", CubeListBuilder.create().texOffs(65, 57).addBox(1.5867F, -1.2175F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0846F, -3.506F, -0.0635F, 0.0843F, 0.8696F));

		PartDefinition Bodyfront_r33 = Bodymiddle.addOrReplaceChild("Bodyfront_r33", CubeListBuilder.create().texOffs(63, 33).addBox(1.5867F, -1.2175F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1154F, -5.506F, -0.0635F, 0.0843F, 0.8696F));

		PartDefinition Bodyfront_r34 = Bodymiddle.addOrReplaceChild("Bodyfront_r34", CubeListBuilder.create().texOffs(7, 74).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1154F, -5.506F, -0.1017F, 0.0283F, 0.2164F));

		PartDefinition Bodyfront_r35 = Bodymiddle.addOrReplaceChild("Bodyfront_r35", CubeListBuilder.create().texOffs(63, 31).addBox(1.5867F, -1.2175F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2154F, -7.506F, -0.0635F, 0.0843F, 0.8696F));

		PartDefinition Bodyfront_r36 = Bodymiddle.addOrReplaceChild("Bodyfront_r36", CubeListBuilder.create().texOffs(72, 59).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2154F, -7.506F, -0.1017F, 0.0283F, 0.2164F));

		PartDefinition Bodyfront_r37 = Bodymiddle.addOrReplaceChild("Bodyfront_r37", CubeListBuilder.create().texOffs(63, 29).addBox(2.1748F, -1.3809F, -1.0617F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(63, 27).addBox(2.2098F, -1.3663F, -3.0614F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(63, 25).addBox(2.2448F, -1.3517F, -5.061F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(63, 5).addBox(2.2798F, -1.3372F, -7.0607F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6507F, -8.9353F, -0.078F, -0.1985F, 0.8907F));

		PartDefinition Bodyfront_r38 = Bodymiddle.addOrReplaceChild("Bodyfront_r38", CubeListBuilder.create().texOffs(72, 55).addBox(0.566F, 0.2285F, -1.0617F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(72, 53).addBox(0.5849F, 0.2613F, -3.0614F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(72, 41).addBox(0.6038F, 0.2941F, -5.061F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(72, 39).addBox(0.6227F, 0.327F, -7.0607F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6507F, -8.9353F, 0.0608F, -0.2044F, 0.2222F));

		PartDefinition Bodyfront_r39 = Bodymiddle.addOrReplaceChild("Bodyfront_r39", CubeListBuilder.create().texOffs(46, 35).addBox(1.7874F, -1.2767F, -9.0893F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6507F, -8.9353F, -0.0846F, -0.2598F, 0.8962F));

		PartDefinition Bodyfront_r40 = Bodymiddle.addOrReplaceChild("Bodyfront_r40", CubeListBuilder.create().texOffs(35, 72).addBox(0.1953F, 0.0753F, -9.0893F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6507F, -8.9353F, 0.0948F, -0.2563F, 0.2184F));

		PartDefinition Bodyfront_r41 = Bodymiddle.addOrReplaceChild("Bodyfront_r41", CubeListBuilder.create().texOffs(65, 18).addBox(1.9964F, -1.6046F, -11.0729F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6507F, -8.9353F, -0.0504F, -0.2319F, 0.8931F));

		PartDefinition Bodyfront_r42 = Bodymiddle.addOrReplaceChild("Bodyfront_r42", CubeListBuilder.create().texOffs(28, 72).addBox(0.5607F, -0.0577F, -11.0729F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6507F, -8.9353F, 0.1035F, -0.2138F, 0.2216F));

		PartDefinition Bodyfront_r43 = Bodymiddle.addOrReplaceChild("Bodyfront_r43", CubeListBuilder.create().texOffs(79, 55).addBox(0.0F, -1.1672F, -1.1145F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(45, 79).addBox(0.0F, -1.1672F, -5.1145F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 38).addBox(0.0F, -1.1672F, -3.1145F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 79).addBox(0.0F, -1.1672F, -7.1145F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 79).addBox(0.0F, -1.1672F, -9.1145F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6507F, -8.9353F, 0.1047F, -0.192F, 0.0F));

		PartDefinition Bodyfront_r44 = Bodymiddle.addOrReplaceChild("Bodyfront_r44", CubeListBuilder.create().texOffs(79, 52).addBox(0.0F, -0.6F, 5.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 7).addBox(0.0F, -0.6F, 3.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 41).addBox(0.0F, -0.6F, 1.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 30).addBox(0.0F, -0.5F, -0.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2936F, -7.5384F, -0.1047F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r45 = Bodymiddle.addOrReplaceChild("Bodyfront_r45", CubeListBuilder.create().texOffs(32, 79).addBox(0.0F, -1.5986F, -11.0738F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6507F, -8.9353F, 0.1484F, -0.192F, 0.0F));

		PartDefinition Bodyfront = Bodymiddle.addOrReplaceChild("Bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0979F, 0.8227F, -19.4203F, 0.2447F, -0.3495F, 0.0288F));

		PartDefinition Bodyfront_r46 = Bodyfront.addOrReplaceChild("Bodyfront_r46", CubeListBuilder.create().texOffs(77, 14).mirror().addBox(-1.0254F, -0.401F, -4.8607F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(72, 71).mirror().addBox(-2.4254F, -0.401F, -0.8607F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(74, 57).mirror().addBox(-1.4254F, -0.401F, -2.8607F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7196F, -7.3201F, 0.2906F, 0.0579F, -0.2105F));

		PartDefinition Bodyfront_r47 = Bodyfront.addOrReplaceChild("Bodyfront_r47", CubeListBuilder.create().texOffs(68, 51).mirror().addBox(-4.5867F, -1.2175F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2804F, -1.7258F, 0.0208F, 0.0159F, -0.8725F));

		PartDefinition Bodyfront_r48 = Bodyfront.addOrReplaceChild("Bodyfront_r48", CubeListBuilder.create().texOffs(72, 73).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2804F, -1.7258F, 0.0262F, 0.0F, -0.2182F));

		PartDefinition Bodyfront_r49 = Bodyfront.addOrReplaceChild("Bodyfront_r49", CubeListBuilder.create().texOffs(65, 73).mirror().addBox(-3.5867F, -1.2175F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2804F, -3.7258F, 0.0208F, 0.0159F, -0.8725F));

		PartDefinition Bodyfront_r50 = Bodyfront.addOrReplaceChild("Bodyfront_r50", CubeListBuilder.create().texOffs(58, 73).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2804F, -3.7258F, 0.0262F, 0.0F, -0.2182F));

		PartDefinition Bodyfront_r51 = Bodyfront.addOrReplaceChild("Bodyfront_r51", CubeListBuilder.create().texOffs(15, 77).mirror().addBox(-2.5867F, -1.2175F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2804F, -5.7258F, 0.0208F, 0.0159F, -0.8725F));

		PartDefinition Bodyfront_r52 = Bodyfront.addOrReplaceChild("Bodyfront_r52", CubeListBuilder.create().texOffs(51, 73).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2804F, -5.7258F, 0.0262F, 0.0F, -0.2182F));

		PartDefinition Bodyfront_r53 = Bodyfront.addOrReplaceChild("Bodyfront_r53", CubeListBuilder.create().texOffs(70, 11).mirror().addBox(-1.0F, -1.1F, 0.1F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.7737F, 4.9176F, -7.0814F, 1.4445F, 0.0995F, 0.1231F));

		PartDefinition Bodyfront_r54 = Bodyfront.addOrReplaceChild("Bodyfront_r54", CubeListBuilder.create().texOffs(63, 59).mirror().addBox(-1.9F, -1.0F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8836F, 3.7766F, -8.7294F, 0.9042F, 0.0921F, 0.1164F));

		PartDefinition Bodyfront_r55 = Bodyfront.addOrReplaceChild("Bodyfront_r55", CubeListBuilder.create().texOffs(0, 60).mirror().addBox(-0.3F, -1.0F, -3.9F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 0.467F, -6.4998F, 1.417F, 0.2405F, 0.3135F));

		PartDefinition Bodyfront_r56 = Bodyfront.addOrReplaceChild("Bodyfront_r56", CubeListBuilder.create().texOffs(43, 53).mirror().addBox(-0.3F, -0.8F, -4.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 0.467F, -6.4998F, 0.937F, 0.2405F, 0.3135F));

		PartDefinition Bodyfront_r57 = Bodyfront.addOrReplaceChild("Bodyfront_r57", CubeListBuilder.create().texOffs(68, 51).addBox(1.5867F, -1.2175F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2804F, -1.7258F, 0.0208F, -0.0159F, 0.8725F));

		PartDefinition Bodyfront_r58 = Bodyfront.addOrReplaceChild("Bodyfront_r58", CubeListBuilder.create().texOffs(72, 73).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2804F, -1.7258F, 0.0262F, 0.0F, 0.2182F));

		PartDefinition Bodyfront_r59 = Bodyfront.addOrReplaceChild("Bodyfront_r59", CubeListBuilder.create().texOffs(65, 73).addBox(1.5867F, -1.2175F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2804F, -3.7258F, 0.0208F, -0.0159F, 0.8725F));

		PartDefinition Bodyfront_r60 = Bodyfront.addOrReplaceChild("Bodyfront_r60", CubeListBuilder.create().texOffs(58, 73).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2804F, -3.7258F, 0.0262F, 0.0F, 0.2182F));

		PartDefinition Bodyfront_r61 = Bodyfront.addOrReplaceChild("Bodyfront_r61", CubeListBuilder.create().texOffs(15, 77).addBox(1.5867F, -1.2175F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2804F, -5.7258F, 0.0208F, -0.0159F, 0.8725F));

		PartDefinition Bodyfront_r62 = Bodyfront.addOrReplaceChild("Bodyfront_r62", CubeListBuilder.create().texOffs(51, 73).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2804F, -5.7258F, 0.0262F, 0.0F, 0.2182F));

		PartDefinition Bodyfront_r63 = Bodyfront.addOrReplaceChild("Bodyfront_r63", CubeListBuilder.create().texOffs(72, 71).addBox(0.4254F, -0.401F, -0.8607F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(77, 14).addBox(0.0254F, -0.401F, -4.8607F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(74, 57).addBox(0.4254F, -0.401F, -2.8607F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7196F, -7.3201F, 0.2906F, -0.0579F, 0.2105F));

		PartDefinition Bodyfront_r64 = Bodyfront.addOrReplaceChild("Bodyfront_r64", CubeListBuilder.create().texOffs(6, 80).addBox(0.0F, -1.7F, 5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 80).addBox(0.0F, -1.7F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 70).addBox(0.0F, -1.5F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 37).addBox(-0.5F, -0.7F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5196F, -7.2201F, 0.0262F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r65 = Bodyfront.addOrReplaceChild("Bodyfront_r65", CubeListBuilder.create().texOffs(80, 47).addBox(0.0F, -1.2777F, -4.8173F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7196F, -7.3201F, 0.2531F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r66 = Bodyfront.addOrReplaceChild("Bodyfront_r66", CubeListBuilder.create().texOffs(0, 80).addBox(0.0F, -1.1973F, -2.8948F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 73).addBox(0.0F, -1.4973F, -0.8948F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7196F, -7.3201F, 0.1658F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r67 = Bodyfront.addOrReplaceChild("Bodyfront_r67", CubeListBuilder.create().texOffs(70, 11).addBox(-1.0F, -1.1F, 0.1F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7737F, 4.9176F, -7.0814F, 1.4445F, -0.0995F, -0.1231F));

		PartDefinition Bodyfront_r68 = Bodyfront.addOrReplaceChild("Bodyfront_r68", CubeListBuilder.create().texOffs(63, 59).addBox(-1.1F, -1.0F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8836F, 3.7766F, -8.7294F, 0.9042F, -0.0921F, -0.1164F));

		PartDefinition Bodyfront_r69 = Bodyfront.addOrReplaceChild("Bodyfront_r69", CubeListBuilder.create().texOffs(0, 60).addBox(-0.7F, -1.0F, -3.9F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 0.467F, -6.4998F, 1.417F, -0.2405F, -0.3135F));

		PartDefinition Bodyfront_r70 = Bodyfront.addOrReplaceChild("Bodyfront_r70", CubeListBuilder.create().texOffs(43, 53).addBox(-0.7F, -0.8F, -4.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.0F, 0.467F, -6.4998F, 0.937F, -0.2405F, -0.3135F));

		PartDefinition Bodyfront_r71 = Bodyfront.addOrReplaceChild("Bodyfront_r71", CubeListBuilder.create().texOffs(38, 11).addBox(-2.0F, -0.8F, -0.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.8865F, -9.5805F, -0.7767F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r72 = Bodyfront.addOrReplaceChild("Bodyfront_r72", CubeListBuilder.create().texOffs(18, 60).addBox(-0.5F, -0.3F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.3314F, -7.6204F, -0.3229F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r73 = Bodyfront.addOrReplaceChild("Bodyfront_r73", CubeListBuilder.create().texOffs(46, 26).addBox(-0.5F, -0.845F, -6.7834F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7196F, -7.3201F, 0.2356F, 0.0F, 0.0F));

		PartDefinition Shoulderslope = Bodyfront.addOrReplaceChild("Shoulderslope", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.3804F, 0.8799F, 0.1772F, 0.0F, 0.0F));

		PartDefinition Head = Bodyfront.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7196F, -13.6201F, 0.0628F, -0.3222F, 0.0301F));

		PartDefinition Lowerjawback = Head.addOrReplaceChild("Lowerjawback", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.484F, 3.5363F, -0.3491F, 0.0F, 0.0F));

		PartDefinition Lowerjawmidbase = Lowerjawback.addOrReplaceChild("Lowerjawmidbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1282F, -0.829F, 1.2779F, 0.0F, 0.0F));

		PartDefinition Lowerjawmidbase_r1 = Lowerjawmidbase.addOrReplaceChild("Lowerjawmidbase_r1", CubeListBuilder.create().texOffs(54, 59).mirror().addBox(-4.4123F, -1.9352F, -4.5301F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.85F, 1.4738F, -0.3966F, -0.0262F, -0.2094F, 0.0F));

		PartDefinition Lowerjawmidbase_r2 = Lowerjawmidbase.addOrReplaceChild("Lowerjawmidbase_r2", CubeListBuilder.create().texOffs(27, 60).mirror().addBox(-4.4123F, -1.2427F, -1.5073F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(0.85F, 1.4738F, -0.3966F, 0.1745F, -0.2094F, 0.0F));

		PartDefinition Lowerjawmidbase_r3 = Lowerjawmidbase.addOrReplaceChild("Lowerjawmidbase_r3", CubeListBuilder.create().texOffs(79, 58).mirror().addBox(-4.06F, -0.5973F, -5.4739F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.75F, 0.0738F, 0.3034F, -0.1571F, -0.1571F, 0.0F));

		PartDefinition Lowerjawmidbase_r4 = Lowerjawmidbase.addOrReplaceChild("Lowerjawmidbase_r4", CubeListBuilder.create().texOffs(48, 0).mirror().addBox(-4.4123F, -1.7204F, -4.8067F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.85F, 1.4738F, -0.3966F, -0.1571F, -0.2094F, 0.0F));

		PartDefinition Lowerjawmidbase_r5 = Lowerjawmidbase.addOrReplaceChild("Lowerjawmidbase_r5", CubeListBuilder.create().texOffs(54, 59).addBox(-0.5003F, -1.9134F, -5.3615F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.15F, 1.4738F, -0.3966F, -0.0262F, 0.2094F, 0.0F));

		PartDefinition Lowerjawmidbase_r6 = Lowerjawmidbase.addOrReplaceChild("Lowerjawmidbase_r6", CubeListBuilder.create().texOffs(27, 60).addBox(-0.5003F, -1.3871F, -2.3263F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(3.15F, 1.4738F, -0.3966F, 0.1745F, 0.2094F, 0.0F));

		PartDefinition Lowerjawmidbase_r7 = Lowerjawmidbase.addOrReplaceChild("Lowerjawmidbase_r7", CubeListBuilder.create().texOffs(79, 58).addBox(0.1092F, -0.4994F, -6.0919F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.25F, 0.0738F, 0.3034F, -0.1571F, 0.1571F, 0.0F));

		PartDefinition Lowerjawmidbase_r8 = Lowerjawmidbase.addOrReplaceChild("Lowerjawmidbase_r8", CubeListBuilder.create().texOffs(48, 0).addBox(-0.5003F, -1.5903F, -5.6281F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.15F, 1.4738F, -0.3966F, -0.1571F, 0.2094F, 0.0F));

		PartDefinition Lowerjawmidfront = Lowerjawmidbase.addOrReplaceChild("Lowerjawmidfront", CubeListBuilder.create(), PartPose.offset(0.0F, -0.2256F, -5.7775F));

		PartDefinition Lowerjawmidfront_r1 = Lowerjawmidfront.addOrReplaceChild("Lowerjawmidfront_r1", CubeListBuilder.create().texOffs(68, 47).mirror().addBox(-3.9901F, -0.7775F, -0.96F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.6F, 0.7775F, -0.0449F, 0.0F, -0.2443F, 0.0F));

		PartDefinition Lowerjawmidfront_r2 = Lowerjawmidfront.addOrReplaceChild("Lowerjawmidfront_r2", CubeListBuilder.create().texOffs(68, 47).addBox(-0.8911F, -0.7775F, -1.9277F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4F, 0.7775F, -0.0449F, 0.0F, 0.2443F, 0.0F));

		PartDefinition Lowerjawfront = Lowerjawmidfront.addOrReplaceChild("Lowerjawfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0F, -2.0F, -0.0213F, 0.0F, 0.0F));

		PartDefinition Lowerjawfront_r1 = Lowerjawfront.addOrReplaceChild("Lowerjawfront_r1", CubeListBuilder.create().texOffs(44, 65).mirror().addBox(-3.592F, -0.9347F, -2.1907F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.9F, -1.7663F, 0.2431F, -0.1926F, -0.2873F, -0.0278F));

		PartDefinition Lowerjawfront_r2 = Lowerjawfront.addOrReplaceChild("Lowerjawfront_r2", CubeListBuilder.create().texOffs(48, 20).mirror().addBox(-3.892F, -0.3847F, -2.8078F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.9F, -1.7663F, 0.2431F, -0.245F, -0.2873F, -0.0278F));

		PartDefinition Lowerjawfront_r3 = Lowerjawfront.addOrReplaceChild("Lowerjawfront_r3", CubeListBuilder.create().texOffs(57, 35).mirror().addBox(-5.1F, -1.2F, -1.3F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(57, 35).addBox(-3.9F, -1.2F, -1.3F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(72, 0).addBox(-5.0F, -0.6F, -1.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.0F, -1.7F, -2.2F, -0.3142F, 0.0F, 0.0F));

		PartDefinition Lowerjawfront_r4 = Lowerjawfront.addOrReplaceChild("Lowerjawfront_r4", CubeListBuilder.create().texOffs(44, 65).addBox(-0.2425F, -0.6088F, -3.2817F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1F, -1.7663F, 0.2431F, -0.1926F, 0.2873F, 0.0278F));

		PartDefinition Lowerjawfront_r5 = Lowerjawfront.addOrReplaceChild("Lowerjawfront_r5", CubeListBuilder.create().texOffs(48, 20).addBox(-0.9425F, -0.0022F, -3.8802F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1F, -1.7663F, 0.2431F, -0.245F, 0.2873F, 0.0278F));

		PartDefinition Lowerjawslopefront = Lowerjawfront.addOrReplaceChild("Lowerjawslopefront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0F, 0.1F, -0.3396F, 0.0F, 0.0F));

		PartDefinition Lowerjawslopefront_r1 = Lowerjawslopefront.addOrReplaceChild("Lowerjawslopefront_r1", CubeListBuilder.create().texOffs(51, 65).mirror().addBox(-4.0417F, -0.7797F, -1.0187F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.6F, -1.2225F, 1.6551F, 0.1047F, -0.2443F, 0.0F));

		PartDefinition Lowerjawslopefront_r2 = Lowerjawslopefront.addOrReplaceChild("Lowerjawslopefront_r2", CubeListBuilder.create().texOffs(0, 54).mirror().addBox(-4.0008F, 0.6826F, -3.1351F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.9F, -2.7663F, 0.1431F, -0.105F, -0.2806F, -0.0115F));

		PartDefinition Lowerjawslopefront_r3 = Lowerjawslopefront.addOrReplaceChild("Lowerjawslopefront_r3", CubeListBuilder.create().texOffs(51, 65).addBox(-0.8395F, -0.8809F, -1.9811F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.4F, -1.2225F, 1.6551F, 0.1047F, 0.2443F, 0.0F));

		PartDefinition Lowerjawslopefront_r4 = Lowerjawslopefront.addOrReplaceChild("Lowerjawslopefront_r4", CubeListBuilder.create().texOffs(0, 54).addBox(-0.8425F, 0.8445F, -4.2317F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.1F, -2.7663F, 0.1431F, -0.105F, 0.2806F, 0.0115F));

		PartDefinition Lowerfrontteeth = Lowerjawfront.addOrReplaceChild("Lowerfrontteeth", CubeListBuilder.create(), PartPose.offset(0.0F, -0.5F, -2.6F));

		PartDefinition Rightlowerteeth = Lowerjawmidfront.addOrReplaceChild("Rightlowerteeth", CubeListBuilder.create(), PartPose.offsetAndRotation(2.45F, 0.5F, -1.0F, 0.0F, 0.1911F, 0.0F));

		PartDefinition Rightlowerteeth_r1 = Rightlowerteeth.addOrReplaceChild("Rightlowerteeth_r1", CubeListBuilder.create().texOffs(80, 44).addBox(-0.0621F, -0.5982F, -1.239F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 68).addBox(-0.7621F, -0.0982F, -1.939F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4251F, -1.1F, 0.9699F, -0.0349F, -0.0175F, 0.0F));

		PartDefinition Rightlowerteeth2 = Lowerjawmidfront.addOrReplaceChild("Rightlowerteeth2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.45F, 0.5F, -1.0F, 0.0F, -0.1911F, 0.0F));

		PartDefinition Leftlowerteeth_r1 = Rightlowerteeth2.addOrReplaceChild("Leftlowerteeth_r1", CubeListBuilder.create().texOffs(80, 44).mirror().addBox(0.0621F, -0.5982F, -1.239F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 68).mirror().addBox(-0.2379F, -0.0982F, -1.939F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4251F, -1.1F, 0.9699F, -0.0349F, 0.0175F, 0.0F));

		PartDefinition Leftlowerteeth = Lowerjawmidfront.addOrReplaceChild("Leftlowerteeth", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.45F, 0.5F, -1.0F, 0.0F, -0.1911F, 0.0F));

		PartDefinition Upperjawbase = Head.addOrReplaceChild("Upperjawbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.516F, -0.4637F, 0.0213F, 0.0F, 0.0F));

		PartDefinition Upperjawbase_r1 = Upperjawbase.addOrReplaceChild("Upperjawbase_r1", CubeListBuilder.create().texOffs(70, 35).addBox(-0.1F, -0.4F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.127F, 0.9277F, -0.0753F, 0.383F, -0.0282F));

		PartDefinition Upperjawbase_r2 = Upperjawbase.addOrReplaceChild("Upperjawbase_r2", CubeListBuilder.create().texOffs(70, 43).addBox(-0.6F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7633F, 1.0007F, 1.6429F, -0.3052F, 0.1084F, -0.5847F));

		PartDefinition Upperjawbase_r3 = Upperjawbase.addOrReplaceChild("Upperjawbase_r3", CubeListBuilder.create().texOffs(45, 60).addBox(-0.8522F, -0.2297F, -0.4718F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.9204F, 1.1546F, 0.3384F, 0.0347F, 0.1571F, -0.2979F));

		PartDefinition Upperjawbase_r4 = Upperjawbase.addOrReplaceChild("Upperjawbase_r4", CubeListBuilder.create().texOffs(65, 69).addBox(-0.5807F, -0.4519F, -1.8214F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.1552F, 1.0527F, 3.4469F, -0.024F, 0.1933F, -0.1167F));

		PartDefinition Upperjawbase_r5 = Upperjawbase.addOrReplaceChild("Upperjawbase_r5", CubeListBuilder.create().texOffs(58, 69).addBox(-0.5814F, -1.0447F, -0.0051F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.1552F, 2.4527F, 2.1469F, 0.4999F, 0.1236F, -0.115F));

		PartDefinition Upperjawbase_r6 = Upperjawbase.addOrReplaceChild("Upperjawbase_r6", CubeListBuilder.create().texOffs(51, 69).addBox(-0.7814F, -0.8222F, -0.105F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1552F, 2.7527F, 0.2469F, 0.273F, 0.1236F, -0.115F));

		PartDefinition Upperjawbase_r7 = Upperjawbase.addOrReplaceChild("Upperjawbase_r7", CubeListBuilder.create().texOffs(42, 74).addBox(-0.3689F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.8289F, 1.4F, 0.3783F, -0.2269F, 0.2618F, 0.0F));

		PartDefinition Upperjawbase_r8 = Upperjawbase.addOrReplaceChild("Upperjawbase_r8", CubeListBuilder.create().texOffs(58, 65).addBox(0.4F, -0.3F, -1.2F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.389F, 2.5F, -1.2637F, 0.2967F, 0.2618F, 0.0F));

		PartDefinition Upperjawbase_r9 = Upperjawbase.addOrReplaceChild("Upperjawbase_r9", CubeListBuilder.create().texOffs(59, 47).addBox(-0.9563F, -1.0F, -2.8306F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(3.2F, 1.9F, 0.0F, 0.0F, 0.2618F, 0.0F));

		PartDefinition Upperjawmiddle = Upperjawbase.addOrReplaceChild("Upperjawmiddle", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0F, -3.0F));

		PartDefinition Upperjawmiddle_r1 = Upperjawmiddle.addOrReplaceChild("Upperjawmiddle_r1", CubeListBuilder.create().texOffs(65, 7).addBox(-0.8718F, -0.7289F, -1.765F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9066F, -0.0853F, -0.7015F, 0.3358F, -0.0413F, 0.6253F));

		PartDefinition Upperjawmiddle_r2 = Upperjawmiddle.addOrReplaceChild("Upperjawmiddle_r2", CubeListBuilder.create().texOffs(74, 75).addBox(-1.5F, -0.4F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(75, 47).addBox(-0.7F, -0.4F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.9442F, -0.3041F, 1.2286F, 0.2491F, -0.3806F, 0.5408F));

		PartDefinition Upperjawmiddle_r3 = Upperjawmiddle.addOrReplaceChild("Upperjawmiddle_r3", CubeListBuilder.create().texOffs(70, 15).addBox(-2.0851F, -0.0181F, 0.3752F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F))
				.texOffs(61, 43).addBox(-1.9851F, -0.0181F, -1.2248F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4887F, -0.0924F, 0.2089F, 0.2329F, 0.1285F, 0.6654F));

		PartDefinition Upperjawmiddle_r4 = Upperjawmiddle.addOrReplaceChild("Upperjawmiddle_r4", CubeListBuilder.create().texOffs(70, 63).addBox(-0.7903F, 0.0168F, -1.9361F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.9887F, 0.0076F, -0.9911F, 0.2793F, 0.2443F, 0.0F));

		PartDefinition Upperjawmiddle_r5 = Upperjawmiddle.addOrReplaceChild("Upperjawmiddle_r5", CubeListBuilder.create().texOffs(15, 79).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.062F, 2.0836F, -1.8547F, 0.0971F, 0.2359F, -0.0644F));

		PartDefinition Upperjawmiddle_r6 = Upperjawmiddle.addOrReplaceChild("Upperjawmiddle_r6", CubeListBuilder.create().texOffs(77, 10).addBox(-0.4F, 0.0F, 0.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 76).addBox(-0.4F, 0.1F, -0.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9887F, 0.9076F, 0.2089F, 0.3665F, 0.2443F, 0.0F));

		PartDefinition Upperjawmiddle_r7 = Upperjawmiddle.addOrReplaceChild("Upperjawmiddle_r7", CubeListBuilder.create().texOffs(6, 76).addBox(0.4F, -0.2F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 55).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9887F, 0.9076F, 0.2089F, 0.1047F, 0.2443F, 0.0F));

		PartDefinition Upperjawmiddle_r8 = Upperjawmiddle.addOrReplaceChild("Upperjawmiddle_r8", CubeListBuilder.create().texOffs(51, 80).addBox(0.4F, -0.4F, -0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.519F, 2.1318F, -1.7167F, 0.1185F, 0.2603F, -0.028F));

		PartDefinition Upperjawmiddle_r9 = Upperjawmiddle.addOrReplaceChild("Upperjawmiddle_r9", CubeListBuilder.create().texOffs(0, 72).addBox(-1.0F, -0.115F, -0.106F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(1.9F, 0.9F, -2.1F, -0.1084F, 0.2603F, -0.028F));

		PartDefinition Upperjawfront = Upperjawmiddle.addOrReplaceChild("Upperjawfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0F, -2.0F, -0.0213F, 0.0F, 0.0F));

		PartDefinition Upperjawfront_r1 = Upperjawfront.addOrReplaceChild("Upperjawfront_r1", CubeListBuilder.create().texOffs(19, 74).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.472F, -1.1395F, -2.6004F, -0.1506F, 0.6948F, -0.0569F));

		PartDefinition Upperjawfront_r2 = Upperjawfront.addOrReplaceChild("Upperjawfront_r2", CubeListBuilder.create().texOffs(14, 74).addBox(-0.8294F, -1.1169F, -1.1153F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(74, 7).addBox(-1.0294F, -1.0169F, -1.1153F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, -0.5F, -2.0F, -0.1506F, 0.6948F, -0.0569F));

		PartDefinition Upperjawfront_r3 = Upperjawfront.addOrReplaceChild("Upperjawfront_r3", CubeListBuilder.create().texOffs(79, 67).addBox(-0.1175F, -0.1148F, -0.6065F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4264F, -0.6654F, -2.2977F, 0.2614F, 0.6863F, 0.0439F));

		PartDefinition Upperjawfront_r4 = Upperjawfront.addOrReplaceChild("Upperjawfront_r4", CubeListBuilder.create().texOffs(70, 20).addBox(-1.0544F, -0.396F, -0.0371F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.7F, -1.2F, -2.0F, 0.3451F, 0.4292F, 0.9257F));

		PartDefinition Upperjawfront_r5 = Upperjawfront.addOrReplaceChild("Upperjawfront_r5", CubeListBuilder.create().texOffs(63, 0).addBox(-2.0722F, -0.1183F, -1.8307F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9F, -1.2F, -0.3F, 0.3138F, -0.0841F, 0.7499F));

		PartDefinition Upperjawfront_r6 = Upperjawfront.addOrReplaceChild("Upperjawfront_r6", CubeListBuilder.create().texOffs(12, 77).addBox(0.4F, -1.1F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2778F, 0.0731F, -1.1114F, 0.215F, 0.141F, 0.0235F));

		PartDefinition Upperjawfront_r7 = Upperjawfront.addOrReplaceChild("Upperjawfront_r7", CubeListBuilder.create().texOffs(65, 53).addBox(-0.9604F, -0.79F, -2.0111F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9F, -0.5F, -0.1F, -0.1166F, 0.141F, 0.0235F));

		PartDefinition Upperjawfront_r8 = Upperjawfront.addOrReplaceChild("Upperjawfront_r8", CubeListBuilder.create().texOffs(54, 53).addBox(-0.6393F, -1.0097F, -0.2574F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.1385F, -0.908F, -2.688F, 0.3317F, -0.0005F, 0.003F));

		PartDefinition Snoutfront = Upperjawfront.addOrReplaceChild("Snoutfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.02F, -0.1F, 0.2972F, 0.0F, 0.0F));

		PartDefinition Upperfrontteeth = Upperjawfront.addOrReplaceChild("Upperfrontteeth", CubeListBuilder.create(), PartPose.offset(0.0F, -0.5F, -2.7F));

		PartDefinition Snoutmiddle = Upperjawmiddle.addOrReplaceChild("Snoutmiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0559F, -1.3767F, 0.3721F, 0.0F, 0.0F));

		PartDefinition Snoutmiddle_r1 = Snoutmiddle.addOrReplaceChild("Snoutmiddle_r1", CubeListBuilder.create().texOffs(36, 60).addBox(-1.1385F, -0.0437F, -5.1351F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1385F, 0.9099F, 4.9435F, -0.1745F, 0.0008F, 0.0029F));

		PartDefinition Rightupperteeth = Upperjawmiddle.addOrReplaceChild("Rightupperteeth", CubeListBuilder.create(), PartPose.offsetAndRotation(2.45F, 1.5F, -1.1F, 0.0F, 0.1911F, 0.0F));

		PartDefinition Leftupperteeth = Upperjawmiddle.addOrReplaceChild("Leftupperteeth", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.45F, 1.5F, -1.1F, 0.0F, -0.1911F, 0.0F));

		PartDefinition Snoutbase = Upperjawbase.addOrReplaceChild("Snoutbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.3187F, 0.0F, 0.0F));

		PartDefinition Snoutbase_r1 = Snoutbase.addOrReplaceChild("Snoutbase_r1", CubeListBuilder.create().texOffs(30, 48).addBox(-2.01F, -0.0596F, -2.9503F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2385F, 1.892F, -0.488F, -0.1121F, 0.397F, 0.5736F));

		PartDefinition Snoutbase_r2 = Snoutbase.addOrReplaceChild("Snoutbase_r2", CubeListBuilder.create().texOffs(44, 70).addBox(-1.1352F, -0.0527F, -0.0076F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(59, 20).addBox(-1.6352F, -0.0527F, 0.9924F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1385F, -0.208F, -2.588F, -0.2443F, 0.0005F, 0.003F));

		PartDefinition Upperjawbase2 = Head.addOrReplaceChild("Upperjawbase2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.516F, -0.4637F, 0.0213F, 0.0F, 0.0F));

		PartDefinition Upperjawbase_r10 = Upperjawbase2.addOrReplaceChild("Upperjawbase_r10", CubeListBuilder.create().texOffs(70, 35).mirror().addBox(-0.9F, -0.4F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.127F, 0.9277F, -0.0753F, -0.383F, 0.0282F));

		PartDefinition Upperjawbase_r11 = Upperjawbase2.addOrReplaceChild("Upperjawbase_r11", CubeListBuilder.create().texOffs(70, 43).mirror().addBox(-0.4F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7633F, 1.0007F, 1.6429F, -0.3052F, -0.1084F, 0.5847F));

		PartDefinition Upperjawbase_r12 = Upperjawbase2.addOrReplaceChild("Upperjawbase_r12", CubeListBuilder.create().texOffs(45, 60).mirror().addBox(-0.1478F, -0.2297F, -0.4718F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.9204F, 1.1546F, 0.3384F, 0.0347F, -0.1571F, 0.2979F));

		PartDefinition Upperjawbase_r13 = Upperjawbase2.addOrReplaceChild("Upperjawbase_r13", CubeListBuilder.create().texOffs(65, 69).mirror().addBox(-0.4193F, -0.4519F, -1.8214F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.1552F, 1.0527F, 3.4469F, -0.024F, -0.1933F, 0.1167F));

		PartDefinition Upperjawbase_r14 = Upperjawbase2.addOrReplaceChild("Upperjawbase_r14", CubeListBuilder.create().texOffs(58, 69).mirror().addBox(-0.4186F, -1.0447F, -0.0051F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.1552F, 2.4527F, 2.1469F, 0.4999F, -0.1236F, 0.115F));

		PartDefinition Upperjawbase_r15 = Upperjawbase2.addOrReplaceChild("Upperjawbase_r15", CubeListBuilder.create().texOffs(51, 69).mirror().addBox(-0.2186F, -0.8222F, -0.105F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1552F, 2.7527F, 0.2469F, 0.273F, -0.1236F, 0.115F));

		PartDefinition Upperjawbase_r16 = Upperjawbase2.addOrReplaceChild("Upperjawbase_r16", CubeListBuilder.create().texOffs(42, 74).mirror().addBox(-0.6311F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.8289F, 1.4F, 0.3783F, -0.2269F, -0.2618F, 0.0F));

		PartDefinition Upperjawbase_r17 = Upperjawbase2.addOrReplaceChild("Upperjawbase_r17", CubeListBuilder.create().texOffs(58, 65).mirror().addBox(-0.4F, -0.3F, -1.2F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.389F, 2.5F, -1.2637F, 0.2967F, -0.2618F, 0.0F));

		PartDefinition Upperjawbase_r18 = Upperjawbase2.addOrReplaceChild("Upperjawbase_r18", CubeListBuilder.create().texOffs(59, 47).mirror().addBox(-0.0437F, -1.0F, -2.8306F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-3.2F, 1.9F, 0.0F, 0.0F, -0.2618F, 0.0F));

		PartDefinition Upperjawmiddle2 = Upperjawbase2.addOrReplaceChild("Upperjawmiddle2", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0F, -3.0F));

		PartDefinition Upperjawmiddle_r10 = Upperjawmiddle2.addOrReplaceChild("Upperjawmiddle_r10", CubeListBuilder.create().texOffs(65, 7).mirror().addBox(-1.1282F, -0.7289F, -1.765F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9066F, -0.0853F, -0.7015F, 0.3358F, 0.0413F, -0.6253F));

		PartDefinition Upperjawmiddle_r11 = Upperjawmiddle2.addOrReplaceChild("Upperjawmiddle_r11", CubeListBuilder.create().texOffs(74, 75).mirror().addBox(0.5F, -0.4F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(75, 47).mirror().addBox(-0.3F, -0.4F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.9442F, -0.3041F, 1.2286F, 0.2491F, 0.3806F, -0.5408F));

		PartDefinition Upperjawmiddle_r12 = Upperjawmiddle2.addOrReplaceChild("Upperjawmiddle_r12", CubeListBuilder.create().texOffs(70, 15).mirror().addBox(0.0851F, -0.0181F, 0.3752F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(61, 43).mirror().addBox(-0.0149F, -0.0181F, -1.2248F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4887F, -0.0924F, 0.2089F, 0.2329F, -0.1285F, -0.6654F));

		PartDefinition Upperjawmiddle_r13 = Upperjawmiddle2.addOrReplaceChild("Upperjawmiddle_r13", CubeListBuilder.create().texOffs(70, 63).mirror().addBox(-0.2097F, 0.0168F, -1.9361F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.9887F, 0.0076F, -0.9911F, 0.2793F, -0.2443F, 0.0F));

		PartDefinition Upperjawmiddle_r14 = Upperjawmiddle2.addOrReplaceChild("Upperjawmiddle_r14", CubeListBuilder.create().texOffs(15, 79).mirror().addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.062F, 2.0836F, -1.8547F, 0.0971F, -0.2359F, 0.0644F));

		PartDefinition Upperjawmiddle_r15 = Upperjawmiddle2.addOrReplaceChild("Upperjawmiddle_r15", CubeListBuilder.create().texOffs(77, 10).mirror().addBox(0.4F, 0.0F, 0.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(9, 76).mirror().addBox(0.4F, 0.1F, -0.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9887F, 0.9076F, 0.2089F, 0.3665F, -0.2443F, 0.0F));

		PartDefinition Upperjawmiddle_r16 = Upperjawmiddle2.addOrReplaceChild("Upperjawmiddle_r16", CubeListBuilder.create().texOffs(6, 76).mirror().addBox(-0.4F, -0.2F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(22, 55).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9887F, 0.9076F, 0.2089F, 0.1047F, -0.2443F, 0.0F));

		PartDefinition Upperjawmiddle_r17 = Upperjawmiddle2.addOrReplaceChild("Upperjawmiddle_r17", CubeListBuilder.create().texOffs(51, 80).mirror().addBox(-0.4F, -0.4F, -0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.519F, 2.1318F, -1.7167F, 0.1185F, -0.2603F, 0.028F));

		PartDefinition Upperjawmiddle_r18 = Upperjawmiddle2.addOrReplaceChild("Upperjawmiddle_r18", CubeListBuilder.create().texOffs(0, 72).mirror().addBox(0.0F, -0.115F, -0.106F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 0.9F, -2.1F, -0.1084F, -0.2603F, 0.028F));

		PartDefinition Upperjawfront2 = Upperjawmiddle2.addOrReplaceChild("Upperjawfront2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0F, -2.0F, -0.0213F, 0.0F, 0.0F));

		PartDefinition Upperjawfront_r9 = Upperjawfront2.addOrReplaceChild("Upperjawfront_r9", CubeListBuilder.create().texOffs(19, 74).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.472F, -1.1395F, -2.6004F, -0.1506F, -0.6948F, 0.0569F));

		PartDefinition Upperjawfront_r10 = Upperjawfront2.addOrReplaceChild("Upperjawfront_r10", CubeListBuilder.create().texOffs(14, 74).mirror().addBox(-0.1706F, -1.1169F, -1.1153F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(74, 7).mirror().addBox(0.0294F, -1.0169F, -1.1153F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, -0.5F, -2.0F, -0.1506F, -0.6948F, 0.0569F));

		PartDefinition Upperjawfront_r11 = Upperjawfront2.addOrReplaceChild("Upperjawfront_r11", CubeListBuilder.create().texOffs(79, 67).mirror().addBox(0.1175F, -0.1148F, -0.6065F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4264F, -0.6654F, -2.2977F, 0.2614F, -0.6863F, -0.0439F));

		PartDefinition Upperjawfront_r12 = Upperjawfront2.addOrReplaceChild("Upperjawfront_r12", CubeListBuilder.create().texOffs(70, 20).mirror().addBox(0.0544F, -0.396F, -0.0371F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -1.2F, -2.0F, 0.3451F, -0.4292F, -0.9257F));

		PartDefinition Upperjawfront_r13 = Upperjawfront2.addOrReplaceChild("Upperjawfront_r13", CubeListBuilder.create().texOffs(63, 0).mirror().addBox(1.0722F, -0.1183F, -1.8307F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9F, -1.2F, -0.3F, 0.3138F, 0.0841F, -0.7499F));

		PartDefinition Upperjawfront_r14 = Upperjawfront2.addOrReplaceChild("Upperjawfront_r14", CubeListBuilder.create().texOffs(12, 77).mirror().addBox(-0.4F, -1.1F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2778F, 0.0731F, -1.1114F, 0.215F, -0.141F, -0.0235F));

		PartDefinition Upperjawfront_r15 = Upperjawfront2.addOrReplaceChild("Upperjawfront_r15", CubeListBuilder.create().texOffs(65, 53).mirror().addBox(-0.0396F, -0.79F, -2.0111F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9F, -0.5F, -0.1F, -0.1166F, -0.141F, -0.0235F));

		PartDefinition Snoutfront2 = Upperjawfront2.addOrReplaceChild("Snoutfront2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.02F, -0.1F, 0.2972F, 0.0F, 0.0F));

		PartDefinition Upperfrontteeth2 = Upperjawfront2.addOrReplaceChild("Upperfrontteeth2", CubeListBuilder.create(), PartPose.offset(0.0F, -0.5F, -2.7F));

		PartDefinition Snoutmiddle2 = Upperjawmiddle2.addOrReplaceChild("Snoutmiddle2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0559F, -1.3767F, 0.3721F, 0.0F, 0.0F));

		PartDefinition Rightupperteeth2 = Upperjawmiddle2.addOrReplaceChild("Rightupperteeth2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.45F, 1.5F, -1.1F, 0.0F, -0.1911F, 0.0F));

		PartDefinition Leftupperteeth2 = Upperjawmiddle2.addOrReplaceChild("Leftupperteeth2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.45F, 1.5F, -1.1F, 0.0F, 0.1911F, 0.0F));

		PartDefinition Snoutbase2 = Upperjawbase2.addOrReplaceChild("Snoutbase2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.3187F, 0.0F, 0.0F));

		PartDefinition Snoutbase_r3 = Snoutbase2.addOrReplaceChild("Snoutbase_r3", CubeListBuilder.create().texOffs(30, 48).mirror().addBox(0.01F, -0.0596F, -2.9503F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2385F, 1.892F, -0.488F, -0.1121F, -0.397F, -0.5736F));

		PartDefinition Rightupperarm = Bodyfront.addOrReplaceChild("Rightupperarm", CubeListBuilder.create().texOffs(27, 11).addBox(-0.2403F, -0.5155F, -0.4669F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.1313F, 4.1269F, -7.4067F, 0.1717F, -1.4481F, -0.3616F));

		PartDefinition Rightlowerarm = Rightupperarm.addOrReplaceChild("Rightlowerarm", CubeListBuilder.create().texOffs(9, 65).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 65).addBox(-1.5F, -0.5F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.0858F, 0.1059F, 0.5969F, -0.3712F, -0.3035F, -1.1647F));

		PartDefinition Rightfrontfoot = Rightlowerarm.addOrReplaceChild("Rightfrontfoot", CubeListBuilder.create().texOffs(42, 47).addBox(-2.0F, 0.0F, -3.5F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.429F, 4.7042F, -0.7941F, 1.8006F, -0.14F, 0.1039F));

		PartDefinition Leftupperarm = Bodyfront.addOrReplaceChild("Leftupperarm", CubeListBuilder.create().texOffs(61, 40).addBox(-3.7597F, -0.5155F, -0.4669F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.1313F, 4.1269F, -7.4067F, 0.1717F, 1.4481F, 0.3616F));

		PartDefinition Leftlowerarm = Leftupperarm.addOrReplaceChild("Leftlowerarm", CubeListBuilder.create().texOffs(65, 11).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 65).addBox(0.5F, -0.5F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-4.0858F, 0.1059F, 0.5969F, -0.3712F, 0.3035F, 1.1647F));

		PartDefinition Leftfrontfoot = Leftlowerarm.addOrReplaceChild("Leftfrontfoot", CubeListBuilder.create().texOffs(0, 48).addBox(-2.0F, 0.0F, -3.5F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.429F, 4.7042F, -0.7941F, 1.8006F, 0.14F, -0.1039F));

		PartDefinition Tailbase = Hips.addOrReplaceChild("Tailbase", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 0.7806F, 17.9966F, -0.2474F, 0.2117F, -0.053F));

		PartDefinition Tailbase_r1 = Tailbase.addOrReplaceChild("Tailbase_r1", CubeListBuilder.create().texOffs(25, 14).addBox(-0.5F, -0.4F, 0.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2002F, 0.0192F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r74 = Tailbase.addOrReplaceChild("Bodyfront_r74", CubeListBuilder.create().texOffs(27, 74).addBox(0.0F, -2.9F, 15.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(74, 24).addBox(0.0F, -2.8F, 13.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 74).addBox(0.0F, -2.7F, 11.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 32).addBox(0.0F, -2.3F, 9.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 27).addBox(0.0F, -1.8F, 7.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9427F, -6.5154F, -0.1571F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r75 = Tailbase.addOrReplaceChild("Bodyfront_r75", CubeListBuilder.create().texOffs(65, 75).addBox(0.0F, -9.7F, 17.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(56, 75).addBox(0.0F, -10.2F, 15.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 74).addBox(0.0F, -10.9F, 13.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 75).addBox(0.0F, -11.6F, 11.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 0).addBox(0.0F, -11.9F, 9.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.7427F, -6.5154F, 0.1571F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r76 = Tailbase.addOrReplaceChild("Bodyfront_r76", CubeListBuilder.create().texOffs(77, 50).addBox(-0.5F, 0.4F, 11.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(77, 36).addBox(-0.3F, 0.4F, 9.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(77, 16).addBox(0.0F, 0.4F, 7.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0392F, -6.6057F, -0.1017F, 0.0283F, 0.2164F));

		PartDefinition Bodyfront_r77 = Tailbase.addOrReplaceChild("Bodyfront_r77", CubeListBuilder.create().texOffs(77, 36).mirror().addBox(-0.7F, 0.4F, 9.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(77, 16).mirror().addBox(-1.0F, 0.4F, 7.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.0392F, -6.6057F, -0.1017F, -0.0283F, -0.2164F));

		PartDefinition Tailmiddlebase = Tailbase.addOrReplaceChild("Tailmiddlebase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9998F, 9.9192F, 0.0053F, 0.3507F, -0.0802F));

		PartDefinition Tailmiddlebase_r1 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r1", CubeListBuilder.create().texOffs(25, 26).addBox(-0.5F, -0.5F, 0.9F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.0684F, -0.9099F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r78 = Tailmiddlebase.addOrReplaceChild("Bodyfront_r78", CubeListBuilder.create().texOffs(36, 74).addBox(0.0F, -2.9F, 23.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 74).addBox(0.0F, -2.9F, 21.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 74).addBox(0.0F, -2.9F, 19.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(74, 29).addBox(0.0F, -2.9F, 17.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9741F, -16.4445F, -0.1571F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r79 = Tailmiddlebase.addOrReplaceChild("Bodyfront_r79", CubeListBuilder.create().texOffs(20, 77).addBox(0.0F, -7.8F, 25.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(59, 75).addBox(0.0F, -8.8F, 23.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 75).addBox(0.0F, -9.0F, 21.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 75).addBox(0.0F, -9.2F, 19.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 12.7113F, -16.4445F, 0.1571F, 0.0F, 0.0F));

		PartDefinition Tailmiddle = Tailmiddlebase.addOrReplaceChild("Tailmiddle", CubeListBuilder.create().texOffs(27, 0).addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7684F, 8.9901F, -0.0249F, 0.4353F, -0.0948F));

		PartDefinition Bodyfront_r80 = Tailmiddle.addOrReplaceChild("Bodyfront_r80", CubeListBuilder.create().texOffs(53, 75).addBox(0.0F, -2.254F, -0.2144F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3905F, 8.1692F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r81 = Tailmiddle.addOrReplaceChild("Bodyfront_r81", CubeListBuilder.create().texOffs(77, 32).addBox(0.0F, -1.9984F, 0.0506F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5033F, 5.8938F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r82 = Tailmiddle.addOrReplaceChild("Bodyfront_r82", CubeListBuilder.create().texOffs(77, 28).addBox(0.0F, -2.0984F, 0.0506F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4211F, 3.8559F, -0.1047F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r83 = Tailmiddle.addOrReplaceChild("Bodyfront_r83", CubeListBuilder.create().texOffs(50, 75).addBox(0.0F, -2.1997F, 0.0662F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4389F, 1.8179F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r84 = Tailmiddle.addOrReplaceChild("Bodyfront_r84", CubeListBuilder.create().texOffs(77, 24).addBox(0.0F, -7.8F, 27.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(77, 20).addBox(0.0F, -7.6F, 29.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(77, 78).addBox(0.0F, -7.4F, 31.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 21).addBox(0.0F, -6.4F, 33.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 18).addBox(0.0F, -6.3F, 35.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.9429F, -25.4346F, 0.1571F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r85 = Tailmiddle.addOrReplaceChild("Bodyfront_r85", CubeListBuilder.create().texOffs(39, 74).addBox(0.0F, -3.0F, 25.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.7425F, -25.4346F, -0.1571F, 0.0F, 0.0F));

		PartDefinition Tailmiddleend = Tailmiddle.addOrReplaceChild("Tailmiddleend", CubeListBuilder.create().texOffs(21, 37).addBox(-0.5F, -0.4126F, -0.0201F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -0.1F, 8.7F, 0.0194F, 0.3951F, -0.0768F));

		PartDefinition Bodyfront_r86 = Tailmiddleend.addOrReplaceChild("Bodyfront_r86", CubeListBuilder.create().texOffs(74, 78).addBox(0.0F, -4.4492F, 41.2043F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(77, 63).addBox(0.0F, -4.4492F, 39.2043F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.6551F, -34.1546F, -0.1571F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r87 = Tailmiddleend.addOrReplaceChild("Bodyfront_r87", CubeListBuilder.create().texOffs(77, 43).addBox(0.0F, -1.75F, -0.3148F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4675F, 3.325F, -0.1047F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r88 = Tailmiddleend.addOrReplaceChild("Bodyfront_r88", CubeListBuilder.create().texOffs(80, 33).addBox(0.0F, -0.25F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 27).addBox(0.0F, -0.35F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 24).addBox(0.0F, -0.35F, -2.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1719F, 3.9596F, 0.0698F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r89 = Tailmiddleend.addOrReplaceChild("Bodyfront_r89", CubeListBuilder.create().texOffs(42, 77).addBox(0.0F, -1.7761F, -0.2171F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.484F, 1.2027F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Tailend = Tailmiddleend.addOrReplaceChild("Tailend", CubeListBuilder.create().texOffs(0, 38).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0874F, 8.7799F, 0.0089F, -0.309F, 0.1221F));

		PartDefinition Bodyfront_r90 = Tailend.addOrReplaceChild("Bodyfront_r90", CubeListBuilder.create().texOffs(80, 10).addBox(0.0F, -4.3392F, 45.0037F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 80).addBox(0.0F, -4.3392F, 43.0037F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.7425F, -42.9346F, -0.1571F, 0.0F, 0.0F));

		PartDefinition Rightthigh = Hips.addOrReplaceChild("Rightthigh", CubeListBuilder.create().texOffs(17, 48).addBox(-0.7852F, -0.0787F, -5.1284F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2223F, 2.6235F, 14.2081F, 2.7787F, -0.1761F, -1.6876F));

		PartDefinition Rightshin = Rightthigh.addOrReplaceChild("Rightshin", CubeListBuilder.create().texOffs(34, 65).addBox(-1.0F, -0.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 65).addBox(0.4F, -0.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.455F, 0.9656F, -5.3113F, -1.118F, 0.0967F, -0.1959F));

		PartDefinition Righthindfoot = Rightshin.addOrReplaceChild("Righthindfoot", CubeListBuilder.create().texOffs(48, 8).addBox(-1.5F, 0.0F, -3.5F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4686F, 4.3979F, -0.315F, 0.7441F, 0.1227F, -0.1583F));

		PartDefinition Leftthigh = Hips.addOrReplaceChild("Leftthigh", CubeListBuilder.create().texOffs(30, 53).addBox(-0.2148F, -0.0787F, -5.1284F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.2223F, 2.6235F, 14.2081F, 2.7787F, 0.1761F, 1.6876F));

		PartDefinition Leftshin = Leftthigh.addOrReplaceChild("Leftshin", CubeListBuilder.create().texOffs(39, 65).addBox(0.0F, -0.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(29, 65).addBox(-1.4F, -0.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.455F, 0.9656F, -5.3113F, -1.118F, -0.0967F, 0.1959F));

		PartDefinition Lefthindfoot = Leftshin.addOrReplaceChild("Lefthindfoot", CubeListBuilder.create().texOffs(48, 14).addBox(-2.5F, 0.0F, -3.5F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4686F, 4.3979F, -0.315F, 0.7441F, -0.1227F, 0.1583F));

		return LayerDefinition.create(meshdefinition, 90, 90);
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